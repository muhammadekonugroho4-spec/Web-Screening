package com.huawei.hms.update.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.UIUtil;

/* loaded from: classes6.dex */
public class NotInstalledHmsDialogHelper {
    public NotInstalledHmsDialogHelper() {
    }

    private static void a(Context r1) {
        if (ResourceLoaderUtil.getmContext() != null) goto L6;
        ResourceLoaderUtil.setmContext(r1.getApplicationContext());
        return;
    }

    public static String getAppName(Activity r1) {
        return a(r1, r1.getPackageName());
    }

    public static int getConfirmResId(Activity r1) {
        Checker.checkNonNull(r1, "activity must not be null");
        a(r1);
        return ResourceLoaderUtil.getStringId("hms_confirm");
    }

    public static AlertDialog.Builder getDialogBuilder(Activity r4) {
        Checker.checkNonNull(r4, "activity must not be null");
        a(r4);
        int r02 = ResourceLoaderUtil.getStringId("hms_apk_not_installed_hints");
        String r1 = a(r4, r4.getPackageName());
        return new AlertDialog.Builder(r4, UIUtil.getDialogThemeId(r4)).setMessage(r4.getString(r02, new Object[]{r1}));
    }

    private static String a(Context r4, String r5) {
        if (r4 != null) goto L6;
        HMSLog.e("NotInstalledHmsDialogHelper", "In getAppName, context is null.");
        return "";
    L6:
        PackageManager r2 = r4.getPackageManager();
        if (r2 != null) goto L20;
        HMSLog.e("NotInstalledHmsDialogHelper", "In getAppName, Failed to get 'PackageManager' instance.");
        return "";
    L20:
    L18:
        HMSLog.e("NotInstalledHmsDialogHelper", "In getAppName, Failed to get app name.");
        return "";
    L11:
        if (TextUtils.isEmpty(r5) == false) goto L13;
        r5 = r4.getPackageName();     // Catch: Throwable -> L18
    L13:
        CharSequence r42 = r2.getApplicationLabel(r2.getApplicationInfo(r5, 128));     // Catch: Throwable -> L18
        if (r42 != null) goto L16;
        return "";
    L16:
        return r42.toString();
    }
}
