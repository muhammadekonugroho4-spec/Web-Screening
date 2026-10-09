package androidx.compose.ui.node;

/* loaded from: classes.dex */
public abstract class p0 {
    public static final void a(int[] r8, C3641v r9) {
        int r02 = 0;
        int r1 = r8[0];
        int r3 = r8[1];
        if (c(r8) == false) goto L12;
        int r4 = Math.min(r8[2] - r8[0], r8[3] - r8[1]);
        if (r8[4] == 0) goto L7;
        int r6 = 1;
    L8:
        r1 = r1 + ((r6 | (d(r8) ? 1 : 0)) ^ 1);
        if (r8[4] == 0) goto L11;
        r02 = 1;
    L11:
        r3 = r3 + (((!d(r8) ? 1 : 0) | r02) ^ 1);
    L13:
        r9.g(r1, r3, r4);
        return;
    L7:
        r6 = 0;
        goto L8
    L12:
        r4 = r8[2] - r8[0];
        goto L13
    }

    public static int[] b(int[] r02) {
        return r02;
    }

    public static final boolean c(int[] r4) {
        if ((r4[3] - r4[1]) == (r4[2] - r4[0])) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean d(int[] r4) {
        if ((r4[3] - r4[1]) <= (r4[2] - r4[0])) goto L5;
        return true;
    L5:
        return false;
    }
}
