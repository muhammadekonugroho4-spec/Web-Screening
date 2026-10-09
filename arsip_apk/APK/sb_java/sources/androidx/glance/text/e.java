package androidx.glance.text;

import kotlin.jvm.internal.i;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25439b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f25440c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f25441e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f25442f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f25443g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f25444a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final int a() {
            return e.a();
        }

        public final int b() {
            return e.b();
        }

        public final int c() {
            return e.c();
        }

        public final int d() {
            return e.d();
        }

        public final int e() {
            return e.e();
        }

        public a() {
        }
    }

    static {
        f25439b = new a(null);
        f25440c = g(1);
        d = g(2);
        f25441e = g(3);
        f25442f = g(4);
        f25443g = g(5);
    }

    public /* synthetic */ e(int r1) {
        this.f25444a = r1;
    }

    public static final /* synthetic */ int a() {
        return f25441e;
    }

    public static final /* synthetic */ int b() {
        return f25443g;
    }

    public static final /* synthetic */ int c() {
        return f25440c;
    }

    public static final /* synthetic */ int d() {
        return d;
    }

    public static final /* synthetic */ int e() {
        return f25442f;
    }

    public static final /* synthetic */ e f(int r1) {
        return new e(r1);
    }

    public static int g(int r02) {
        return r02;
    }

    public static boolean h(int r2, Object r3) {
        if ((r3 instanceof e) == true) goto L6;
        return false;
    L6:
        if (r2 == ((e) r3).l()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean i(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static int j(int r02) {
        return Integer.hashCode(r02);
    }

    public static String k(int r1) {
        if (i(r1, f25440c) == false) goto L7;
        return "Left";
    L7:
        if (i(r1, d) == false) goto L11;
        return "Right";
    L11:
        if (i(r1, f25441e) == false) goto L15;
        return "Center";
    L15:
        if (i(r1, f25442f) == false) goto L19;
        return "Start";
    L19:
        if (i(r1, f25443g) == false) goto L22;
        return "End";
    L22:
        return "Invalid";
    }

    public boolean equals(Object r2) {
        return h(this.f25444a, r2);
    }

    public int hashCode() {
        return j(this.f25444a);
    }

    public final /* synthetic */ int l() {
        return this.f25444a;
    }

    public String toString() {
        return k(this.f25444a);
    }
}
