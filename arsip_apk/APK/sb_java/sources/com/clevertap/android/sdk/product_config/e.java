package com.clevertap.android.sdk.product_config;

import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* loaded from: classes4.dex */
public abstract class e {
    public static String a(CleverTapInstanceConfig r1) {
        StringBuilder r02 = new StringBuilder();
        if (r1 == null) goto L5;
        String r12 = r1.getAccountId();
    L6:
        r02.append(r12);
        r02.append("[Product Config]");
        return r02.toString();
    L5:
        r12 = "";
        goto L6
    }
}
