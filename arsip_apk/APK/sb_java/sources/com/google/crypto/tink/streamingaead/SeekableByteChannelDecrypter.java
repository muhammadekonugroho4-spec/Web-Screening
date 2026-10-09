package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.StreamingAead;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
final class SeekableByteChannelDecrypter implements SeekableByteChannel, AutoCloseable {
    byte[] associatedData;
    SeekableByteChannel attemptingChannel;
    long cachedPosition;
    SeekableByteChannel ciphertextChannel;
    SeekableByteChannel matchingChannel;
    Deque<StreamingAead> remainingPrimitives;
    long startingPosition;

    public SeekableByteChannelDecrypter(List<StreamingAead> r3, SeekableByteChannel r4, byte[] r5) throws IOException {
        this.attemptingChannel = null;
        this.matchingChannel = null;
        this.remainingPrimitives = new ArrayDeque();
        Iterator<StreamingAead> r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        StreamingAead r02 = r32.next();
        this.remainingPrimitives.add(r02);
        goto L4
    L6:
        this.ciphertextChannel = r4;
        this.cachedPosition = -1;
        this.startingPosition = r4.position();
        this.associatedData = (byte[]) r5.clone();
    }

    private synchronized SeekableByteChannel nextAttemptingChannel() throws IOException {
        monitor-enter(this);
    L21:
    L10:
        th = move-exception;
        throw th;
    L4:
        if (this.remainingPrimitives.isEmpty() == true) goto L15;
        this.ciphertextChannel.position(this.startingPosition);     // Catch: Throwable -> L10
        StreamingAead r02 = this.remainingPrimitives.removeFirst();     // Catch: Throwable -> L10
        SeekableByteChannel r03 = r02.newSeekableDecryptingChannel(this.ciphertextChannel, this.associatedData);     // Catch: GeneralSecurityException -> L18 Throwable -> L10
        long r1 = this.cachedPosition;     // Catch: GeneralSecurityException -> L18 Throwable -> L10
        if (r1 < 0) goto L12;
        r03.position(r1);     // Catch: GeneralSecurityException -> L18 Throwable -> L10
    L12:
        monitor-exit(this);
        return r03;
    L15:
        throw new IOException("No matching key found for the ciphertext in the stream.");     // Catch: Throwable -> L10
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

    @Override // java.nio.channels.SeekableByteChannel
    @CanIgnoreReturnValue
    public synchronized SeekableByteChannel position(long r3) throws IOException {
        monitor-enter(this);
        SeekableByteChannel r02 = this.matchingChannel;     // Catch: Throwable -> L6
        if (r02 == null) goto L9;
        r02.position(r3);     // Catch: Throwable -> L6
    L13:
        monitor-exit(this);
        return this;
    L9:
        if (r3 < 0) goto L16;
        this.cachedPosition = r3;     // Catch: Throwable -> L6
        SeekableByteChannel r03 = this.attemptingChannel;     // Catch: Throwable -> L6
        if (r03 == null) goto L13;
        r03.position(r3);     // Catch: Throwable -> L6
        goto L13
    L16:
        throw new IllegalArgumentException("Position must be non-negative");     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer r4) throws IOException {
        monitor-enter(this);
    L13:
        th = move-exception;
        throw th;
    L5:
        if (r4.remaining() != 0) goto L8;
        monitor-exit(this);
        return 0;
    L8:
        SeekableByteChannel r02 = this.matchingChannel;     // Catch: Throwable -> L13
        if (r02 == null) goto L16;
        int r42 = r02.read(r4);     // Catch: Throwable -> L13
        monitor-exit(this);
        return r42;
    L16:
        if (this.attemptingChannel != null) goto L29;
        this.attemptingChannel = nextAttemptingChannel();     // Catch: Throwable -> L13
    L29:
        int r03 = this.attemptingChannel.read(r4);     // Catch: Throwable -> L13 IOException -> L25
        if (r03 == 0) goto L20;
        this.matchingChannel = this.attemptingChannel;     // Catch: Throwable -> L13 IOException -> L25
        this.attemptingChannel = null;     // Catch: Throwable -> L13 IOException -> L25
    L23:
        monitor-exit(this);
        return r03;
    L20:
        monitor-exit(this);
        return 0;
    L25:
        this.attemptingChannel = nextAttemptingChannel();     // Catch: Throwable -> L13
        goto L29
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized long size() throws IOException {
        monitor-enter(this);
        SeekableByteChannel r02 = this.matchingChannel;     // Catch: Throwable -> L8
        if (r02 == null) goto L11;
        long r03 = r02.size();     // Catch: Throwable -> L8
        monitor-exit(this);
        return r03;
    L11:
        throw new IOException("Cannot determine size before first read()-call.");     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public SeekableByteChannel truncate(long r1) throws IOException {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer r1) throws IOException {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized long position() throws IOException {
        monitor-enter(this);
        SeekableByteChannel r02 = this.matchingChannel;     // Catch: Throwable -> L8
        if (r02 == null) goto L10;
        long r03 = r02.position();     // Catch: Throwable -> L8
        monitor-exit(this);
        return r03;
    L10:
        long r04 = this.cachedPosition;     // Catch: Throwable -> L8
        monitor-exit(this);
        return r04;
    L8:
        th = move-exception;
        throw th;
    }
}
