package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public abstract class ByteOutput {
    public ByteOutput() {
    }

    public abstract void write(byte r1) throws IOException;

    public abstract void write(ByteBuffer r1) throws IOException;

    public abstract void write(byte[] r1, int r2, int r3) throws IOException;

    public abstract void writeLazy(ByteBuffer r1) throws IOException;

    public abstract void writeLazy(byte[] r1, int r2, int r3) throws IOException;
}
