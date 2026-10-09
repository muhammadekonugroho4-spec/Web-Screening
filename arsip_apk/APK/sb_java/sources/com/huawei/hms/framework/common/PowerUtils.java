package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.PowerManager;

/* loaded from: classes6.dex */
public class PowerUtils {
    private static final String TAG = "PowerUtils";

    public static final class PowerMode {
        static int POWER_MODE_DEFAULT_RETURN_VALUE = 0;
        static int POWER_SAVER_MODE = 4;
        static String SMART_MODE_STATUS = "SmartModeStatus";

        static {
        }

        public PowerMode() {
        }
    }

    public PowerUtils() {
    }

    public static boolean isAppIdleMode(Context r4) {
        if (r4 == null) goto L12;
        String r2 = r4.getPackageName();
        Object r42 = r4.getSystemService("usagestats");
        if ((r42 instanceof UsageStatsManager) == false) goto L11;
        UsageStatsManager r43 = (UsageStatsManager) r42;
        if (r43 != null) goto L9;
        Logger.i(TAG, "isAppIdleMode statsManager is null!");
        goto L11
    L9:
        return r43.isAppInactive(r2);
    L11:
        return false;
    L12:
        Logger.i(TAG, "isAppIdleMode Context is null!");
        return false;
    }

    public static boolean isDozeIdleMode(Context r3) {
        if (r3 == null) goto L16;
        Object r32 = ContextCompat.getSystemService(r3, "power");
        if ((r32 instanceof PowerManager) == false) goto L7;
        PowerManager r33 = (PowerManager) r32;
    L8:
        if (r33 != null) goto L18;
        Logger.i(TAG, "isDozeIdleMode powerManager is null!");
        return false;
    L18:
        return r33.isDeviceIdleMode();
    L11:
        e = move-exception;
        Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
        return false;
    L7:
        r33 = null;
        goto L8
    L16:
        Logger.i(TAG, "isDozeIdleMode Context is null!");
        return false;
    }

    public static boolean isInteractive(Context r2) {
        if (r2 == null) goto L14;
        Object r22 = ContextCompat.getSystemService(r2, "power");
        if ((r22 instanceof PowerManager) == true) goto L12;
        return false;
    L12:
        return ((PowerManager) r22).isInteractive();
    L8:
        e = move-exception;
        Logger.i(TAG, "getActiveNetworkInfo failed, exception:" + e.getClass().getSimpleName() + e.getMessage());
        return false;
    L14:
        return false;
    }

    public static boolean isWhilteList(Context r2) {
        if (r2 == null) goto L17;
        Object r02 = ContextCompat.getSystemService(r2, "power");
        if ((r02 instanceof PowerManager) == false) goto L6;
        PowerManager r03 = (PowerManager) r02;
    L7:
        String r22 = r2.getPackageName();
        if (r03 == null) goto L18;
        return r03.isIgnoringBatteryOptimizations(r22);
    L11:
        e = move-exception;
        Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
        return false;
    L18:
        return false;
    L6:
        r03 = null;
        goto L7
    L17:
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(Context r4) {
        if (r4 == null) goto L20;
        Object r2 = r4.getSystemService("connectivity");
        if ((r2 instanceof ConnectivityManager) == false) goto L7;
        ConnectivityManager r22 = (ConnectivityManager) r2;
    L8:
        if (r22 != null) goto L10;
        Logger.i(TAG, "readDataSaverMode Context is null!");
        return 0;
    L10:
        if (ContextCompat.checkSelfPermission(r4, "android.permission.ACCESS_NETWORK_STATE") == false) goto L13;
        return 0;
    L13:
        if (r22.isActiveNetworkMetered() == true) goto L15;
        Logger.v(TAG, "ConnectType is not Mobile Network!");
        return 0;
    L15:
        return r22.getRestrictBackgroundStatus();
    L7:
        r22 = null;
        goto L8
    L20:
        Logger.i(TAG, "readDataSaverMode manager is null!");
        return 0;
    }

    public static int readPowerSaverMode(Context r4) {
        if (r4 == null) goto L21;
        int r1 = SettingUtil.getSystemInt(r4.getContentResolver(), PowerMode.SMART_MODE_STATUS, PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE);
        if (r1 != PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE) goto L24;
        Object r42 = ContextCompat.getSystemService(r4, "power");
        if ((r42 instanceof PowerManager) == false) goto L9;
        PowerManager r43 = (PowerManager) r42;
    L10:
        if (r43 == null) goto L25;
    L15:
        e = move-exception;
        Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
        return r1;
    L12:
        if (r43.isPowerSaveMode() == false) goto L17;
        int r44 = PowerMode.POWER_SAVER_MODE;     // Catch: RuntimeException -> L15
    L26:
        return r44;
    L17:
        r44 = PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE;     // Catch: RuntimeException -> L15
        goto L26
    L25:
        return r1;
    L9:
        r43 = null;
        goto L10
    L24:
        return r1;
    L21:
        Logger.i(TAG, "readPowerSaverMode Context is null!");
        return 0;
    }
}
