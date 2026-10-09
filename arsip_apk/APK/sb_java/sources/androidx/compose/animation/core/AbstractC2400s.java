package androidx.compose.animation.core;

/* renamed from: androidx.compose.animation.core.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2400s {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6889a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6890b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6891c = 0;
    public static final int d = 0;

    /* renamed from: androidx.compose.animation.core.s$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return AbstractC2400s.a();
        }

        public a() {
        }
    }

    static {
        f6889a = new a(null);
        f6890b = b(5);
        f6891c = b(4);
        d = b(0);
    }

    public static final /* synthetic */ int a() {
        return d;
    }

    public static int b(int r02) {
        return r02;
    }

    public static final boolean c(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static int d(int r02) {
        return Integer.hashCode(r02);
    }

    public static String e(int r2) {
        return "ArcMode(value=" + r2 + ')';
    }
}
