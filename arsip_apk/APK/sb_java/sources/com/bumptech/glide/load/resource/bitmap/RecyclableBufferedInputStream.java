package com.bumptech.glide.load.resource.bitmap;

import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class RecyclableBufferedInputStream extends FilterInputStream implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public volatile byte[] f33045a;

    /* renamed from: b, reason: collision with root package name */
    public int f33046b;

    /* renamed from: c, reason: collision with root package name */
    public int f33047c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f33048e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f33049f;

    public static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String r1) {
            super(r1);
        }
    }

    public RecyclableBufferedInputStream(InputStream r2, com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
        this(r2, r3, 65536);
    }

    public static IOException i() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        monitor-enter(this);
        InputStream r02 = ((FilterInputStream) this).in;     // Catch: Throwable -> L10
        if (this.f33045a == null) goto L13;
        if (r02 == null) goto L13;
        int r1 = (this.f33046b - this.f33048e) + r02.available();
        monitor-exit(this);
        return r1;
    L13:
        throw i();     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    public final int c(InputStream r6, byte[] r7) {
        int r02 = this.d;
        if (r02 == (-1)) goto L25;
        int r3 = this.f33048e - r02;
        int r4 = this.f33047c;
        if (r3 >= r4) goto L25;
        if (r02 == 0) goto L9;
    L17:
        if (r02 <= 0) goto L19;
        System.arraycopy(r7, r02, r7, 0, r7.length - r02);
    L19:
        int r03 = this.f33048e - this.d;
        this.f33048e = r03;
        this.d = 0;
        this.f33046b = 0;
        int r62 = r6.read(r7, r03, r7.length - r03);
        int r72 = this.f33048e;
        if (r62 <= 0) goto L23;
        r72 = r72 + r62;
    L23:
        this.f33046b = r72;
        return r62;
    L9:
        if (r4 <= r7.length) goto L17;
        if (this.f33046b != r7.length) goto L17;
        int r04 = r7.length * 2;
        if (r04 > r4) goto L16;
        r4 = r04;
    L16:
        byte[] r05 = (byte[]) this.f33049f.c(r4, byte[].class);
        System.arraycopy(r7, 0, r05, 0, r7.length);
        this.f33045a = r05;
        this.f33049f.put(r7);
        r7 = r05;
    L25:
        int r63 = r6.read(r7);
        if (r63 <= 0) goto L28;
        this.d = -1;
        this.f33048e = 0;
        this.f33046b = r63;
    L28:
        return r63;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f33045a == null) goto L5;
        this.f33049f.put(this.f33045a);
        this.f33045a = null;
    L5:
        InputStream r02 = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (r02 == null) goto L9;
        r02.close();
        return;
    }

    public synchronized void f() {
        monitor-enter(this);
        this.f33047c = this.f33045a.length;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r2) {
        monitor-enter(this);
        this.f33047c = Math.max(this.f33047c, r2);     // Catch: Throwable -> L6
        this.d = this.f33048e;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        monitor-enter(this);
        byte[] r02 = this.f33045a;     // Catch: Throwable -> L12
        InputStream r1 = ((FilterInputStream) this).in;     // Catch: Throwable -> L12
        if (r02 == null) goto L30;
        if (r1 == null) goto L30;
        if (this.f33048e < this.f33046b) goto L15;
        if (c(r1, r02) != (-1)) goto L15;
        monitor-exit(this);
        return -1;
    L15:
        if (r02 == this.f33045a) goto L21;
        r02 = this.f33045a;     // Catch: Throwable -> L12
        if (r02 != null) goto L21;
        throw i();     // Catch: Throwable -> L12
    L21:
        int r12 = this.f33046b;     // Catch: Throwable -> L12
        int r2 = this.f33048e;     // Catch: Throwable -> L12
        if ((r12 - r2) <= 0) goto L27;
        this.f33048e = r2 + 1;     // Catch: Throwable -> L12
        int r03 = r02[r2] & UnsignedBytes.MAX_VALUE;
        monitor-exit(this);
        return r03;
    L27:
        monitor-exit(this);
        return -1;
    L30:
        throw i();     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }

    public synchronized void release() {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.f33045a == null) goto L9;
        this.f33049f.put(this.f33045a);     // Catch: Throwable -> L7
        this.f33045a = null;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (this.f33045a == null) goto L15;
        int r02 = this.d;     // Catch: Throwable -> L10
        if ((-1) == r02) goto L13;
        this.f33048e = r02;     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L13:
        throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f33048e + " markLimit: " + this.f33047c);     // Catch: Throwable -> L10
    L15:
        throw new IOException("Stream is closed");     // Catch: Throwable -> L10
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long r11) {
        monitor-enter(this);
        if (r11 >= 1) goto L49;
        monitor-exit(this);
        return 0;
    L49:
        byte[] r02 = this.f33045a;     // Catch: Throwable -> L16
        if (r02 == null) goto L46;
        InputStream r3 = ((FilterInputStream) this).in;     // Catch: Throwable -> L16
        if (r3 == null) goto L44;
        int r4 = this.f33046b;     // Catch: Throwable -> L16
        int r5 = this.f33048e;     // Catch: Throwable -> L16
        if ((r4 - r5) < r11) goto L18;
        this.f33048e = (int) (r5 + r11);     // Catch: Throwable -> L16
        monitor-exit(this);
        return r11;
    L18:
        long r6 = r4 - r5;
        this.f33048e = r4;     // Catch: Throwable -> L16
        if (this.d == (-1)) goto L37;
        if (r11 > this.f33047c) goto L37;
        if (c(r3, r02) != (-1)) goto L27;
        monitor-exit(this);
        return r6;
    L27:
        int r03 = this.f33046b;     // Catch: Throwable -> L16
        int r1 = this.f33048e;     // Catch: Throwable -> L16
        if ((r03 - r1) < (r11 - r6)) goto L32;
        this.f33048e = (int) ((r1 + r11) - r6);     // Catch: Throwable -> L16
        monitor-exit(this);
        return r11;
    L32:
        long r62 = (r6 + r03) - r1;
        this.f33048e = r03;     // Catch: Throwable -> L16
        monitor-exit(this);
        return r62;
    L37:
        long r112 = r3.skip(r11 - r6);     // Catch: Throwable -> L16
        if (r112 <= 0) goto L40;
        this.d = -1;     // Catch: Throwable -> L16
    L40:
        long r63 = r6 + r112;
        monitor-exit(this);
        return r63;
    L44:
        throw i();     // Catch: Throwable -> L16
    L46:
        throw i();     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    }

    public RecyclableBufferedInputStream(InputStream r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2, int r3) {
        super(r1);
        this.d = -1;
        this.f33049f = r2;
        this.f33045a = (byte[]) r2.c(r3, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] r7, int r8, int r9) {
        monitor-enter(this);
        byte[] r02 = this.f33045a;     // Catch: Throwable -> L23
        if (r02 == null) goto L71;
        if (r9 != 0) goto L9;
        monitor-exit(this);
        return 0;
    L9:
        InputStream r1 = ((FilterInputStream) this).in;     // Catch: Throwable -> L23
        if (r1 == null) goto L69;
        int r2 = this.f33048e;     // Catch: Throwable -> L23
        int r3 = this.f33046b;     // Catch: Throwable -> L23
        if (r2 < r3) goto L14;
        int r22 = r9;
    L28:
        int r4 = -1;
        if (this.d != (-1)) goto L40;
        if (r22 < r02.length) goto L40;
        int r32 = r1.read(r7, r8, r22);     // Catch: Throwable -> L23
        if (r32 == (-1)) goto L34;
    L58:
        r22 = r22 - r32;
        if (r22 == 0) goto L60;
        if (r1.available() == 0) goto L64;
        r8 = r8 + r32;
        goto L28
    L64:
        int r92 = r9 - r22;
        monitor-exit(this);
        return r92;
    L60:
        monitor-exit(this);
        return r9;
    L34:
        if (r22 == r9) goto L37;
        r4 = r9 - r22;
    L37:
        monitor-exit(this);
        return r4;
    L40:
        if (c(r1, r02) == (-1)) goto L41;
        if (r02 == this.f33045a) goto L53;
        r02 = this.f33045a;     // Catch: Throwable -> L23
        if (r02 != null) goto L53;
        throw i();     // Catch: Throwable -> L23
    L53:
        int r33 = this.f33046b;     // Catch: Throwable -> L23
        int r42 = this.f33048e;     // Catch: Throwable -> L23
        if ((r33 - r42) < r22) goto L56;
        r32 = r22;
    L57:
        System.arraycopy(r02, r42, r7, r8, r32);     // Catch: Throwable -> L23
        this.f33048e += r32;
        goto L58
    L56:
        r32 = r33 - r42;     // Catch: Throwable -> L23
        goto L57
    L41:
        if (r22 == r9) goto L44;
        r4 = r9 - r22;
    L44:
        monitor-exit(this);
        return r4;
    L14:
        if ((r3 - r2) < r9) goto L16;
        int r34 = r9;
    L17:
        System.arraycopy(r02, r2, r7, r8, r34);     // Catch: Throwable -> L23
        this.f33048e += r34;
        if (r34 != r9) goto L20;
    L25:
        monitor-exit(this);
        return r34;
    L20:
        if (r1.available() == 0) goto L25;
        r8 = r8 + r34;
        r22 = r9 - r34;
        goto L28
    L16:
        r34 = r3 - r2;     // Catch: Throwable -> L23
        goto L17
    L69:
        throw i();     // Catch: Throwable -> L23
    L71:
        throw i();     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;
    }
}
