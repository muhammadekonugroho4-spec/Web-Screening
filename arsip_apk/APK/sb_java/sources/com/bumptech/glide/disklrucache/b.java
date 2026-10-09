package com.bumptech.glide.disklrucache;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public class b implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f32452a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f32453b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f32454c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f32455e;

    public class a extends ByteArrayOutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f32456a;

        public a(b r1, int r2) {
            this.f32456a = r1;
            super(r2);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int r02 = ((ByteArrayOutputStream) this).count;
            if (r02 > 0) goto L5;
        L12:
            return new String(((ByteArrayOutputStream) this).buf, 0, r02, b.c(this.f32456a).name());
        L9:
            e = move-exception;
            throw new AssertionError(e);
        L5:
            if (((ByteArrayOutputStream) this).buf[r02 - 1] != 13) goto L12;
            r02 = r02 - 1;
            goto L12
        }
    }

    public b(InputStream r2, Charset r3) {
        this(r2, UserMetadata.MAX_INTERNAL_KEY_SIZE, r3);
    }

    public static /* synthetic */ Charset c(b r02) {
        return r02.f32453b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream r02 = this.f32452a;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f32454c == null) goto L9;
        this.f32454c = null;     // Catch: Throwable -> L7
        this.f32452a.close();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
    }

    public final void f() {
        InputStream r02 = this.f32452a;
        byte[] r1 = this.f32454c;
        int r03 = r02.read(r1, 0, r1.length);
        if (r03 == (-1)) goto L7;
        this.d = 0;
        this.f32455e = r03;
        return;
    L7:
        throw new EOFException();
    }

    public boolean i() {
        if (this.f32455e != (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    public String k() {
        InputStream r02 = this.f32452a;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.f32454c == null) goto L40;
        if (this.d < this.f32455e) goto L11;
        f();     // Catch: Throwable -> L9
    L11:
        int r1 = this.d;     // Catch: Throwable -> L9
    L13:
        if (r1 == this.f32455e) goto L26;
        byte[] r2 = this.f32454c;     // Catch: Throwable -> L9
        if (r2[r1] == 10) goto L16;
        r1 = r1 + 1;     // Catch: Throwable -> L9
        goto L13
    L16:
        int r3 = this.d;     // Catch: Throwable -> L9
        if (r1 == r3) goto L21;
        int r4 = r1 - 1;
        if (r2[r4] != 13) goto L21;
    L22:
        String r5 = new String(r2, r3, r4 - r3, this.f32453b.name());     // Catch: Throwable -> L9
        this.d = r1 + 1;     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r5;
    L21:
        r4 = r1;
        goto L22
    L26:
        a r12 = new a(this, (this.f32455e - this.d) + 80);     // Catch: Throwable -> L9
    L27:
        byte[] r22 = this.f32454c;     // Catch: Throwable -> L9
        int r42 = this.d;     // Catch: Throwable -> L9
        r12.write(r22, r42, this.f32455e - r42);     // Catch: Throwable -> L9
        this.f32455e = -1;     // Catch: Throwable -> L9
        f();     // Catch: Throwable -> L9
        int r23 = this.d;     // Catch: Throwable -> L9
    L29:
        if (r23 == this.f32455e) goto L27;
        byte[] r43 = this.f32454c;     // Catch: Throwable -> L9
        if (r43[r23] == 10) goto L32;
        r23 = r23 + 1;     // Catch: Throwable -> L9
        goto L29
    L32:
        int r32 = this.d;     // Catch: Throwable -> L9
        if (r23 == r32) goto L35;
        r12.write(r43, r32, r23 - r32);     // Catch: Throwable -> L9
    L35:
        this.d = r23 + 1;     // Catch: Throwable -> L9
        String r13 = r12.toString();     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r13;
    L40:
        throw new IOException("LineReader is closed");     // Catch: Throwable -> L9
    }

    public b(InputStream r2, int r3, Charset r4) {
        if (r2 == null) goto L15;
        if (r4 == null) goto L15;
        if (r3 < 0) goto L13;
        if (r4.equals(c.f32457a) == false) goto L11;
        this.f32452a = r2;
        this.f32453b = r4;
        this.f32454c = new byte[r3];
        return;
    L11:
        throw new IllegalArgumentException("Unsupported encoding");
    L13:
        throw new IllegalArgumentException("capacity <= 0");
    L15:
        throw null;
    }
}
