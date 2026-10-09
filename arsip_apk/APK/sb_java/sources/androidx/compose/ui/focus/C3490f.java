package androidx.compose.ui.focus;

/* renamed from: androidx.compose.ui.focus.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3490f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17025b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17026c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f17027e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f17028f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f17029g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f17030h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f17031i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f17032j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f17033a;

    /* renamed from: androidx.compose.ui.focus.f$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return C3490f.a();
        }

        public final int b() {
            return C3490f.b();
        }

        public final int c() {
            return C3490f.c();
        }

        public final int d() {
            return C3490f.d();
        }

        public final int e() {
            return C3490f.e();
        }

        public final int f() {
            return C3490f.f();
        }

        public final int g() {
            return C3490f.g();
        }

        public final int h() {
            return C3490f.h();
        }

        public a() {
        }
    }

    static {
        f17025b = new a(null);
        f17026c = j(1);
        d = j(2);
        f17027e = j(3);
        f17028f = j(4);
        f17029g = j(5);
        f17030h = j(6);
        f17031i = j(7);
        f17032j = j(8);
    }

    public /* synthetic */ C3490f(int r1) {
        this.f17033a = r1;
    }

    public static final /* synthetic */ int a() {
        return f17030h;
    }

    public static final /* synthetic */ int b() {
        return f17031i;
    }

    public static final /* synthetic */ int c() {
        return f17032j;
    }

    public static final /* synthetic */ int d() {
        return f17027e;
    }

    public static final /* synthetic */ int e() {
        return f17026c;
    }

    public static final /* synthetic */ int f() {
        return d;
    }

    public static final /* synthetic */ int g() {
        return f17028f;
    }

    public static final /* synthetic */ int h() {
        return f17029g;
    }

    public static final /* synthetic */ C3490f i(int r1) {
        return new C3490f(r1);
    }

    public static int j(int r02) {
        return r02;
    }

    public static boolean k(int r2, Object r3) {
        if ((r3 instanceof C3490f) == true) goto L6;
        return false;
    L6:
        if (r2 == ((C3490f) r3).o()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean l(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static int m(int r02) {
        return Integer.hashCode(r02);
    }

    public static String n(int r1) {
        if (l(r1, f17026c) == false) goto L7;
        return "Next";
    L7:
        if (l(r1, d) == false) goto L11;
        return "Previous";
    L11:
        if (l(r1, f17027e) == false) goto L15;
        return "Left";
    L15:
        if (l(r1, f17028f) == false) goto L19;
        return "Right";
    L19:
        if (l(r1, f17029g) == false) goto L23;
        return "Up";
    L23:
        if (l(r1, f17030h) == false) goto L27;
        return "Down";
    L27:
        if (l(r1, f17031i) == false) goto L31;
        return "Enter";
    L31:
        if (l(r1, f17032j) == false) goto L34;
        return "Exit";
    L34:
        return "Invalid FocusDirection";
    }

    public boolean equals(Object r2) {
        return k(this.f17033a, r2);
    }

    public int hashCode() {
        return m(this.f17033a);
    }

    public final /* synthetic */ int o() {
        return this.f17033a;
    }

    public String toString() {
        return n(this.f17033a);
    }
}
