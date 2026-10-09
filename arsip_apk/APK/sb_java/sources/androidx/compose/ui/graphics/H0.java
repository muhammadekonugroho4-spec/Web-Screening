package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public abstract class H0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17089a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17090b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17091c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f17092e = 0;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return H0.a();
        }

        public final int b() {
            return H0.b();
        }

        public a() {
        }
    }

    static {
        f17089a = new a(null);
        f17090b = c(0);
        f17091c = c(1);
        d = c(2);
        f17092e = c(3);
    }

    public static final /* synthetic */ int a() {
        return f17091c;
    }

    public static final /* synthetic */ int b() {
        return f17090b;
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

    public static int e(int r02) {
        return Integer.hashCode(r02);
    }

    public static String f(int r1) {
        if (d(r1, f17090b) == false) goto L7;
        return "None";
    L7:
        if (d(r1, f17091c) == false) goto L11;
        return "Low";
    L11:
        if (d(r1, d) == false) goto L15;
        return "Medium";
    L15:
        if (d(r1, f17092e) == false) goto L18;
        return "High";
    L18:
        return "Unknown";
    }
}
