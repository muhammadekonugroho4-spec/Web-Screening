package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public abstract class G0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17086a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17087b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17088c = 0;
    public static final int d = 0;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return G0.a();
        }

        public final int b() {
            return G0.b();
        }

        public final int c() {
            return G0.c();
        }

        public a() {
        }
    }

    static {
        f17086a = new a(null);
        f17087b = d(0);
        f17088c = d(1);
        d = d(2);
    }

    public static final /* synthetic */ int a() {
        return f17087b;
    }

    public static final /* synthetic */ int b() {
        return d;
    }

    public static final /* synthetic */ int c() {
        return f17088c;
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

    public static String g(int r2) {
        return "CompositingStrategy(value=" + r2 + ')';
    }
}
