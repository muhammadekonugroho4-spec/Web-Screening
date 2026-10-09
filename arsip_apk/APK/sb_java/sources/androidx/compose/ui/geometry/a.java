package androidx.compose.ui.geometry;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0118a f17045a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final long f17046b = 0;

    /* renamed from: androidx.compose.ui.geometry.a$a, reason: collision with other inner class name */
    public static final class C0118a {
        public /* synthetic */ C0118a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a() {
            return a.a();
        }

        public C0118a() {
        }
    }

    static {
        f17045a = new C0118a(null);
        f17046b = b(0);
    }

    public static final /* synthetic */ long a() {
        return f17046b;
    }

    public static long b(long r02) {
        return r02;
    }

    public static final boolean c(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static int d(long r02) {
        return Long.hashCode(r02);
    }

    public static String e(long r4) {
        int r02 = (int) (r4 >> 32);
        int r42 = (int) (r4 & 4294967295L);
        if (Float.intBitsToFloat(r02) != Float.intBitsToFloat(r42)) goto L7;
        return "CornerRadius.circular(" + b.a(Float.intBitsToFloat(r02), 1) + ')';
    L7:
        return "CornerRadius.elliptical(" + b.a(Float.intBitsToFloat(r02), 1) + ", " + b.a(Float.intBitsToFloat(r42), 1) + ')';
    }
}
