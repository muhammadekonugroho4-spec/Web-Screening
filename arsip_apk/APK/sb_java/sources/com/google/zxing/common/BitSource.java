package com.google.zxing.common;

import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes6.dex */
public final class BitSource {
    private int bitOffset;
    private int byteOffset;
    private final byte[] bytes;

    public BitSource(byte[] r1) {
        this.bytes = r1;
    }

    public int available() {
        return ((this.bytes.length - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getBitOffset() {
        return this.bitOffset;
    }

    public int getByteOffset() {
        return this.byteOffset;
    }

    public int readBits(int r10) {
        if (r10 <= 0) goto L25;
        if (r10 > 32) goto L25;
        if (r10 > available()) goto L25;
        int r02 = this.bitOffset;
        int r1 = 0;
        if (r02 <= 0) goto L17;
        int r4 = 8 - r02;
        if (r10 >= r4) goto L12;
        int r5 = r10;
    L13:
        int r42 = r4 - r5;
        int r6 = (Constants.MAX_HOST_LENGTH >> (8 - r5)) << r42;
        byte[] r7 = this.bytes;
        int r8 = this.byteOffset;
        int r43 = (r6 & r7[r8]) >> r42;
        r10 = r10 - r5;
        int r03 = r02 + r5;
        this.bitOffset = r03;
        if (r03 != 8) goto L16;
        this.bitOffset = 0;
        this.byteOffset = r8 + 1;
    L16:
        r1 = r43;
        goto L17
    L12:
        r5 = r4;
    L17:
        if (r10 <= 0) goto L23;
    L18:
        if (r10 < 8) goto L20;
        int r04 = r1 << 8;
        byte[] r12 = this.bytes;
        int r44 = this.byteOffset;
        r1 = (r12[r44] & UnsignedBytes.MAX_VALUE) | r04;
        this.byteOffset = r44 + 1;
        r10 = r10 - 8;
        goto L18
    L20:
        if (r10 <= 0) goto L23;
        int r05 = 8 - r10;
        int r06 = ((((Constants.MAX_HOST_LENGTH >> r05) << r05) & this.bytes[this.byteOffset]) >> r05) | (r1 << r10);
        this.bitOffset += r10;
        return r06;
    L23:
        return r1;
    L25:
        throw new IllegalArgumentException(String.valueOf(r10));
    }
}
