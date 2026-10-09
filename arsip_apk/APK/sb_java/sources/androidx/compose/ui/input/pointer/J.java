package androidx.compose.ui.input.pointer;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final a f18073b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18074c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f18075e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f18076f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f18077g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f18078a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return J.a();
        }

        public final int b() {
            return J.b();
        }

        public final int c() {
            return J.c();
        }

        public final int d() {
            return J.d();
        }

        public final int e() {
            return J.e();
        }

        public a() {
        }
    }

    static {
        f18073b = new a(null);
        f18074c = g(0);
        d = g(1);
        f18075e = g(2);
        f18076f = g(3);
        f18077g = g(4);
    }

    public /* synthetic */ J(int r1) {
        this.f18078a = r1;
    }

    public static final /* synthetic */ int a() {
        return f18077g;
    }

    public static final /* synthetic */ int b() {
        return f18075e;
    }

    public static final /* synthetic */ int c() {
        return f18076f;
    }

    public static final /* synthetic */ int d() {
        return d;
    }

    public static final /* synthetic */ int e() {
        return f18074c;
    }

    public static final /* synthetic */ J f(int r1) {
        return new J(r1);
    }

    public static int g(int r02) {
        return r02;
    }

    public static boolean h(int r2, Object r3) {
        if ((r3 instanceof J) == true) goto L6;
        return false;
    L6:
        if (r2 == ((J) r3).l()) goto L8;
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
        if (r1 != 1) goto L5;
        return "Touch";
    L5:
        if (r1 != 2) goto L7;
        return "Mouse";
    L7:
        if (r1 != 3) goto L9;
        return "Stylus";
    L9:
        if (r1 == 4) goto L12;
        return "Unknown";
    L12:
        return "Eraser";
    }

    public boolean equals(Object r2) {
        return h(this.f18078a, r2);
    }

    public int hashCode() {
        return j(this.f18078a);
    }

    public final /* synthetic */ int l() {
        return this.f18078a;
    }

    public String toString() {
        return k(this.f18078a);
    }
}
