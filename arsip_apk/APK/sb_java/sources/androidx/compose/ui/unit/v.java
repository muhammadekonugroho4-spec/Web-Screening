package androidx.compose.ui.unit;

import androidx.compose.ui.unit.x;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20657b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final x[] f20658c = null;
    public static final long d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f20659a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a() {
            return v.a();
        }

        public a() {
        }
    }

    static {
        f20657b = new a(null);
        x.a r02 = x.f20660b;
        f20658c = new x[]{x.d(r02.c()), x.d(r02.b()), x.d(r02.a())};
        d = w.k(0, Float.NaN);
    }

    public /* synthetic */ v(long r1) {
        this.f20659a = r1;
    }

    public static final /* synthetic */ long a() {
        return d;
    }

    public static final /* synthetic */ v b(long r1) {
        return new v(r1);
    }

    public static long c(long r02) {
        return r02;
    }

    public static boolean d(long r4, Object r6) {
        if ((r6 instanceof v) == true) goto L6;
        return false;
    L6:
        if (r4 == ((v) r6).m()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean e(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final long f(long r2) {
        return r2 & 1095216660480L;
    }

    public static final long g(long r2) {
        return f20658c[(int) (f(r2) >>> 32)].j();
    }

    public static final float h(long r2) {
        return Float.intBitsToFloat((int) (r2 & 4294967295L));
    }

    public static int i(long r02) {
        return Long.hashCode(r02);
    }

    public static final boolean j(long r2) {
        if (f(r2) != 8589934592L) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean k(long r2) {
        if (f(r2) != 4294967296L) goto L6;
        return true;
    L6:
        return false;
    }

    public static String l(long r5) {
        long r02 = g(r5);
        x.a r2 = x.f20660b;
        if (x.g(r02, r2.c()) == false) goto L7;
        return "Unspecified";
    L7:
        if (x.g(r02, r2.b()) == false) goto L11;
        return h(r5) + ".sp";
    L11:
        if (x.g(r02, r2.a()) == true) goto L13;
        return "Invalid";
    L13:
        return h(r5) + ".em";
    }

    public boolean equals(Object r3) {
        return d(this.f20659a, r3);
    }

    public int hashCode() {
        return i(this.f20659a);
    }

    public final /* synthetic */ long m() {
        return this.f20659a;
    }

    public String toString() {
        return l(this.f20659a);
    }
}
