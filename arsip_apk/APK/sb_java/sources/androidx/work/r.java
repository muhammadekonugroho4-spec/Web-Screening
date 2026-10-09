package androidx.work;

import android.util.Log;

/* loaded from: classes4.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f29637a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile r f29638b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f29639c = 20;

    public static class a extends r {
        public final int d;

        public a(int r1) {
            super(r1);
            this.d = r1;
        }

        @Override // androidx.work.r
        public void a(String r3, String r4) {
            if (this.d > 3) goto L6;
            Log.d(r3, r4);
            return;
        }

        @Override // androidx.work.r
        public void b(String r3, String r4, Throwable r5) {
            if (this.d > 3) goto L6;
            Log.d(r3, r4, r5);
            return;
        }

        @Override // androidx.work.r
        public void c(String r3, String r4) {
            if (this.d > 6) goto L6;
            Log.e(r3, r4);
            return;
        }

        @Override // androidx.work.r
        public void d(String r3, String r4, Throwable r5) {
            if (this.d > 6) goto L6;
            Log.e(r3, r4, r5);
            return;
        }

        @Override // androidx.work.r
        public void f(String r3, String r4) {
            if (this.d > 4) goto L6;
            Log.i(r3, r4);
            return;
        }

        @Override // androidx.work.r
        public void g(String r3, String r4, Throwable r5) {
            if (this.d > 4) goto L6;
            Log.i(r3, r4, r5);
            return;
        }

        @Override // androidx.work.r
        public void j(String r3, String r4) {
            if (this.d > 2) goto L6;
            Log.v(r3, r4);
            return;
        }

        @Override // androidx.work.r
        public void k(String r3, String r4) {
            if (this.d > 5) goto L6;
            Log.w(r3, r4);
            return;
        }

        @Override // androidx.work.r
        public void l(String r3, String r4, Throwable r5) {
            if (this.d > 5) goto L6;
            Log.w(r3, r4, r5);
            return;
        }
    }

    static {
        f29637a = new Object();
    }

    public r(int r1) {
    }

    public static r e() {
        Object r02 = f29637a;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f29638b != null) goto L9;
        f29638b = new a(3);     // Catch: Throwable -> L7
    L9:
        r r1 = f29638b;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    }

    public static void h(r r2) {
        Object r02 = f29637a;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f29638b != null) goto L9;
        f29638b = r2;     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
    }

    public static String i(String r3) {
        int r02 = r3.length();
        StringBuilder r1 = new StringBuilder(23);
        r1.append("WM-");
        int r2 = f29639c;
        if (r02 < r2) goto L5;
        r1.append(r3.substring(0, r2));
    L7:
        return r1.toString();
    L5:
        r1.append(r3);
        goto L7
    }

    public abstract void a(String r1, String r2);

    public abstract void b(String r1, String r2, Throwable r3);

    public abstract void c(String r1, String r2);

    public abstract void d(String r1, String r2, Throwable r3);

    public abstract void f(String r1, String r2);

    public abstract void g(String r1, String r2, Throwable r3);

    public abstract void j(String r1, String r2);

    public abstract void k(String r1, String r2);

    public abstract void l(String r1, String r2, Throwable r3);
}
