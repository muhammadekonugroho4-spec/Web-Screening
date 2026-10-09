package com.google.crypto.tink.subtle;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes6.dex */
public final class RewindableReadableByteChannel implements ReadableByteChannel, AutoCloseable {
    final ReadableByteChannel baseChannel;
    ByteBuffer buffer;
    boolean canRewind;
    boolean directRead;

    public RewindableReadableByteChannel(ReadableByteChannel r1) {
        this.baseChannel = r1;
        this.buffer = null;
        this.canRewind = true;
        this.directRead = false;
    }

    private synchronized void setBufferLimit(int r4) {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.buffer.capacity() >= r4) goto L8;
        int r02 = this.buffer.position();     // Catch: Throwable -> L6
        ByteBuffer r1 = ByteBuffer.allocate(Math.max(this.buffer.capacity() * 2, r4));     // Catch: Throwable -> L6
        this.buffer.rewind();     // Catch: Throwable -> L6
        r1.put(this.buffer);     // Catch: Throwable -> L6
        r1.position(r02);     // Catch: Throwable -> L6
        this.buffer = r1;     // Catch: Throwable -> L6
    L8:
        this.buffer.limit(r4);     // Catch: Throwable -> L6
        monitor-exit(this);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        monitor-enter(this);
        this.canRewind = false;     // Catch: Throwable -> L7
        this.directRead = true;     // Catch: Throwable -> L7
        this.baseChannel.close();     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public synchronized void disableRewinding() {
        monitor-enter(this);
        this.canRewind = false;     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
        monitor-enter(this);
        boolean r02 = this.baseChannel.isOpen();     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer r7) throws IOException {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.directRead == false) goto L10;
        int r72 = this.baseChannel.read(r7);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r72;
    L10:
        int r02 = r7.remaining();     // Catch: Throwable -> L8
        if (r02 != 0) goto L15;
        monitor-exit(this);
        return 0;
    L15:
        ByteBuffer r1 = this.buffer;     // Catch: Throwable -> L8
        if (r1 != null) goto L28;
        if (this.canRewind == true) goto L22;
        this.directRead = true;     // Catch: Throwable -> L8
        int r73 = this.baseChannel.read(r7);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r73;
    L22:
        ByteBuffer r03 = ByteBuffer.allocate(r02);     // Catch: Throwable -> L8
        this.buffer = r03;     // Catch: Throwable -> L8
        int r04 = this.baseChannel.read(r03);     // Catch: Throwable -> L8
        this.buffer.flip();     // Catch: Throwable -> L8
        if (r04 <= 0) goto L25;
        r7.put(this.buffer);     // Catch: Throwable -> L8
    L25:
        monitor-exit(this);
        return r04;
    L28:
        if (r1.remaining() < r02) goto L36;
        int r12 = this.buffer.limit();     // Catch: Throwable -> L8
        ByteBuffer r4 = this.buffer;     // Catch: Throwable -> L8
        r4.limit(r4.position() + r02);     // Catch: Throwable -> L8
        r7.put(this.buffer);     // Catch: Throwable -> L8
        this.buffer.limit(r12);     // Catch: Throwable -> L8
        if (this.canRewind == false) goto L32;
    L34:
        monitor-exit(this);
        return r02;
    L32:
        if (this.buffer.hasRemaining() == true) goto L34;
        this.buffer = null;     // Catch: Throwable -> L8
        this.directRead = true;     // Catch: Throwable -> L8
        goto L34
    L36:
        int r13 = this.buffer.remaining();     // Catch: Throwable -> L8
        int r42 = this.buffer.position();     // Catch: Throwable -> L8
        int r5 = this.buffer.limit();     // Catch: Throwable -> L8
        setBufferLimit((r02 - r13) + r5);     // Catch: Throwable -> L8
        this.buffer.position(r5);     // Catch: Throwable -> L8
        int r05 = this.baseChannel.read(this.buffer);     // Catch: Throwable -> L8
        this.buffer.flip();     // Catch: Throwable -> L8
        this.buffer.position(r42);     // Catch: Throwable -> L8
        r7.put(this.buffer);     // Catch: Throwable -> L8
        if (r13 != 0) goto L42;
        if (r05 >= 0) goto L42;
        monitor-exit(this);
        return -1;
    L42:
        int r74 = this.buffer.position() - r42;     // Catch: Throwable -> L8
        if (this.canRewind == false) goto L45;
    L47:
        monitor-exit(this);
        return r74;
    L45:
        if (this.buffer.hasRemaining() == true) goto L47;
        this.buffer = null;     // Catch: Throwable -> L8
        this.directRead = true;     // Catch: Throwable -> L8
        goto L47
    }

    public synchronized void rewind() throws IOException {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.canRewind == false) goto L14;
        ByteBuffer r02 = this.buffer;     // Catch: Throwable -> L9
        if (r02 == null) goto L11;
        r02.position(0);     // Catch: Throwable -> L9
    L11:
        monitor-exit(this);
        return;
    L14:
        throw new IOException("Cannot rewind anymore.");     // Catch: Throwable -> L9
    }
}
