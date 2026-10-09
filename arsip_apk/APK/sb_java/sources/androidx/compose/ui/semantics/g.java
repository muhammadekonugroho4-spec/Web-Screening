package androidx.compose.ui.semantics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19544b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19545c = 0;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f19546a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return g.a();
        }

        public final int b() {
            return g.b();
        }

        public a() {
        }
    }

    static {
        f19544b = new a(null);
        f19545c = d(0);
        d = d(1);
    }

    public /* synthetic */ g(int r1) {
        this.f19546a = r1;
    }

    public static final /* synthetic */ int a() {
        return d;
    }

    public static final /* synthetic */ int b() {
        return f19545c;
    }

    public static final /* synthetic */ g c(int r1) {
        return new g(r1);
    }

    public static int d(int r02) {
        return r02;
    }

    public static boolean e(int r2, Object r3) {
        if ((r3 instanceof g) == true) goto L6;
        return false;
    L6:
        if (r2 == ((g) r3).i()) goto L8;
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

    public static String h(int r1) {
        if (f(r1, f19545c) == false) goto L7;
        return "Polite";
    L7:
        if (f(r1, d) == false) goto L10;
        return "Assertive";
    L10:
        return "Unknown";
    }

    public boolean equals(Object r2) {
        return e(this.f19546a, r2);
    }

    public int hashCode() {
        return g(this.f19546a);
    }

    public final /* synthetic */ int i() {
        return this.f19546a;
    }

    public String toString() {
        return h(this.f19546a);
    }
}
