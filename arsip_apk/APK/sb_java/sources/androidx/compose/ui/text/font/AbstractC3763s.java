package androidx.compose.ui.text.font;

/* renamed from: androidx.compose.ui.text.font.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3763s {

    /* renamed from: a, reason: collision with root package name */
    public static final a f19929a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f19930b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19931c = 0;
    public static final int d = 0;

    /* renamed from: androidx.compose.ui.text.font.s$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return AbstractC3763s.a();
        }

        public final int b() {
            return AbstractC3763s.b();
        }

        public final int c() {
            return AbstractC3763s.c();
        }

        public a() {
        }
    }

    static {
        f19929a = new a(null);
        f19930b = d(0);
        f19931c = d(1);
        d = d(2);
    }

    public static final /* synthetic */ int a() {
        return d;
    }

    public static final /* synthetic */ int b() {
        return f19930b;
    }

    public static final /* synthetic */ int c() {
        return f19931c;
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
        if (e(r2, f19930b) == false) goto L7;
        return "Blocking";
    L7:
        if (e(r2, f19931c) == false) goto L11;
        return "Optional";
    L11:
        if (e(r2, d) == false) goto L15;
        return "Async";
    L15:
        return "Invalid(value=" + r2 + ')';
    }
}
