package com.gojek.ojosdk.exif;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
class OrderedDataOutputStream extends FilterOutputStream {
    private final ByteBuffer mByteBuffer;

    public OrderedDataOutputStream(OutputStream r1) {
        super(r1);
        this.mByteBuffer = ByteBuffer.allocate(4);
    }

    public OrderedDataOutputStream setByteOrder(ByteOrder r2) {
        this.mByteBuffer.order(r2);
        return this;
    }

    public OrderedDataOutputStream writeInt(int r2) {
        this.mByteBuffer.rewind();
        this.mByteBuffer.putInt(r2);
        ((FilterOutputStream) this).out.write(this.mByteBuffer.array());
        return this;
    }

    public OrderedDataOutputStream writeRational(Rational r3) {
        writeInt((int) r3.getNumerator());
        writeInt((int) r3.getDenominator());
        return this;
    }

    public OrderedDataOutputStream writeShort(short r4) {
        this.mByteBuffer.rewind();
        this.mByteBuffer.putShort(r4);
        ((FilterOutputStream) this).out.write(this.mByteBuffer.array(), 0, 2);
        return this;
    }
}
