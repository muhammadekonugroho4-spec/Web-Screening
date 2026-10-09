package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17131b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17132c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f17133e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f17134f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f17135g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f17136a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return P0.a();
        }

        public final int b() {
            return P0.b();
        }

        public final int c() {
            return P0.c();
        }

        public final int d() {
            return P0.d();
        }

        public final int e() {
            return P0.e();
        }

        public a() {
        }
    }

    static {
        f17131b = new a(null);
        f17132c = g(0);
        d = g(1);
        f17133e = g(2);
        f17134f = g(3);
        f17135g = g(4);
    }

    public /* synthetic */ P0(int r1) {
        this.f17136a = r1;
    }

    public static final /* synthetic */ int a() {
        return d;
    }

    public static final /* synthetic */ int b() {
        return f17132c;
    }

    public static final /* synthetic */ int c() {
        return f17134f;
    }

    public static final /* synthetic */ int d() {
        return f17135g;
    }

    public static final /* synthetic */ int e() {
        return f17133e;
    }

    public static final /* synthetic */ P0 f(int r1) {
        return new P0(r1);
    }

    public static int g(int r02) {
        return r02;
    }

    public static boolean h(int r2, Object r3) {
        if ((r3 instanceof P0) == true) goto L6;
        return false;
    L6:
        if (r2 == ((P0) r3).l()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean i(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static int j(int r02) {
        return Integer.hashCode(r02);
    }

    public static String k(int r1) {
        if (i(r1, f17132c) == false) goto L7;
        return "Argb8888";
    L7:
        if (i(r1, d) == false) goto L11;
        return "Alpha8";
    L11:
        if (i(r1, f17133e) == false) goto L15;
        return "Rgb565";
    L15:
        if (i(r1, f17134f) == false) goto L19;
        return "F16";
    L19:
        if (i(r1, f17135g) == false) goto L22;
        return "Gpu";
    L22:
        return "Unknown";
    }

    public boolean equals(Object r2) {
        return h(this.f17136a, r2);
    }

    public int hashCode() {
        return j(this.f17136a);
    }

    public final /* synthetic */ int l() {
        return this.f17136a;
    }

    public String toString() {
        return k(this.f17136a);
    }
}
