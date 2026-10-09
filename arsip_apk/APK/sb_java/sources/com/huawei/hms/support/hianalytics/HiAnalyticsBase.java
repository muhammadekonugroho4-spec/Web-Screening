package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class HiAnalyticsBase {
    public HiAnalyticsBase() {
    }

    public static Map<String, String> getMapForBi(Context r3, String r4) {
        HashMap r02 = new HashMap();
        if (r3 != null) goto L5;
    L10:
        return r02;
    L5:
        if (TextUtils.isEmpty(r4) == true) goto L10;
        String[] r42 = r4.split("\\.");
        if (r42.length < 2) goto L10;
        String r1 = r42[0];
        String r43 = r42[1];
        r02.put("service", r1);
        r02.put("apiName", r43);
        r02.put("package", r3.getPackageName());
        r02.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.7.0.300");
        r02.put("callTime", String.valueOf(System.currentTimeMillis()));
        goto L10
    }
}
