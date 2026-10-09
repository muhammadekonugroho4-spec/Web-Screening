package com.huawei.hms.framework.common;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;

/* loaded from: classes6.dex */
public class Utils {
    private static final String TAG = "Utils";

    public Utils() {
    }

    public static long getCurrentTime(boolean r2) {
        if (r2 == false) goto L6;
        return SystemClock.elapsedRealtime();
    L6:
        return System.currentTimeMillis();
    }

    public static boolean is64Bit(Context r1) {
        if (r1 != null) goto L6;
        Logger.e(TAG, "Null context, please check it.");
        return false;
    L6:
        if (r1.getApplicationContext() == null) goto L10;
        r1.getApplicationContext();
    L10:
        return Process.is64Bit();
    }
}
