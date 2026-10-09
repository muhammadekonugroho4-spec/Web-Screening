package com.stockbit.common.utils;

/* loaded from: classes7.dex */
public abstract class F {
    public static int a(int r2) {
        return b(r2, c(r2), false);
    }

    public static int b(int r1, int r2, boolean r3) {
        if (r2 <= 0) goto L4;
        int r02 = r1 % r2;
    L5:
        if (r3 == true) goto L7;
        if (r02 <= 0) goto L10;
        int r32 = r2 - r02;
    L12:
        return (r1 + (r2 - r32)) - r2;
    L10:
        r32 = r2;
        goto L12
    L7:
        return (r1 - r02) + r2;
    L4:
        r02 = 0;
        goto L5
    }

    public static int c(int r02) {
        if (r02 <= 0) goto L5;
        return 1;
    L5:
        return 0;
    }

    public static int d(int r02) {
        if (r02 < 0) goto L5;
        return 1;
    L5:
        return 0;
    }

    public static int e(int r2) {
        return b(r2, d(r2), true);
    }
}
