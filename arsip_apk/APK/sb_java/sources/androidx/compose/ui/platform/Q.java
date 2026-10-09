package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19211b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19212c = 0;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f19213a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return Q.a();
        }

        public final int b() {
            return a();
        }

        public a() {
        }
    }

    static {
        f19211b = new a(null);
        f19212c = c(0);
        d = c(1);
    }

    public /* synthetic */ Q(int r1) {
        this.f19213a = r1;
    }

    public static final /* synthetic */ int a() {
        return d;
    }

    public static final /* synthetic */ Q b(int r1) {
        return new Q(r1);
    }

    public static int c(int r02) {
        return r02;
    }

    public static boolean d(int r2, Object r3) {
        if ((r3 instanceof Q) == true) goto L6;
        return false;
    L6:
        if (r2 == ((Q) r3).g()) goto L8;
        return false;
    L8:
        return true;
    }

    public static int e(int r02) {
        return Integer.hashCode(r02);
    }

    public static String f(int r2) {
        return "AutoClearFocusBehavior(value=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return d(this.f19213a, r2);
    }

    public final /* synthetic */ int g() {
        return this.f19213a;
    }

    public int hashCode() {
        return e(this.f19213a);
    }

    public String toString() {
        return f(this.f19213a);
    }
}
