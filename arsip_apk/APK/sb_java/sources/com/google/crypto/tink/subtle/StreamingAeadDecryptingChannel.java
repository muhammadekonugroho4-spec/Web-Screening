package com.google.crypto.tink.subtle;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
class StreamingAeadDecryptingChannel implements ReadableByteChannel, AutoCloseable {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] associatedData;
    private ReadableByteChannel ciphertextChannel;
    private ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private final StreamSegmentDecrypter decrypter;
    private boolean definedState;
    private boolean endOfCiphertext;
    private boolean endOfPlaintext;
    private final int firstCiphertextSegmentSize;
    private ByteBuffer header;
    private boolean headerRead;
    private ByteBuffer plaintextSegment;
    private int segmentNr;

    public StreamingAeadDecryptingChannel(NonceBasedStreamingAead r2, ReadableByteChannel r3, byte[] r4) throws GeneralSecurityException, IOException {
        this.decrypter = r2.newStreamSegmentDecrypter();
        this.ciphertextChannel = r3;
        this.header = ByteBuffer.allocate(r2.getHeaderLength());
        this.associatedData = Arrays.copyOf(r4, r4.length);
        int r32 = r2.getCiphertextSegmentSize();
        this.ciphertextSegmentSize = r32;
        ByteBuffer r42 = ByteBuffer.allocate(r32 + 1);
        this.ciphertextSegment = r42;
        r42.limit(0);
        this.firstCiphertextSegmentSize = r32 - r2.getCiphertextOffset();
        ByteBuffer r22 = ByteBuffer.allocate(r2.getPlaintextSegmentSize() + 16);
        this.plaintextSegment = r22;
        r22.limit(0);
        this.headerRead = false;
        this.endOfCiphertext = false;
        this.endOfPlaintext = false;
        this.segmentNr = 0;
        this.definedState = true;
    }

    private void readSomeCiphertext(ByteBuffer r3) throws IOException {
    L2:
        int r02 = this.ciphertextChannel.read(r3);
        if (r02 <= 0) goto L7;
        if (r3.remaining() > 0) goto L2;
    L7:
        if (r02 != (-1)) goto L13;
        this.endOfCiphertext = true;
        return;
    }

    private void setUndefinedState() {
        this.definedState = false;
        this.plaintextSegment.limit(0);
    }

    private boolean tryLoadSegment() throws IOException {
        if (this.endOfCiphertext == true) goto L5;
        readSomeCiphertext(this.ciphertextSegment);
    L5:
        byte r1 = 0;
        if (this.ciphertextSegment.remaining() <= 0) goto L11;
        if (this.endOfCiphertext == true) goto L11;
        return false;
    L11:
        if (this.endOfCiphertext == true) goto L13;
        ByteBuffer r02 = this.ciphertextSegment;
        r1 = r02.get(r02.position() - 1);
        ByteBuffer r03 = this.ciphertextSegment;
        r03.position(r03.position() - 1);
    L13:
        this.ciphertextSegment.flip();
        this.plaintextSegment.clear();
        this.decrypter.decryptSegment(this.ciphertextSegment, this.segmentNr, this.endOfCiphertext, this.plaintextSegment);     // Catch: GeneralSecurityException -> L19
        this.segmentNr++;
        this.plaintextSegment.flip();
        this.ciphertextSegment.clear();
        if (this.endOfCiphertext == true) goto L18;
        this.ciphertextSegment.clear();
        this.ciphertextSegment.limit(this.ciphertextSegmentSize + 1);
        this.ciphertextSegment.put(r1);
    L18:
        return true;
    L19:
        e = move-exception;
        setUndefinedState();
        throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.segmentNr + " endOfCiphertext:" + this.endOfCiphertext, e);
    }

    private boolean tryReadHeader() throws IOException {
        if (this.endOfCiphertext == true) goto L15;
        readSomeCiphertext(this.header);
        if (this.header.remaining() <= 0) goto L8;
        return false;
    L8:
        this.header.flip();
        this.decrypter.init(this.header, this.associatedData);     // Catch: GeneralSecurityException -> L11
        this.headerRead = true;     // Catch: GeneralSecurityException -> L11
        return true;
    L11:
        e = move-exception;
        setUndefinedState();
        throw new IOException(e);
    L15:
        throw new IOException("Ciphertext is too short");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        monitor-enter(this);
        this.ciphertextChannel.close();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
        monitor-enter(this);
        boolean r02 = this.ciphertextChannel.isOpen();     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer r7) throws IOException {
        monitor-enter(this);
    L13:
        th = move-exception;
        throw th;
    L4:
        if (this.definedState == false) goto L44;
        if (this.headerRead == true) goto L17;
        if (tryReadHeader() == true) goto L12;
        monitor-exit(this);
        return 0;
    L12:
        this.ciphertextSegment.clear();     // Catch: Throwable -> L13
        this.ciphertextSegment.limit(this.firstCiphertextSegmentSize + 1);     // Catch: Throwable -> L13
    L17:
        if (this.endOfPlaintext == false) goto L20;
        monitor-exit(this);
        return -1;
    L20:
        int r02 = r7.position();     // Catch: Throwable -> L13
    L22:
        if (r7.remaining() <= 0) goto L35;
        if (this.plaintextSegment.remaining() != 0) goto L32;
        if (this.endOfCiphertext == true) goto L27;
        if (tryLoadSegment() == true) goto L32;
    L27:
        this.endOfPlaintext = true;     // Catch: Throwable -> L13
    L32:
        if (this.plaintextSegment.remaining() <= r7.remaining()) goto L33;
        int r3 = r7.remaining();     // Catch: Throwable -> L13
        ByteBuffer r4 = this.plaintextSegment.duplicate();     // Catch: Throwable -> L13
        r4.limit(r4.position() + r3);     // Catch: Throwable -> L13
        r7.put(r4);     // Catch: Throwable -> L13
        ByteBuffer r42 = this.plaintextSegment;     // Catch: Throwable -> L13
        r42.position(r42.position() + r3);     // Catch: Throwable -> L13
        goto L22
    L33:
        r7.put(this.plaintextSegment);     // Catch: Throwable -> L13
    L35:
        int r72 = r7.position() - r02;     // Catch: Throwable -> L13
        if (r72 == 0) goto L38;
    L41:
        monitor-exit(this);
        return r72;
    L38:
        if (this.endOfPlaintext == false) goto L41;
        monitor-exit(this);
        return -1;
    L44:
        throw new IOException("This StreamingAeadDecryptingChannel is in an undefined state");     // Catch: Throwable -> L13
    }

    public synchronized String toString() {
        monitor-enter(this);
        String r02 = "StreamingAeadDecryptingChannel\nsegmentNr:" + this.segmentNr + "\nciphertextSegmentSize:" + this.ciphertextSegmentSize + "\nheaderRead:" + this.headerRead + "\nendOfCiphertext:" + this.endOfCiphertext + "\nendOfPlaintext:" + this.endOfPlaintext + "\ndefinedState:" + this.definedState + "\nHeader position:" + this.header.position() + " limit:" + this.header.position() + "\nciphertextSgement position:" + this.ciphertextSegment.position() + " limit:" + this.ciphertextSegment.limit() + "\nplaintextSegment position:" + this.plaintextSegment.position() + " limit:" + this.plaintextSegment.limit();     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }
}
