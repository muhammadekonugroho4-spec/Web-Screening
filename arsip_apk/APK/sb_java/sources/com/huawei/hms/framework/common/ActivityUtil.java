package com.huawei.hms.framework.common;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class ActivityUtil {
    private static final String TAG = "ActivityUtil";

    public ActivityUtil() {
    }

    public static PendingIntent getActivities(Context r2, int r3, Intent[] r4, int r5) {
        if (r2 != null) goto L11;
        Logger.w(TAG, "context is null");
        return null;
    L11:
        return PendingIntent.getActivities(r2, r3, r4, r5);
    L8:
        e = move-exception;
        Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
        return null;
    }

    public static boolean isForeground(Context r5) {
        if (r5 == null) goto L22;
        ActivityManager r1 = (ActivityManager) ContextCompat.getSystemService(r5, "activity");
        if (r1 == null) goto L34;
        List<ActivityManager.RunningAppProcessInfo> r12 = r1.getRunningAppProcesses();     // Catch: RuntimeException -> L8
    L10:
        if (r12 == null) goto L35;
        Iterator<ActivityManager.RunningAppProcessInfo> r13 = r12.iterator();
    L13:
        if (r13.hasNext() == false) goto L36;
        ActivityManager.RunningAppProcessInfo r2 = r13.next();
        String r3 = r2.processName;
        if (r3 == null) goto L13;
        if (r3.equals(r5.getPackageName()) == false) goto L13;
        if (r2.importance != 100) goto L13;
        Logger.v(TAG, "isForeground true");
        return true;
    L36:
        return false;
    L35:
        return false;
    L8:
        e = move-exception;
        Logger.w(TAG, "activityManager getRunningAppProcesses occur exception: ", e);
        r12 = null;
        goto L10
    L34:
        return false;
    L22:
        return false;
    }
}
