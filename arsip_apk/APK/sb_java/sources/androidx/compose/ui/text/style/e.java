package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20252b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20253c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20254e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f20255a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return e.a();
        }

        public final int b() {
            return e.b();
        }

        public final int c() {
            return e.c();
        }

        public a() {
        }
    }

    static {
        f20252b = new a(null);
        f20253c = e(1);
        d = e(2);
        f20254e = e(0);
    }

    public /* synthetic */ e(int r1) {
        this.f20255a = r1;
    }

    public static final /* synthetic */ int a() {
        return d;
    }

    public static final /* synthetic */ int b() {
        return f20253c;
    }

    public static final /* synthetic */ int c() {
        return f20254e;
    }

    public static final /* synthetic */ e d(int r1) {
        return new e(r1);
    }

    public static int e(int r02) {
        return r02;
    }

    public static boolean f(int r2, Object r3) {
        if ((r3 instanceof e) == true) goto L6;
        return false;
    L6:
        if (r2 == ((e) r3).j()) goto L8;
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
        if (g(r1, f20253c) == false) goto L7;
        return "Hyphens.None";
    L7:
        if (g(r1, d) == false) goto L11;
        return "Hyphens.Auto";
    L11:
        if (g(r1, f20254e) == false) goto L14;
        return "Hyphens.Unspecified";
    L14:
        return "Invalid";
    }

    public boolean equals(Object r2) {
        return f(this.f20255a, r2);
    }

    public int hashCode() {
        return h(this.f20255a);
    }

    public final /* synthetic */ int j() {
        return this.f20255a;
    }

    public String toString() {
        return i(this.f20255a);
    }
}
