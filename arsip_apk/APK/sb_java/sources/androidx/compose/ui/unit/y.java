package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20664b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final long f20665c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f20666a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a() {
            return y.a();
        }

        public a() {
        }
    }

    static {
        f20664b = new a(null);
        f20665c = c(0);
    }

    public /* synthetic */ y(long r1) {
        this.f20666a = r1;
    }

    public static final /* synthetic */ long a() {
        return f20665c;
    }

    public static final /* synthetic */ y b(long r1) {
        return new y(r1);
    }

    public static long c(long r02) {
        return r02;
    }

    public static final long d(long r2, float r4, float r5) {
        return c((Float.floatToRawIntBits(r4) << 32) | (Float.floatToRawIntBits(r5) & 4294967295L));
    }

    public static /* synthetic */ long e(long r2, float r4, float r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r4 = Float.intBitsToFloat((int) (r2 >> 32));
    L6:
        if ((r6 & 2) == 0) goto L9;
        r5 = Float.intBitsToFloat((int) (4294967295L & r2));
    L9:
        return d(r2, r4, r5);
    }

    public static boolean f(long r4, Object r6) {
        if ((r6 instanceof y) == true) goto L6;
        return false;
    L6:
        if (r4 == ((y) r6).o()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean g(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final float h(long r1) {
        return Float.intBitsToFloat((int) (r1 >> 32));
    }

    public static final float i(long r2) {
        return Float.intBitsToFloat((int) (r2 & 4294967295L));
    }

    public static int j(long r02) {
        return Long.hashCode(r02);
    }

    public static final long k(long r6, long r8) {
        float r1 = Float.intBitsToFloat((int) (r6 >> 32)) - Float.intBitsToFloat((int) (r8 >> 32));
        float r62 = Float.intBitsToFloat((int) (r6 & 4294967295L)) - Float.intBitsToFloat((int) (r8 & 4294967295L));
        return c((Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r62) & 4294967295L));
    }

    public static final long l(long r6, long r8) {
        float r1 = Float.intBitsToFloat((int) (r6 >> 32)) + Float.intBitsToFloat((int) (r8 >> 32));
        float r62 = Float.intBitsToFloat((int) (r6 & 4294967295L)) + Float.intBitsToFloat((int) (r8 & 4294967295L));
        return c((Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r62) & 4294967295L));
    }

    public static final long m(long r6, float r8) {
        float r1 = Float.intBitsToFloat((int) (r6 >> 32)) * r8;
        float r62 = Float.intBitsToFloat((int) (r6 & 4294967295L)) * r8;
        return c((Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r62) & 4294967295L));
    }

    public static String n(long r2) {
        return '(' + h(r2) + ", " + i(r2) + ") px/sec";
    }

    public boolean equals(Object r3) {
        return f(this.f20666a, r3);
    }

    public int hashCode() {
        return j(this.f20666a);
    }

    public final /* synthetic */ long o() {
        return this.f20666a;
    }

    public String toString() {
        return n(this.f20666a);
    }
}
