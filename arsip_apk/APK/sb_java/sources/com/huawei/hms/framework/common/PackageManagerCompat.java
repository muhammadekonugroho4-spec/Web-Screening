package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public class PackageManagerCompat {
    private static final String TAG = "PackageUtils";
    private static final String VERSION = "6.0.2.300";
    private static String sAppVersion = "";

    static {
    }

    public PackageManagerCompat() {
    }

    public static String getAppPackageName(Context r2) {
        if (ContextHolder.getAppContext() == null) goto L6;
        r2 = ContextHolder.getAppContext();
    L6:
        PackageManager r02 = r2.getPackageManager();
        if (r02 == null) goto L16;
        return r02.getPackageInfo(r2.getPackageName(), 16384).packageName;
    L11:
        Logger.w(TAG, "Failed to get Package managers Package Info");
        return "";
    L16:
        return "";
    }

    public static String getAppVersion(Context r2) {
        if (TextUtils.isEmpty(sAppVersion) == true) goto L7;
        return sAppVersion;
    L7:
        if (ContextHolder.getAppContext() == null) goto L10;
        r2 = ContextHolder.getAppContext();
    L10:
        PackageManager r02 = r2.getPackageManager();
        if (r02 == null) goto L13;
        sAppVersion = String.valueOf(r02.getPackageInfo(r2.getPackageName(), 16384).versionCode);     // Catch: Throwable -> L16
    L18:
        return sAppVersion;
    L16:
        Logger.w(TAG, "Failed to get Package managers Package Info");
        goto L18
    L13:
        return sAppVersion;
    }

    private static Bundle getBundleFromApp(Context r3) {
        Bundle r02 = Bundle.EMPTY;
        if (ContextHolder.getAppContext() == null) goto L6;
        r3 = ContextHolder.getAppContext();
    L6:
        if (r3 == null) goto L20;
        PackageManager r1 = r3.getPackageManager();
        if (r1 == null) goto L20;
        ApplicationInfo r32 = r1.getApplicationInfo(r3.getPackageName(), 128);     // Catch: RuntimeException -> L16 Throwable -> L18
        if (r32 == null) goto L20;
        Bundle r33 = r32.metaData;     // Catch: RuntimeException -> L16 Throwable -> L18
        if (r33 == null) goto L20;
        return r33;
    L18:
        e = move-exception;
        Logger.w(TAG, "NameNotFoundException:", e);
    L20:
        return r02;
    }

    private static Bundle getBundleFromKit(Context r2) {
        if (ContextHolder.getKitContext() == null) goto L7;
        r2 = ContextHolder.getKitContext();
    L7:
        if (r2 != null) goto L11;
        Logger.v(TAG, "the kitContext is null");
        return Bundle.EMPTY;
    L11:
        if (r2.getApplicationInfo() != null) goto L14;
        Logger.v(TAG, "the kit applicationInfo is null");
        return Bundle.EMPTY;
    L14:
        Bundle r22 = r2.getApplicationInfo().metaData;
        if (r22 == null) goto L17;
        return r22;
    L17:
        return Bundle.EMPTY;
    }

    private static Bundle getBundleFromKitOrAPP(Context r2) {
        Bundle r02 = getBundleFromKit(r2);
        if (r02 == null) goto L9;
        if (r02.isEmpty() == true) goto L9;
        return r02;
    L9:
        return getBundleFromApp(r2);
    }

    public static String getMetaDataFromApp(Context r02, String r1, String r2) {
        Bundle r03 = getBundleFromApp(r02);
        if (r03 != null) goto L5;
        return r2;
    L5:
        return r03.getString(r1, r2);
    }

    public static String getMetaDataFromKit(Context r02, String r1, String r2) {
        Bundle r03 = getBundleFromKit(r02);     // Catch: RuntimeException -> L7
        if (r03 != null) goto L5;
        return r2;
    L5:
        return r03.getString(r1, r2);
    L7:
        Logger.v(TAG, "the kit metaData is runtimeException");
        return r2;
    }

    public static String getMetaDataFromKitOrApp(Context r02, String r1, String r2) {
        return getBundleFromKitOrAPP(r02).getString(r1, r2);
    }

    public static Map<String, String> getMetaDataMapFromKitOrApp(Context r5, String r6) {
        HashMap r02 = new HashMap();
        Bundle r1 = getBundleFromKitOrAPP(r5);
        Iterator<String> r52 = getBundleFromKitOrAPP(r5).keySet().iterator();
    L4:
        if (r52.hasNext() == false) goto L11;
        String r2 = r52.next();
        if (r2.startsWith(r6) == false) goto L4;
        String r3 = r1.getString(r2);
        if (TextUtils.isEmpty(r3) == true) goto L4;
        r02.put(r2.substring(r6.length()), r3);
        goto L4
    L11:
        return r02;
    }
}
