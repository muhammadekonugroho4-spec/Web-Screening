package com.google.crypto.tink.shaded.protobuf;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes6.dex */
class IterableByteBufferInputStream extends InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize;
    private boolean hasArray;
    private Iterator<ByteBuffer> iterator;

    public IterableByteBufferInputStream(Iterable<ByteBuffer> r3) {
        this.iterator = r3.iterator();
        this.dataSize = 0;
        Iterator<ByteBuffer> r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        ByteBuffer r1 = r32.next();
        this.dataSize++;
        goto L4
    L6:
        this.currentIndex = -1;
        if (getNextByteBuffer() == true) goto L11;
        this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
        this.currentIndex = 0;
        this.currentByteBufferPos = 0;
        this.currentAddress = 0;
        return;
    }

    private boolean getNextByteBuffer() {
        this.currentIndex++;
        if (this.iterator.hasNext() == true) goto L5;
        return false;
    L5:
        ByteBuffer r02 = this.iterator.next();
        this.currentByteBuffer = r02;
        this.currentByteBufferPos = r02.position();
        if (this.currentByteBuffer.hasArray() == false) goto L8;
        this.hasArray = true;
        this.currentArray = this.currentByteBuffer.array();
        this.currentArrayOffset = this.currentByteBuffer.arrayOffset();
    L9:
        return true;
    L8:
        this.hasArray = false;
        this.currentAddress = UnsafeUtil.addressOffset(this.currentByteBuffer);
        this.currentArray = null;
        goto L9
    }

    private void updateCurrentByteBufferPos(int r2) {
        int r02 = this.currentByteBufferPos + r2;
        this.currentByteBufferPos = r02;
        if (r02 != this.currentByteBuffer.limit()) goto L6;
        getNextByteBuffer();
        return;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.currentIndex != this.dataSize) goto L7;
        return -1;
    L7:
        if (this.hasArray == false) goto L10;
        int r02 = this.currentArray[this.currentByteBufferPos + this.currentArrayOffset] & UnsignedBytes.MAX_VALUE;
        updateCurrentByteBufferPos(1);
        return r02;
    L10:
        int r03 = UnsafeUtil.getByte(this.currentByteBufferPos + this.currentAddress) & UnsignedBytes.MAX_VALUE;
        updateCurrentByteBufferPos(1);
        return r03;
    }

    @Override // java.io.InputStream
    public int read(byte[] r4, int r5, int r6) throws IOException {
        if (this.currentIndex != this.dataSize) goto L6;
        return -1;
    L6:
        int r02 = this.currentByteBuffer.limit();
        int r1 = this.currentByteBufferPos;
        int r03 = r02 - r1;
        if (r6 <= r03) goto L10;
        r6 = r03;
    L10:
        if (this.hasArray == false) goto L13;
        System.arraycopy(this.currentArray, r1 + this.currentArrayOffset, r4, r5, r6);
        updateCurrentByteBufferPos(r6);
        return r6;
    L13:
        int r04 = this.currentByteBuffer.position();
        this.currentByteBuffer.position(this.currentByteBufferPos);
        this.currentByteBuffer.get(r4, r5, r6);
        this.currentByteBuffer.position(r04);
        updateCurrentByteBufferPos(r6);
        return r6;
    }
}
