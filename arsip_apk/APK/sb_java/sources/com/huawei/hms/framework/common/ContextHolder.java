package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes6.dex */
public class ContextHolder {
    private static final String TAG = "ContextHolder";

    @SuppressLint({"StaticFieldLeak"})
    private static Context sAppContext;

    @SuppressLint({"StaticFieldLeak"})
    private static Context sKitContext;

    public ContextHolder() {
    }

    public static Context getAppContext() {
        return sAppContext;
    }

    public static Context getKitContext() {
        return sKitContext;
    }

    public static Context getResourceContext() {
        if (getKitContext() == null) goto L7;
        return getKitContext();
    L7:
        return getAppContext();
    }

    public static void setAppContext(Context r1) {
        CheckParamUtils.checkNotNull(r1, "sAppContext == null");
        sAppContext = r1.getApplicationContext();
    }

    public static void setKitContext(Context r1) {
        CheckParamUtils.checkNotNull(r1, "sKitContext == null");
        sKitContext = r1;
    }
}
