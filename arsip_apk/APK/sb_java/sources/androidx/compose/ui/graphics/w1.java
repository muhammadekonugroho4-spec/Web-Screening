package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17861a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17862b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17863c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f17864e = 0;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return w1.a();
        }

        public final int b() {
            return w1.b();
        }

        public final int c() {
            return w1.c();
        }

        public final int d() {
            return w1.d();
        }

        public a() {
        }
    }

    static {
        f17861a = new a(null);
        f17862b = e(0);
        f17863c = e(1);
        d = e(2);
        f17864e = e(3);
    }

    public static final /* synthetic */ int a() {
        return f17862b;
    }

    public static final /* synthetic */ int b() {
        return f17864e;
    }

    public static final /* synthetic */ int c() {
        return d;
    }

    public static final /* synthetic */ int d() {
        return f17863c;
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

    public static int g(int r02) {
        return Integer.hashCode(r02);
    }

    public static String h(int r1) {
        if (f(r1, f17862b) == false) goto L7;
        return "Clamp";
    L7:
        if (f(r1, f17863c) == false) goto L11;
        return "Repeated";
    L11:
        if (f(r1, d) == false) goto L15;
        return "Mirror";
    L15:
        if (f(r1, f17864e) == false) goto L18;
        return "Decal";
    L18:
        return "Unknown";
    }
}
