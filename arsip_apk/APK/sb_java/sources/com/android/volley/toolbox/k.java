package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;

/* loaded from: classes4.dex */
public class k extends ByteArrayOutputStream implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final c f32067a;

    public k(c r2, int r3) {
        this.f32067a = r2;
        ((ByteArrayOutputStream) this).buf = r2.a(Math.max(r3, 256));
    }

    public final void c(int r4) {
        int r02 = ((ByteArrayOutputStream) this).count;
        if ((r02 + r4) > ((ByteArrayOutputStream) this).buf.length) goto L5;
        return;
    L5:
        byte[] r42 = this.f32067a.a((r02 + r4) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, r42, 0, ((ByteArrayOutputStream) this).count);
        this.f32067a.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = r42;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32067a.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.f32067a.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] r1, int r2, int r3) {
        monitor-enter(this);
        c(r3);     // Catch: Throwable -> L6
        super.write(r1, r2, r3);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int r2) {
        monitor-enter(this);
        c(1);     // Catch: Throwable -> L7
        super.write(r2);     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
