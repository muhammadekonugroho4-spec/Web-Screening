package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static String f32019a = "Volley";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f32020b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f32021c = null;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final boolean f32022c = false;

        /* renamed from: a, reason: collision with root package name */
        public final List f32023a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f32024b;

        /* renamed from: com.android.volley.m$a$a, reason: collision with other inner class name */
        public static class C0305a {

            /* renamed from: a, reason: collision with root package name */
            public final String f32025a;

            /* renamed from: b, reason: collision with root package name */
            public final long f32026b;

            /* renamed from: c, reason: collision with root package name */
            public final long f32027c;

            public C0305a(String r1, long r2, long r4) {
                this.f32025a = r1;
                this.f32026b = r2;
                this.f32027c = r4;
            }
        }

        static {
            f32022c = m.f32020b;
        }

        public a() {
            this.f32023a = new ArrayList();
            this.f32024b = false;
        }

        public synchronized void a(String r8, long r9) {
            monitor-enter(this);
        L8:
            th = move-exception;
            throw th;
        L4:
            if (this.f32024b == true) goto L11;
            this.f32023a.add(new C0305a(r8, r9, SystemClock.elapsedRealtime()));     // Catch: Throwable -> L8
            monitor-exit(this);
            return;
        L11:
            throw new IllegalStateException("Marker added to finished log");     // Catch: Throwable -> L8
        }

        public synchronized void b(String r9) {
            monitor-enter(this);
            this.f32024b = true;     // Catch: Throwable -> L14
            long r02 = c();     // Catch: Throwable -> L14
            if (r02 > 0) goto L9;
            monitor-exit(this);
            return;
        L9:
            long r2 = ((C0305a) this.f32023a.get(0)).f32027c;     // Catch: Throwable -> L14
            m.b("(%-4d ms) %s", new Object[]{Long.valueOf(r02), r9});     // Catch: Throwable -> L14
            Iterator r92 = this.f32023a.iterator();     // Catch: Throwable -> L14
        L10:
            if (r92.hasNext() == false) goto L16;
            C0305a r03 = (C0305a) r92.next();     // Catch: Throwable -> L14
            long r4 = r03.f32027c;     // Catch: Throwable -> L14
            m.b("(+%-4d) [%2d] %s", new Object[]{Long.valueOf(r4 - r2), Long.valueOf(r03.f32026b), r03.f32025a});     // Catch: Throwable -> L14
            r2 = r4;
            goto L10
        L16:
            monitor-exit(this);
            return;
        L14:
            th = move-exception;
            throw th;
        }

        public final long c() {
            if (this.f32023a.size() != 0) goto L7;
            return 0;
        L7:
            return ((C0305a) this.f32023a.get(r2.size() - 1)).f32027c - ((C0305a) this.f32023a.get(0)).f32027c;
        }

        public void finalize() {
            if (this.f32024b == true) goto L6;
            b("Request on the loose");
            m.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            return;
        }
    }

    static {
        f32020b = Log.isLoggable("Volley", 2);
        f32021c = m.class.getName();
    }

    public static String a(String r3, Object... r4) {
        if (r4 == null) goto L5;
        r3 = String.format(Locale.US, r3, r4);
    L5:
        StackTraceElement[] r42 = new Throwable().fillInStackTrace().getStackTrace();
        int r02 = 2;
    L7:
        if (r02 >= r42.length) goto L12;
        if (r42[r02].getClassName().equals(f32021c) == false) goto L10;
        r02 = r02 + 1;
        goto L7
    L10:
        String r1 = r42[r02].getClassName();
        String r12 = r1.substring(r1.lastIndexOf(46) + 1);
        String r43 = r12.substring(r12.lastIndexOf(36) + 1) + "." + r42[r02].getMethodName();
    L14:
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), r43, r3});
    L12:
        r43 = "<unknown>";
        goto L14
    }

    public static void b(String r1, Object... r2) {
        Log.d(f32019a, a(r1, r2));
    }

    public static void c(String r1, Object... r2) {
        Log.e(f32019a, a(r1, r2));
    }

    public static void d(Throwable r1, String r2, Object... r3) {
        Log.e(f32019a, a(r2, r3), r1);
    }

    public static void e(String r1, Object... r2) {
        if (f32020b == false) goto L6;
        Log.v(f32019a, a(r1, r2));
        return;
    }
}
