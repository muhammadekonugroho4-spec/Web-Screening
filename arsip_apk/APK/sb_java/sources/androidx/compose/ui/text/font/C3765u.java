package androidx.compose.ui.text.font;

/* renamed from: androidx.compose.ui.text.font.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3765u {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19932b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19933c = 0;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f19934a;

    /* renamed from: androidx.compose.ui.text.font.u$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return C3765u.a();
        }

        public final int b() {
            return C3765u.b();
        }

        public a() {
        }
    }

    static {
        f19932b = new a(null);
        f19933c = d(0);
        d = d(1);
    }

    public /* synthetic */ C3765u(int r1) {
        this.f19934a = r1;
    }

    public static final /* synthetic */ int a() {
        return d;
    }

    public static final /* synthetic */ int b() {
        return f19933c;
    }

    public static final /* synthetic */ C3765u c(int r1) {
        return new C3765u(r1);
    }

    public static int d(int r02) {
        return r02;
    }

    public static boolean e(int r2, Object r3) {
        if ((r3 instanceof C3765u) == true) goto L6;
        return false;
    L6:
        if (r2 == ((C3765u) r3).i()) goto L8;
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

    public static String h(int r1) {
        if (f(r1, f19933c) == false) goto L7;
        return "Normal";
    L7:
        if (f(r1, d) == false) goto L10;
        return "Italic";
    L10:
        return "Invalid";
    }

    public boolean equals(Object r2) {
        return e(this.f19934a, r2);
    }

    public int hashCode() {
        return g(this.f19934a);
    }

    public final /* synthetic */ int i() {
        return this.f19934a;
    }

    public String toString() {
        return h(this.f19934a);
    }
}
