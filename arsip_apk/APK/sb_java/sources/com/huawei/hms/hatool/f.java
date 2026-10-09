package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public abstract class f {

    public static class a extends Exception {
        public a(String r1) {
            super(r1);
        }
    }

    private static Object a(Class r3, String r4, Class[] r5, Object[] r6) {
        if (r3 == null) goto L28;
        if (r5 != null) goto L9;
        if (r6 == null) goto L29;
        throw new a("paramsType is null, but params is not null");
    L29:
    L21:
        z.f("hmsSdk", "invokeStaticFun(): cls.getMethod(),No Such Method !");
    L22:
        return null;
    L30:
        return r3.getMethod(r4, r5).invoke(null, r6);
    L19:
        String r32 = "invokeStaticFun(): method invoke Exception!";
    L17:
        z.f("hmsSdk", r32);     // Catch: NoSuchMethodException -> L21
    L18:
        r32 = "invokeStaticFun(): Illegal Argument!";
    L16:
        r32 = "invokeStaticFun(): Invocation Target Exception!";
        goto L17
    L9:
        if (r6 == null) goto L26;
        if (r5.length == r6.length) goto L29;
        throw new a("paramsType len:" + r5.length + " should equal params.len:" + r6.length);
    L26:
        throw new a("paramsType or params should be same");
    L28:
        throw new a("class is null in invokeStaticFun");
    }

    public static String b() {
        String r02 = a("com.huawei.android.os.SystemPropertiesEx", "ro.huawei.build.display.id", "");
        z.c("hmsSdk", "SystemPropertiesEx: get rom_ver: " + r02);
        if (TextUtils.isEmpty(r02) == false) goto L6;
        String r03 = Build.DISPLAY;
        z.c("hmsSdk", "SystemProperties: get rom_ver: " + r03);
        return r03;
    L6:
        return r02;
    }

    public static String c(Context r02) {
        if (r02 != null) goto L6;
        return "";
    L6:
        return r02.getPackageName();
    }

    public static String d(Context r2) {
        if (r2 == null) goto L11;
        return r2.getPackageManager().getPackageInfo(c(r2), 16384).versionName;
    L6:
        z.f("hmsSdk", "getVersion(): The package name is not correct!");
        return "";
    L11:
        return "";
    }

    private static Object a(String r1, String r2, Class[] r3, Object[] r4) {
        return a(Class.forName(r1), r2, r3, r4);
    L5:
        String r12 = "invokeStaticFun(): Static function call Exception ";
    L6:
        z.f("hmsSdk", r12);
        return null;
    L7:
        r12 = "invokeStaticFun() Not found class!";
        goto L6
    }

    public static String b(Context r3) {
        ApplicationInfo r32 = r3.getPackageManager().getApplicationInfo(r3.getPackageName(), 128);     // Catch: PackageManager.NameNotFoundException -> L14
        if (r32 == null) goto L15;
        Bundle r33 = r32.metaData;     // Catch: PackageManager.NameNotFoundException -> L14
        if (r33 == null) goto L15;
        Object r34 = r33.get("CHANNEL");     // Catch: PackageManager.NameNotFoundException -> L14
        if (r34 == null) goto L15;
        String r35 = r34.toString();     // Catch: PackageManager.NameNotFoundException -> L14
        if (r35.length() <= 256) goto L13;
        return "Unknown";
    L13:
        return r35;
    L15:
        return "Unknown";
    L14:
        z.f("hmsSdk", "getChannel(): The packageName is not correct!");
        goto L15
    }

    public static String a() {
        return a("ro.build.version.emui", "");
    }

    @SuppressLint({"HardwareIds"})
    public static String a(Context r1) {
        if (r1 != null) goto L6;
        return "";
    L6:
        return Settings.Secure.getString(r1.getContentResolver(), "android_id");
    }

    public static String a(String r2, String r3) {
        if (TextUtils.isEmpty(r2) == false) goto L5;
        return r3;
    L5:
        String r02 = a("android.os.SystemProperties", r2, r3);
        if (TextUtils.isEmpty(r02) == true) goto L8;
        return r02;
    L8:
        return a("com.huawei.android.os.SystemPropertiesEx", r2, r3);
    }

    private static String a(String r2, String r3, String r4) {
        Object r22 = a(r2, "get", new Class[]{String.class, String.class}, new Object[]{r3, r4});
        if (r22 != null) goto L5;
        return r4;
    L5:
        return (String) r22;
    }
}
