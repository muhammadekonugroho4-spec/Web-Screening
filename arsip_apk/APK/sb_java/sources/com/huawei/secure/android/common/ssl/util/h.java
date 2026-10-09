package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes6.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static SharedPreferences f39611a;

    static {
    }

    public static String a(String r02, String r1, Context r2) {
        return b(r2).getString(r02, r1);
    }

    public static synchronized SharedPreferences b(Context r3) {
        monitor-enter(h.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f39611a != null) goto L9;
        f39611a = r3.createDeviceProtectedStorageContext().getSharedPreferences("aegis", 0);     // Catch: Throwable -> L7
    L9:
        SharedPreferences r32 = f39611a;     // Catch: Throwable -> L7
        monitor-exit(h.class);
        return r32;
    }

    public static void c(String r02, String r1, Context r2) {
        b(r2).edit().putString(r02, r1).apply();
    }
}
