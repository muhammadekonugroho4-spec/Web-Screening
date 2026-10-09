package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class c extends com.huawei.agconnect.c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f38826b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f38827c = null;
    public static String d;

    /* renamed from: a, reason: collision with root package name */
    public com.huawei.agconnect.config.a f38828a;

    static {
        f38826b = new HashMap();
        f38827c = new Object();
    }

    public c(Context r1, String r2) {
        this.f38828a = com.huawei.agconnect.config.a.e(r1, r2);
    }

    public static com.huawei.agconnect.c a(Context r1) {
        Context r02 = r1.getApplicationContext();
        if (r02 == null) goto L6;
        r1 = r02;
    L6:
        String r03 = r1.getPackageName();
        d = r03;
        return b(r1, r03);
    }

    public static com.huawei.agconnect.c b(Context r4, String r5) {
        if (TextUtils.isEmpty(r5) == true) goto L16;
        Object r02 = f38827c;
        monitor-enter(r02);
        Map r1 = f38826b;     // Catch: Throwable -> L9
        com.huawei.agconnect.c r2 = (com.huawei.agconnect.c) r1.get(r5);     // Catch: Throwable -> L9
        if (r2 != null) goto L11;
        r1.put(r5, new c(r4, r5));     // Catch: Throwable -> L9
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r2;
    L9:
        th = move-exception;
        throw th;
    L16:
        throw new IllegalArgumentException("packageName can not be empty");
    }
}
