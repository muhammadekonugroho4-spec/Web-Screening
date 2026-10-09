package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes6.dex */
public class PackageUtils {
    private static final String TAG = "PackageUtils";

    public PackageUtils() {
    }

    public static String getVersionName(Context r3) {
        if (r3 != null) goto L5;
        return "";
    L5:
        PackageManager r1 = r3.getPackageManager();
        return r1.getPackageInfo(r3.getPackageName(), 16384).versionName;
    L8:
        e = move-exception;
        Logger.w(TAG, "", e);
        return "";
    }
}
