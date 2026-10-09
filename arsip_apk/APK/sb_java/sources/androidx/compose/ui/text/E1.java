package androidx.compose.ui.text;

/* loaded from: classes.dex */
public final class E1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19628b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final long f19629c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f19630a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a() {
            return E1.a();
        }

        public a() {
        }
    }

    static {
        f19628b = new a(null);
        f19629c = F1.a(0);
    }

    public /* synthetic */ E1(long r1) {
        this.f19630a = r1;
    }

    public static final /* synthetic */ long a() {
        return f19629c;
    }

    public static final /* synthetic */ E1 b(long r1) {
        return new E1(r1);
    }

    public static long c(long r02) {
        return r02;
    }

    public static final boolean d(long r4, long r6) {
        boolean r2 = false;
        if (l(r4) > l(r6)) goto L5;
        boolean r02 = true;
    L7:
        if (k(r6) > k(r4)) goto L10;
        r2 = true;
    L10:
        return r02 & r2;
    L5:
        r02 = false;
        goto L7
    }

    public static final boolean e(long r1, int r3) {
        int r02 = l(r1);
        if (r3 >= k(r1)) goto L7;
        if (r02 > r3) goto L7;
        return true;
    L7:
        return false;
    }

    public static boolean f(long r4, Object r6) {
        if ((r6 instanceof E1) == true) goto L6;
        return false;
    L6:
        if (r4 == ((E1) r6).r()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean g(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean h(long r1) {
        if (n(r1) != i(r1)) goto L6;
        return true;
    L6:
        return false;
    }

    public static final int i(long r2) {
        return (int) (r2 & 4294967295L);
    }

    public static final int j(long r1) {
        return k(r1) - l(r1);
    }

    public static final int k(long r1) {
        return Math.max(n(r1), i(r1));
    }

    public static final int l(long r1) {
        return Math.min(n(r1), i(r1));
    }

    public static final boolean m(long r1) {
        if (n(r1) <= i(r1)) goto L6;
        return true;
    L6:
        return false;
    }

    public static final int n(long r1) {
        return (int) (r1 >> 32);
    }

    public static int o(long r02) {
        return Long.hashCode(r02);
    }

    public static final boolean p(long r4, long r6) {
        boolean r2 = false;
        if (l(r4) >= k(r6)) goto L5;
        boolean r02 = true;
    L7:
        if (l(r6) >= k(r4)) goto L10;
        r2 = true;
    L10:
        return r02 & r2;
    L5:
        r02 = false;
        goto L7
    }

    public static String q(long r2) {
        return "TextRange(" + n(r2) + ", " + i(r2) + ')';
    }

    public boolean equals(Object r3) {
        return f(this.f19630a, r3);
    }

    public int hashCode() {
        return o(this.f19630a);
    }

    public final /* synthetic */ long r() {
        return this.f19630a;
    }

    public String toString() {
        return q(this.f19630a);
    }
}
