package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20639b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final long f20640c = 0;
    public static final long d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f20641a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a() {
            return k.a();
        }

        public a() {
        }
    }

    static {
        f20639b = new a(null);
        f20640c = c(0);
        d = c(9205357640488583168L);
    }

    public /* synthetic */ k(long r1) {
        this.f20641a = r1;
    }

    public static final /* synthetic */ long a() {
        return f20640c;
    }

    public static final /* synthetic */ k b(long r1) {
        return new k(r1);
    }

    public static long c(long r02) {
        return r02;
    }

    public static boolean d(long r4, Object r6) {
        if ((r6 instanceof k) == true) goto L6;
        return false;
    L6:
        if (r4 == ((k) r6).j()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean e(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final float f(long r1) {
        return i.h(Float.intBitsToFloat((int) (r1 >> 32)));
    }

    public static final float g(long r2) {
        return i.h(Float.intBitsToFloat((int) (r2 & 4294967295L)));
    }

    public static int h(long r02) {
        return Long.hashCode(r02);
    }

    public static String i(long r2) {
        if (r2 != 9205357640488583168L) goto L5;
        return "DpOffset.Unspecified";
    L5:
        return '(' + i.l(f(r2)) + ", " + i.l(g(r2)) + ')';
    }

    public boolean equals(Object r3) {
        return d(this.f20641a, r3);
    }

    public int hashCode() {
        return h(this.f20641a);
    }

    public final /* synthetic */ long j() {
        return this.f20641a;
    }

    public String toString() {
        return i(this.f20641a);
    }
}
