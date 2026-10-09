package androidx.compose.ui.geometry;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17050b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final long f17051c = 0;
    public static final long d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final long f17052e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f17053a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a() {
            return e.a();
        }

        public final long b() {
            return e.b();
        }

        public final long c() {
            return e.c();
        }

        public a() {
        }
    }

    static {
        f17050b = new a(null);
        f17051c = e(0);
        d = e(9187343241974906880L);
        f17052e = e(9205357640488583168L);
    }

    public /* synthetic */ e(long r1) {
        this.f17053a = r1;
    }

    public static final /* synthetic */ long a() {
        return d;
    }

    public static final /* synthetic */ long b() {
        return f17052e;
    }

    public static final /* synthetic */ long c() {
        return f17051c;
    }

    public static final /* synthetic */ e d(long r1) {
        return new e(r1);
    }

    public static long e(long r02) {
        return r02;
    }

    public static final long f(long r2, float r4, float r5) {
        return e((Float.floatToRawIntBits(r4) << 32) | (Float.floatToRawIntBits(r5) & 4294967295L));
    }

    public static /* synthetic */ long g(long r2, float r4, float r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r4 = Float.intBitsToFloat((int) (r2 >> 32));
    L6:
        if ((r6 & 2) == 0) goto L9;
        r5 = Float.intBitsToFloat((int) (4294967295L & r2));
    L9:
        return f(r2, r4, r5);
    }

    public static final long h(long r6, float r8) {
        float r1 = Float.intBitsToFloat((int) (r6 >> 32)) / r8;
        float r62 = Float.intBitsToFloat((int) (r6 & 4294967295L)) / r8;
        return e((Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r62) & 4294967295L));
    }

    public static boolean i(long r4, Object r6) {
        if ((r6 instanceof e) == true) goto L6;
        return false;
    L6:
        if (r4 == ((e) r6).t()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean j(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final float k(long r3) {
        float r02 = Float.intBitsToFloat((int) (r3 >> 32));
        float r32 = Float.intBitsToFloat((int) (r3 & 4294967295L));
        return (float) Math.sqrt((r02 * r02) + (r32 * r32));
    }

    public static final float l(long r3) {
        float r02 = Float.intBitsToFloat((int) (r3 >> 32));
        float r32 = Float.intBitsToFloat((int) (r3 & 4294967295L));
        return (r02 * r02) + (r32 * r32);
    }

    public static final float m(long r1) {
        return Float.intBitsToFloat((int) (r1 >> 32));
    }

    public static final float n(long r2) {
        return Float.intBitsToFloat((int) (r2 & 4294967295L));
    }

    public static int o(long r02) {
        return Long.hashCode(r02);
    }

    public static final long p(long r6, long r8) {
        float r1 = Float.intBitsToFloat((int) (r6 >> 32)) - Float.intBitsToFloat((int) (r8 >> 32));
        float r62 = Float.intBitsToFloat((int) (r6 & 4294967295L)) - Float.intBitsToFloat((int) (r8 & 4294967295L));
        return e((Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r62) & 4294967295L));
    }

    public static final long q(long r6, long r8) {
        float r1 = Float.intBitsToFloat((int) (r6 >> 32)) + Float.intBitsToFloat((int) (r8 >> 32));
        float r62 = Float.intBitsToFloat((int) (r6 & 4294967295L)) + Float.intBitsToFloat((int) (r8 & 4294967295L));
        return e((Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r62) & 4294967295L));
    }

    public static final long r(long r6, float r8) {
        float r1 = Float.intBitsToFloat((int) (r6 >> 32)) * r8;
        float r62 = Float.intBitsToFloat((int) (r6 & 4294967295L)) * r8;
        return e((Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r62) & 4294967295L));
    }

    public static String s(long r5) {
        if ((9223372034707292159L & r5) != 9205357640488583168L) goto L5;
        return "Offset.Unspecified";
    L5:
        return "Offset(" + b.a(Float.intBitsToFloat((int) (r5 >> 32)), 1) + ", " + b.a(Float.intBitsToFloat((int) (r5 & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object r3) {
        return i(this.f17053a, r3);
    }

    public int hashCode() {
        return o(this.f17053a);
    }

    public final /* synthetic */ long t() {
        return this.f17053a;
    }

    public String toString() {
        return s(this.f17053a);
    }
}
