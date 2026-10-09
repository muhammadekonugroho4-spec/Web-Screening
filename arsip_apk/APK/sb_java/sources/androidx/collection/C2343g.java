package androidx.collection;

/* renamed from: androidx.collection.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2343g {

    /* renamed from: a, reason: collision with root package name */
    public final long f6435a;

    public /* synthetic */ C2343g(long r1) {
        this.f6435a = r1;
    }

    public static final /* synthetic */ C2343g a(long r1) {
        return new C2343g(r1);
    }

    public static long b(float r4, float r5) {
        long r02 = Float.floatToRawIntBits(r4);
        return c((Float.floatToRawIntBits(r5) & 4294967295L) | (r02 << 32));
    }

    public static long c(long r02) {
        return r02;
    }

    public static boolean d(long r4, Object r6) {
        if ((r6 instanceof C2343g) == true) goto L6;
        return false;
    L6:
        if (r4 == ((C2343g) r6).g()) goto L8;
        return false;
    L8:
        return true;
    }

    public static int e(long r02) {
        return Long.hashCode(r02);
    }

    public static String f(long r3) {
        return '(' + Float.intBitsToFloat((int) (r3 >> 32)) + ", " + Float.intBitsToFloat((int) (r3 & 4294967295L)) + ')';
    }

    public boolean equals(Object r3) {
        return d(this.f6435a, r3);
    }

    public final /* synthetic */ long g() {
        return this.f6435a;
    }

    public int hashCode() {
        return e(this.f6435a);
    }

    public String toString() {
        return f(this.f6435a);
    }
}
