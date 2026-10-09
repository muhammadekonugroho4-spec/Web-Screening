package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17623a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17624b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17625c = 0;
    public static final int d = 0;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return u1.a();
        }

        public final int b() {
            return u1.b();
        }

        public final int c() {
            return u1.c();
        }

        public a() {
        }
    }

    static {
        f17623a = new a(null);
        f17624b = d(0);
        f17625c = d(1);
        d = d(2);
    }

    public static final /* synthetic */ int a() {
        return f17624b;
    }

    public static final /* synthetic */ int b() {
        return f17625c;
    }

    public static final /* synthetic */ int c() {
        return d;
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
        if (e(r1, f17624b) == false) goto L7;
        return "Butt";
    L7:
        if (e(r1, f17625c) == false) goto L11;
        return "Round";
    L11:
        if (e(r1, d) == false) goto L14;
        return "Square";
    L14:
        return "Unknown";
    }
}
