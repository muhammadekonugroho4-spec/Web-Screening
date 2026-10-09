package com.huawei.hms.framework.network.grs.h;

import com.huawei.hms.framework.common.Logger;

/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f39270a = "e";

    public static boolean a(Long r5) {
        if (r5 != null) goto L14;
        Logger.v(f39270a, "Method isTimeExpire input param expireTime is null.");
        return true;
    L14:
        long r1 = System.currentTimeMillis();     // Catch: NumberFormatException -> L12
        if ((r5.longValue() - r1) < 0) goto L10;
        Logger.i(f39270a, "isSpExpire false.");     // Catch: NumberFormatException -> L12
        return false;
    L10:
        Logger.i(f39270a, "isSpExpire true.");     // Catch: NumberFormatException -> L12
    L13:
        return true;
    L12:
        Logger.v(f39270a, "isSpExpire spValue NumberFormatException.");
        goto L13
    }

    public static boolean a(Long r5, long r6) {
        if (r5 != null) goto L13;
        Logger.v(f39270a, "Method isTimeWillExpire input param expireTime is null.");
        return true;
    L13:
        long r1 = System.currentTimeMillis();     // Catch: NumberFormatException -> L11
        if ((r5.longValue() - (r1 + r6)) < 0) goto L12;
        Logger.v(f39270a, "isSpExpire false.");     // Catch: NumberFormatException -> L11
        return false;
    L12:
        return true;
    L11:
        Logger.v(f39270a, "isSpExpire spValue NumberFormatException.");
        goto L12
    }
}
