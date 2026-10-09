package com.huawei.agconnect.config;

import android.content.Context;
import com.huawei.agconnect.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f38823a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f38824b = null;

    static {
        f38823a = new HashMap();
        f38824b = new Object();
    }

    public a() {
    }

    public static a d(Context r1) {
        Context r02 = r1.getApplicationContext();
        if (r02 == null) goto L7;
        r1 = r02;
    L7:
        return e(r1, r1.getPackageName());
    }

    public static a e(Context r3, String r4) {
        Object r02 = f38824b;
        monitor-enter(r02);
        Map r1 = f38823a;     // Catch: Throwable -> L7
        a r2 = (a) r1.get(r4);     // Catch: Throwable -> L7
        if (r2 != null) goto L9;
        r2 = new com.huawei.agconnect.config.impl.e(r3, r4);     // Catch: Throwable -> L7
        r1.put(r4, r2);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r2;
    L7:
        th = move-exception;
        throw th;
    }
}
