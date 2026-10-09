package com.stockbit.common.utils;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes7.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final org.slf4j.b f61905a = null;

    static {
        f61905a = org.slf4j.c.i(M.class);
    }

    public static int a(int r2) {
        return c(r2, e(r2), false);
    }

    public static long b(long r3) {
        return d(r3, f(r3), false);
    }

    public static int c(int r1, int r2, boolean r3) {
        if (r2 <= 0) goto L4;
        int r02 = r1 % r2;
    L5:
        if (r3 == true) goto L7;
        if (r02 <= 0) goto L10;
        int r32 = r2 - r02;
    L11:
        if (r32 != r2) goto L15;
        return r1 + ((r2 - r32) - r2);
    L15:
        return r1 - r02;
    L10:
        r32 = r2;
        goto L11
    L7:
        return (r1 - r02) + r2;
    L4:
        r02 = 0;
        goto L5
    }

    public static long d(long r4, long r6, boolean r8) {
        if (r6 <= 0) goto L5;
        long r2 = r4 % r6;
    L6:
        if (r8 == false) goto L10;
        return (r4 - r2) + r6;
    L10:
        if (r2 <= 0) goto L12;
        long r02 = r6 - r2;
    L14:
        if (r02 != r6) goto L18;
        return r4 + ((r6 - r02) - r6);
    L18:
        return r4 - r2;
    L12:
        r02 = r6;
        goto L14
    L5:
        r2 = 0;
        goto L6
    }

    public static int e(int r1) {
        if (r1 <= 5000) goto L7;
        return 25;
    L7:
        if (r1 <= 2000) goto L11;
        return 10;
    L11:
        if (r1 <= 500) goto L15;
        return 5;
    L15:
        if (r1 <= 200) goto L18;
        return 2;
    L18:
        if (r1 <= 0) goto L21;
        return 1;
    L21:
        return 0;
    }

    public static long f(long r2) {
        if (r2 <= 5000) goto L7;
        return 25;
    L7:
        if (r2 <= Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS) goto L11;
        return 10;
    L11:
        if (r2 <= 500) goto L15;
        return 5;
    L15:
        if (r2 <= 200) goto L19;
        return 2;
    L19:
        if (r2 <= 0) goto L22;
        return 1;
    L22:
        return 0;
    }

    public static int g(int r1) {
        if (r1 < 5000) goto L7;
        return 25;
    L7:
        if (r1 < 2000) goto L11;
        return 10;
    L11:
        if (r1 < 500) goto L15;
        return 5;
    L15:
        if (r1 < 200) goto L18;
        return 2;
    L18:
        if (r1 < 0) goto L21;
        return 1;
    L21:
        return 0;
    }

    public static long h(long r2) {
        if (r2 < 5000) goto L7;
        return 25;
    L7:
        if (r2 < Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS) goto L11;
        return 10;
    L11:
        if (r2 < 500) goto L15;
        return 5;
    L15:
        if (r2 < 200) goto L19;
        return 2;
    L19:
        if (r2 < 0) goto L22;
        return 1;
    L22:
        return 0;
    }

    public static int i(int r2) {
        return c(r2, g(r2), true);
    }

    public static long j(long r3) {
        return d(r3, h(r3), true);
    }
}
