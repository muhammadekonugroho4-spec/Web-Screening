package com.huawei.secure.android.common.ssl.util;

import android.util.Log;

/* loaded from: classes6.dex */
public abstract class f {
    public static String a(String r2) {
        return "SecurityComp10200300: " + r2;
    }

    public static void b(String r02, String r1) {
    }

    public static void c(String r02, String r1, Throwable r2) {
        Log.e(a(r02), r1, r2);
    }

    public static void d(String r02, String r1) {
        Log.e(a(r02), r1);
    }

    public static void e(String r02, String r1) {
        Log.i(a(r02), r1);
    }

    public static void f(String r02, String r1) {
        Log.w(a(r02), r1);
    }
}
