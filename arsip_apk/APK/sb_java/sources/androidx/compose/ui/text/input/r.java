package androidx.compose.ui.text.input;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20070b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20071c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20072e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f20073f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f20074g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f20075h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f20076i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f20077j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f20078k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f20079a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return r.a();
        }

        public final int b() {
            return r.b();
        }

        public final int c() {
            return r.c();
        }

        public final int d() {
            return r.d();
        }

        public final int e() {
            return r.e();
        }

        public final int f() {
            return r.f();
        }

        public final int g() {
            return r.g();
        }

        public final int h() {
            return r.h();
        }

        public final int i() {
            return r.i();
        }

        public a() {
        }
    }

    static {
        f20070b = new a(null);
        f20071c = k(-1);
        d = k(1);
        f20072e = k(0);
        f20073f = k(2);
        f20074g = k(3);
        f20075h = k(4);
        f20076i = k(5);
        f20077j = k(6);
        f20078k = k(7);
    }

    public /* synthetic */ r(int r1) {
        this.f20079a = r1;
    }

    public static final /* synthetic */ int a() {
        return d;
    }

    public static final /* synthetic */ int b() {
        return f20078k;
    }

    public static final /* synthetic */ int c() {
        return f20073f;
    }

    public static final /* synthetic */ int d() {
        return f20077j;
    }

    public static final /* synthetic */ int e() {
        return f20072e;
    }

    public static final /* synthetic */ int f() {
        return f20076i;
    }

    public static final /* synthetic */ int g() {
        return f20074g;
    }

    public static final /* synthetic */ int h() {
        return f20075h;
    }

    public static final /* synthetic */ int i() {
        return f20071c;
    }

    public static final /* synthetic */ r j(int r1) {
        return new r(r1);
    }

    public static int k(int r02) {
        return r02;
    }

    public static boolean l(int r2, Object r3) {
        if ((r3 instanceof r) == true) goto L6;
        return false;
    L6:
        if (r2 == ((r) r3).p()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean m(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static int n(int r02) {
        return Integer.hashCode(r02);
    }

    public static String o(int r1) {
        if (m(r1, f20071c) == false) goto L7;
        return "Unspecified";
    L7:
        if (m(r1, f20072e) == false) goto L11;
        return "None";
    L11:
        if (m(r1, d) == false) goto L15;
        return "Default";
    L15:
        if (m(r1, f20073f) == false) goto L19;
        return "Go";
    L19:
        if (m(r1, f20074g) == false) goto L23;
        return "Search";
    L23:
        if (m(r1, f20075h) == false) goto L27;
        return "Send";
    L27:
        if (m(r1, f20076i) == false) goto L31;
        return "Previous";
    L31:
        if (m(r1, f20077j) == false) goto L35;
        return "Next";
    L35:
        if (m(r1, f20078k) == false) goto L38;
        return "Done";
    L38:
        return "Invalid";
    }

    public boolean equals(Object r2) {
        return l(this.f20079a, r2);
    }

    public int hashCode() {
        return n(this.f20079a);
    }

    public final /* synthetic */ int p() {
        return this.f20079a;
    }

    public String toString() {
        return o(this.f20079a);
    }
}
