package com.huawei.hms.framework.network.grs.h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import java.util.Locale;

/* loaded from: classes6.dex */
public class a {
    public static String a() {
        return "6.0.2.300";
    }

    public static String b(Context r02, String r1, String r2) {
        return a(r02, r1, r2);
    }

    public static String a(Context r3) {
        if (r3 != null) goto L6;
        return "";
    L6:
        if (ContextHolder.getAppContext() == null) goto L9;
        r3 = ContextHolder.getAppContext();
    L9:
        PackageManager r1 = r3.getPackageManager();
        return r1.getPackageInfo(r3.getPackageName(), 16384).versionName;
    L12:
        e = move-exception;
        Logger.w("AgentUtil", "", e);
        return "";
    }

    public static String a(Context r7, String r8, String r9) {
        if (r7 != null) goto L6;
        return String.format(Locale.ROOT, r8 + "/%s", new Object[]{a()});
    L6:
        if (ContextHolder.getAppContext() != null) goto L8;
        Context r02 = r7;
    L9:
        String r1 = r02.getPackageName();
        String r2 = a(r7);
        String r3 = Build.VERSION.RELEASE;
        String r4 = Build.MODEL;
        Locale r72 = Locale.ROOT;
        String r82 = "%s/%s (Linux; Android %s; %s) " + r8 + "/%s %s";
        String r5 = a();
        if (TextUtils.isEmpty(r9) == false) goto L13;
        r9 = "no_service_name";
    L13:
        return String.format(r72, r82, new Object[]{r1, r2, r3, r4, r5, r9});
    L8:
        r02 = ContextHolder.getAppContext();
        goto L9
    }
}
