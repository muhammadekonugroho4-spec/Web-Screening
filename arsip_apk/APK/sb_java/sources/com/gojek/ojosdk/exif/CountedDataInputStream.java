package com.gojek.ojosdk.exif;

import com.gojek.ojosdk.exif.ExifInterface;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
class CountedDataInputStream extends FilterInputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final byte[] mByteArray;
    private final ByteBuffer mByteBuffer;
    private int mCount;

    static {
    }

    public CountedDataInputStream(InputStream r1) {
        super(r1);
        this.mCount = 0;
        byte[] r12 = new byte[8];
        this.mByteArray = r12;
        this.mByteBuffer = ByteBuffer.wrap(r12);
    }

    public ByteOrder getByteOrder() {
        return this.mByteBuffer.order();
    }

    public int getReadByteCount() {
        return this.mCount;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3) {
        int r32 = ((FilterInputStream) this).in.read(r3);
        int r02 = this.mCount;
        if (r32 < 0) goto L5;
        int r1 = r32;
    L6:
        this.mCount = r02 + r1;
        return r32;
    L5:
        r1 = 0;
        goto L6
    }

    public int readInt() {
        readOrThrow(this.mByteArray, 0, 4);
        this.mByteBuffer.rewind();
        return this.mByteBuffer.getInt();
    }

    public long readLong() {
        readOrThrow(this.mByteArray, 0, 8);
        this.mByteBuffer.rewind();
        return this.mByteBuffer.getLong();
    }

    public void readOrThrow(byte[] r1, int r2, int r3) {
        if (read(r1, r2, r3) != r3) goto L6;
        return;
    L6:
        throw new EOFException();
    }

    public short readShort() {
        readOrThrow(this.mByteArray, 0, 2);
        this.mByteBuffer.rewind();
        return this.mByteBuffer.getShort();
    }

    public String readString(int r3) {
        byte[] r32 = new byte[r3];
        readOrThrow(r32);
        return new String(r32, "UTF8");
    }

    public long readUnsignedInt() {
        return readInt() & 4294967295L;
    }

    public int readUnsignedShort() {
        return readShort() & ExifInterface.ColorSpace.UNCALIBRATED;
    }

    public void setByteOrder(ByteOrder r2) {
        this.mByteBuffer.order(r2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r3) {
        long r32 = ((FilterInputStream) this).in.skip(r3);
        this.mCount = (int) (this.mCount + r32);
        return r32;
    }

    public void skipOrThrow(long r3) {
        if (skip(r3) != r3) goto L6;
        return;
    L6:
        throw new EOFException();
    }

    public void skipTo(long r3) {
        skipOrThrow(r3 - this.mCount);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r2, int r3, int r4) {
        int r22 = ((FilterInputStream) this).in.read(r2, r3, r4);
        int r32 = this.mCount;
        if (r22 < 0) goto L5;
        int r42 = r22;
    L6:
        this.mCount = r32 + r42;
        return r22;
    L5:
        r42 = 0;
        goto L6
    }

    public void readOrThrow(byte[] r3) {
        readOrThrow(r3, 0, r3.length);
    }

    public String readString(int r2, Charset r3) {
        byte[] r22 = new byte[r2];
        readOrThrow(r22);
        return new String(r22, r3);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int r02 = ((FilterInputStream) this).in.read();
        int r1 = this.mCount;
        if (r02 < 0) goto L5;
        int r2 = 1;
    L6:
        this.mCount = r1 + r2;
        return r02;
    L5:
        r2 = 0;
        goto L6
    }
}
