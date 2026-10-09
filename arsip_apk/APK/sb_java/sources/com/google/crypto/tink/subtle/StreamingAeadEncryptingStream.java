package com.google.crypto.tink.subtle;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
class StreamingAeadEncryptingStream extends FilterOutputStream implements AutoCloseable {
    ByteBuffer ctBuffer;
    private StreamSegmentEncrypter encrypter;
    boolean open;
    private int plaintextSegmentSize;
    ByteBuffer ptBuffer;

    public StreamingAeadEncryptingStream(NonceBasedStreamingAead r1, OutputStream r2, byte[] r3) throws GeneralSecurityException, IOException {
        super(r2);
        this.encrypter = r1.newStreamSegmentEncrypter(r3);
        int r22 = r1.getPlaintextSegmentSize();
        this.plaintextSegmentSize = r22;
        this.ptBuffer = ByteBuffer.allocate(r22);
        this.ctBuffer = ByteBuffer.allocate(r1.getCiphertextSegmentSize());
        this.ptBuffer.limit(this.plaintextSegmentSize - r1.getCiphertextOffset());
        ByteBuffer r12 = this.encrypter.getHeader();
        byte[] r23 = new byte[r12.remaining()];
        r12.get(r23);
        ((FilterOutputStream) this).out.write(r23);
        this.open = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.open == true) goto L18;
        monitor-exit(this);
        return;
    L18:
        this.ptBuffer.flip();     // Catch: Throwable -> L11 GeneralSecurityException -> L13
        this.ctBuffer.clear();     // Catch: Throwable -> L11 GeneralSecurityException -> L13
        this.encrypter.encryptSegment(this.ptBuffer, true, this.ctBuffer);     // Catch: Throwable -> L11 GeneralSecurityException -> L13
        this.ctBuffer.flip();     // Catch: Throwable -> L11
        ((FilterOutputStream) this).out.write(this.ctBuffer.array(), this.ctBuffer.position(), this.ctBuffer.remaining());     // Catch: Throwable -> L11
        this.open = false;     // Catch: Throwable -> L11
        super.close();     // Catch: Throwable -> L11
        monitor-exit(this);
        return;
    L13:
        e = move-exception;
        throw new IOException("ptBuffer.remaining():" + this.ptBuffer.remaining() + " ctBuffer.remaining():" + this.ctBuffer.remaining(), e);     // Catch: Throwable -> L11
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r3) throws IOException {
        write(new byte[]{(byte) r3});
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3) throws IOException {
        write(r3, 0, r3.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] r6, int r7, int r8) throws IOException {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.open == false) goto L20;
    L6:
        if (r8 <= this.ptBuffer.remaining()) goto L16;
        int r02 = this.ptBuffer.remaining();     // Catch: Throwable -> L11
        ByteBuffer r1 = ByteBuffer.wrap(r6, r7, r02);     // Catch: Throwable -> L11
        r7 = r7 + r02;
        r8 = r8 - r02;
        this.ptBuffer.flip();     // Catch: Throwable -> L11 GeneralSecurityException -> L13
        this.ctBuffer.clear();     // Catch: Throwable -> L11 GeneralSecurityException -> L13
        this.encrypter.encryptSegment(this.ptBuffer, r1, false, this.ctBuffer);     // Catch: Throwable -> L11 GeneralSecurityException -> L13
        this.ctBuffer.flip();     // Catch: Throwable -> L11
        ((FilterOutputStream) this).out.write(this.ctBuffer.array(), this.ctBuffer.position(), this.ctBuffer.remaining());     // Catch: Throwable -> L11
        this.ptBuffer.clear();     // Catch: Throwable -> L11
        this.ptBuffer.limit(this.plaintextSegmentSize);     // Catch: Throwable -> L11
        goto L6
    L13:
        e = move-exception;
        throw new IOException(e);     // Catch: Throwable -> L11
    L16:
        this.ptBuffer.put(r6, r7, r8);     // Catch: Throwable -> L11
        monitor-exit(this);
        return;
    L20:
        throw new IOException("Trying to write to closed stream");     // Catch: Throwable -> L11
    }
}
