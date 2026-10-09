package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.subtle.RewindableReadableByteChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
final class ReadableByteChannelDecrypter implements ReadableByteChannel, AutoCloseable {
    byte[] associatedData;
    ReadableByteChannel attemptingChannel;
    RewindableReadableByteChannel ciphertextChannel;
    ReadableByteChannel matchingChannel;
    Deque<StreamingAead> remainingPrimitives;

    public ReadableByteChannelDecrypter(List<StreamingAead> r3, ReadableByteChannel r4, byte[] r5) {
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
        this.ciphertextChannel = new RewindableReadableByteChannel(r4);
        this.associatedData = (byte[]) r5.clone();
    }

    private synchronized ReadableByteChannel nextAttemptingChannel() throws IOException {
        monitor-enter(this);
    L18:
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.remainingPrimitives.isEmpty() == true) goto L13;
        StreamingAead r02 = this.remainingPrimitives.removeFirst();     // Catch: Throwable -> L9
        ReadableByteChannel r03 = r02.newDecryptingChannel(this.ciphertextChannel, this.associatedData);     // Catch: Throwable -> L9 GeneralSecurityException -> L11
    L7:
        monitor-exit(this);
        return r03;
    L11:
        this.ciphertextChannel.rewind();     // Catch: Throwable -> L9
        goto L18
    L13:
        throw new IOException("No matching key found for the ciphertext in the stream.");     // Catch: Throwable -> L9
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
        ReadableByteChannel r02 = this.matchingChannel;     // Catch: Throwable -> L13
        if (r02 == null) goto L16;
        int r42 = r02.read(r4);     // Catch: Throwable -> L13
        monitor-exit(this);
        return r42;
    L16:
        if (this.attemptingChannel != null) goto L28;
        this.attemptingChannel = nextAttemptingChannel();     // Catch: Throwable -> L13
    L28:
        int r03 = this.attemptingChannel.read(r4);     // Catch: Throwable -> L13 IOException -> L25
        if (r03 == 0) goto L20;
        this.matchingChannel = this.attemptingChannel;     // Catch: Throwable -> L13 IOException -> L25
        this.attemptingChannel = null;     // Catch: Throwable -> L13 IOException -> L25
        this.ciphertextChannel.disableRewinding();     // Catch: Throwable -> L13 IOException -> L25
    L23:
        monitor-exit(this);
        return r03;
    L20:
        monitor-exit(this);
        return 0;
    L25:
        this.ciphertextChannel.rewind();     // Catch: Throwable -> L13
        this.attemptingChannel = nextAttemptingChannel();     // Catch: Throwable -> L13
        goto L28
    }
}
