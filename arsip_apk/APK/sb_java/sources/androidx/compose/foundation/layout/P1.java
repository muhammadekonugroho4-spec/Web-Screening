package androidx.compose.foundation.layout;

/* loaded from: classes.dex */
public abstract class P1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7940a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7941b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7942c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7943e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7944f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7945g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7946h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f7947i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f7948j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f7949k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f7950l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f7951m = 0;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return P1.a();
        }

        public final int b() {
            return P1.b();
        }

        public final int c() {
            return P1.c();
        }

        public final int d() {
            return P1.d();
        }

        public final int e() {
            return P1.e();
        }

        public final int f() {
            return P1.f();
        }

        public final int g() {
            return P1.g();
        }

        public a() {
        }
    }

    static {
        f7940a = new a(null);
        int r02 = h(8);
        f7941b = r02;
        int r1 = h(4);
        f7942c = r1;
        int r2 = h(2);
        d = r2;
        int r3 = h(1);
        f7943e = r3;
        f7944f = l(r02, r3);
        f7945g = l(r1, r2);
        int r4 = h(16);
        f7946h = r4;
        int r5 = h(32);
        f7947i = r5;
        int r03 = l(r02, r2);
        f7948j = r03;
        int r12 = l(r1, r3);
        f7949k = r12;
        f7950l = l(r03, r12);
        f7951m = l(r4, r5);
    }

    public static final /* synthetic */ int a() {
        return f7941b;
    }

    public static final /* synthetic */ int b() {
        return d;
    }

    public static final /* synthetic */ int c() {
        return f7942c;
    }

    public static final /* synthetic */ int d() {
        return f7943e;
    }

    public static final /* synthetic */ int e() {
        return f7947i;
    }

    public static final /* synthetic */ int f() {
        return f7950l;
    }

    public static final /* synthetic */ int g() {
        return f7946h;
    }

    public static int h(int r02) {
        return r02;
    }

    public static final boolean i(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean j(int r02, int r1) {
        if ((r02 & r1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static int k(int r02) {
        return Integer.hashCode(r02);
    }

    public static final int l(int r02, int r1) {
        return h(r02 | r1);
    }

    public static String m(int r2) {
        return "WindowInsetsSides(" + n(r2) + ')';
    }

    public static final String n(int r3) {
        StringBuilder r02 = new StringBuilder();
        int r1 = f7944f;
        if ((r3 & r1) != r1) goto L5;
        o(r02, "Start");
    L5:
        int r12 = f7948j;
        if ((r3 & r12) != r12) goto L8;
        o(r02, "Left");
    L8:
        int r13 = f7946h;
        if ((r3 & r13) != r13) goto L11;
        o(r02, "Top");
    L11:
        int r14 = f7945g;
        if ((r3 & r14) != r14) goto L14;
        o(r02, "End");
    L14:
        int r15 = f7949k;
        if ((r3 & r15) != r15) goto L17;
        o(r02, "Right");
    L17:
        int r16 = f7947i;
        if ((r3 & r16) != r16) goto L20;
        o(r02, "Bottom");
    L20:
        String r32 = r02.toString();
        kotlin.jvm.internal.p.k(r32, "toString(...)");
        return r32;
    }

    public static final void o(StringBuilder r1, String r2) {
        if (r1.length() <= 0) goto L5;
        r1.append('+');
    L5:
        r1.append(r2);
    }
}
