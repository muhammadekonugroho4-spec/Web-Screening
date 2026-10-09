package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public final class h {
    public static final b d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final h f20273e = null;

    /* renamed from: a, reason: collision with root package name */
    public final float f20274a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20275b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20276c;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0139a f20277b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final float f20278c = 0.0f;
        public static final float d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public static final float f20279e = 0.0f;

        /* renamed from: f, reason: collision with root package name */
        public static final float f20280f = 0.0f;

        /* renamed from: a, reason: collision with root package name */
        public final float f20281a;

        /* renamed from: androidx.compose.ui.text.style.h$a$a, reason: collision with other inner class name */
        public static final class C0139a {
            public /* synthetic */ C0139a(kotlin.jvm.internal.i r1) {
                this();
            }

            public final float a() {
                return a.a();
            }

            public final float b() {
                return a.b();
            }

            public C0139a() {
            }
        }

        static {
            f20277b = new C0139a(null);
            f20278c = d(0.0f);
            d = d(0.5f);
            f20279e = d(-1.0f);
            f20280f = d(1.0f);
        }

        public /* synthetic */ a(float r1) {
            this.f20281a = r1;
        }

        public static final /* synthetic */ float a() {
            return d;
        }

        public static final /* synthetic */ float b() {
            return f20279e;
        }

        public static final /* synthetic */ a c(float r1) {
            return new a(r1);
        }

        public static float d(float r1) {
            if (0.0f > r1) goto L8;
            if (r1 > 1.0f) goto L8;
        L9:
            boolean r02 = true;
        L11:
            if (r02 == true) goto L13;
            androidx.compose.ui.text.internal.a.c("topRatio should be in [0..1] range or -1");
        L13:
            return r1;
        L8:
            if (r1 == (-1.0f)) goto L9;
            r02 = false;
            goto L11
        }

        public static boolean e(float r2, Object r3) {
            if ((r3 instanceof a) == true) goto L6;
            return false;
        L6:
            if (Float.compare(r2, ((a) r3).i()) == 0) goto L8;
            return false;
        L8:
            return true;
        }

        public static final boolean f(float r02, float r1) {
            if (Float.compare(r02, r1) != 0) goto L6;
            return true;
        L6:
            return false;
        }

        public static int g(float r02) {
            return Float.hashCode(r02);
        }

        public static String h(float r2) {
            if (r2 != f20278c) goto L7;
            return "LineHeightStyle.Alignment.Top";
        L7:
            if (r2 != d) goto L11;
            return "LineHeightStyle.Alignment.Center";
        L11:
            if (r2 != f20279e) goto L15;
            return "LineHeightStyle.Alignment.Proportional";
        L15:
            if (r2 != f20280f) goto L19;
            return "LineHeightStyle.Alignment.Bottom";
        L19:
            return "LineHeightStyle.Alignment(topPercentage = " + r2 + ')';
        }

        public boolean equals(Object r2) {
            return e(this.f20281a, r2);
        }

        public int hashCode() {
            return g(this.f20281a);
        }

        public final /* synthetic */ float i() {
            return this.f20281a;
        }

        public String toString() {
            return h(this.f20281a);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final h a() {
            return h.a();
        }

        public b() {
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20282b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20283c = 0;
        public static final int d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f20284e = 0;

        /* renamed from: a, reason: collision with root package name */
        public final int f20285a;

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

            public a() {
            }
        }

        static {
            f20282b = new a(null);
            f20283c = e(0);
            d = e(1);
            f20284e = e(2);
        }

        public /* synthetic */ c(int r1) {
            this.f20285a = r1;
        }

        public static final /* synthetic */ int a() {
            return f20283c;
        }

        public static final /* synthetic */ int b() {
            return d;
        }

        public static final /* synthetic */ int c() {
            return f20284e;
        }

        public static final /* synthetic */ c d(int r1) {
            return new c(r1);
        }

        public static int e(int r02) {
            return r02;
        }

        public static boolean f(int r2, Object r3) {
            if ((r3 instanceof c) == true) goto L6;
            return false;
        L6:
            if (r2 == ((c) r3).j()) goto L8;
            return false;
        L8:
            return true;
        }

        public static final boolean g(int r02, int r1) {
            if (r02 != r1) goto L5;
            return true;
        L5:
            return false;
        }

        public static int h(int r02) {
            return Integer.hashCode(r02);
        }

        public static String i(int r1) {
            if (g(r1, f20283c) == false) goto L7;
            return "LineHeightStyle.Mode.Fixed";
        L7:
            if (g(r1, d) == false) goto L11;
            return "LineHeightStyle.Mode.Minimum";
        L11:
            if (g(r1, f20284e) == false) goto L14;
            return "LineHeightStyle.Mode.Tight";
        L14:
            return "Invalid";
        }

        public boolean equals(Object r2) {
            return f(this.f20285a, r2);
        }

        public int hashCode() {
            return h(this.f20285a);
        }

        public final /* synthetic */ int j() {
            return this.f20285a;
        }

        public String toString() {
            return i(this.f20285a);
        }
    }

    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20286b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20287c = 0;
        public static final int d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f20288e = 0;

        /* renamed from: f, reason: collision with root package name */
        public static final int f20289f = 0;

        /* renamed from: a, reason: collision with root package name */
        public final int f20290a;

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
            f20286b = new a(null);
            f20287c = d(1);
            d = d(16);
            f20288e = d(17);
            f20289f = d(0);
        }

        public /* synthetic */ d(int r1) {
            this.f20290a = r1;
        }

        public static final /* synthetic */ int a() {
            return f20288e;
        }

        public static final /* synthetic */ int b() {
            return f20289f;
        }

        public static final /* synthetic */ d c(int r1) {
            return new d(r1);
        }

        public static int d(int r02) {
            return r02;
        }

        public static boolean e(int r2, Object r3) {
            if ((r3 instanceof d) == true) goto L6;
            return false;
        L6:
            if (r2 == ((d) r3).k()) goto L8;
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

        public static int g(int r02) {
            return Integer.hashCode(r02);
        }

        public static final boolean h(int r1) {
            if ((r1 & 1) <= 0) goto L5;
            return true;
        L5:
            return false;
        }

        public static final boolean i(int r02) {
            if ((r02 & 16) <= 0) goto L6;
            return true;
        L6:
            return false;
        }

        public static String j(int r1) {
            if (r1 != f20287c) goto L7;
            return "LineHeightStyle.Trim.FirstLineTop";
        L7:
            if (r1 != d) goto L11;
            return "LineHeightStyle.Trim.LastLineBottom";
        L11:
            if (r1 != f20288e) goto L15;
            return "LineHeightStyle.Trim.Both";
        L15:
            if (r1 != f20289f) goto L18;
            return "LineHeightStyle.Trim.None";
        L18:
            return "Invalid";
        }

        public boolean equals(Object r2) {
            return e(this.f20290a, r2);
        }

        public int hashCode() {
            return g(this.f20290a);
        }

        public final /* synthetic */ int k() {
            return this.f20290a;
        }

        public String toString() {
            return j(this.f20290a);
        }
    }

    static {
        kotlin.jvm.internal.i r1 = null;
        d = new b(r1);
        f20273e = new h(a.f20277b.b(), d.f20286b.a(), c.f20282b.a(), r1);
    }

    public /* synthetic */ h(float r1, int r2, int r3, kotlin.jvm.internal.i r4) {
        this(r1, r2, r3);
    }

    public static final /* synthetic */ h a() {
        return f20273e;
    }

    public final float b() {
        return this.f20274a;
    }

    public final int c() {
        return this.f20276c;
    }

    public final int d() {
        return this.f20275b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (a.f(this.f20274a, r52.f20274a) == true) goto L12;
        return false;
    L12:
        if (d.f(this.f20275b, r52.f20275b) == true) goto L15;
        return false;
    L15:
        if (c.g(this.f20276c, r52.f20276c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((a.g(this.f20274a) * 31) + d.g(this.f20275b)) * 31) + c.h(this.f20276c);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + a.h(this.f20274a) + ", trim=" + d.j(this.f20275b) + ",mode=" + c.i(this.f20276c) + ')';
    }

    public /* synthetic */ h(float r1, int r2, kotlin.jvm.internal.i r3) {
        this(r1, r2);
    }

    public h(float r1, int r2, int r3) {
        this.f20274a = r1;
        this.f20275b = r2;
        this.f20276c = r3;
    }

    public h(float r3, int r4) {
        this(r3, r4, c.f20282b.a(), null);
    }
}
