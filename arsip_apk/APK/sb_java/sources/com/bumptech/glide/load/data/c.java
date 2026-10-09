package com.bumptech.glide.load.data;

import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class c extends OutputStream implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f32574a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f32575b;

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.load.engine.bitmap_recycle.b f32576c;
    public int d;

    public c(OutputStream r2, com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
        this(r2, r3, 65536);
    }

    public final void c() {
        int r02 = this.d;
        if (r02 <= 0) goto L6;
        this.f32574a.write(this.f32575b, 0, r02);
        this.d = 0;
        return;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flush();     // Catch: Throwable -> L5
        this.f32574a.close();
        release();
        return;
    L5:
        th = move-exception;
        this.f32574a.close();
        throw th;
    }

    public final void f() {
        if (this.d != this.f32575b.length) goto L6;
        c();
        return;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        c();
        this.f32574a.flush();
    }

    public final void release() {
        byte[] r02 = this.f32575b;
        if (r02 == null) goto L6;
        this.f32576c.put(r02);
        this.f32575b = null;
        return;
    }

    @Override // java.io.OutputStream
    public void write(int r4) {
        byte[] r02 = this.f32575b;
        int r1 = this.d;
        this.d = r1 + 1;
        r02[r1] = (byte) r4;
        f();
    }

    public c(OutputStream r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2, int r3) {
        this.f32574a = r1;
        this.f32576c = r2;
        this.f32575b = (byte[]) r2.c(r3, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] r3) {
        write(r3, 0, r3.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] r6, int r7, int r8) {
        int r02 = 0;
    L3:
        int r1 = r8 - r02;
        int r2 = r7 + r02;
        int r3 = this.d;
        if (r3 == 0) goto L6;
    L9:
        int r12 = Math.min(r1, this.f32575b.length - r3);
        System.arraycopy(r6, r2, this.f32575b, this.d, r12);
        this.d += r12;
        r02 = r02 + r12;
        f();
        if (r02 < r8) goto L3;
        return;
    L6:
        if (r1 < this.f32575b.length) goto L9;
        this.f32574a.write(r6, r2, r1);
    }
}
