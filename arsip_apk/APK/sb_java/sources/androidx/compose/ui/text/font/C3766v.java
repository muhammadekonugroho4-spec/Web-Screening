package androidx.compose.ui.text.font;

/* renamed from: androidx.compose.ui.text.font.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3766v {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19935b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19936c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19937e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f19938f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f19939a;

    /* renamed from: androidx.compose.ui.text.font.v$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return C3766v.a();
        }

        public final int b() {
            return C3766v.b();
        }

        public final int c() {
            return C3766v.c();
        }

        public final int d() {
            return C3766v.d();
        }

        public a() {
        }
    }

    static {
        f19935b = new a(null);
        f19936c = f(0);
        d = f(1);
        f19937e = f(2);
        f19938f = f(65535);
    }

    public /* synthetic */ C3766v(int r1) {
        this.f19939a = r1;
    }

    public static final /* synthetic */ int a() {
        return f19938f;
    }

    public static final /* synthetic */ int b() {
        return f19936c;
    }

    public static final /* synthetic */ int c() {
        return f19937e;
    }

    public static final /* synthetic */ int d() {
        return d;
    }

    public static final /* synthetic */ C3766v e(int r1) {
        return new C3766v(r1);
    }

    public static int f(int r02) {
        return r02;
    }

    public static boolean g(int r2, Object r3) {
        if ((r3 instanceof C3766v) == true) goto L6;
        return false;
    L6:
        if (r2 == ((C3766v) r3).m()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean h(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static int i(int r02) {
        return Integer.hashCode(r02);
    }

    public static final boolean j(int r02) {
        if ((r02 & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean k(int r1) {
        if ((r1 & 1) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static String l(int r1) {
        if (h(r1, f19936c) == false) goto L7;
        return "None";
    L7:
        if (h(r1, d) == false) goto L11;
        return "Weight";
    L11:
        if (h(r1, f19937e) == false) goto L15;
        return "Style";
    L15:
        if (h(r1, f19938f) == false) goto L18;
        return "All";
    L18:
        return "Invalid";
    }

    public boolean equals(Object r2) {
        return g(this.f19939a, r2);
    }

    public int hashCode() {
        return i(this.f19939a);
    }

    public final /* synthetic */ int m() {
        return this.f19939a;
    }

    public String toString() {
        return l(this.f19939a);
    }
}
