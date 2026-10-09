package kotlin.comparisons;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class c extends b {
    public static float i(float r3, float... r4) {
        p.l(r4, "other");
        int r02 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        r3 = Math.max(r3, r4[r1]);
        r1 = r1 + 1;
        goto L3
    L5:
        return r3;
    }

    public static int j(int r3, int... r4) {
        p.l(r4, "other");
        int r02 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        r3 = Math.max(r3, r4[r1]);
        r1 = r1 + 1;
        goto L3
    L5:
        return r3;
    }

    public static Comparable k(Comparable r1, Comparable r2) {
        p.l(r1, "a");
        p.l(r2, "b");
        if (r1.compareTo(r2) < 0) goto L5;
        return r1;
    L5:
        return r2;
    }

    public static float l(float r3, float... r4) {
        p.l(r4, "other");
        int r02 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        r3 = Math.min(r3, r4[r1]);
        r1 = r1 + 1;
        goto L3
    L5:
        return r3;
    }

    public static Comparable m(Comparable r1, Comparable r2) {
        p.l(r1, "a");
        p.l(r2, "b");
        if (r1.compareTo(r2) > 0) goto L5;
        return r1;
    L5:
        return r2;
    }
}
