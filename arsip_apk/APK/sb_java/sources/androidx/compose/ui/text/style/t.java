package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static final a f20321c = null;
    public static final t d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final t f20322e = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f20323a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20324b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final t a() {
            return t.a();
        }

        public final t b() {
            return t.b();
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20325b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20326c = 0;
        public static final int d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f20327e = 0;

        /* renamed from: a, reason: collision with root package name */
        public final int f20328a;

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
            f20325b = new a(null);
            f20326c = e(1);
            d = e(2);
            f20327e = e(3);
        }

        public /* synthetic */ b(int r1) {
            this.f20328a = r1;
        }

        public static final /* synthetic */ int a() {
            return d;
        }

        public static final /* synthetic */ int b() {
            return f20326c;
        }

        public static final /* synthetic */ int c() {
            return f20327e;
        }

        public static final /* synthetic */ b d(int r1) {
            return new b(r1);
        }

        public static int e(int r02) {
            return r02;
        }

        public static boolean f(int r2, Object r3) {
            if ((r3 instanceof b) == true) goto L6;
            return false;
        L6:
            if (r2 == ((b) r3).j()) goto L8;
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
            if (g(r1, f20326c) == false) goto L7;
            return "Linearity.Linear";
        L7:
            if (g(r1, d) == false) goto L11;
            return "Linearity.FontHinting";
        L11:
            if (g(r1, f20327e) == false) goto L14;
            return "Linearity.None";
        L14:
            return "Invalid";
        }

        public boolean equals(Object r2) {
            return f(this.f20328a, r2);
        }

        public int hashCode() {
            return h(this.f20328a);
        }

        public final /* synthetic */ int j() {
            return this.f20328a;
        }

        public String toString() {
            return i(this.f20328a);
        }
    }

    static {
        kotlin.jvm.internal.i r1 = null;
        f20321c = new a(r1);
        b.a r2 = b.f20325b;
        d = new t(r2.a(), false, r1);
        f20322e = new t(r2.b(), true, r1);
    }

    public /* synthetic */ t(int r1, boolean r2, kotlin.jvm.internal.i r3) {
        this(r1, r2);
    }

    public static final /* synthetic */ t a() {
        return f20322e;
    }

    public static final /* synthetic */ t b() {
        return d;
    }

    public final int c() {
        return this.f20323a;
    }

    public final boolean d() {
        return this.f20324b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof t) == true) goto L8;
        return false;
    L8:
        t r52 = (t) r5;
        if (b.g(this.f20323a, r52.f20323a) == true) goto L12;
        return false;
    L12:
        if (this.f20324b == r52.f20324b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (b.h(this.f20323a) * 31) + Boolean.hashCode(this.f20324b);
    }

    public String toString() {
        if (kotlin.jvm.internal.p.g(this, d) == false) goto L7;
        return "TextMotion.Static";
    L7:
        if (kotlin.jvm.internal.p.g(this, f20322e) == false) goto L10;
        return "TextMotion.Animated";
    L10:
        return "Invalid";
    }

    public t(int r1, boolean r2) {
        this.f20323a = r1;
        this.f20324b = r2;
    }
}
