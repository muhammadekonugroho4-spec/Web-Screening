package androidx.collection;

/* renamed from: androidx.collection.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2350n {

    /* renamed from: a, reason: collision with root package name */
    public final long f6466a;

    public /* synthetic */ C2350n(long r1) {
        this.f6466a = r1;
    }

    public static final /* synthetic */ C2350n a(long r1) {
        return new C2350n(r1);
    }

    public static long b(int r4, int r5) {
        return c((r5 & 4294967295L) | (r4 << 32));
    }

    public static long c(long r02) {
        return r02;
    }

    public static boolean d(long r4, Object r6) {
        if ((r6 instanceof C2350n) == true) goto L6;
        return false;
    L6:
        if (r4 == ((C2350n) r6).i()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final int e(long r1) {
        return (int) (r1 >> 32);
    }

    public static final int f(long r2) {
        return (int) (r2 & 4294967295L);
    }

    public static int g(long r02) {
        return Long.hashCode(r02);
    }

    public static String h(long r2) {
        return '(' + e(r2) + ", " + f(r2) + ')';
    }

    public boolean equals(Object r3) {
        return d(this.f6466a, r3);
    }

    public int hashCode() {
        return g(this.f6466a);
    }

    public final /* synthetic */ long i() {
        return this.f6466a;
    }

    public String toString() {
        return h(this.f6466a);
    }
}
