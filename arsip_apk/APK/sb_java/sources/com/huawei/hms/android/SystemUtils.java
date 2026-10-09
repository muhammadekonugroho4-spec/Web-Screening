package com.huawei.hms.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import java.util.Locale;

/* loaded from: classes6.dex */
public class SystemUtils {
    public static final String UNKNOWN = "unknown";

    public SystemUtils() {
    }

    private static String a() {
        return getSystemProperties("ro.product.locale", "");
    }

    private static String b() {
        return getSystemProperties("ro.product.locale.region", "");
    }

    public static String getAndoridVersion() {
        return getSystemProperties("ro.build.version.release", UNKNOWN);
    }

    public static String getLocalCountry() {
        Locale r02 = Locale.getDefault();
        if (r02 != null) goto L5;
        return "";
    L5:
        return r02.getCountry();
    }

    public static String getManufacturer() {
        return getSystemProperties("ro.product.manufacturer", UNKNOWN);
    }

    public static long getMegabyte(double r2) {
        return (long) ((r2 * 1000.0d) * 1000.0d);
    }

    public static String getNetType(Context r1) {
        if (r1 == null) goto L11;
        ConnectivityManager r12 = (ConnectivityManager) r1.getSystemService("connectivity");
        if (r12 == null) goto L13;
        NetworkInfo r13 = r12.getActiveNetworkInfo();
        if (r13 != null) goto L8;
        return "";
    L8:
        if (r13.isAvailable() == true) goto L10;
        return "";
    L10:
        return r13.getTypeName();
    L13:
        return "";
    L11:
        return "";
    }

    public static String getPhoneModel() {
        return getSystemProperties("ro.product.model", UNKNOWN);
    }

    public static String getSystemProperties(String r3, String r4) {
        Class<?> r1 = Class.forName("android.os.SystemProperties");     // Catch: Throwable -> L7
        return (String) r1.getDeclaredMethod("get", new Class[]{String.class, String.class}).invoke(r1, new Object[]{r3, r4});
    L7:
        HMSLog.e("SystemUtils", "An exception occurred while reading: getSystemProperties:" + r3);
        return r4;
    }

    public static boolean isChinaROM() {
        String r02 = b();
        if (TextUtils.isEmpty(r02) == false) goto L5;
        String r03 = a();
        if (TextUtils.isEmpty(r03) == false) goto L9;
        String r04 = getLocalCountry();
        if (TextUtils.isEmpty(r04) == false) goto L13;
        return false;
    L13:
        return "cn".equalsIgnoreCase(r04);
    L9:
        return r03.toLowerCase(Locale.US).contains("cn");
    L5:
        return "cn".equalsIgnoreCase(r02);
    }

    public static boolean isEMUI() {
        StringBuilder r02 = new StringBuilder();
        r02.append("is Emui :");
        int r1 = HwBuildEx.VERSION.EMUI_SDK_INT;
        r02.append(r1);
        HMSLog.i("SystemUtils", r02.toString());
        if (r1 <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean isSystemApp(Context r2, String r3) {
        PackageInfo r22 = r2.getPackageManager().getPackageInfo(r3, 16384);     // Catch: RuntimeException -> L5 AndroidException -> L7
    L12:
        if (r22 != null) goto L14;
    L16:
        return false;
    L14:
        if ((r22.applicationInfo.flags & 1) <= 0) goto L16;
        return true;
    L7:
        e = move-exception;
        HMSLog.e("SystemUtils", "isSystemApp Exception: " + e);
    L11:
        r22 = null;
    L5:
        e = move-exception;
        HMSLog.e("SystemUtils", "isSystemApp RuntimeException:" + e);
        goto L11
    }

    public static boolean isTVDevice() {
        return getSystemProperties("ro.build.characteristics", "default").equalsIgnoreCase("tv");
    }
}
