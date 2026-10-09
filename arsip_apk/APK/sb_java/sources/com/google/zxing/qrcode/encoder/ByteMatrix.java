package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class ByteMatrix {
    private final byte[][] bytes;
    private final int height;
    private final int width;

    public ByteMatrix(int r3, int r4) {
        this.bytes = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{r4, r3});
        this.width = r3;
        this.height = r4;
    }

    public void clear(byte r5) {
        byte[][] r02 = this.bytes;
        int r1 = r02.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        Arrays.fill(r02[r2], r5);
        r2 = r2 + 1;
        goto L3
    }

    public byte get(int r2, int r3) {
        return this.bytes[r3][r2];
    }

    public byte[][] getArray() {
        return this.bytes;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void set(int r2, int r3, byte r4) {
        this.bytes[r3][r2] = r4;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder(((this.width * 2) * this.height) + 2);
        int r2 = 0;
    L4:
        if (r2 >= this.height) goto L18;
        byte[] r3 = this.bytes[r2];
        int r4 = 0;
    L7:
        if (r4 >= this.width) goto L16;
        byte r5 = r3[r4];
        if (r5 != 0) goto L11;
        r02.append(" 0");
    L15:
        r4 = r4 + 1;
        goto L7
    L11:
        if (r5 == 1) goto L13;
        r02.append("  ");
        goto L15
    L13:
        r02.append(" 1");
        goto L15
    L16:
        r02.append('\n');
        r2 = r2 + 1;
        goto L4
    L18:
        return r02.toString();
    }

    public void set(int r2, int r3, int r4) {
        this.bytes[r3][r2] = (byte) r4;
    }

    public void set(int r2, int r3, boolean r4) {
        this.bytes[r3][r2] = r4 ? 1 : 0;
    }
}
