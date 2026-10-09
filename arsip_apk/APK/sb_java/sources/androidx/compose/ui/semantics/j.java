package androidx.compose.ui.semantics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19552b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19553c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19554e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f19555f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f19556g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f19557h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f19558i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f19559j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f19560k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f19561a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return j.a();
        }

        public final int b() {
            return j.b();
        }

        public final int c() {
            return j.c();
        }

        public final int d() {
            return j.d();
        }

        public final int e() {
            return j.e();
        }

        public final int f() {
            return j.f();
        }

        public final int g() {
            return j.g();
        }

        public final int h() {
            return j.h();
        }

        public final int i() {
            return j.i();
        }

        public a() {
        }
    }

    static {
        f19552b = new a(null);
        f19553c = k(0);
        d = k(1);
        f19554e = k(2);
        f19555f = k(3);
        f19556g = k(4);
        f19557h = k(5);
        f19558i = k(6);
        f19559j = k(7);
        f19560k = k(8);
    }

    public /* synthetic */ j(int r1) {
        this.f19561a = r1;
    }

    public static final /* synthetic */ int a() {
        return f19553c;
    }

    public static final /* synthetic */ int b() {
        return f19560k;
    }

    public static final /* synthetic */ int c() {
        return d;
    }

    public static final /* synthetic */ int d() {
        return f19558i;
    }

    public static final /* synthetic */ int e() {
        return f19557h;
    }

    public static final /* synthetic */ int f() {
        return f19555f;
    }

    public static final /* synthetic */ int g() {
        return f19554e;
    }

    public static final /* synthetic */ int h() {
        return f19556g;
    }

    public static final /* synthetic */ int i() {
        return f19559j;
    }

    public static final /* synthetic */ j j(int r1) {
        return new j(r1);
    }

    public static int k(int r02) {
        return r02;
    }

    public static boolean l(int r2, Object r3) {
        if ((r3 instanceof j) == true) goto L6;
        return false;
    L6:
        if (r2 == ((j) r3).p()) goto L8;
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
        if (m(r1, f19553c) == false) goto L7;
        return "Button";
    L7:
        if (m(r1, d) == false) goto L11;
        return "Checkbox";
    L11:
        if (m(r1, f19554e) == false) goto L15;
        return "Switch";
    L15:
        if (m(r1, f19555f) == false) goto L19;
        return "RadioButton";
    L19:
        if (m(r1, f19556g) == false) goto L23;
        return "Tab";
    L23:
        if (m(r1, f19557h) == false) goto L27;
        return "Image";
    L27:
        if (m(r1, f19558i) == false) goto L31;
        return "DropdownList";
    L31:
        if (m(r1, f19559j) == false) goto L35;
        return "Picker";
    L35:
        if (m(r1, f19560k) == false) goto L38;
        return "Carousel";
    L38:
        return "Unknown";
    }

    public boolean equals(Object r2) {
        return l(this.f19561a, r2);
    }

    public int hashCode() {
        return n(this.f19561a);
    }

    public final /* synthetic */ int p() {
        return this.f19561a;
    }

    public String toString() {
        return o(this.f19561a);
    }
}
