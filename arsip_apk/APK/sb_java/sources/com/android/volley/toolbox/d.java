package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.a;
import com.google.firebase.perf.util.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class d implements com.android.volley.a {

    /* renamed from: a, reason: collision with root package name */
    public final Map f32047a;

    /* renamed from: b, reason: collision with root package name */
    public long f32048b;

    /* renamed from: c, reason: collision with root package name */
    public final c f32049c;
    public final int d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f32050a;

        /* renamed from: b, reason: collision with root package name */
        public final String f32051b;

        /* renamed from: c, reason: collision with root package name */
        public final String f32052c;
        public final long d;

        /* renamed from: e, reason: collision with root package name */
        public final long f32053e;

        /* renamed from: f, reason: collision with root package name */
        public final long f32054f;

        /* renamed from: g, reason: collision with root package name */
        public final long f32055g;

        /* renamed from: h, reason: collision with root package name */
        public final List f32056h;

        public a(String r1, String r2, long r3, long r5, long r7, long r9, List r11) {
            this.f32051b = r1;
            if ("".equals(r2) == false) goto L5;
            r2 = null;
        L5:
            this.f32052c = r2;
            this.d = r3;
            this.f32053e = r5;
            this.f32054f = r7;
            this.f32055g = r9;
            this.f32056h = r11;
        }

        public static List a(a.C0304a r1) {
            List r02 = r1.f31977h;
            if (r02 == null) goto L6;
            return r02;
        L6:
            return e.g(r1.f31976g);
        }

        public static a b(b r14) {
            if (d.l(r14) != 538247942) goto L7;
            return new a(d.n(r14), d.n(r14), d.m(r14), d.m(r14), d.m(r14), d.m(r14), d.k(r14));
        L7:
            throw new IOException();
        }

        public a.C0304a c(byte[] r4) {
            a.C0304a r02 = new a.C0304a();
            r02.f31971a = r4;
            r02.f31972b = this.f32052c;
            r02.f31973c = this.d;
            r02.d = this.f32053e;
            r02.f31974e = this.f32054f;
            r02.f31975f = this.f32055g;
            r02.f31976g = e.h(this.f32056h);
            r02.f31977h = Collections.unmodifiableList(this.f32056h);
            return r02;
        }

        public boolean d(OutputStream r3) {
            d.s(r3, 538247942);     // Catch: IOException -> L6
            d.u(r3, this.f32051b);     // Catch: IOException -> L6
            String r02 = this.f32052c;     // Catch: IOException -> L6
            if (r02 != null) goto L8;
            r02 = "";
        L8:
            d.u(r3, r02);     // Catch: IOException -> L6
            d.t(r3, this.d);     // Catch: IOException -> L6
            d.t(r3, this.f32053e);     // Catch: IOException -> L6
            d.t(r3, this.f32054f);     // Catch: IOException -> L6
            d.t(r3, this.f32055g);     // Catch: IOException -> L6
            d.r(this.f32056h, r3);     // Catch: IOException -> L6
            r3.flush();     // Catch: IOException -> L6
            return true;
        L6:
            e = move-exception;
            com.android.volley.m.b("%s", new Object[]{e.toString()});
            return false;
        }

        public a(String r13, a.C0304a r14) {
            this(r13, r14.f31972b, r14.f31973c, r14.d, r14.f31974e, r14.f31975f, a(r14));
        }
    }

    public static class b extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        public final long f32057a;

        /* renamed from: b, reason: collision with root package name */
        public long f32058b;

        public b(InputStream r1, long r2) {
            super(r1);
            this.f32057a = r2;
        }

        public long c() {
            return this.f32057a - this.f32058b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int r02 = super.read();
            if (r02 == (-1)) goto L5;
            this.f32058b++;
        L5:
            return r02;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] r3, int r4, int r5) {
            int r32 = super.read(r3, r4, r5);
            if (r32 == (-1)) goto L5;
            this.f32058b += r32;
        L5:
            return r32;
        }
    }

    public interface c {
        File get();
    }

    public d(c r5, int r6) {
        this.f32047a = new LinkedHashMap(16, 0.75f, true);
        this.f32048b = 0;
        this.f32049c = r5;
        this.d = r6;
    }

    public static int j(InputStream r1) {
        int r12 = r1.read();
        if (r12 == (-1)) goto L6;
        return r12;
    L6:
        throw new EOFException();
    }

    public static List k(b r6) {
        int r02 = l(r6);
        if (r02 < 0) goto L12;
        if (r02 != 0) goto L6;
        List r1 = Collections.EMPTY_LIST;
    L7:
        int r2 = 0;
    L8:
        if (r2 >= r02) goto L10;
        r1.add(new com.android.volley.e(n(r6).intern(), n(r6).intern()));
        r2 = r2 + 1;
        goto L8
    L10:
        return r1;
    L6:
        r1 = new ArrayList();
        goto L7
    L12:
        throw new IOException("readHeaderList size=" + r02);
    }

    public static int l(InputStream r2) {
        int r02 = (j(r2) | (j(r2) << 8)) | (j(r2) << 16);
        return (j(r2) << 24) | r02;
    }

    public static long m(InputStream r7) {
        return (((((((j(r7) & 255) | ((j(r7) & 255) << 8)) | ((j(r7) & 255) << 16)) | ((j(r7) & 255) << 24)) | ((j(r7) & 255) << 32)) | ((j(r7) & 255) << 40)) | ((j(r7) & 255) << 48)) | ((255 & j(r7)) << 56);
    }

    public static String n(b r2) {
        return new String(q(r2, m(r2)), "UTF-8");
    }

    public static byte[] q(b r5, long r6) {
        long r02 = r5.c();
        if (r6 < 0) goto L11;
        if (r6 > r02) goto L11;
        int r2 = (int) r6;
        if (r2 != r6) goto L11;
        byte[] r62 = new byte[r2];
        new DataInputStream(r5).readFully(r62);
        return r62;
    L11:
        throw new IOException("streamToBytes length=" + r6 + ", maxLength=" + r02);
    }

    public static void r(List r2, OutputStream r3) {
        if (r2 == null) goto L8;
        s(r3, r2.size());
        Iterator r22 = r2.iterator();
    L5:
        if (r22.hasNext() == false) goto L7;
        com.android.volley.e r02 = (com.android.volley.e) r22.next();
        u(r3, r02.a());
        u(r3, r02.b());
        goto L5
    L7:
        return;
    L8:
        s(r3, 0);
    }

    public static void s(OutputStream r1, int r2) {
        r1.write(r2 & Constants.MAX_HOST_LENGTH);
        r1.write((r2 >> 8) & Constants.MAX_HOST_LENGTH);
        r1.write((r2 >> 16) & Constants.MAX_HOST_LENGTH);
        r1.write((r2 >> 24) & Constants.MAX_HOST_LENGTH);
    }

    public static void t(OutputStream r2, long r3) {
        r2.write((byte) r3);
        r2.write((byte) (r3 >>> 8));
        r2.write((byte) (r3 >>> 16));
        r2.write((byte) (r3 >>> 24));
        r2.write((byte) (r3 >>> 32));
        r2.write((byte) (r3 >>> 40));
        r2.write((byte) (r3 >>> 48));
        r2.write((byte) (r3 >>> 56));
    }

    public static void u(OutputStream r2, String r3) {
        byte[] r32 = r3.getBytes("UTF-8");
        t(r2, r32.length);
        r2.write(r32, 0, r32.length);
    }

    @Override // com.android.volley.a
    public synchronized void a(String r4, boolean r5) {
        monitor-enter(this);
        a.C0304a r02 = get(r4);     // Catch: Throwable -> L8
        if (r02 == null) goto L11;
        r02.f31975f = 0;     // Catch: Throwable -> L8
        if (r5 == false) goto L10;
        r02.f31974e = 0;     // Catch: Throwable -> L8
    L10:
        b(r4, r02);     // Catch: Throwable -> L8
    L11:
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // com.android.volley.a
    public synchronized void b(String r7, a.C0304a r8) {
        monitor-enter(this);
        long r02 = this.f32048b;     // Catch: Throwable -> L10
        byte[] r2 = r8.f31971a;     // Catch: Throwable -> L10
        long r03 = r02 + r2.length;     // Catch: Throwable -> L10
        int r3 = this.d;     // Catch: Throwable -> L10
        if (r03 > r3) goto L7;
    L12:
        File r04 = e(r7);     // Catch: Throwable -> L10
        BufferedOutputStream r1 = new BufferedOutputStream(d(r04));     // Catch: Throwable -> L10 IOException -> L18
        a r22 = new a(r7, r8);     // Catch: Throwable -> L10 IOException -> L18
        if (r22.d(r1) == false) goto L16;
        r1.write(r8.f31971a);     // Catch: Throwable -> L10 IOException -> L18
        r1.close();     // Catch: Throwable -> L10 IOException -> L18
        r22.f32050a = r04.length();     // Catch: Throwable -> L10 IOException -> L18
        i(r7, r22);     // Catch: Throwable -> L10 IOException -> L18
        h();     // Catch: Throwable -> L10 IOException -> L18
    L22:
        monitor-exit(this);
        return;
    L16:
        r1.close();     // Catch: Throwable -> L10 IOException -> L18
        com.android.volley.m.b("Failed to write header for %s", new Object[]{r04.getAbsolutePath()});     // Catch: Throwable -> L10 IOException -> L18
        throw new IOException();     // Catch: Throwable -> L10 IOException -> L18
    L19:
        if (r04.delete() == true) goto L21;
        com.android.volley.m.b("Could not clean up file %s", new Object[]{r04.getAbsolutePath()});     // Catch: Throwable -> L10
    L21:
        g();     // Catch: Throwable -> L10
        goto L22
    L7:
        if (r2.length <= (r3 * 0.9f)) goto L12;
        monitor-exit(this);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    public InputStream c(File r2) {
        return new FileInputStream(r2);
    }

    public OutputStream d(File r2) {
        return new FileOutputStream(r2);
    }

    public File e(String r3) {
        return new File(this.f32049c.get(), f(r3));
    }

    public final String f(String r4) {
        int r02 = r4.length() / 2;
        return String.valueOf(r4.substring(0, r02).hashCode()) + String.valueOf(r4.substring(r02).hashCode());
    }

    public final void g() {
        if (this.f32049c.get().exists() == true) goto L6;
        com.android.volley.m.b("Re-initializing cache after external clearing.", new Object[0]);
        this.f32047a.clear();
        this.f32048b = 0;
        initialize();
        return;
    }

    @Override // com.android.volley.a
    public synchronized a.C0304a get(String r8) {
        monitor-enter(this);
        a r02 = (a) this.f32047a.get(r8);     // Catch: Throwable -> L16
        if (r02 != null) goto L8;
        monitor-exit(this);
        return null;
    L8:
        File r2 = e(r8);     // Catch: Throwable -> L16
        b r3 = new b(new BufferedInputStream(c(r2)), r2.length());     // Catch: Throwable -> L16 IOException -> L18
        a r4 = a.b(r3);     // Catch: Throwable -> L20
        if (TextUtils.equals(r8, r4.f32051b) == true) goto L22;
        com.android.volley.m.b("%s: key=%s, found=%s", new Object[]{r2.getAbsolutePath(), r8, r4.f32051b});     // Catch: Throwable -> L20
        p(r8);     // Catch: Throwable -> L20
        r3.close();     // Catch: Throwable -> L16 IOException -> L18
        monitor-exit(this);
        return null;
    L22:
        a.C0304a r03 = r02.c(q(r3, r3.c()));     // Catch: Throwable -> L20
        r3.close();     // Catch: Throwable -> L16 IOException -> L18
        monitor-exit(this);
        return r03;
    L20:
        th = move-exception;
        r3.close();     // Catch: Throwable -> L16 IOException -> L18
        throw th;     // Catch: Throwable -> L16 IOException -> L18
    L18:
        e = move-exception;
        com.android.volley.m.b("%s: %s", new Object[]{r2.getAbsolutePath(), e.toString()});     // Catch: Throwable -> L16
        o(r8);     // Catch: Throwable -> L16
        return null;
    L16:
        th = move-exception;
        throw th;
    }

    public final void h() {
        if (this.f32048b < this.d) goto L25;
        int r1 = 0;
        if (com.android.volley.m.f32020b == false) goto L8;
        com.android.volley.m.e("Pruning old cache entries.", new Object[0]);
    L8:
        long r2 = this.f32048b;
        long r4 = SystemClock.elapsedRealtime();
        Iterator r02 = this.f32047a.entrySet().iterator();
    L10:
        if (r02.hasNext() == false) goto L18;
        a r6 = (a) ((Map.Entry) r02.next()).getValue();
        if (e(r6.f32051b).delete() == false) goto L14;
        this.f32048b -= r6.f32050a;
    L15:
        r02.remove();
        r1 = r1 + 1;
        if (this.f32048b >= (this.d * 0.9f)) goto L10;
    L14:
        String r62 = r6.f32051b;
        com.android.volley.m.b("Could not delete cache entry for key=%s, filename=%s", new Object[]{r62, f(r62)});
    L18:
        if (com.android.volley.m.f32020b == false) goto L24;
        com.android.volley.m.e("pruned %d files, %d bytes, %d ms", new Object[]{Integer.valueOf(r1), Long.valueOf(this.f32048b - r2), Long.valueOf(SystemClock.elapsedRealtime() - r4)});
        return;
    L24:
        return;
    }

    public final void i(String r8, a r9) {
        if (this.f32047a.containsKey(r8) == true) goto L5;
        this.f32048b += r9.f32050a;
    L6:
        this.f32047a.put(r8, r9);
        return;
    L5:
        this.f32048b += r9.f32050a - ((a) this.f32047a.get(r8)).f32050a;
        goto L6
    }

    @Override // com.android.volley.a
    public synchronized void initialize() {
        monitor-enter(this);
        File r02 = this.f32049c.get();     // Catch: Throwable -> L9
        if (r02.exists() == false) goto L6;
        File[] r03 = r02.listFiles();     // Catch: Throwable -> L9
        if (r03 != null) goto L17;
        monitor-exit(this);
        return;
    L17:
        int r1 = r03.length;     // Catch: Throwable -> L9
        int r2 = 0;
    L18:
        if (r2 >= r1) goto L28;
        File r3 = r03[r2];     // Catch: Throwable -> L9
        long r4 = r3.length();     // Catch: Throwable -> L9 IOException -> L26
        b r6 = new b(new BufferedInputStream(c(r3)), r4);     // Catch: Throwable -> L9 IOException -> L26
        a r7 = a.b(r6);     // Catch: Throwable -> L23
        r7.f32050a = r4;     // Catch: Throwable -> L23
        i(r7.f32051b, r7);     // Catch: Throwable -> L23
        r6.close();     // Catch: Throwable -> L9 IOException -> L26
    L27:
        r2 = r2 + 1;
    L23:
        th = move-exception;
        r6.close();     // Catch: Throwable -> L9 IOException -> L26
        throw th;     // Catch: Throwable -> L9 IOException -> L26
    L26:
        r3.delete();     // Catch: Throwable -> L9
        goto L27
    L28:
        monitor-exit(this);
        return;
    L6:
        if (r02.mkdirs() == true) goto L11;
        com.android.volley.m.c("Unable to create cache dir %s", new Object[]{r02.getAbsolutePath()});     // Catch: Throwable -> L9
    L11:
        monitor-exit(this);
        return;
    L9:
        th = move-exception;
        throw th;
    }

    public synchronized void o(String r3) {
        monitor-enter(this);
        boolean r02 = e(r3).delete();     // Catch: Throwable -> L7
        p(r3);     // Catch: Throwable -> L7
        if (r02 == true) goto L9;
        com.android.volley.m.b("Could not delete cache entry for key=%s, filename=%s", new Object[]{r3, f(r3)});     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void p(String r5) {
        a r52 = (a) this.f32047a.remove(r5);
        if (r52 == null) goto L6;
        this.f32048b -= r52.f32050a;
        return;
    }

    public d(c r2) {
        this(r2, 5242880);
    }
}
