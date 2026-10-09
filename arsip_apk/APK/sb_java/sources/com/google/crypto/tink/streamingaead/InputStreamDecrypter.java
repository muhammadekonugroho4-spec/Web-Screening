package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.StreamingAead;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
final class InputStreamDecrypter extends InputStream implements AutoCloseable {
    byte[] associatedData;
    boolean attemptedMatching;
    InputStream ciphertextStream;
    InputStream matchingStream;
    List<StreamingAead> primitives;

    public InputStreamDecrypter(List<StreamingAead> r2, InputStream r3, byte[] r4) {
        this.attemptedMatching = false;
        this.matchingStream = null;
        this.primitives = r2;
        if (r3.markSupported() == false) goto L5;
        this.ciphertextStream = r3;
    L6:
        this.ciphertextStream.mark(Integer.MAX_VALUE);
        this.associatedData = (byte[]) r4.clone();
        return;
    L5:
        this.ciphertextStream = new BufferedInputStream(r3);
        goto L6
    }

    private void disableRewinding() throws IOException {
        this.ciphertextStream.mark(0);
    }

    private void rewind() throws IOException {
        this.ciphertextStream.reset();
    }

    @Override // java.io.InputStream
    public synchronized int available() throws IOException {
        monitor-enter(this);
        InputStream r02 = this.matchingStream;     // Catch: Throwable -> L11
        if (r02 != null) goto L8;
        monitor-exit(this);
        return 0;
    L8:
        int r03 = r02.available();     // Catch: Throwable -> L11
        monitor-exit(this);
        return r03;
    L11:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        monitor-enter(this);
        this.ciphertextStream.close();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public synchronized int read() throws IOException {
        monitor-enter(this);
        byte[] r1 = new byte[1];     // Catch: Throwable -> L9
        if (read(r1) != 1) goto L11;
        byte r02 = r1[0];     // Catch: Throwable -> L9
        monitor-exit(this);
        return r02;
    L11:
        monitor-exit(this);
        return -1;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] r3) throws IOException {
        monitor-enter(this);
        int r32 = read(r3, 0, r3.length);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r32;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] r5, int r6, int r7) throws IOException {
        monitor-enter(this);
        if (r7 != 0) goto L35;
        monitor-exit(this);
        return 0;
    L35:
        InputStream r02 = this.matchingStream;     // Catch: Throwable -> L12
        if (r02 == null) goto L15;
        int r52 = r02.read(r5, r6, r7);     // Catch: Throwable -> L12
        monitor-exit(this);
        return r52;
    L15:
        if (this.attemptedMatching == true) goto L32;
        this.attemptedMatching = true;     // Catch: Throwable -> L12
        Iterator<StreamingAead> r03 = this.primitives.iterator();     // Catch: Throwable -> L12
    L18:
        if (r03.hasNext() == false) goto L30;
        StreamingAead r1 = r03.next();     // Catch: Throwable -> L12
        InputStream r12 = r1.newDecryptingStream(this.ciphertextStream, this.associatedData);     // Catch: Throwable -> L12 GeneralSecurityException -> L27 IOException -> L28
        int r2 = r12.read(r5, r6, r7);     // Catch: Throwable -> L12 GeneralSecurityException -> L27 IOException -> L28
        if (r2 == 0) goto L26;
        this.matchingStream = r12;     // Catch: Throwable -> L12 GeneralSecurityException -> L27 IOException -> L28
        disableRewinding();     // Catch: Throwable -> L12 GeneralSecurityException -> L27 IOException -> L28
        monitor-exit(this);
        return r2;
    L26:
        throw new IOException("Could not read bytes from the ciphertext stream");     // Catch: Throwable -> L12 GeneralSecurityException -> L27 IOException -> L28
    L27:
        rewind();     // Catch: Throwable -> L12
    L28:
        rewind();     // Catch: Throwable -> L12
        goto L18
    L30:
        throw new IOException("No matching key found for the ciphertext in the stream.");     // Catch: Throwable -> L12
    L32:
        throw new IOException("No matching key found for the ciphertext in the stream.");     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }
}
