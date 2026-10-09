package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes6.dex */
final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;

    public static final class LimitedInputStream extends FilterInputStream {
        private long left;
        private long mark;

        public LimitedInputStream(InputStream r3, long r4) {
            super(r3);
            this.mark = -1;
            this.left = r4;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.left);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int r3) {
            monitor-enter(this);
            ((FilterInputStream) this).in.mark(r3);     // Catch: Throwable -> L6
            this.mark = this.left;     // Catch: Throwable -> L6
            monitor-exit(this);
            return;
        L6:
            th = move-exception;
            throw th;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.left != 0) goto L5;
            return -1;
        L5:
            int r02 = ((FilterInputStream) this).in.read();
            if (r02 == (-1)) goto L8;
            this.left--;
        L8:
            return r02;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            monitor-enter(this);
        L10:
            th = move-exception;
            throw th;
        L4:
            if (((FilterInputStream) this).in.markSupported() == false) goto L15;
            if (this.mark == (-1)) goto L13;
            ((FilterInputStream) this).in.reset();     // Catch: Throwable -> L10
            this.left = this.mark;     // Catch: Throwable -> L10
            monitor-exit(this);
            return;
        L13:
            throw new IOException("Mark not set");     // Catch: Throwable -> L10
        L15:
            throw new IOException("Mark not supported");     // Catch: Throwable -> L10
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long r3) throws IOException {
            long r32 = ((FilterInputStream) this).in.skip(Math.min(r3, this.left));
            this.left -= r32;
            return r32;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] r7, int r8, int r9) throws IOException {
            long r02 = this.left;
            if (r02 != 0) goto L5;
            return -1;
        L5:
            int r72 = ((FilterInputStream) this).in.read(r7, r8, (int) Math.min(r9, r02));
            if (r72 == (-1)) goto L8;
            this.left -= r72;
        L8:
            return r72;
        }
    }

    private ByteStreams() {
    }

    private static byte[] combineBuffers(Queue<byte[]> r6, int r7) {
        if (r6.isEmpty() == true) goto L5;
        byte[] r02 = r6.remove();
        if (r02.length != r7) goto L9;
        return r02;
    L9:
        int r2 = r7 - r02.length;
        byte[] r03 = Arrays.copyOf(r02, r7);
    L10:
        if (r2 <= 0) goto L12;
        byte[] r3 = r6.remove();
        int r4 = Math.min(r2, r3.length);
        System.arraycopy(r3, 0, r03, r7 - r2, r4);
        r2 = r2 - r4;
        goto L10
    L12:
        return r03;
    L5:
        return new byte[0];
    }

    public static byte[] createBuffer() {
        return new byte[8192];
    }

    public static InputStream limit(InputStream r1, long r2) {
        return new LimitedInputStream(r1, r2);
    }

    private static int saturatedCast(long r2) {
        if (r2 <= 2147483647L) goto L7;
        return Integer.MAX_VALUE;
    L7:
        if (r2 >= (-2147483648L)) goto L11;
        return Integer.MIN_VALUE;
    L11:
        return (int) r2;
    }

    public static byte[] toByteArray(InputStream r2) throws IOException {
        return toByteArrayInternal(r2, new ArrayDeque(20), 0);
    }

    private static byte[] toByteArrayInternal(InputStream r7, Queue<byte[]> r8, int r9) throws IOException {
        int r02 = Math.min(8192, Math.max(128, Integer.highestOneBit(r9) * 2));
    L4:
        if (r9 >= MAX_ARRAY_LEN) goto L18;
        int r3 = Math.min(r02, MAX_ARRAY_LEN - r9);
        byte[] r4 = new byte[r3];
        r8.add(r4);
        int r5 = 0;
    L6:
        if (r5 >= r3) goto L12;
        int r6 = r7.read(r4, r5, r3 - r5);
        if (r6 == (-1)) goto L10;
        r5 = r5 + r6;
        r9 = r9 + r6;
        goto L6
    L10:
        return combineBuffers(r8, r9);
    L12:
        long r2 = r02;
        if (r02 >= 4096) goto L15;
        int r03 = 4;
    L16:
        r02 = saturatedCast(r2 * r03);
        goto L4
    L15:
        r03 = 2;
        goto L16
    L18:
        if (r7.read() != (-1)) goto L22;
        return combineBuffers(r8, MAX_ARRAY_LEN);
    L22:
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
