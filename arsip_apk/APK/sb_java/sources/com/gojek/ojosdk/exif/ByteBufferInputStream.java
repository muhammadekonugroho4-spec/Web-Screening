package com.gojek.ojosdk.exif;

import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
class ByteBufferInputStream extends InputStream {
    private ByteBuffer mBuf;

    public ByteBufferInputStream(ByteBuffer r1) {
        this.mBuf = r1;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.mBuf.hasRemaining() == true) goto L7;
        return -1;
    L7:
        return this.mBuf.get() & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) {
        if (this.mBuf.hasRemaining() == true) goto L6;
        return -1;
    L6:
        int r42 = Math.min(r4, this.mBuf.remaining());
        this.mBuf.get(r2, r3, r42);
        return r42;
    }
}
