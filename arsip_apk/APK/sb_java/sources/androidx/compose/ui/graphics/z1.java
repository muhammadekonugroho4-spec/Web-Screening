package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17867b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final long f17868c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f17869a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a() {
            return z1.a();
        }

        public a() {
        }
    }

    static {
        f17867b = new a(null);
        f17868c = A1.a(0.5f, 0.5f);
    }

    public /* synthetic */ z1(long r1) {
        this.f17869a = r1;
    }

    public static final /* synthetic */ long a() {
        return f17868c;
    }

    public static final /* synthetic */ z1 b(long r1) {
        return new z1(r1);
    }

    public static long c(long r02) {
        return r02;
    }

    public static boolean d(long r4, Object r6) {
        if ((r6 instanceof z1) == true) goto L6;
        return false;
    L6:
        if (r4 == ((z1) r6).j()) goto L8;
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
        return Float.intBitsToFloat((int) (r1 >> 32));
    }

    public static final float g(long r2) {
        return Float.intBitsToFloat((int) (r2 & 4294967295L));
    }

    public static int h(long r02) {
        return Long.hashCode(r02);
    }

    public static String i(long r2) {
        return "TransformOrigin(packedValue=" + r2 + ')';
    }

    public boolean equals(Object r3) {
        return d(this.f17869a, r3);
    }

    public int hashCode() {
        return h(this.f17869a);
    }

    public final /* synthetic */ long j() {
        return this.f17869a;
    }

    public String toString() {
        return i(this.f17869a);
    }
}
