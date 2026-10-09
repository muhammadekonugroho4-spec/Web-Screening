package com.bumptech.glide.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes4.dex */
public final class d extends InputStream implements AutoCloseable {

    /* renamed from: c, reason: collision with root package name */
    public static final Queue f33383c = null;

    /* renamed from: a, reason: collision with root package name */
    public InputStream f33384a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f33385b;

    static {
        f33383c = l.f(0);
    }

    public d() {
    }

    public static d f(InputStream r2) {
        Queue r02 = f33383c;
        monitor-enter(r02);
        d r1 = (d) r02.poll();     // Catch: Throwable -> L10
        monitor-exit(r02);     // Catch: Throwable -> L10
        if (r1 != null) goto L8;
        r1 = new d();
    L8:
        r1.i(r2);
        return r1;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f33384a.available();
    }

    public IOException c() {
        return this.f33385b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f33384a.close();
    }

    public void i(InputStream r1) {
        this.f33384a = r1;
    }

    @Override // java.io.InputStream
    public void mark(int r2) {
        this.f33384a.mark(r2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f33384a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f33384a.read();
    L4:
        e = move-exception;
        this.f33385b = e;
        throw e;
    }

    public void release() {
        this.f33385b = null;
        this.f33384a = null;
        Queue r02 = f33383c;
        monitor-enter(r02);
        r02.offer(this);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        monitor-enter(this);
        this.f33384a.reset();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public long skip(long r2) {
        return this.f33384a.skip(r2);
    L4:
        e = move-exception;
        this.f33385b = e;
        throw e;
    }

    @Override // java.io.InputStream
    public int read(byte[] r2) {
        return this.f33384a.read(r2);
    L4:
        e = move-exception;
        this.f33385b = e;
        throw e;
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) {
        return this.f33384a.read(r2, r3, r4);
    L4:
        e = move-exception;
        this.f33385b = e;
        throw e;
    }
}
