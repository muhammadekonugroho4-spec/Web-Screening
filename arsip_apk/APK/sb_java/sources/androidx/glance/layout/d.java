package androidx.glance.layout;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25308b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f25309c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f25310e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f25311a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return d.a();
        }

        public final int b() {
            return d.b();
        }

        public final int c() {
            return d.c();
        }

        public a() {
        }
    }

    static {
        f25308b = new a(null);
        f25309c = e(0);
        d = e(1);
        f25310e = e(2);
    }

    public /* synthetic */ d(int r1) {
        this.f25311a = r1;
    }

    public static final /* synthetic */ int a() {
        return f25309c;
    }

    public static final /* synthetic */ int b() {
        return f25310e;
    }

    public static final /* synthetic */ int c() {
        return d;
    }

    public static final /* synthetic */ d d(int r1) {
        return new d(r1);
    }

    public static int e(int r02) {
        return r02;
    }

    public static boolean f(int r2, Object r3) {
        if ((r3 instanceof d) == true) goto L6;
        return false;
    L6:
        if (r2 == ((d) r3).j()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean g(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static int h(int r02) {
        return Integer.hashCode(r02);
    }

    public static String i(int r2) {
        return "ContentScale(value=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return f(this.f25311a, r2);
    }

    public int hashCode() {
        return h(this.f25311a);
    }

    public final /* synthetic */ int j() {
        return this.f25311a;
    }

    public String toString() {
        return i(this.f25311a);
    }
}
