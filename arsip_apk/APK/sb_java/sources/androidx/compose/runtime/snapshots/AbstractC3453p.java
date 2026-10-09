package androidx.compose.runtime.snapshots;

import kotlin.collections.AbstractC11772p;

/* renamed from: androidx.compose.runtime.snapshots.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3453p {
    public static final int a(long[] r5, long r6) {
        int r02 = r5.length - 1;
        int r1 = 0;
    L3:
        if (r1 > r02) goto L11;
        int r2 = (r1 + r02) >>> 1;
        long r3 = r5[r2];
        if (r6 > r3) goto L6;
        if (r6 >= r3) goto L9;
        r02 = r2 - 1;
        goto L3
    L9:
        return r2;
    L6:
        r1 = r2 + 1;
        goto L3
    L11:
        return -(r1 + 1);
    }

    public static final long[] b(int r02) {
        return new long[r02];
    }

    public static final long c(int r2) {
        return r2;
    }

    public static final long[] d(long[] r3, int r4, long r5) {
        int r02 = r3.length;
        long[] r1 = new long[r02 + 1];
        AbstractC11772p.n(r3, r1, 0, 0, r4);
        AbstractC11772p.n(r3, r1, r4 + 1, r4, r02);
        r1[r4] = r5;
        return r1;
    }

    public static final long[] e(long[] r4, int r5) {
        int r02 = r4.length;
        int r1 = r02 - 1;
        if (r1 != 0) goto L6;
        return null;
    L6:
        long[] r2 = new long[r1];
        if (r5 <= 0) goto L9;
        AbstractC11772p.n(r4, r2, 0, 0, r5);
    L9:
        if (r5 >= r1) goto L11;
        AbstractC11772p.n(r4, r2, r5, r5 + 1, r02);
    L11:
        return r2;
    }
}
