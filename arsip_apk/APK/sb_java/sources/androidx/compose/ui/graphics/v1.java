package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17640a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17641b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17642c = 0;
    public static final int d = 0;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return v1.a();
        }

        public final int b() {
            return v1.b();
        }

        public final int c() {
            return v1.c();
        }

        public a() {
        }
    }

    static {
        f17640a = new a(null);
        f17641b = d(0);
        f17642c = d(1);
        d = d(2);
    }

    public static final /* synthetic */ int a() {
        return d;
    }

    public static final /* synthetic */ int b() {
        return f17641b;
    }

    public static final /* synthetic */ int c() {
        return f17642c;
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

    public static int f(int r02) {
        return Integer.hashCode(r02);
    }

    public static String g(int r1) {
        if (e(r1, f17641b) == false) goto L7;
        return "Miter";
    L7:
        if (e(r1, f17642c) == false) goto L11;
        return "Round";
    L11:
        if (e(r1, d) == false) goto L14;
        return "Bevel";
    L14:
        return "Unknown";
    }
}
