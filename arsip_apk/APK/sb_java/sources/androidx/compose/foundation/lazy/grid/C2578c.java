package androidx.compose.foundation.lazy.grid;

/* renamed from: androidx.compose.foundation.lazy.grid.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2578c {

    /* renamed from: a, reason: collision with root package name */
    public final long f8509a;

    public /* synthetic */ C2578c(long r1) {
        this.f8509a = r1;
    }

    public static final /* synthetic */ C2578c a(long r1) {
        return new C2578c(r1);
    }

    public static long b(long r02) {
        return r02;
    }

    public static boolean c(long r4, Object r6) {
        if ((r6 instanceof C2578c) == true) goto L6;
        return false;
    L6:
        if (r4 == ((C2578c) r6).g()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final int d(long r02) {
        return (int) r02;
    }

    public static int e(long r02) {
        return Long.hashCode(r02);
    }

    public static String f(long r2) {
        return "GridItemSpan(packedValue=" + r2 + ')';
    }

    public boolean equals(Object r3) {
        return c(this.f8509a, r3);
    }

    public final /* synthetic */ long g() {
        return this.f8509a;
    }

    public int hashCode() {
        return e(this.f8509a);
    }

    public String toString() {
        return f(this.f8509a);
    }
}
