package com.bumptech.glide.util;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f33374a = null;

    /* renamed from: com.bumptech.glide.util.a$a, reason: collision with other inner class name */
    public static class C0340a extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f33375a;

        /* renamed from: b, reason: collision with root package name */
        public int f33376b;

        public C0340a(ByteBuffer r2) {
            this.f33376b = -1;
            this.f33375a = r2;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f33375a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int r1) {
            monitor-enter(this);
            this.f33376b = this.f33375a.position();     // Catch: Throwable -> L6
            monitor-exit(this);
            return;
        L6:
            th = move-exception;
            throw th;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f33375a.hasRemaining() == true) goto L7;
            return -1;
        L7:
            return this.f33375a.get() & UnsignedBytes.MAX_VALUE;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            monitor-enter(this);
            int r02 = this.f33376b;     // Catch: Throwable -> L8
            if (r02 == (-1)) goto L11;
            this.f33375a.position(r02);     // Catch: Throwable -> L8
            monitor-exit(this);
            return;
        L11:
            throw new IOException("Cannot reset to unset mark position");     // Catch: Throwable -> L8
        L8:
            th = move-exception;
            throw th;
        }

        @Override // java.io.InputStream
        public long skip(long r4) {
            if (this.f33375a.hasRemaining() == true) goto L6;
            return -1;
        L6:
            long r42 = Math.min(r4, available());
            this.f33375a.position((int) (r0.position() + r42));
            return r42;
        }

        @Override // java.io.InputStream
        public int read(byte[] r2, int r3, int r4) {
            if (this.f33375a.hasRemaining() == true) goto L6;
            return -1;
        L6:
            int r42 = Math.min(r4, available());
            this.f33375a.get(r2, r3, r42);
            return r42;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f33377a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33378b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f33379c;

        public b(byte[] r1, int r2, int r3) {
            this.f33379c = r1;
            this.f33377a = r2;
            this.f33378b = r3;
        }
    }

    static {
        f33374a = new AtomicReference();
    }

    public static ByteBuffer a(File r9) {
        FileChannel r1 = null;
        long r6 = r9.length();     // Catch: Throwable -> L17
        if (r6 > 2147483647L) goto L22;
        if (r6 == 0) goto L20;
        RandomAccessFile r8 = new RandomAccessFile(r9, "r");     // Catch: Throwable -> L17
        FileChannel r2 = r8.getChannel();     // Catch: Throwable -> L15
        MappedByteBuffer r92 = r2.map(FileChannel.MapMode.READ_ONLY, 0, r6).load();     // Catch: Throwable -> L13
        r2.close();     // Catch: IOException -> L28
    L39:
        r8.close();     // Catch: IOException -> L29
    L12:
        return r92;
    L13:
        th = move-exception;
        Throwable r93 = th;
        r1 = r2;
    L23:
        if (r1 != null) goto L41;
    L25:
        if (r8 == null) goto L45;
        r8.close();     // Catch: IOException -> L31
        throw r93;
    L46:
        throw r93;
    L45:
        throw r93;
    L41:
        r1.close();     // Catch: IOException -> L30
    L15:
        th = move-exception;
        r93 = th;
        goto L23
    L20:
        throw new IOException("File unsuitable for memory mapping");     // Catch: Throwable -> L17
    L22:
        throw new IOException("File too large to map into memory");     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        r93 = th;
        r8 = null;
        goto L23
    }

    public static ByteBuffer b(InputStream r4) {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream(16384);
        byte[] r2 = (byte[]) f33374a.getAndSet(null);
        if (r2 != null) goto L5;
        r2 = new byte[16384];
    L5:
        int r1 = r4.read(r2);
        if (r1 < 0) goto L8;
        r02.write(r2, 0, r1);
        goto L5
    L8:
        f33374a.set(r2);
        byte[] r42 = r02.toByteArray();
        return d(ByteBuffer.allocateDirect(r42.length).put(r42));
    }

    public static b c(ByteBuffer r3) {
        if (r3.isReadOnly() == false) goto L5;
        return null;
    L5:
        if (r3.hasArray() == true) goto L7;
        return null;
    L7:
        return new b(r3.array(), r3.arrayOffset(), r3.limit());
    }

    public static ByteBuffer d(ByteBuffer r1) {
        return (ByteBuffer) r1.position(0);
    }

    public static byte[] e(ByteBuffer r2) {
        b r02 = c(r2);
        if (r02 != null) goto L5;
    L10:
        ByteBuffer r22 = r2.asReadOnlyBuffer();
        byte[] r03 = new byte[r22.limit()];
        d(r22);
        r22.get(r03);
        return r03;
    L5:
        if (r02.f33377a != 0) goto L10;
        if (r02.f33378b != r02.f33379c.length) goto L10;
        return r2.array();
    }

    public static void f(ByteBuffer r3, File r4) {
        d(r3);
        FileChannel r02 = null;
        RandomAccessFile r1 = new RandomAccessFile(r4, "rw");     // Catch: Throwable -> L10
        r02 = r1.getChannel();     // Catch: Throwable -> L8
        r02.write(r3);     // Catch: Throwable -> L8
        r02.force(false);     // Catch: Throwable -> L8
        r02.close();     // Catch: Throwable -> L8
        r1.close();     // Catch: Throwable -> L8
        r02.close();     // Catch: IOException -> L17
    L27:
        r1.close();     // Catch: IOException -> L18
        return;
    L33:
        return;
    L8:
        th = th;
    L12:
        if (r02 != null) goto L31;
    L14:
        if (r1 == null) goto L34;
        r1.close();     // Catch: IOException -> L20
        throw th;
    L35:
        throw th;
    L34:
        throw th;
    L31:
        r02.close();     // Catch: IOException -> L19
    L10:
        th = th;
        r1 = null;
        goto L12
    }

    public static InputStream g(ByteBuffer r1) {
        return new C0340a(r1);
    }
}
