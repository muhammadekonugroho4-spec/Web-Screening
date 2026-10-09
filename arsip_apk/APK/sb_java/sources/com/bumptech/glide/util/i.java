package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class i extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f33396a;

    public i(InputStream r1) {
        super(r1);
        this.f33396a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int r02 = this.f33396a;
        if (r02 != Integer.MIN_VALUE) goto L7;
        return super.available();
    L7:
        return Math.min(r02, super.available());
    }

    public final long c(long r4) {
        int r02 = this.f33396a;
        if (r02 != 0) goto L7;
        return -1;
    L7:
        if (r02 != Integer.MIN_VALUE) goto L9;
        return r4;
    L9:
        if (r4 > r02) goto L11;
        return r4;
    L11:
        return r02;
    }

    public final void f(long r4) {
        int r02 = this.f33396a;
        if (r02 != Integer.MIN_VALUE) goto L5;
        return;
    L5:
        if (r4 == (-1)) goto L9;
        this.f33396a = (int) (r02 - r4);
        return;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r1) {
        monitor-enter(this);
        super.mark(r1);     // Catch: Throwable -> L6
        this.f33396a = r1;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (c(1) != (-1)) goto L6;
        return -1;
    L6:
        int r2 = super.read();
        f(1);
        return r2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        monitor-enter(this);
        super.reset();     // Catch: Throwable -> L6
        this.f33396a = Integer.MIN_VALUE;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r3) {
        long r32 = c(r3);
        if (r32 != (-1)) goto L6;
        return 0;
    L6:
        long r33 = super.skip(r32);
        f(r33);
        return r33;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3, int r4, int r5) {
        int r52 = (int) c(r5);
        if (r52 != (-1)) goto L5;
        return -1;
    L5:
        int r32 = super.read(r3, r4, r52);
        f(r32);
        return r32;
    }
}
