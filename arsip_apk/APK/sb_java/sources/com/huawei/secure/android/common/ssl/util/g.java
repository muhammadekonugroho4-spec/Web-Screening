package com.huawei.secure.android.common.ssl.util;

import android.content.Context;

/* loaded from: classes6.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f39610a = "h";

    static {
    }

    public static String a(String r4) {
        Context r02 = c.a();
        if (r02 != null) goto L15;
        return "";
    L15:
        return r02.getPackageManager().getPackageInfo(r4, 0).versionName;
    L9:
        e = move-exception;
        f.d(f39610a, "getVersion NameNotFoundException : " + e.getMessage());
    L14:
        return "";
    L7:
        e = move-exception;
        f.d(f39610a, "getVersion: " + e.getMessage());
    L11:
        f.d(f39610a, "throwable");
        goto L14
    }
}
