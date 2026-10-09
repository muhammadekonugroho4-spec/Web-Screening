package com.stockbit.lib.extension;

/* loaded from: classes10.dex */
public abstract class h {
    public static final boolean a(int r2) {
        if (127232 > r2) goto L8;
        if (r2 >= 127488) goto L8;
        return true;
    L8:
        if (127744 > r2) goto L11;
        if (r2 >= 128512) goto L11;
        return true;
    L11:
        if (128512 > r2) goto L16;
        if (r2 >= 128592) goto L16;
        return true;
    L16:
        if (128640 > r2) goto L20;
        if (r2 >= 128768) goto L20;
        return true;
    L20:
        if (128768 > r2) goto L24;
        if (r2 >= 128896) goto L24;
        return true;
    L24:
        if (128896 > r2) goto L28;
        if (r2 >= 129024) goto L28;
        return true;
    L28:
        if (129024 > r2) goto L32;
        if (r2 >= 129280) goto L32;
        return true;
    L32:
        if (129280 > r2) goto L35;
        if (r2 >= 129536) goto L35;
        return true;
    L35:
        if (129536 > r2) goto L40;
        if (r2 >= 129792) goto L40;
        return true;
    L40:
        if (9728 > r2) goto L43;
        if (r2 >= 9984) goto L43;
        return true;
    L43:
        if (9984 > r2) goto L48;
        if (r2 >= 10176) goto L48;
        return true;
    L48:
        if (r2 != 169) goto L50;
        return true;
    L50:
        if (r2 == 174) goto L67;
        return false;
    L67:
        return true;
    }

    public static final boolean b(int r2) {
        if (127995 <= r2) goto L5;
    L8:
        return false;
    L5:
        if (r2 >= 128000) goto L8;
        return true;
    }

    public static final boolean c(int r1) {
        if (a(r1) == false) goto L5;
        return true;
    L5:
        if (e(r1) == false) goto L7;
        return true;
    L7:
        if (d(r1) == false) goto L9;
        return true;
    L9:
        if (b(r1) == false) goto L11;
        return true;
    L11:
        if (f(r1) == false) goto L13;
        return true;
    L13:
        if (r1 != 8205) goto L15;
        return true;
    L15:
        if (r1 == 8419) goto L26;
        return false;
    L26:
        return true;
    }

    public static final boolean d(int r1) {
        if (r1 != 35) goto L5;
        return true;
    L5:
        if (r1 != 42) goto L7;
        return true;
    L7:
        if (48 <= r1) goto L9;
        return false;
    L9:
        if (r1 < 58) goto L17;
        return false;
    L17:
        return true;
    }

    public static final boolean e(int r2) {
        if (127462 <= r2) goto L5;
    L8:
        return false;
    L5:
        if (r2 >= 127488) goto L8;
        return true;
    }

    public static final boolean f(int r1) {
        if (r1 != 65039) goto L6;
        return true;
    L6:
        return false;
    }

    public static final int g(int r02, int r1) {
        return r02 + r1;
    }
}
