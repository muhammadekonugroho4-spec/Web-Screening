package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20642b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final long f20643c = 0;
    public static final long d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f20644a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a() {
            return l.a();
        }

        public final long b() {
            return l.b();
        }

        public a() {
        }
    }

    static {
        f20642b = new a(null);
        f20643c = d(0);
        d = d(9205357640488583168L);
    }

    public /* synthetic */ l(long r1) {
        this.f20644a = r1;
    }

    public static final /* synthetic */ long a() {
        return d;
    }

    public static final /* synthetic */ long b() {
        return f20643c;
    }

    public static final /* synthetic */ l c(long r1) {
        return new l(r1);
    }

    public static long d(long r02) {
        return r02;
    }

    public static boolean e(long r4, Object r6) {
        if ((r6 instanceof l) == true) goto L6;
        return false;
    L6:
        if (r4 == ((l) r6).k()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean f(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final float g(long r2) {
        return i.h(Float.intBitsToFloat((int) (r2 & 4294967295L)));
    }

    public static final float h(long r1) {
        return i.h(Float.intBitsToFloat((int) (r1 >> 32)));
    }

    public static int i(long r02) {
        return Long.hashCode(r02);
    }

    public static String j(long r2) {
        if (r2 != 9205357640488583168L) goto L5;
        return "DpSize.Unspecified";
    L5:
        return i.l(h(r2)) + " x " + i.l(g(r2));
    }

    public boolean equals(Object r3) {
        return e(this.f20644a, r3);
    }

    public int hashCode() {
        return i(this.f20644a);
    }

    public final /* synthetic */ long k() {
        return this.f20644a;
    }

    public String toString() {
        return j(this.f20644a);
    }
}
