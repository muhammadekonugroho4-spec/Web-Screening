package com.huawei.hms.framework.common;

import android.text.TextUtils;

/* loaded from: classes6.dex */
public class SystemPropUtils {
    private static final String TAG = "SystemPropUtils";

    static {
    }

    public SystemPropUtils() {
    }

    public static String getProperty(String r2, String r3, String r4, String r5) {
        if (TextUtils.isEmpty(r2) == false) goto L5;
    L14:
        Logger.w(TAG, "reflect class for method has exception.");
        return r5;
    L5:
        if (TextUtils.isEmpty(r3) == true) goto L14;
        if (TextUtils.isEmpty(r4) == true) goto L14;
        Class<?> r42 = Class.forName(r4);     // Catch: Exception -> L11
        return (String) r42.getMethod(r2, new Class[]{String.class, String.class}).invoke(r42, new Object[]{r3, r5});
    L11:
        e = move-exception;
        Logger.e(TAG, "getProperty catch exception: ", e);
        return r5;
    }
}
