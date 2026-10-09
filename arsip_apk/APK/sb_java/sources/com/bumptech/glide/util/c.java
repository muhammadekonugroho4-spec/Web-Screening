package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class c extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final long f33381a;

    /* renamed from: b, reason: collision with root package name */
    public int f33382b;

    public c(InputStream r1, long r2) {
        super(r1);
        this.f33381a = r2;
    }

    public static InputStream f(InputStream r1, long r2) {
        return new c(r1, r2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        monitor-enter(this);
        int r02 = (int) Math.max(this.f33381a - this.f33382b, ((FilterInputStream) this).in.available());
        monitor-exit(this);
        return r02;
    L7:
        th = move-exception;
        throw th;
    }

    public final int c(int r5) {
        if (r5 < 0) goto L6;
        this.f33382b += r5;
        return r5;
    L6:
        if ((this.f33381a - this.f33382b) > 0) goto L9;
        return r5;
    L9:
        throw new IOException("Failed to read all expected data, expected: " + this.f33381a + ", but read: " + this.f33382b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        monitor-enter(this);
        int r02 = super.read();     // Catch: Throwable -> L10
        if (r02 < 0) goto L6;
        int r1 = 1;
    L7:
        c(r1);     // Catch: Throwable -> L10
        monitor-exit(this);
        return r02;
    L6:
        r1 = -1;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3) {
        return read(r3, 0, r3.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] r1, int r2, int r3) {
        monitor-enter(this);
        int r12 = c(super.read(r1, r2, r3));     // Catch: Throwable -> L6
        monitor-exit(this);
        return r12;
    L6:
        th = move-exception;
        throw th;
    }
}
