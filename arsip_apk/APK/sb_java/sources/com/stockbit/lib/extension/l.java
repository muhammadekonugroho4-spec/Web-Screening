package com.stockbit.lib.extension;

/* loaded from: classes10.dex */
public abstract class l {
    public static final boolean a(Integer r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (r1.intValue() != 1) goto L8;
        return true;
    L8:
        return false;
    }

    public static final String b(Integer r8, boolean r9, int r10, boolean r11, boolean r12) {
        String r82 = s.C(String.valueOf(r8), r9, r10, r11, 0, r12, 8, null);
        if (r82 != null) goto L6;
        return "0";
    L6:
        return r82;
    }

    public static /* synthetic */ String c(Integer r1, boolean r2, int r3, boolean r4, boolean r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = 2;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = false;
    L9:
        if ((r6 & 8) == 0) goto L12;
        r5 = false;
    L12:
        return b(r1, r2, r3, r4, r5);
    }

    public static final boolean d(Integer r02) {
        if (r02 != null) goto L4;
        return true;
    L4:
        if (r02.intValue() == 0) goto L10;
        return false;
    L10:
        return true;
    }

    public static final boolean e(Integer r02) {
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.intValue() != 0) goto L8;
        return true;
    L8:
        return false;
    }

    public static final int f(Integer r02) {
        if (r02 != null) goto L4;
        return 0;
    L4:
        return r02.intValue();
    }

    public static final String g(Integer r3) {
        return g.H(f(r3), null, 1, null);
    }
}
