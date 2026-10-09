package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes5.dex */
final class CharSequenceReader extends Reader implements AutoCloseable {
    private int mark;
    private int pos;
    private CharSequence seq;

    public CharSequenceReader(CharSequence r1) {
        this.seq = (CharSequence) Preconditions.checkNotNull(r1);
    }

    private void checkOpen() throws IOException {
        if (this.seq == null) goto L6;
        return;
    L6:
        throw new IOException("reader closed");
    }

    private boolean hasRemaining() {
        if (remaining() <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    private int remaining() {
        Objects.requireNonNull(this.seq);
        return this.seq.length() - this.pos;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        monitor-enter(this);
        this.seq = null;     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // java.io.Reader
    public synchronized void mark(int r3) throws IOException {
        monitor-enter(this);
        if (r3 < 0) goto L5;
        boolean r02 = true;
    L12:
        Preconditions.checkArgument(r02, "readAheadLimit (%s) may not be negative", r3);     // Catch: Throwable -> L9
        checkOpen();     // Catch: Throwable -> L9
        this.mark = this.pos;     // Catch: Throwable -> L9
        monitor-exit(this);
        return;
    L9:
        th = move-exception;
        throw th;
    L5:
        r02 = false;
        goto L12
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer r6) throws IOException {
        monitor-enter(this);
        Preconditions.checkNotNull(r6);     // Catch: Throwable -> L12
        checkOpen();     // Catch: Throwable -> L12
        Objects.requireNonNull(this.seq);     // Catch: Throwable -> L12
        if (hasRemaining() == true) goto L8;
        monitor-exit(this);
        return -1;
    L8:
        int r02 = Math.min(r6.remaining(), remaining());     // Catch: Throwable -> L12
        int r1 = 0;
    L9:
        if (r1 >= r02) goto L14;
        CharSequence r2 = this.seq;     // Catch: Throwable -> L12
        int r3 = this.pos;     // Catch: Throwable -> L12
        this.pos = r3 + 1;     // Catch: Throwable -> L12
        r6.put(r2.charAt(r3));     // Catch: Throwable -> L12
        r1 = r1 + 1;
        goto L9
    L14:
        monitor-exit(this);
        return r02;
    L12:
        th = move-exception;
        throw th;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        monitor-enter(this);
        checkOpen();     // Catch: Throwable -> L7
        monitor-exit(this);
        return true;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        monitor-enter(this);
        checkOpen();     // Catch: Throwable -> L6
        this.pos = this.mark;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.Reader
    public synchronized long skip(long r3) throws IOException {
        monitor-enter(this);
        if (r3 < 0) goto L6;
        boolean r02 = true;
    L14:
        Preconditions.checkArgument(r02, "n (%s) may not be negative", r3);     // Catch: Throwable -> L11
        checkOpen();     // Catch: Throwable -> L11
        int r32 = (int) Math.min(remaining(), r3);     // Catch: Throwable -> L11
        this.pos += r32;
        long r33 = r32;
        monitor-exit(this);
        return r33;
    L11:
        th = move-exception;
        throw th;
    L6:
        r02 = false;
        goto L14
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        monitor-enter(this);
        checkOpen();     // Catch: Throwable -> L7
        Objects.requireNonNull(this.seq);     // Catch: Throwable -> L7
        if (hasRemaining() == false) goto L9;
        CharSequence r02 = this.seq;     // Catch: Throwable -> L7
        int r1 = this.pos;     // Catch: Throwable -> L7
        this.pos = r1 + 1;     // Catch: Throwable -> L7
        char r03 = r02.charAt(r1);     // Catch: Throwable -> L7
    L10:
        monitor-exit(this);
        return r03;
    L9:
        r03 = 65535;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] r6, int r7, int r8) throws IOException {
        monitor-enter(this);
        int r02 = r7 + r8;
        Preconditions.checkPositionIndexes(r7, r02, r6.length);     // Catch: Throwable -> L13
        checkOpen();     // Catch: Throwable -> L13
        Objects.requireNonNull(this.seq);     // Catch: Throwable -> L13
        if (hasRemaining() == true) goto L9;
        monitor-exit(this);
        return -1;
    L9:
        int r82 = Math.min(r8, remaining());     // Catch: Throwable -> L13
        int r03 = 0;
    L10:
        if (r03 >= r82) goto L15;
        CharSequence r2 = this.seq;     // Catch: Throwable -> L13
        int r3 = this.pos;     // Catch: Throwable -> L13
        this.pos = r3 + 1;     // Catch: Throwable -> L13
        r6[r7 + r03] = r2.charAt(r3);     // Catch: Throwable -> L13
        r03 = r03 + 1;
        goto L10
    L15:
        monitor-exit(this);
        return r82;
    L13:
        th = move-exception;
        throw th;
    }
}
