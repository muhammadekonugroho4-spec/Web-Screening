package com.huawei.hms.framework.common.check;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;

/* loaded from: classes6.dex */
public class ProviderCheckUtil {
    private static String TAG = "ProviderCheckUtil";

    static {
    }

    public ProviderCheckUtil() {
    }

    public static boolean isValid(Uri r5) {
        if (r5 == null) goto L15;
        PackageManager r1 = ContextHolder.getAppContext().getPackageManager();
        ProviderInfo r52 = r1.resolveContentProvider(r5.getAuthority(), 0);
        if (r52 == null) goto L14;
        ApplicationInfo r53 = r52.applicationInfo;
        if (r53 == null) goto L15;
        String r54 = r53.packageName;
        Logger.v(TAG, "Target provider service's package name is : " + r54);
        if (r54 == null) goto L15;
        if (r1.checkSignatures("com.huawei.hwid", r54) != 0) goto L15;
        return true;
    L14:
        Logger.w(TAG, "Invalid param");
    L15:
        return false;
    }
}
