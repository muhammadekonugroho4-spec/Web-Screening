package androidx.compose.ui.text.input;

/* renamed from: androidx.compose.ui.text.input.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3800w {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20087b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20088c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20089e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f20090f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f20091g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f20092a;

    /* renamed from: androidx.compose.ui.text.input.w$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return C3800w.a();
        }

        public final int b() {
            return C3800w.b();
        }

        public final int c() {
            return C3800w.c();
        }

        public final int d() {
            return C3800w.d();
        }

        public final int e() {
            return C3800w.e();
        }

        public a() {
        }
    }

    static {
        f20087b = new a(null);
        f20088c = g(-1);
        d = g(0);
        f20089e = g(1);
        f20090f = g(2);
        f20091g = g(3);
    }

    public /* synthetic */ C3800w(int r1) {
        this.f20092a = r1;
    }

    public static final /* synthetic */ int a() {
        return f20089e;
    }

    public static final /* synthetic */ int b() {
        return d;
    }

    public static final /* synthetic */ int c() {
        return f20091g;
    }

    public static final /* synthetic */ int d() {
        return f20088c;
    }

    public static final /* synthetic */ int e() {
        return f20090f;
    }

    public static final /* synthetic */ C3800w f(int r1) {
        return new C3800w(r1);
    }

    public static int g(int r02) {
        return r02;
    }

    public static boolean h(int r2, Object r3) {
        if ((r3 instanceof C3800w) == true) goto L6;
        return false;
    L6:
        if (r2 == ((C3800w) r3).l()) goto L8;
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
        if (i(r1, f20088c) == false) goto L7;
        return "Unspecified";
    L7:
        if (i(r1, d) == false) goto L11;
        return "None";
    L11:
        if (i(r1, f20089e) == false) goto L15;
        return "Characters";
    L15:
        if (i(r1, f20090f) == false) goto L19;
        return "Words";
    L19:
        if (i(r1, f20091g) == false) goto L22;
        return "Sentences";
    L22:
        return "Invalid";
    }

    public boolean equals(Object r2) {
        return h(this.f20092a, r2);
    }

    public int hashCode() {
        return j(this.f20092a);
    }

    public final /* synthetic */ int l() {
        return this.f20092a;
    }

    public String toString() {
        return k(this.f20092a);
    }
}
