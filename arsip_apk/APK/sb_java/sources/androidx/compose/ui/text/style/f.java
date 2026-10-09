package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20256b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20257c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20258e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f20259f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f20260a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return f.a();
        }

        public final int b() {
            return f.b();
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f20261a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final int f20262b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20263c = 0;
        public static final int d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f20264e = 0;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.i r1) {
                this();
            }

            public final int a() {
                return b.a();
            }

            public final int b() {
                return b.b();
            }

            public final int c() {
                return b.c();
            }

            public a() {
            }
        }

        static {
            f20261a = new a(null);
            f20262b = d(1);
            f20263c = d(2);
            d = d(3);
            f20264e = d(0);
        }

        public static final /* synthetic */ int a() {
            return d;
        }

        public static final /* synthetic */ int b() {
            return f20263c;
        }

        public static final /* synthetic */ int c() {
            return f20262b;
        }

        public static int d(int r02) {
            return r02;
        }

        public static final boolean e(int r02, int r1) {
            if (r02 != r1) goto L5;
            return true;
        L5:
            return false;
        }

        public static String f(int r1) {
            if (e(r1, f20262b) == false) goto L7;
            return "Strategy.Simple";
        L7:
            if (e(r1, f20263c) == false) goto L11;
            return "Strategy.HighQuality";
        L11:
            if (e(r1, d) == false) goto L15;
            return "Strategy.Balanced";
        L15:
            if (e(r1, f20264e) == false) goto L18;
            return "Strategy.Unspecified";
        L18:
            return "Invalid";
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f20265a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final int f20266b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20267c = 0;
        public static final int d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f20268e = 0;

        /* renamed from: f, reason: collision with root package name */
        public static final int f20269f = 0;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.i r1) {
                this();
            }

            public final int a() {
                return c.a();
            }

            public final int b() {
                return c.b();
            }

            public final int c() {
                return c.c();
            }

            public final int d() {
                return c.d();
            }

            public a() {
            }
        }

        static {
            f20265a = new a(null);
            f20266b = e(1);
            f20267c = e(2);
            d = e(3);
            f20268e = e(4);
            f20269f = e(0);
        }

        public static final /* synthetic */ int a() {
            return f20266b;
        }

        public static final /* synthetic */ int b() {
            return f20267c;
        }

        public static final /* synthetic */ int c() {
            return d;
        }

        public static final /* synthetic */ int d() {
            return f20268e;
        }

        public static int e(int r02) {
            return r02;
        }

        public static final boolean f(int r02, int r1) {
            if (r02 != r1) goto L5;
            return true;
        L5:
            return false;
        }

        public static String g(int r1) {
            if (f(r1, f20266b) == false) goto L7;
            return "Strictness.None";
        L7:
            if (f(r1, f20267c) == false) goto L11;
            return "Strictness.Loose";
        L11:
            if (f(r1, d) == false) goto L15;
            return "Strictness.Normal";
        L15:
            if (f(r1, f20268e) == false) goto L19;
            return "Strictness.Strict";
        L19:
            if (f(r1, f20269f) == false) goto L22;
            return "Strictness.Unspecified";
        L22:
            return "Invalid";
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f20270a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final int f20271b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20272c = 0;
        public static final int d = 0;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.i r1) {
                this();
            }

            public final int a() {
                return d.a();
            }

            public final int b() {
                return d.b();
            }

            public a() {
            }
        }

        static {
            f20270a = new a(null);
            f20271b = c(1);
            f20272c = c(2);
            d = c(0);
        }

        public static final /* synthetic */ int a() {
            return f20271b;
        }

        public static final /* synthetic */ int b() {
            return f20272c;
        }

        public static int c(int r02) {
            return r02;
        }

        public static final boolean d(int r02, int r1) {
            if (r02 != r1) goto L5;
            return true;
        L5:
            return false;
        }

        public static String e(int r1) {
            if (d(r1, f20271b) == false) goto L7;
            return "WordBreak.None";
        L7:
            if (d(r1, f20272c) == false) goto L11;
            return "WordBreak.Phrase";
        L11:
            if (d(r1, d) == false) goto L14;
            return "WordBreak.Unspecified";
        L14:
            return "Invalid";
        }
    }

    static {
        f20256b = new a(null);
        b.a r02 = b.f20261a;
        int r1 = r02.c();
        c.a r2 = c.f20265a;
        int r3 = r2.c();
        d.a r4 = d.f20270a;
        f20257c = d(g.a(r1, r3, r4.a()));
        d = d(g.a(r02.a(), r2.b(), r4.b()));
        f20258e = d(g.a(r02.b(), r2.d(), r4.a()));
        f20259f = d(0);
    }

    public /* synthetic */ f(int r1) {
        this.f20260a = r1;
    }

    public static final /* synthetic */ int a() {
        return f20257c;
    }

    public static final /* synthetic */ int b() {
        return f20259f;
    }

    public static final /* synthetic */ f c(int r1) {
        return new f(r1);
    }

    public static int d(int r02) {
        return r02;
    }

    public static boolean e(int r2, Object r3) {
        if ((r3 instanceof f) == true) goto L6;
        return false;
    L6:
        if (r2 == ((f) r3).l()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean f(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static final int g(int r02) {
        return b.d(g.b(r02));
    }

    public static final int h(int r02) {
        return c.e(g.c(r02));
    }

    public static final int i(int r02) {
        return d.c(g.d(r02));
    }

    public static int j(int r02) {
        return Integer.hashCode(r02);
    }

    public static String k(int r2) {
        return "LineBreak(strategy=" + b.f(g(r2)) + ", strictness=" + c.g(h(r2)) + ", wordBreak=" + d.e(i(r2)) + ')';
    }

    public boolean equals(Object r2) {
        return e(this.f20260a, r2);
    }

    public int hashCode() {
        return j(this.f20260a);
    }

    public final /* synthetic */ int l() {
        return this.f20260a;
    }

    public String toString() {
        return k(this.f20260a);
    }
}
