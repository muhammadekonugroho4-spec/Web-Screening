package com.google.crypto.tink.subtle;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
class StreamingAeadEncryptingChannel implements WritableByteChannel, AutoCloseable {
    private WritableByteChannel ciphertextChannel;
    ByteBuffer ctBuffer;
    private StreamSegmentEncrypter encrypter;
    boolean open;
    private int plaintextSegmentSize;
    ByteBuffer ptBuffer;

    public StreamingAeadEncryptingChannel(NonceBasedStreamingAead r3, WritableByteChannel r4, byte[] r5) throws GeneralSecurityException, IOException {
        this.open = true;
        this.ciphertextChannel = r4;
        this.encrypter = r3.newStreamSegmentEncrypter(r5);
        int r52 = r3.getPlaintextSegmentSize();
        this.plaintextSegmentSize = r52;
        ByteBuffer r53 = ByteBuffer.allocate(r52);
        this.ptBuffer = r53;
        r53.limit(this.plaintextSegmentSize - r3.getCiphertextOffset());
        ByteBuffer r32 = ByteBuffer.allocate(r3.getCiphertextSegmentSize());
        this.ctBuffer = r32;
        r32.put(this.encrypter.getHeader());
        this.ctBuffer.flip();
        r4.write(this.ctBuffer);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        monitor-enter(this);
    L14:
        th = move-exception;
        throw th;
    L4:
        if (this.open == true) goto L8;
        monitor-exit(this);
        return;
    L8:
        if (this.ctBuffer.remaining() > 0) goto L10;
        this.ctBuffer.clear();     // Catch: Throwable -> L14 GeneralSecurityException -> L28
        this.ptBuffer.flip();     // Catch: Throwable -> L14 GeneralSecurityException -> L28
        this.encrypter.encryptSegment(this.ptBuffer, true, this.ctBuffer);     // Catch: Throwable -> L14 GeneralSecurityException -> L28
        this.ctBuffer.flip();     // Catch: Throwable -> L14
    L19:
        if (this.ctBuffer.remaining() <= 0) goto L25;
        if (this.ciphertextChannel.write(this.ctBuffer) > 0) goto L19;
        throw new IOException("Failed to write ciphertext before closing");     // Catch: Throwable -> L14
    L25:
        this.ciphertextChannel.close();     // Catch: Throwable -> L14
        this.open = false;     // Catch: Throwable -> L14
        monitor-exit(this);
        return;
    L28:
        e = move-exception;
        throw new IOException(e);     // Catch: Throwable -> L14
    L10:
        if (this.ciphertextChannel.write(this.ctBuffer) > 0) goto L8;
        throw new IOException("Failed to write ciphertext before closing");     // Catch: Throwable -> L14
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.open;
    }

    @Override // java.nio.channels.WritableByteChannel
    public synchronized int write(ByteBuffer r7) throws IOException {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.open == false) goto L34;
        if (this.ctBuffer.remaining() <= 0) goto L10;
        this.ciphertextChannel.write(this.ctBuffer);     // Catch: Throwable -> L8
    L10:
        int r02 = r7.position();     // Catch: Throwable -> L8
    L12:
        if (r7.remaining() <= this.ptBuffer.remaining()) goto L29;
        if (this.ctBuffer.remaining() > 0) goto L16;
        int r1 = this.ptBuffer.remaining();     // Catch: Throwable -> L8
        ByteBuffer r2 = r7.slice();     // Catch: Throwable -> L8
        r2.limit(r1);     // Catch: Throwable -> L8
        r7.position(r7.position() + r1);     // Catch: Throwable -> L8
        this.ptBuffer.flip();     // Catch: Throwable -> L8 GeneralSecurityException -> L23
        this.ctBuffer.clear();     // Catch: Throwable -> L8 GeneralSecurityException -> L23
        if (r2.remaining() == 0) goto L25;
        this.encrypter.encryptSegment(this.ptBuffer, r2, false, this.ctBuffer);     // Catch: Throwable -> L8 GeneralSecurityException -> L23
    L26:
        this.ctBuffer.flip();     // Catch: Throwable -> L8
        this.ciphertextChannel.write(this.ctBuffer);     // Catch: Throwable -> L8
        this.ptBuffer.clear();     // Catch: Throwable -> L8
        this.ptBuffer.limit(this.plaintextSegmentSize);     // Catch: Throwable -> L8
        goto L12
    L25:
        this.encrypter.encryptSegment(this.ptBuffer, false, this.ctBuffer);     // Catch: Throwable -> L8 GeneralSecurityException -> L23
        goto L26
    L23:
        e = move-exception;
        throw new IOException(e);     // Catch: Throwable -> L8
    L16:
        int r72 = r7.position() - r02;
        monitor-exit(this);
        return r72;
    L29:
        this.ptBuffer.put(r7);     // Catch: Throwable -> L8
        int r73 = r7.position() - r02;
        monitor-exit(this);
        return r73;
    L34:
        throw new ClosedChannelException();     // Catch: Throwable -> L8
    }
}
