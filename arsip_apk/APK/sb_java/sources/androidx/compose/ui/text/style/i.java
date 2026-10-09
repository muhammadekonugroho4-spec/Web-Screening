package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20291b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20292c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20293e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f20294f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f20295g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f20296h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f20297i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f20298a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return i.a();
        }

        public final int b() {
            return i.b();
        }

        public final int c() {
            return i.c();
        }

        public final int d() {
            return i.d();
        }

        public final int e() {
            return i.e();
        }

        public final int f() {
            return i.f();
        }

        public final int g() {
            return i.g();
        }

        public a() {
        }
    }

    static {
        f20291b = new a(null);
        f20292c = i(1);
        d = i(2);
        f20293e = i(3);
        f20294f = i(4);
        f20295g = i(5);
        f20296h = i(6);
        f20297i = i(0);
    }

    public /* synthetic */ i(int r1) {
        this.f20298a = r1;
    }

    public static final /* synthetic */ int a() {
        return f20293e;
    }

    public static final /* synthetic */ int b() {
        return f20296h;
    }

    public static final /* synthetic */ int c() {
        return f20294f;
    }

    public static final /* synthetic */ int d() {
        return f20292c;
    }

    public static final /* synthetic */ int e() {
        return d;
    }

    public static final /* synthetic */ int f() {
        return f20295g;
    }

    public static final /* synthetic */ int g() {
        return f20297i;
    }

    public static final /* synthetic */ i h(int r1) {
        return new i(r1);
    }

    public static int i(int r02) {
        return r02;
    }

    public static boolean j(int r2, Object r3) {
        if ((r3 instanceof i) == true) goto L6;
        return false;
    L6:
        if (r2 == ((i) r3).n()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean k(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static int l(int r02) {
        return Integer.hashCode(r02);
    }

    public static String m(int r1) {
        if (k(r1, f20292c) == false) goto L7;
        return "Left";
    L7:
        if (k(r1, d) == false) goto L11;
        return "Right";
    L11:
        if (k(r1, f20293e) == false) goto L15;
        return "Center";
    L15:
        if (k(r1, f20294f) == false) goto L19;
        return "Justify";
    L19:
        if (k(r1, f20295g) == false) goto L23;
        return "Start";
    L23:
        if (k(r1, f20296h) == false) goto L27;
        return "End";
    L27:
        if (k(r1, f20297i) == false) goto L30;
        return "Unspecified";
    L30:
        return "Invalid";
    }

    public boolean equals(Object r2) {
        return j(this.f20298a, r2);
    }

    public int hashCode() {
        return l(this.f20298a);
    }

    public final /* synthetic */ int n() {
        return this.f20298a;
    }

    public String toString() {
        return m(this.f20298a);
    }
}
