package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20303b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20304c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20305e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f20306f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f20307g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f20308h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f20309a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return k.a();
        }

        public final int b() {
            return k.b();
        }

        public final int c() {
            return k.c();
        }

        public final int d() {
            return k.d();
        }

        public final int e() {
            return k.e();
        }

        public final int f() {
            return k.f();
        }

        public a() {
        }
    }

    static {
        f20303b = new a(null);
        f20304c = h(1);
        d = h(2);
        f20305e = h(3);
        f20306f = h(4);
        f20307g = h(5);
        f20308h = h(0);
    }

    public /* synthetic */ k(int r1) {
        this.f20309a = r1;
    }

    public static final /* synthetic */ int a() {
        return f20305e;
    }

    public static final /* synthetic */ int b() {
        return f20306f;
    }

    public static final /* synthetic */ int c() {
        return f20307g;
    }

    public static final /* synthetic */ int d() {
        return f20304c;
    }

    public static final /* synthetic */ int e() {
        return d;
    }

    public static final /* synthetic */ int f() {
        return f20308h;
    }

    public static final /* synthetic */ k g(int r1) {
        return new k(r1);
    }

    public static int h(int r02) {
        return r02;
    }

    public static boolean i(int r2, Object r3) {
        if ((r3 instanceof k) == true) goto L6;
        return false;
    L6:
        if (r2 == ((k) r3).m()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean j(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static int k(int r02) {
        return Integer.hashCode(r02);
    }

    public static String l(int r1) {
        if (j(r1, f20304c) == false) goto L7;
        return "Ltr";
    L7:
        if (j(r1, d) == false) goto L11;
        return "Rtl";
    L11:
        if (j(r1, f20305e) == false) goto L15;
        return "Content";
    L15:
        if (j(r1, f20306f) == false) goto L19;
        return "ContentOrLtr";
    L19:
        if (j(r1, f20307g) == false) goto L23;
        return "ContentOrRtl";
    L23:
        if (j(r1, f20308h) == false) goto L26;
        return "Unspecified";
    L26:
        return "Invalid";
    }

    public boolean equals(Object r2) {
        return i(this.f20309a, r2);
    }

    public int hashCode() {
        return k(this.f20309a);
    }

    public final /* synthetic */ int m() {
        return this.f20309a;
    }

    public String toString() {
        return l(this.f20309a);
    }
}
