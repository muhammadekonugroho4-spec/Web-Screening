package com.bumptech.glide.disklrucache;

import android.os.StrictMode;
import com.clevertap.android.sdk.Constants;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class a implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final File f32424a;

    /* renamed from: b, reason: collision with root package name */
    public final File f32425b;

    /* renamed from: c, reason: collision with root package name */
    public final File f32426c;
    public final File d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32427e;

    /* renamed from: f, reason: collision with root package name */
    public long f32428f;

    /* renamed from: g, reason: collision with root package name */
    public final int f32429g;

    /* renamed from: h, reason: collision with root package name */
    public long f32430h;

    /* renamed from: i, reason: collision with root package name */
    public Writer f32431i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f32432j;

    /* renamed from: k, reason: collision with root package name */
    public int f32433k;

    /* renamed from: l, reason: collision with root package name */
    public long f32434l;

    /* renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f32435m;

    /* renamed from: n, reason: collision with root package name */
    public final Callable f32436n;

    /* renamed from: com.bumptech.glide.disklrucache.a$a, reason: collision with other inner class name */
    public class CallableC0317a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f32437a;

        public CallableC0317a(a r1) {
            this.f32437a = r1;
        }

        public Void a() {
            a r02 = this.f32437a;
            monitor-enter(r02);
        L8:
            th = move-exception;
            throw th;
        L5:
            if (a.c(this.f32437a) != null) goto L10;
            monitor-exit(r02);     // Catch: Throwable -> L8
            return null;
        L10:
            a.i(this.f32437a);     // Catch: Throwable -> L8
            if (a.n(this.f32437a) == false) goto L13;
            a.t(this.f32437a);     // Catch: Throwable -> L8
            a.u(this.f32437a, 0);     // Catch: Throwable -> L8
        L13:
            monitor-exit(r02);     // Catch: Throwable -> L8
            return null;
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() {
            return a();
        }
    }

    public static final class b implements ThreadFactory {
        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable r3) {
            monitor-enter(this);
            Thread r02 = new Thread(r3, "glide-disk-lru-cache-thread");     // Catch: Throwable -> L6
            r02.setPriority(1);     // Catch: Throwable -> L6
            monitor-exit(this);
            return r02;
        L6:
            th = move-exception;
            throw th;
        }

        public /* synthetic */ b(CallableC0317a r1) {
            this();
        }
    }

    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d f32438a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f32439b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f32440c;
        public final /* synthetic */ a d;

        public /* synthetic */ c(a r1, d r2, CallableC0317a r3) {
            this(r1, r2);
        }

        public static /* synthetic */ d c(c r02) {
            return r02.f32438a;
        }

        public static /* synthetic */ boolean[] d(c r02) {
            return r02.f32439b;
        }

        public void a() {
            a.l(this.d, this, false);
        }

        public void b() {
            if (this.f32440c == true) goto L9;
            a();     // Catch: IOException -> L6
            return;
        L10:
            return;
        }

        public void e() {
            a.l(this.d, this, true);
            this.f32440c = true;
        }

        public File f(int r4) {
            a r02 = this.d;
            monitor-enter(r02);
        L9:
            th = move-exception;
            throw th;
        L5:
            if (d.g(this.f32438a) != this) goto L15;
            if (d.e(this.f32438a) == true) goto L11;
            this.f32439b[r4] = true;     // Catch: Throwable -> L9
        L11:
            File r42 = this.f32438a.k(r4);     // Catch: Throwable -> L9
            a.k(this.d).mkdirs();     // Catch: Throwable -> L9
            monitor-exit(r02);     // Catch: Throwable -> L9
            return r42;
        L15:
            throw new IllegalStateException();     // Catch: Throwable -> L9
        }

        public c(a r1, d r2) {
            this.d = r1;
            this.f32438a = r2;
            if (d.e(r2) == false) goto L5;
            boolean[] r12 = null;
        L6:
            this.f32439b = r12;
            return;
        L5:
            r12 = new boolean[a.f(r1)];
            goto L6
        }
    }

    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f32441a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f32442b;

        /* renamed from: c, reason: collision with root package name */
        public File[] f32443c;
        public File[] d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f32444e;

        /* renamed from: f, reason: collision with root package name */
        public c f32445f;

        /* renamed from: g, reason: collision with root package name */
        public long f32446g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ a f32447h;

        public /* synthetic */ d(a r1, String r2, CallableC0317a r3) {
            this(r1, r2);
        }

        public static /* synthetic */ long[] a(d r02) {
            return r02.f32442b;
        }

        public static /* synthetic */ String b(d r02) {
            return r02.f32441a;
        }

        public static /* synthetic */ long c(d r2) {
            return r2.f32446g;
        }

        public static /* synthetic */ long d(d r02, long r1) {
            r02.f32446g = r1;
            return r1;
        }

        public static /* synthetic */ boolean e(d r02) {
            return r02.f32444e;
        }

        public static /* synthetic */ boolean f(d r02, boolean r1) {
            r02.f32444e = r1;
            return r1;
        }

        public static /* synthetic */ c g(d r02) {
            return r02.f32445f;
        }

        public static /* synthetic */ c h(d r02, c r1) {
            r02.f32445f = r1;
            return r1;
        }

        public static /* synthetic */ void i(d r02, String[] r1) {
            r02.n(r1);
        }

        public File j(int r2) {
            return this.f32443c[r2];
        }

        public File k(int r2) {
            return this.d[r2];
        }

        public String l() {
            StringBuilder r02 = new StringBuilder();
            long[] r1 = this.f32442b;
            int r2 = r1.length;
            int r3 = 0;
        L3:
            if (r3 >= r2) goto L6;
            long r4 = r1[r3];
            r02.append(' ');
            r02.append(r4);
            r3 = r3 + 1;
            goto L3
        L6:
            return r02.toString();
        }

        public final IOException m(String[] r4) {
            throw new IOException("unexpected journal line: " + Arrays.toString(r4));
        }

        public final void n(String[] r5) {
            if (r5.length != a.f(this.f32447h)) goto L13;
            int r02 = 0;
        L14:
            if (r02 >= r5.length) goto L9;
            this.f32442b[r02] = Long.parseLong(r5[r02]);     // Catch: NumberFormatException -> L10
            r02 = r02 + 1;
            goto L14
        L9:
            return;
        L11:
            throw m(r5);
        L13:
            throw m(r5);
        }

        public d(a r7, String r8) {
            this.f32447h = r7;
            this.f32441a = r8;
            this.f32442b = new long[a.f(r7)];
            this.f32443c = new File[a.f(r7)];
            this.d = new File[a.f(r7)];
            StringBuilder r02 = new StringBuilder(r8);
            r02.append('.');
            int r82 = r02.length();
            int r1 = 0;
        L4:
            if (r1 >= a.f(r7)) goto L6;
            r02.append(r1);
            this.f32443c[r1] = new File(a.k(r7), r02.toString());
            r02.append(".tmp");
            this.d[r1] = new File(a.k(r7), r02.toString());
            r02.setLength(r82);
            r1 = r1 + 1;
            goto L4
        }
    }

    public final class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f32448a;

        /* renamed from: b, reason: collision with root package name */
        public final long f32449b;

        /* renamed from: c, reason: collision with root package name */
        public final long[] f32450c;
        public final File[] d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a f32451e;

        public /* synthetic */ e(a r1, String r2, long r3, File[] r5, long[] r6, CallableC0317a r7) {
            this(r1, r2, r3, r5, r6);
        }

        public File a(int r2) {
            return this.d[r2];
        }

        public e(a r1, String r2, long r3, File[] r5, long[] r6) {
            this.f32451e = r1;
            this.f32448a = r2;
            this.f32449b = r3;
            this.d = r5;
            this.f32450c = r6;
        }
    }

    public a(File r17, int r18, int r19, long r20) {
        this.f32430h = 0;
        this.f32432j = new LinkedHashMap(0, 0.75f, true);
        this.f32434l = 0;
        this.f32435m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
        this.f32436n = new CallableC0317a(this);
        this.f32424a = r17;
        this.f32427e = r18;
        this.f32425b = new File(r17, "journal");
        this.f32426c = new File(r17, "journal.tmp");
        this.d = new File(r17, "journal.bkp");
        this.f32429g = r19;
        this.f32428f = r20;
    }

    public static void A0(File r02, File r1, boolean r2) {
        if (r2 == false) goto L5;
        O(r1);
    L5:
        if (r02.renameTo(r1) == false) goto L8;
        return;
    L8:
        throw new IOException();
    }

    public static void B(Writer r2) {
        StrictMode.ThreadPolicy r02 = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(r02).permitUnbufferedIo().build());
        r2.close();     // Catch: Throwable -> L6
        StrictMode.setThreadPolicy(r02);
        return;
    L6:
        th = move-exception;
        StrictMode.setThreadPolicy(r02);
        throw th;
    }

    public static void O(File r1) {
        if (r1.exists() == true) goto L5;
        return;
    L5:
        if (r1.delete() == false) goto L8;
        return;
    L8:
        throw new IOException();
    }

    public static /* synthetic */ Writer c(a r02) {
        return r02.f32431i;
    }

    public static void c0(Writer r2) {
        StrictMode.ThreadPolicy r02 = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(r02).permitUnbufferedIo().build());
        r2.flush();     // Catch: Throwable -> L6
        StrictMode.setThreadPolicy(r02);
        return;
    L6:
        th = move-exception;
        StrictMode.setThreadPolicy(r02);
        throw th;
    }

    public static /* synthetic */ int f(a r02) {
        return r02.f32429g;
    }

    public static a g0(File r10, int r11, int r12, long r13) {
        if (r13 <= 0) goto L22;
        if (r12 <= 0) goto L20;
        File r02 = new File(r10, "journal.bkp");
        if (r02.exists() == false) goto L11;
        File r1 = new File(r10, "journal");
        if (r1.exists() == false) goto L10;
        r02.delete();
        goto L11
    L10:
        A0(r02, r1, false);
    L11:
        a r3 = new a(r10, r11, r12, r13);
        if (r3.f32425b.exists() == true) goto L23;
    L17:
        r10.mkdirs();
        a r4 = new a(r10, r11, r12, r13);
        r4.y0();
        return r4;
    L23:
        r3.p0();     // Catch: IOException -> L15
        r3.o0();     // Catch: IOException -> L15
        return r3;
    L15:
        e = move-exception;
        System.out.println("DiskLruCache " + r10 + " is corrupt: " + e.getMessage() + ", removing");
        r3.M();
        goto L17
    L20:
        throw new IllegalArgumentException("valueCount <= 0");
    L22:
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static /* synthetic */ void i(a r02) {
        r02.B0();
    }

    public static /* synthetic */ File k(a r02) {
        return r02.f32424a;
    }

    public static /* synthetic */ void l(a r02, c r1, boolean r2) {
        r02.E(r1, r2);
    }

    public static /* synthetic */ boolean n(a r02) {
        return r02.f0();
    }

    public static /* synthetic */ void t(a r02) {
        r02.y0();
    }

    public static /* synthetic */ int u(a r02, int r1) {
        r02.f32433k = r1;
        return r1;
    }

    public final void B0() {
    L3:
        if (this.f32430h <= this.f32428f) goto L5;
        z0((String) ((Map.Entry) this.f32432j.entrySet().iterator().next()).getKey());
        goto L3
    }

    public final synchronized void E(c r10, boolean r11) {
        monitor-enter(this);
        d r02 = c.c(r10);     // Catch: Throwable -> L19
        if (d.g(r02) != r10) goto L47;
        int r1 = 0;
        if (r11 == false) goto L25;
        if (d.e(r02) == true) goto L25;
        int r2 = 0;
    L11:
        if (r2 >= this.f32429g) goto L25;
        if (c.d(r10)[r2] == false) goto L22;
        if (r02.k(r2).exists() == false) goto L16;
        r2 = r2 + 1;
        goto L11
    L16:
        r10.a();     // Catch: Throwable -> L19
        monitor-exit(this);
        return;
    L22:
        r10.a();     // Catch: Throwable -> L19
        throw new IllegalStateException("Newly created entry didn't create value for index " + r2);     // Catch: Throwable -> L19
    L25:
        if (r1 >= this.f32429g) goto L33;
        File r102 = r02.k(r1);     // Catch: Throwable -> L19
        if (r11 == true) goto L29;
        O(r102);     // Catch: Throwable -> L19
    L32:
        r1 = r1 + 1;     // Catch: Throwable -> L19
        goto L25
    L29:
        if (r102.exists() == false) goto L32;
        File r22 = r02.j(r1);     // Catch: Throwable -> L19
        r102.renameTo(r22);     // Catch: Throwable -> L19
        long r3 = d.a(r02)[r1];     // Catch: Throwable -> L19
        long r5 = r22.length();     // Catch: Throwable -> L19
        d.a(r02)[r1] = r5;     // Catch: Throwable -> L19
        this.f32430h = (this.f32430h - r3) + r5;     // Catch: Throwable -> L19
        goto L32
    L33:
        this.f32433k++;
        d.h(r02, null);     // Catch: Throwable -> L19
        if ((d.e(r02) | r11) == false) goto L38;
        d.f(r02, true);     // Catch: Throwable -> L19
        this.f32431i.append("CLEAN");     // Catch: Throwable -> L19
        this.f32431i.append(' ');     // Catch: Throwable -> L19
        this.f32431i.append(d.b(r02));     // Catch: Throwable -> L19
        this.f32431i.append(r02.l());     // Catch: Throwable -> L19
        this.f32431i.append('\n');     // Catch: Throwable -> L19
        if (r11 == false) goto L39;
        long r103 = this.f32434l;     // Catch: Throwable -> L19
        this.f32434l = 1 + r103;     // Catch: Throwable -> L19
        d.d(r02, r103);     // Catch: Throwable -> L19
    L39:
        c0(this.f32431i);     // Catch: Throwable -> L19
        if (this.f32430h <= this.f32428f) goto L42;
    L43:
        this.f32435m.submit(this.f32436n);     // Catch: Throwable -> L19
    L44:
        monitor-exit(this);
        return;
    L42:
        if (f0() == false) goto L44;
    L38:
        this.f32432j.remove(d.b(r02));     // Catch: Throwable -> L19
        this.f32431i.append("REMOVE");     // Catch: Throwable -> L19
        this.f32431i.append(' ');     // Catch: Throwable -> L19
        this.f32431i.append(d.b(r02));     // Catch: Throwable -> L19
        this.f32431i.append('\n');     // Catch: Throwable -> L19
        goto L39
    L47:
        throw new IllegalStateException();     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        throw th;
    }

    public void M() {
        close();
        com.bumptech.glide.disklrucache.c.b(this.f32424a);
    }

    public c W(String r3) {
        return Z(r3, -1);
    }

    public final synchronized c Z(String r6, long r7) {
        monitor-enter(this);
        x();     // Catch: Throwable -> L10
        d r02 = (d) this.f32432j.get(r6);     // Catch: Throwable -> L10
        CallableC0317a r2 = null;
        if (r7 == (-1)) goto L14;
        if (r02 != null) goto L8;
    L12:
        monitor-exit(this);
        return null;
    L8:
        if (d.c(r02) != r7) goto L12;
    L14:
        if (r02 != null) goto L17;
        r02 = new d(this, r6, r2);     // Catch: Throwable -> L10
        this.f32432j.put(r6, r02);     // Catch: Throwable -> L10
    L20:
        c r72 = new c(this, r02, r2);     // Catch: Throwable -> L10
        d.h(r02, r72);     // Catch: Throwable -> L10
        this.f32431i.append("DIRTY");     // Catch: Throwable -> L10
        this.f32431i.append(' ');     // Catch: Throwable -> L10
        this.f32431i.append(r6);     // Catch: Throwable -> L10
        this.f32431i.append('\n');     // Catch: Throwable -> L10
        c0(this.f32431i);     // Catch: Throwable -> L10
        monitor-exit(this);
        return r72;
    L17:
        if (d.g(r02) == null) goto L20;
        monitor-exit(this);
        return null;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        monitor-enter(this);
    L13:
        th = move-exception;
        throw th;
    L4:
        if (this.f32431i != null) goto L7;
        monitor-exit(this);
        return;
    L7:
        Iterator r02 = new ArrayList(this.f32432j.values()).iterator();     // Catch: Throwable -> L13
    L9:
        if (r02.hasNext() == false) goto L15;
        d r1 = (d) r02.next();     // Catch: Throwable -> L13
        if (d.g(r1) == null) goto L9;
        d.g(r1).a();     // Catch: Throwable -> L13
        goto L9
    L15:
        B0();     // Catch: Throwable -> L13
        B(this.f32431i);     // Catch: Throwable -> L13
        this.f32431i = null;     // Catch: Throwable -> L13
        monitor-exit(this);
    }

    public synchronized e d0(String r9) {
        monitor-enter(this);
        x();     // Catch: Throwable -> L33
        d r02 = (d) this.f32432j.get(r9);     // Catch: Throwable -> L33
        if (r02 != null) goto L9;
        monitor-exit(this);
        return null;
    L9:
        if (d.e(r02) == true) goto L12;
        monitor-exit(this);
        return null;
    L12:
        File[] r2 = r02.f32443c;     // Catch: Throwable -> L33
        int r3 = r2.length;     // Catch: Throwable -> L33
        int r4 = 0;
    L14:
        if (r4 >= r3) goto L22;
    L20:
        th = move-exception;
        Throwable r92 = th;
    L35:
        monitor-exit(this);     // Catch: Throwable -> L31
        throw r92;
    L16:
        if (r2[r4].exists() == false) goto L17;
        r4 = r4 + 1;
        goto L14
    L17:
        monitor-exit(this);
        return null;
    L22:
        this.f32433k++;
        this.f32431i.append("READ");     // Catch: Throwable -> L33
        this.f32431i.append(' ');     // Catch: Throwable -> L33
        this.f32431i.append(r9);     // Catch: Throwable -> L33
        this.f32431i.append('\n');     // Catch: Throwable -> L33
        if (f0() == false) goto L26;
        this.f32435m.submit(this.f32436n);     // Catch: Throwable -> L20
    L26:
        e r03 = new e(this, r9, d.c(r02), r02.f32443c, d.a(r02), null);     // Catch: Throwable -> L31
        monitor-exit(this);
        return r03;
    L31:
        th = th;
    L32:
        r92 = th;
    L33:
        th = th;
        goto L32
    }

    public final boolean f0() {
        int r02 = this.f32433k;
        if (r02 >= 2000) goto L5;
        return false;
    L5:
        if (r02 < this.f32432j.size()) goto L10;
        return true;
    L10:
        return false;
    }

    public final void o0() {
        O(this.f32426c);
        Iterator r02 = this.f32432j.values().iterator();
    L4:
        if (r02.hasNext() == false) goto L15;
        d r1 = (d) r02.next();
        int r3 = 0;
        if (d.g(r1) == null) goto L8;
        d.h(r1, null);
    L12:
        if (r3 >= this.f32429g) goto L14;
        O(r1.j(r3));
        O(r1.k(r3));
        r3 = r3 + 1;
        goto L12
    L14:
        r02.remove();
    L8:
        if (r3 >= this.f32429g) goto L4;
        this.f32430h += d.a(r1)[r3];
        r3 = r3 + 1;
        goto L8
    }

    public final void p0() {
        com.bumptech.glide.disklrucache.b r1 = new com.bumptech.glide.disklrucache.b(new FileInputStream(this.f32425b), com.bumptech.glide.disklrucache.c.f32457a);
        String r2 = r1.k();     // Catch: Throwable -> L16
        String r3 = r1.k();     // Catch: Throwable -> L16
        String r4 = r1.k();     // Catch: Throwable -> L16
        String r5 = r1.k();     // Catch: Throwable -> L16
        String r6 = r1.k();     // Catch: Throwable -> L16
        if ("libcore.io.DiskLruCache".equals(r2) == false) goto L25;
        if (GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(r3) == false) goto L25;
        if (Integer.toString(this.f32427e).equals(r4) == false) goto L25;
        if (Integer.toString(this.f32429g).equals(r5) == false) goto L25;
        if ("".equals(r6) == false) goto L25;
        int r02 = 0;
    L28:
        v0(r1.k());     // Catch: Throwable -> L16 EOFException -> L18
        r02 = r02 + 1;
        goto L28
    L18:
        this.f32433k = r02 - this.f32432j.size();     // Catch: Throwable -> L16
        if (r1.i() == false) goto L21;
        y0();     // Catch: Throwable -> L16
    L22:
        com.bumptech.glide.disklrucache.c.a(r1);
        return;
    L21:
        this.f32431i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f32425b, true), com.bumptech.glide.disklrucache.c.f32457a));     // Catch: Throwable -> L16
    L25:
        throw new IOException("unexpected journal header: [" + r2 + ", " + r3 + ", " + r5 + ", " + r6 + Constants.AES_SUFFIX);     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        com.bumptech.glide.disklrucache.c.a(r1);
        throw th;
    }

    public final void v0(String r9) {
        int r1 = r9.indexOf(32);
        if (r1 == (-1)) goto L38;
        int r4 = r1 + 1;
        int r02 = r9.indexOf(32, r4);
        if (r02 != (-1)) goto L12;
        String r42 = r9.substring(r4);
        if (r1 == 6) goto L9;
    L13:
        d r5 = (d) this.f32432j.get(r42);
        CallableC0317a r6 = null;
        if (r5 != null) goto L17;
        r5 = new d(this, r42, r6);
        this.f32432j.put(r42, r5);
    L17:
        if (r02 == (-1)) goto L23;
        if (r1 != 5) goto L23;
        if (r9.startsWith("CLEAN") == false) goto L23;
        String[] r92 = r9.substring(r02 + 1).split(" ");
        d.f(r5, true);
        d.h(r5, null);
        d.i(r5, r92);
        return;
    L23:
        if (r02 != (-1)) goto L29;
        if (r1 != 5) goto L29;
        if (r9.startsWith("DIRTY") == false) goto L29;
        d.h(r5, new c(this, r5, r6));
        return;
    L29:
        if (r02 != (-1)) goto L36;
        if (r1 != 4) goto L36;
        if (r9.startsWith("READ") == false) goto L36;
        return;
    L36:
        throw new IOException("unexpected journal line: " + r9);
    L9:
        if (r9.startsWith("REMOVE") == false) goto L13;
        this.f32432j.remove(r42);
        return;
    L12:
        r42 = r9.substring(r4, r02);
        goto L13
    L38:
        throw new IOException("unexpected journal line: " + r9);
    }

    public final void x() {
        if (this.f32431i == null) goto L6;
        return;
    L6:
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void y0() {
        monitor-enter(this);
        Writer r02 = this.f32431i;     // Catch: Throwable -> L6
        if (r02 == null) goto L8;
        B(r02);     // Catch: Throwable -> L6
    L8:
        BufferedWriter r03 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f32426c), com.bumptech.glide.disklrucache.c.f32457a));     // Catch: Throwable -> L6
        r03.write("libcore.io.DiskLruCache");     // Catch: Throwable -> L15
        r03.write("\n");     // Catch: Throwable -> L15
        r03.write(GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A);     // Catch: Throwable -> L15
        r03.write("\n");     // Catch: Throwable -> L15
        r03.write(Integer.toString(this.f32427e));     // Catch: Throwable -> L15
        r03.write("\n");     // Catch: Throwable -> L15
        r03.write(Integer.toString(this.f32429g));     // Catch: Throwable -> L15
        r03.write("\n");     // Catch: Throwable -> L15
        r03.write("\n");     // Catch: Throwable -> L15
        Iterator r1 = this.f32432j.values().iterator();     // Catch: Throwable -> L15
    L10:
        if (r1.hasNext() == false) goto L19;
        d r2 = (d) r1.next();     // Catch: Throwable -> L15
        if (d.g(r2) != null) goto L14;
        r03.write("CLEAN " + d.b(r2) + r2.l() + '\n');     // Catch: Throwable -> L15
        goto L10
    L14:
        r03.write("DIRTY " + d.b(r2) + '\n');     // Catch: Throwable -> L15
        goto L10
    L19:
        B(r03);     // Catch: Throwable -> L6
        if (this.f32425b.exists() == false) goto L22;
        A0(this.f32425b, this.d, true);     // Catch: Throwable -> L6
    L22:
        A0(this.f32426c, this.f32425b, false);     // Catch: Throwable -> L6
        this.d.delete();     // Catch: Throwable -> L6
        this.f32431i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f32425b, true), com.bumptech.glide.disklrucache.c.f32457a));     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L15:
        th = move-exception;
        B(r03);     // Catch: Throwable -> L6
        throw th;     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized boolean z0(String r8) {
        monitor-enter(this);
        x();     // Catch: Throwable -> L17
        d r02 = (d) this.f32432j.get(r8);     // Catch: Throwable -> L17
        int r1 = 0;
        if (r02 != null) goto L6;
    L25:
        monitor-exit(this);
        return false;
    L6:
        if (d.g(r02) != null) goto L25;
    L9:
        if (r1 >= this.f32429g) goto L20;
        File r2 = r02.j(r1);     // Catch: Throwable -> L17
        if (r2.exists() == false) goto L19;
        if (r2.delete() == true) goto L19;
        throw new IOException("failed to delete " + r2);     // Catch: Throwable -> L17
    L19:
        this.f32430h -= d.a(r02)[r1];
        d.a(r02)[r1] = 0;     // Catch: Throwable -> L17
        r1 = r1 + 1;     // Catch: Throwable -> L17
        goto L9
    L20:
        this.f32433k++;
        this.f32431i.append("REMOVE");     // Catch: Throwable -> L17
        this.f32431i.append(' ');     // Catch: Throwable -> L17
        this.f32431i.append(r8);     // Catch: Throwable -> L17
        this.f32431i.append('\n');     // Catch: Throwable -> L17
        this.f32432j.remove(r8);     // Catch: Throwable -> L17
        if (f0() == false) goto L23;
        this.f32435m.submit(this.f32436n);     // Catch: Throwable -> L17
    L23:
        monitor-exit(this);
        return true;
    L17:
        th = move-exception;
        throw th;
    }
}
