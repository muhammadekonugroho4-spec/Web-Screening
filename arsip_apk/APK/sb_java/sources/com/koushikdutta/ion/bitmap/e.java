package com.koushikdutta.ion.bitmap;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public final class e extends InputStream implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f41745a;

    /* renamed from: b, reason: collision with root package name */
    public long f41746b;

    /* renamed from: c, reason: collision with root package name */
    public long f41747c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f41748e;

    public e(InputStream r3) {
        this.f41748e = -1;
        if (r3.markSupported() == true) goto L5;
        r3 = new BufferedInputStream(r3);
    L5:
        this.f41745a = r3;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f41745a.available();
    }

    public void c(long r5) {
        if (this.f41746b > this.d) goto L9;
        if (r5 < this.f41747c) goto L9;
        this.f41745a.reset();
        k(this.f41747c, r5);
        this.f41746b = r5;
        return;
    L9:
        throw new IOException("Cannot reset");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f41745a.close();
    }

    public long f(int r5) {
        long r02 = this.f41746b + r5;
        if (this.d >= r02) goto L6;
        i(r02);
    L6:
        return this.f41746b;
    }

    public final void i(long r5) {
        long r02 = this.f41747c;     // Catch: IOException -> L7
        long r2 = this.f41746b;     // Catch: IOException -> L7
        if (r02 < r2) goto L5;
    L9:
        this.f41747c = r2;     // Catch: IOException -> L7
        this.f41745a.mark((int) (r5 - r2));     // Catch: IOException -> L7
    L10:
        this.d = r5;     // Catch: IOException -> L7
        return;
    L5:
        if (r2 > this.d) goto L9;
        this.f41745a.reset();     // Catch: IOException -> L7
        this.f41745a.mark((int) (r5 - this.f41747c));     // Catch: IOException -> L7
        k(this.f41747c, this.f41746b);     // Catch: IOException -> L7
    L7:
        e = move-exception;
        throw new IllegalStateException("Unable to mark: " + e);
    }

    public final void k(long r5, long r7) {
    L3:
        if (r5 >= r7) goto L11;
        long r02 = this.f41745a.skip(r7 - r5);
        if (r02 != 0) goto L10;
        if (read() == (-1)) goto L16;
        r02 = 1;
        goto L10
    L16:
        return;
    L10:
        r5 = r5 + r02;
        goto L3
    }

    @Override // java.io.InputStream
    public void mark(int r3) {
        this.f41748e = f(r3);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f41745a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        int r02 = this.f41745a.read();
        if (r02 == (-1)) goto L5;
        this.f41746b++;
    L5:
        return r02;
    }

    @Override // java.io.InputStream
    public void reset() {
        c(this.f41748e);
    }

    @Override // java.io.InputStream
    public long skip(long r3) {
        long r32 = this.f41745a.skip(r3);
        this.f41746b += r32;
        return r32;
    }

    @Override // java.io.InputStream
    public int read(byte[] r5) {
        int r52 = this.f41745a.read(r5);
        if (r52 == (-1)) goto L5;
        this.f41746b += r52;
    L5:
        return r52;
    }

    @Override // java.io.InputStream
    public int read(byte[] r3, int r4, int r5) {
        int r32 = this.f41745a.read(r3, r4, r5);
        if (r32 == (-1)) goto L5;
        this.f41746b += r32;
    L5:
        return r32;
    }
}
