package com.huawei.hms.support.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.clevertap.android.sdk.Constants;
import com.huawei.hms.base.log.a;
import com.huawei.hms.base.log.b;

/* loaded from: classes6.dex */
public class HMSLog {

    /* renamed from: a, reason: collision with root package name */
    private static final b f39483a = null;

    static {
        f39483a = new b();
    }

    public HMSLog() {
    }

    private static String a(Context r3) {
        PackageManager r02 = r3.getPackageManager();
        if (r02 != null) goto L8;
    L6:
        return "HMS-[unknown-version]";
    L8:
        PackageInfo r32 = r02.getPackageInfo(r3.getPackageName(), 16384);     // Catch: Throwable -> L7
        return "HMS-" + r32.versionName + "(" + r32.versionCode + ")";
    }

    public static void d(String r2, String r3) {
        f39483a.a(3, r2, r3);
    }

    public static void e(String r2, String r3) {
        f39483a.a(6, r2, r3);
    }

    public static void i(String r2, String r3) {
        f39483a.a(4, r2, r3);
    }

    public static void init(Context r4, int r5, String r6) {
        b r02 = f39483a;
        r02.a(r4, r5, r6);
        r02.a(r6, "============================================================================\n====== " + a(r4) + "\n============================================================================");
    }

    public static boolean isErrorEnable() {
        return f39483a.a(6);
    }

    public static boolean isInfoEnable() {
        return f39483a.a(4);
    }

    public static boolean isWarnEnable() {
        return f39483a.a(5);
    }

    public static void setExtLogger(HMSExtLogger r1, boolean r2) throws IllegalArgumentException {
        if (r1 == null) goto L10;
        a r02 = new a(r1);
        if (r2 == false) goto L7;
        f39483a.a(r02);
        return;
    L7:
        f39483a.a().a(r02);
        return;
    L10:
        throw new IllegalArgumentException("extLogger is not able to be null");
    }

    public static void w(String r2, String r3) {
        f39483a.a(5, r2, r3);
    }

    public static void e(String r2, String r3, Throwable r4) {
        f39483a.a(6, r2, r3, r4);
    }

    public static void e(String r3, long r4, String r6) {
        f39483a.a(6, r3, Constants.AES_PREFIX + r4 + "] " + r6);
    }

    public static void e(String r3, long r4, String r6, Throwable r7) {
        f39483a.a(6, r3, Constants.AES_PREFIX + r4 + "] " + r6, r7);
    }
}
