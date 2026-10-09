package androidx.compose.foundation.text.input;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final a f10566b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10567c = 0;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f10568a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return n.a();
        }

        public final int b() {
            return n.b();
        }

        public a() {
        }
    }

    static {
        f10566b = new a(null);
        f10567c = d(0);
        d = d(1);
    }

    public /* synthetic */ n(int r1) {
        this.f10568a = r1;
    }

    public static final /* synthetic */ int a() {
        return d;
    }

    public static final /* synthetic */ int b() {
        return f10567c;
    }

    public static final /* synthetic */ n c(int r1) {
        return new n(r1);
    }

    public static int d(int r02) {
        return r02;
    }

    public static boolean e(int r2, Object r3) {
        if ((r3 instanceof n) == true) goto L6;
        return false;
    L6:
        if (r2 == ((n) r3).i()) goto L8;
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

    public static String h(int r2) {
        return "TextHighlightType(value=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return e(this.f10568a, r2);
    }

    public int hashCode() {
        return g(this.f10568a);
    }

    public final /* synthetic */ int i() {
        return this.f10568a;
    }

    public String toString() {
        return h(this.f10568a);
    }
}
