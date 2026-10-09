package androidx.compose.ui.spatial;

import androidx.compose.ui.unit.o;

/* loaded from: classes.dex */
public abstract class c {
    public static final /* synthetic */ int a(float[] r02) {
        return c(r02);
    }

    public static final /* synthetic */ boolean b(long r02) {
        return d(r02);
    }

    public static final int c(float[] r6) {
        int r2 = 0;
        if (r6.length >= 16) goto L6;
        return 0;
    L6:
        if (r6[0] == 1.0f) goto L8;
    L24:
        int r02 = 0;
    L26:
        if (r6[12] != 0.0f) goto L35;
        if (r6[13] != 0.0f) goto L35;
        if (r6[14] != 0.0f) goto L35;
        if (r6[15] != 1.0f) goto L35;
        r2 = 1;
    L35:
        return (r02 << 1) | r2;
    L8:
        if (r6[1] != 0.0f) goto L24;
        if (r6[2] != 0.0f) goto L24;
        if (r6[4] != 0.0f) goto L24;
        if (r6[5] != 1.0f) goto L24;
        if (r6[6] != 0.0f) goto L24;
        if (r6[8] != 0.0f) goto L24;
        if (r6[9] != 0.0f) goto L24;
        if (r6[10] != 1.0f) goto L24;
        r02 = 1;
        goto L26
    }

    public static final boolean d(long r2) {
        return !o.j(r2, o.f20645b.a());
    }
}
