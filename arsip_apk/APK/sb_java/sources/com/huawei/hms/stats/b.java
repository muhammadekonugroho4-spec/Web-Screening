package com.huawei.hms.stats;

import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f39451a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f39452b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f39453c = false;

    static {
        f39451a = new Object();
    }

    public static boolean a() {
        Object r02 = f39451a;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (f39452b == false) goto L20;
    L15:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return f39453c;
    L20:
        Class.forName("com.huawei.hianalytics.process.HiAnalyticsInstance");     // Catch: Throwable -> L9 ClassNotFoundException -> L11
    L12:
        f39452b = true;     // Catch: Throwable -> L9
        HMSLog.i("HianalyticsExist", "hianalytics exist: " + f39453c);     // Catch: Throwable -> L9
        goto L15
    L11:
        HMSLog.i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HiAnalyticsConfig.");     // Catch: Throwable -> L9
        goto L12
    }
}
