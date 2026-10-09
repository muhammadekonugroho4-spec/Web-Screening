package com.huawei.hms.adapter;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AndroidException;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes6.dex */
public class AvailableUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f38899a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f38900b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f38901c = false;

    static {
        f38899a = new Object();
    }

    public AvailableUtil() {
    }

    public static boolean isInstallerLibExist(Context r4) {
        if (f38900b == false) goto L6;
        HMSLog.i("AvailableUtil", "installerInit exist: " + f38901c);
        return f38901c;
    L6:
        Object r02 = f38899a;
        monitor-enter(r02);
    L16:
        th = move-exception;
        throw th;
    L9:
        if (f38900b == true) goto L35;
        PackageManager r1 = r4.getPackageManager();     // Catch: Throwable -> L16
        if (r1 != null) goto L44;
        HMSLog.e("AvailableUtil", "In isAvailableLibExist, Failed to get 'PackageManager' instance.");     // Catch: Throwable -> L16
        Class.forName("com.huawei.hms.update.manager.UpdateManager");     // Catch: Throwable -> L16 ClassNotFoundException -> L18
    L29:
        boolean r42 = true;
    L34:
        f38901c = r42;     // Catch: Throwable -> L16
        f38900b = true;     // Catch: Throwable -> L16
        goto L35
    L18:
        HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to find class UpdateManager.");     // Catch: Throwable -> L16
    L33:
        r42 = false;
        goto L34
    L44:
        ApplicationInfo r43 = r1.getPackageInfo(r4.getPackageName(), 128).applicationInfo;     // Catch: Throwable -> L16 RuntimeException -> L30 AndroidException -> L32
        if (r43 == null) goto L33;
        Bundle r44 = r43.metaData;     // Catch: Throwable -> L16 RuntimeException -> L30 AndroidException -> L32
        if (r44 == null) goto L33;
        Object r45 = r44.get("availableHMSCoreInstaller");     // Catch: Throwable -> L16 RuntimeException -> L30 AndroidException -> L32
        if (r45 == null) goto L33;
        if (String.valueOf(r45).equalsIgnoreCase("yes") == false) goto L33;
        HMSLog.i("AvailableUtil", "available exist: true");     // Catch: Throwable -> L16 RuntimeException -> L30 AndroidException -> L32
    L32:
        HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to read meta data for the availableHMSCoreInstaller.");     // Catch: Throwable -> L16
    L30:
        e = move-exception;
        HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to read meta data for the availableHMSCoreInstaller.", e);     // Catch: Throwable -> L16
    L35:
        monitor-exit(r02);     // Catch: Throwable -> L16
        HMSLog.i("AvailableUtil", "available exist: " + f38901c);
        return f38901c;
    }
}
