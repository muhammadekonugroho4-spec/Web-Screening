package com.huawei.hms.framework.common;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: classes6.dex */
public class SettingUtil {
    private static final String TAG = "SettingUtil";

    public SettingUtil() {
    }

    public static int getSecureInt(ContentResolver r1, String r2, int r3) {
        return Settings.Secure.getInt(r1, r2, r3);
    L4:
        e = move-exception;
        Logger.e(TAG, "Settings Secure getInt throwFromSystemServer:", e);
        return r3;
    }

    public static int getSystemInt(ContentResolver r1, String r2, int r3) {
        return Settings.System.getInt(r1, r2, r3);
    L4:
        e = move-exception;
        Logger.e(TAG, "Settings System getInt throwFromSystemServer:", e);
        return r3;
    }
}
