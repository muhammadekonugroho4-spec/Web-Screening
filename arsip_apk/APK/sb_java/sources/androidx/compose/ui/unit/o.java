package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20645b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final long f20646c = 0;
    public static final long d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f20647a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a() {
            return o.a();
        }

        public final long b() {
            return o.b();
        }

        public a() {
        }
    }

    static {
        f20645b = new a(null);
        f20646c = f(0);
        d = f(9223372034707292159L);
    }

    public /* synthetic */ o(long r1) {
        this.f20647a = r1;
    }

    public static final /* synthetic */ long a() {
        return d;
    }

    public static final /* synthetic */ long b() {
        return f20646c;
    }

    public static final /* synthetic */ o c(long r1) {
        return new o(r1);
    }

    public static final int d(long r02) {
        return k(r02);
    }

    public static final int e(long r02) {
        return l(r02);
    }

    public static long f(long r02) {
        return r02;
    }

    public static final long g(long r2, int r4, int r5) {
        return f((r4 << 32) | (r5 & 4294967295L));
    }

    public static /* synthetic */ long h(long r2, int r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r4 = (int) (r2 >> 32);
    L6:
        if ((r6 & 2) == 0) goto L9;
        r5 = (int) (4294967295L & r2);
    L9:
        return g(r2, r4, r5);
    }

    public static boolean i(long r4, Object r6) {
        if ((r6 instanceof o) == true) goto L6;
        return false;
    L6:
        if (r4 == ((o) r6).r()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean j(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final int k(long r1) {
        return (int) (r1 >> 32);
    }

    public static final int l(long r2) {
        return (int) (r2 & 4294967295L);
    }

    public static int m(long r02) {
        return Long.hashCode(r02);
    }

    public static final long n(long r4, long r6) {
        return f(((((int) (r4 >> 32)) - ((int) (r6 >> 32))) << 32) | ((((int) (r4 & 4294967295L)) - ((int) (r6 & 4294967295L))) & 4294967295L));
    }

    public static final long o(long r4, long r6) {
        return f(((((int) (r4 >> 32)) + ((int) (r6 >> 32))) << 32) | ((((int) (r4 & 4294967295L)) + ((int) (r6 & 4294967295L))) & 4294967295L));
    }

    public static String p(long r2) {
        return '(' + k(r2) + ", " + l(r2) + ')';
    }

    public static final long q(long r6) {
        int r1 = -((int) (r6 >> 32));
        return f(((-((int) (r6 & 4294967295L))) & 4294967295L) | (r1 << 32));
    }

    public boolean equals(Object r3) {
        return i(this.f20647a, r3);
    }

    public int hashCode() {
        return m(this.f20647a);
    }

    public final /* synthetic */ long r() {
        return this.f20647a;
    }

    public String toString() {
        return p(this.f20647a);
    }
}
