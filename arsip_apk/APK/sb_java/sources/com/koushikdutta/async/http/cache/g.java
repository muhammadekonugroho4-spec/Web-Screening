package com.koushikdutta.async.http.cache;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public class g implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f41458a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f41459b;

    /* renamed from: c, reason: collision with root package name */
    public int f41460c;
    public int d;

    public class a extends ByteArrayOutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f41461a;

        public a(g r1, int r2) {
            this.f41461a = r1;
            super(r2);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int r02 = ((ByteArrayOutputStream) this).count;
            if (r02 <= 0) goto L8;
            if (((ByteArrayOutputStream) this).buf[r02 - 1] != 13) goto L8;
            r02 = r02 - 1;
        L8:
            return new String(((ByteArrayOutputStream) this).buf, 0, r02);
        }
    }

    public g(InputStream r2, Charset r3) {
        this(r2, UserMetadata.MAX_INTERNAL_KEY_SIZE, r3);
    }

    public final void c() {
        InputStream r02 = this.f41458a;
        byte[] r1 = this.f41459b;
        int r03 = r02.read(r1, 0, r1.length);
        if (r03 == (-1)) goto L7;
        this.f41460c = 0;
        this.d = r03;
        return;
    L7:
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream r02 = this.f41458a;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f41459b == null) goto L9;
        this.f41459b = null;     // Catch: Throwable -> L7
        this.f41458a.close();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
    }

    public String f() {
        InputStream r02 = this.f41458a;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.f41459b == null) goto L40;
        if (this.f41460c < this.d) goto L11;
        c();     // Catch: Throwable -> L9
    L11:
        int r1 = this.f41460c;     // Catch: Throwable -> L9
    L13:
        if (r1 == this.d) goto L26;
        byte[] r2 = this.f41459b;     // Catch: Throwable -> L9
        if (r2[r1] == 10) goto L16;
        r1 = r1 + 1;     // Catch: Throwable -> L9
        goto L13
    L16:
        int r3 = this.f41460c;     // Catch: Throwable -> L9
        if (r1 == r3) goto L21;
        int r4 = r1 - 1;
        if (r2[r4] != 13) goto L21;
    L22:
        String r5 = new String(r2, r3, r4 - r3);     // Catch: Throwable -> L9
        this.f41460c = r1 + 1;     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r5;
    L21:
        r4 = r1;
        goto L22
    L26:
        a r12 = new a(this, (this.d - this.f41460c) + 80);     // Catch: Throwable -> L9
    L27:
        byte[] r22 = this.f41459b;     // Catch: Throwable -> L9
        int r42 = this.f41460c;     // Catch: Throwable -> L9
        r12.write(r22, r42, this.d - r42);     // Catch: Throwable -> L9
        this.d = -1;     // Catch: Throwable -> L9
        c();     // Catch: Throwable -> L9
        int r23 = this.f41460c;     // Catch: Throwable -> L9
    L29:
        if (r23 == this.d) goto L27;
        byte[] r43 = this.f41459b;     // Catch: Throwable -> L9
        if (r43[r23] == 10) goto L32;
        r23 = r23 + 1;     // Catch: Throwable -> L9
        goto L29
    L32:
        int r32 = this.f41460c;     // Catch: Throwable -> L9
        if (r23 == r32) goto L35;
        r12.write(r43, r32, r23 - r32);     // Catch: Throwable -> L9
    L35:
        this.f41460c = r23 + 1;     // Catch: Throwable -> L9
        String r13 = r12.toString();     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r13;
    L40:
        throw new IOException("LineReader is closed");     // Catch: Throwable -> L9
    }

    public int readInt() {
        String r02 = f();
        return Integer.parseInt(r02);
    L6:
        throw new IOException("expected an int but was \"" + r02 + "\"");
    }

    public g(InputStream r2, int r3, Charset r4) {
        if (r2 == null) goto L20;
        if (r4 == null) goto L18;
        if (r3 < 0) goto L16;
        if (r4.equals(com.koushikdutta.async.util.b.f41647a) == false) goto L9;
    L13:
        this.f41458a = r2;
        this.f41459b = new byte[r3];
        return;
    L9:
        if (r4.equals(com.koushikdutta.async.util.b.f41648b) == true) goto L13;
        throw new IllegalArgumentException("Unsupported encoding");
    L16:
        throw new IllegalArgumentException("capacity <= 0");
    L18:
        throw new NullPointerException("charset == null");
    L20:
        throw new NullPointerException("in == null");
    }
}
