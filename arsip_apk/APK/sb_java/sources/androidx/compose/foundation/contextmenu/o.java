package androidx.compose.foundation.contextmenu;

/* loaded from: classes.dex */
public abstract class o {
    public static final int a(int r02, int r1, boolean r2) {
        return f(r02, r1, !r2);
    }

    public static final int b(int r1, int r2, int r3, boolean r4) {
        if (r2 < r3) goto L6;
        return f(r2, r3, r4);
    L6:
        if (g(r1, r2, r3, r4) == false) goto L10;
        return e(r1, r2, r4);
    L10:
        if (h(r1, r2, r3, r4) == false) goto L14;
        return d(r1, r2, r4);
    L14:
        return a(r2, r3, r4);
    }

    public static /* synthetic */ int c(int r02, int r1, int r2, boolean r3, int r4, Object r5) {
        if ((r4 & 8) == 0) goto L6;
        r3 = true;
    L6:
        return b(r02, r1, r2, r3);
    }

    public static final int d(int r02, int r1, boolean r2) {
        return e(r02, r1, !r2);
    }

    public static final int e(int r02, int r1, boolean r2) {
        if (r2 == false) goto L5;
        return r02;
    L5:
        return r02 - r1;
    }

    public static final int f(int r02, int r1, boolean r2) {
        if (r2 == false) goto L6;
        return 0;
    L6:
        return r1 - r02;
    }

    public static final boolean g(int r02, int r1, int r2, boolean r3) {
        return h(r02, r1, r2, !r3);
    }

    public static final boolean h(int r2, int r3, int r4, boolean r5) {
        if (r5 == false) goto L8;
        if (r3 > r2) goto L6;
        return true;
    L6:
        return false;
    L8:
        if ((r4 - r3) <= r2) goto L10;
        return true;
    L10:
        return false;
    }
}
