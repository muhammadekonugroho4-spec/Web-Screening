package androidx.compose.animation.core;

/* renamed from: androidx.compose.animation.core.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2382i0 {
    public static long a(int r02, int r1) {
        return b(r02 * r1);
    }

    public static long b(long r02) {
        return r02;
    }

    public static /* synthetic */ long c(int r02, int r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = AbstractC2384j0.f6824a.a();
    L6:
        return a(r02, r1);
    }

    public static final boolean d(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static int e(long r02) {
        return Long.hashCode(r02);
    }
}
