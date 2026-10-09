package com.google.crypto.tink.subtle;

import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
class StreamingAeadDecryptingStream extends FilterInputStream implements AutoCloseable {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] aad;
    private final ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private final StreamSegmentDecrypter decrypter;
    private boolean decryptionErrorOccured;
    private boolean endOfCiphertext;
    private boolean endOfPlaintext;
    private final int firstCiphertextSegmentSize;
    private final int headerLength;
    private boolean headerRead;
    private final ByteBuffer plaintextSegment;
    private int segmentNr;

    public StreamingAeadDecryptingStream(NonceBasedStreamingAead r2, InputStream r3, byte[] r4) throws GeneralSecurityException, IOException {
        super(r3);
        this.decrypter = r2.newStreamSegmentDecrypter();
        this.headerLength = r2.getHeaderLength();
        this.aad = Arrays.copyOf(r4, r4.length);
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
        this.decryptionErrorOccured = false;
    }

    private void loadSegment() throws IOException {
    L3:
        if (this.endOfCiphertext == true) goto L17;
        if (this.ciphertextSegment.remaining() <= 0) goto L17;
        int r02 = ((FilterInputStream) this).in.read(this.ciphertextSegment.array(), this.ciphertextSegment.position(), this.ciphertextSegment.remaining());
        if (r02 > 0) goto L8;
        if (r02 == (-1)) goto L11;
        if (r02 != 0) goto L3;
        throw new IOException("Could not read bytes from the ciphertext stream");
    L11:
        this.endOfCiphertext = true;
        goto L3
    L8:
        ByteBuffer r1 = this.ciphertextSegment;
        r1.position(r1.position() + r02);
    L17:
        if (this.endOfCiphertext == true) goto L19;
        ByteBuffer r03 = this.ciphertextSegment;
        byte r04 = r03.get(r03.position() - 1);
        ByteBuffer r2 = this.ciphertextSegment;
        r2.position(r2.position() - 1);
    L20:
        this.ciphertextSegment.flip();
        this.plaintextSegment.clear();
        this.decrypter.decryptSegment(this.ciphertextSegment, this.segmentNr, this.endOfCiphertext, this.plaintextSegment);     // Catch: GeneralSecurityException -> L26
        this.segmentNr++;
        this.plaintextSegment.flip();
        this.ciphertextSegment.clear();
        if (this.endOfCiphertext == true) goto L42;
        this.ciphertextSegment.clear();
        this.ciphertextSegment.limit(this.ciphertextSegmentSize + 1);
        this.ciphertextSegment.put(r04);
        return;
    L42:
        return;
    L26:
        e = move-exception;
        setDecryptionErrorOccured();
        throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.segmentNr + " endOfCiphertext:" + this.endOfCiphertext, e);
    L19:
        r04 = 0;
        goto L20
    }

    private void readHeader() throws IOException {
        if (this.headerRead == true) goto L22;
        ByteBuffer r02 = ByteBuffer.allocate(this.headerLength);
    L6:
        if (r02.remaining() <= 0) goto L15;
        int r1 = ((FilterInputStream) this).in.read(r02.array(), r02.position(), r02.remaining());
        if (r1 == (-1)) goto L13;
        if (r1 == 0) goto L12;
        r02.position(r02.position() + r1);
        goto L6
    L12:
        throw new IOException("Could not read bytes from the ciphertext stream");
    L13:
        setDecryptionErrorOccured();
        throw new IOException("Ciphertext is too short");
    L15:
        r02.flip();
        this.decrypter.init(r02, this.aad);     // Catch: GeneralSecurityException -> L19
        this.headerRead = true;
        return;
    L19:
        e = move-exception;
        throw new IOException(e);
    L22:
        setDecryptionErrorOccured();
        throw new IOException("Decryption failed.");
    }

    private void setDecryptionErrorOccured() {
        this.decryptionErrorOccured = true;
        this.plaintextSegment.limit(0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        monitor-enter(this);
        int r02 = this.plaintextSegment.remaining();     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        monitor-enter(this);
        super.close();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r1) {
        monitor-enter(this);
        monitor-exit(this);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        byte[] r1 = new byte[1];
        int r3 = read(r1, 0, 1);
        if (r3 != 1) goto L7;
        return r1[0] & UnsignedBytes.MAX_VALUE;
    L7:
        if (r3 != (-1)) goto L10;
        return r3;
    L10:
        throw new IOException("Reading failed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r9) throws IOException {
        long r02 = this.ciphertextSegmentSize;
        if (r9 > 0) goto L5;
        return 0;
    L5:
        int r03 = (int) Math.min(r02, r9);
        byte[] r1 = new byte[r03];
        long r4 = r9;
    L7:
        if (r4 <= 0) goto L13;
        int r6 = read(r1, 0, (int) Math.min(r03, r4));
        if (r6 <= 0) goto L13;
        r4 = r4 - r6;
    L13:
        return r9 - r4;
    }

    public synchronized String toString() {
        monitor-enter(this);
        String r02 = "StreamingAeadDecryptingStream\nsegmentNr:" + this.segmentNr + "\nciphertextSegmentSize:" + this.ciphertextSegmentSize + "\nheaderRead:" + this.headerRead + "\nendOfCiphertext:" + this.endOfCiphertext + "\nendOfPlaintext:" + this.endOfPlaintext + "\ndecryptionErrorOccured:" + this.decryptionErrorOccured + "\nciphertextSgement position:" + this.ciphertextSegment.position() + " limit:" + this.ciphertextSegment.limit() + "\nplaintextSegment position:" + this.plaintextSegment.position() + " limit:" + this.plaintextSegment.limit();     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3) throws IOException {
        return read(r3, 0, r3.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] r7, int r8, int r9) throws IOException {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.decryptionErrorOccured == true) goto L32;
        if (this.headerRead == true) goto L12;
        readHeader();     // Catch: Throwable -> L8
        this.ciphertextSegment.clear();     // Catch: Throwable -> L8
        this.ciphertextSegment.limit(this.firstCiphertextSegmentSize + 1);     // Catch: Throwable -> L8
    L12:
        if (this.endOfPlaintext == false) goto L15;
        monitor-exit(this);
        return -1;
    L15:
        int r02 = 0;
    L16:
        if (r02 >= r9) goto L24;
        if (this.plaintextSegment.remaining() != 0) goto L23;
        if (this.endOfCiphertext == true) goto L21;
        loadSegment();     // Catch: Throwable -> L8
        goto L23
    L21:
        this.endOfPlaintext = true;     // Catch: Throwable -> L8
    L23:
        int r3 = Math.min(this.plaintextSegment.remaining(), r9 - r02);     // Catch: Throwable -> L8
        this.plaintextSegment.get(r7, r02 + r8, r3);     // Catch: Throwable -> L8
        r02 = r02 + r3;     // Catch: Throwable -> L8
    L24:
        if (r02 == 0) goto L26;
    L29:
        monitor-exit(this);
        return r02;
    L26:
        if (this.endOfPlaintext == false) goto L29;
        monitor-exit(this);
        return -1;
    L32:
        throw new IOException("Decryption failed.");     // Catch: Throwable -> L8
    }
}
