package androidx.compose.ui.text.input;

/* renamed from: androidx.compose.ui.text.input.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3801x {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20093b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20094c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20095e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f20096f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f20097g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f20098h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f20099i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f20100j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f20101k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f20102l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f20103a;

    /* renamed from: androidx.compose.ui.text.input.x$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return C3801x.a();
        }

        public final int b() {
            return C3801x.b();
        }

        public final int c() {
            return C3801x.c();
        }

        public final int d() {
            return C3801x.d();
        }

        public final int e() {
            return C3801x.e();
        }

        public final int f() {
            return C3801x.f();
        }

        public final int g() {
            return C3801x.g();
        }

        public final int h() {
            return C3801x.h();
        }

        public final int i() {
            return C3801x.i();
        }

        public final int j() {
            return C3801x.j();
        }

        public a() {
        }
    }

    static {
        f20093b = new a(null);
        f20094c = l(0);
        d = l(1);
        f20095e = l(2);
        f20096f = l(3);
        f20097g = l(4);
        f20098h = l(5);
        f20099i = l(6);
        f20100j = l(7);
        f20101k = l(8);
        f20102l = l(9);
    }

    public /* synthetic */ C3801x(int r1) {
        this.f20103a = r1;
    }

    public static final /* synthetic */ int a() {
        return f20095e;
    }

    public static final /* synthetic */ int b() {
        return f20102l;
    }

    public static final /* synthetic */ int c() {
        return f20099i;
    }

    public static final /* synthetic */ int d() {
        return f20096f;
    }

    public static final /* synthetic */ int e() {
        return f20101k;
    }

    public static final /* synthetic */ int f() {
        return f20100j;
    }

    public static final /* synthetic */ int g() {
        return f20097g;
    }

    public static final /* synthetic */ int h() {
        return d;
    }

    public static final /* synthetic */ int i() {
        return f20094c;
    }

    public static final /* synthetic */ int j() {
        return f20098h;
    }

    public static final /* synthetic */ C3801x k(int r1) {
        return new C3801x(r1);
    }

    public static int l(int r02) {
        return r02;
    }

    public static boolean m(int r2, Object r3) {
        if ((r3 instanceof C3801x) == true) goto L6;
        return false;
    L6:
        if (r2 == ((C3801x) r3).q()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean n(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static int o(int r02) {
        return Integer.hashCode(r02);
    }

    public static String p(int r1) {
        if (n(r1, f20094c) == false) goto L7;
        return "Unspecified";
    L7:
        if (n(r1, d) == false) goto L11;
        return "Text";
    L11:
        if (n(r1, f20095e) == false) goto L15;
        return "Ascii";
    L15:
        if (n(r1, f20096f) == false) goto L19;
        return "Number";
    L19:
        if (n(r1, f20097g) == false) goto L23;
        return "Phone";
    L23:
        if (n(r1, f20098h) == false) goto L27;
        return "Uri";
    L27:
        if (n(r1, f20099i) == false) goto L31;
        return "Email";
    L31:
        if (n(r1, f20100j) == false) goto L35;
        return "Password";
    L35:
        if (n(r1, f20101k) == false) goto L39;
        return "NumberPassword";
    L39:
        if (n(r1, f20102l) == false) goto L42;
        return "Decimal";
    L42:
        return "Invalid";
    }

    public boolean equals(Object r2) {
        return m(this.f20103a, r2);
    }

    public int hashCode() {
        return o(this.f20103a);
    }

    public final /* synthetic */ int q() {
        return this.f20103a;
    }

    public String toString() {
        return p(this.f20103a);
    }
}
