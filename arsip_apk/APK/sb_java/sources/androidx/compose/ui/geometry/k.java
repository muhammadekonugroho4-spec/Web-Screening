package androidx.compose.ui.geometry;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17068b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final long f17069c = 0;
    public static final long d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f17070a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a() {
            return k.a();
        }

        public final long b() {
            return k.b();
        }

        public a() {
        }
    }

    static {
        f17068b = new a(null);
        f17069c = d(0);
        d = d(9205357640488583168L);
    }

    public /* synthetic */ k(long r1) {
        this.f17070a = r1;
    }

    public static final /* synthetic */ long a() {
        return d;
    }

    public static final /* synthetic */ long b() {
        return f17069c;
    }

    public static final /* synthetic */ k c(long r1) {
        return new k(r1);
    }

    public static long d(long r02) {
        return r02;
    }

    public static boolean e(long r4, Object r6) {
        if ((r6 instanceof k) == true) goto L6;
        return false;
    L6:
        if (r4 == ((k) r6).n()) goto L8;
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
        return Float.intBitsToFloat((int) (r2 & 4294967295L));
    }

    public static final float h(long r4) {
        return Math.max(Float.intBitsToFloat((int) ((r4 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (r4 & 2147483647L)));
    }

    public static final float i(long r4) {
        return Math.min(Float.intBitsToFloat((int) ((r4 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (r4 & 2147483647L)));
    }

    public static final float j(long r1) {
        return Float.intBitsToFloat((int) (r1 >> 32));
    }

    public static int k(long r02) {
        return Long.hashCode(r02);
    }

    public static final boolean l(long r7) {
        boolean r1 = false;
        if (r7 != 9205357640488583168L) goto L5;
        boolean r02 = true;
    L7:
        if (Float.intBitsToFloat((int) (r7 >> 32)) > 0.0f) goto L9;
        boolean r3 = true;
    L10:
        boolean r03 = r02 | r3;
        if (Float.intBitsToFloat((int) (r7 & 4294967295L)) > 0.0f) goto L14;
        r1 = true;
    L14:
        return r03 | r1;
    L9:
        r3 = false;
        goto L10
    L5:
        r02 = false;
        goto L7
    }

    public static String m(long r5) {
        if (r5 != 9205357640488583168L) goto L5;
        return "Size.Unspecified";
    L5:
        return "Size(" + b.a(Float.intBitsToFloat((int) (r5 >> 32)), 1) + ", " + b.a(Float.intBitsToFloat((int) (r5 & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object r3) {
        return e(this.f17070a, r3);
    }

    public int hashCode() {
        return k(this.f17070a);
    }

    public final /* synthetic */ long n() {
        return this.f17070a;
    }

    public String toString() {
        return m(this.f17070a);
    }
}
