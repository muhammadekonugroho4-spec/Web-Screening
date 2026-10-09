package androidx.compose.ui.node;

/* renamed from: androidx.compose.ui.node.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3634n {
    public static final int a(long r5, long r7) {
        boolean r02 = e(r5);
        if (r02 == e(r7)) goto L7;
        if (r02 == false) goto L6;
        return -1;
    L6:
        return 1;
    L7:
        int r03 = (int) Math.signum(c(r5) - c(r7));
        if (Math.min(c(r5), c(r7)) >= 0.0f) goto L11;
    L16:
        return r03;
    L11:
        if (d(r5) == d(r7)) goto L16;
        if (d(r5) == false) goto L15;
        return -1;
    L15:
        return 1;
    }

    public static long b(long r02) {
        return r02;
    }

    public static final float c(long r1) {
        return Float.intBitsToFloat((int) (r1 >> 32));
    }

    public static final boolean d(long r2) {
        if ((r2 & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean e(long r2) {
        if ((r2 & 1) == 0) goto L6;
        return true;
    L6:
        return false;
    }
}
