package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final a f20329a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f20330b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20331c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20332e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f20333f = 0;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return u.a();
        }

        public final int b() {
            return u.b();
        }

        public final int c() {
            return u.c();
        }

        public final int d() {
            return u.d();
        }

        public final int e() {
            return u.e();
        }

        public a() {
        }
    }

    static {
        f20329a = new a(null);
        f20330b = f(1);
        f20331c = f(2);
        d = f(3);
        f20332e = f(4);
        f20333f = f(5);
    }

    public static final /* synthetic */ int a() {
        return f20330b;
    }

    public static final /* synthetic */ int b() {
        return f20331c;
    }

    public static final /* synthetic */ int c() {
        return f20333f;
    }

    public static final /* synthetic */ int d() {
        return f20332e;
    }

    public static final /* synthetic */ int e() {
        return d;
    }

    public static int f(int r02) {
        return r02;
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
        if (g(r1, f20330b) == false) goto L7;
        return "Clip";
    L7:
        if (g(r1, f20331c) == false) goto L11;
        return "Ellipsis";
    L11:
        if (g(r1, f20333f) == false) goto L15;
        return "MiddleEllipsis";
    L15:
        if (g(r1, d) == false) goto L19;
        return "Visible";
    L19:
        if (g(r1, f20332e) == false) goto L22;
        return "StartEllipsis";
    L22:
        return "Invalid";
    }
}
