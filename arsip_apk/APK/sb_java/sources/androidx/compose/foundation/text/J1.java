package androidx.compose.foundation.text;

/* loaded from: classes.dex */
public final class J1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f9448b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9449c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f9450a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return J1.a();
        }

        public a() {
        }
    }

    static {
        f9448b = new a(null);
        f9449c = c(0);
    }

    public /* synthetic */ J1(int r1) {
        this.f9450a = r1;
    }

    public static final /* synthetic */ int a() {
        return f9449c;
    }

    public static final /* synthetic */ J1 b(int r1) {
        return new J1(r1);
    }

    public static int c(int r02) {
        return r02;
    }

    public static int d(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5) {
        int r02 = 0;
        if (r2 == false) goto L5;
        int r22 = 2;
    L6:
        int r12 = (r1 ? 1 : 0) | r22;
        if (r3 == false) goto L9;
        int r23 = 4;
    L10:
        int r13 = r12 | r23;
        if (r4 == false) goto L13;
        int r24 = 8;
    L14:
        int r14 = r13 | r24;
        if (r5 == false) goto L18;
        r02 = 16;
    L18:
        return c(r14 | r02);
    L13:
        r24 = 0;
        goto L14
    L9:
        r23 = 0;
        goto L10
    L5:
        r22 = 0;
        goto L6
    }

    public static boolean e(int r2, Object r3) {
        if ((r3 instanceof J1) == true) goto L6;
        return false;
    L6:
        if (r2 == ((J1) r3).m()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean f(int r1) {
        if ((r1 & 16) != 16) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean g(int r1) {
        if ((r1 & 1) != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean h(int r1) {
        if ((r1 & 4) != 4) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean i(int r1) {
        if ((r1 & 2) != 2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean j(int r1) {
        if ((r1 & 8) != 8) goto L6;
        return true;
    L6:
        return false;
    }

    public static int k(int r02) {
        return Integer.hashCode(r02);
    }

    public static String l(int r2) {
        return "MenuItemsAvailability(value=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return e(this.f9450a, r2);
    }

    public int hashCode() {
        return k(this.f9450a);
    }

    public final /* synthetic */ int m() {
        return this.f9450a;
    }

    public String toString() {
        return l(this.f9450a);
    }
}
