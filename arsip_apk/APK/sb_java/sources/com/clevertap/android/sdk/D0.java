package com.clevertap.android.sdk;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public abstract class D0 {
    public static boolean a(Context r02, String r1, boolean r2) {
        return g(r02).getBoolean(r1, r2);
    }

    public static boolean b(Context r2, CleverTapInstanceConfig r3, String r4) {
        if (r3.isDefaultInstance() == false) goto L10;
        boolean r32 = a(r2, v(r3, r4), false);
        if (r32 == false) goto L7;
        return r32;
    L7:
        return a(r2, r4, false);
    L10:
        return a(r2, v(r3, r4), false);
    }

    public static int c(Context r02, String r1, int r2) {
        return g(r02).getInt(r1, r2);
    }

    public static int d(Context r1, CleverTapInstanceConfig r2, String r3, int r4) {
        if (r2.isDefaultInstance() == false) goto L10;
        int r22 = c(r1, v(r2, r3), Constants.EMPTY_NOTIFICATION_ID);
        if (r22 == (-1000)) goto L8;
        return r22;
    L8:
        return c(r1, r3, r4);
    L10:
        return c(r1, v(r2, r3), r4);
    }

    public static long e(Context r02, String r1, String r2, long r3) {
        return h(r02, r1).getLong(r2, r3);
    }

    public static long f(Context r4, CleverTapInstanceConfig r5, String r6, int r7, String r8) {
        if (r5.isDefaultInstance() == false) goto L10;
        long r2 = e(r4, r8, v(r5, r6), -1000);
        if (r2 == (-1000)) goto L8;
        return r2;
    L8:
        return e(r4, r8, r6, r7);
    L10:
        return e(r4, r8, v(r5, r6), r7);
    }

    public static SharedPreferences g(Context r1) {
        return h(r1, null);
    }

    public static SharedPreferences h(Context r2, String r3) {
        String r02 = Constants.CLEVERTAP_STORAGE_TAG;
        if (r3 == null) goto L6;
        r02 = Constants.CLEVERTAP_STORAGE_TAG + "_" + r3;
    L6:
        return r2.getSharedPreferences(r02, 0);
    }

    public static String i(Context r02, String r1, String r2) {
        return g(r02).getString(r1, r2);
    }

    public static String j(Context r02, String r1, String r2, String r3) {
        return h(r02, r1).getString(r2, r3);
    }

    public static String k(Context r1, CleverTapInstanceConfig r2, String r3, String r4) {
        if (r2.isDefaultInstance() == false) goto L10;
        String r22 = i(r1, v(r2, r3), r4);
        if (r22 == null) goto L8;
        return r22;
    L8:
        return i(r1, r3, r4);
    L10:
        return i(r1, v(r2, r3), r4);
    }

    public static void l(SharedPreferences.Editor r1) {
        r1.apply();     // Catch: Throwable -> L4
        return;
    L4:
        th = move-exception;
        Logger.v("CRITICAL: Failed to persist shared preferences!", th);
    }

    public static void m(SharedPreferences.Editor r1) {
        r1.commit();     // Catch: Throwable -> L4
        return;
    L4:
        th = move-exception;
        Logger.v("CRITICAL: Failed to persist shared preferences!", th);
    }

    public static void n(Context r02, String r1, boolean r2) {
        l(g(r02).edit().putBoolean(r1, r2));
    }

    public static void o(Context r02, String r1, boolean r2) {
        m(g(r02).edit().putBoolean(r1, r2));
    }

    public static void p(Context r02, String r1, int r2) {
        l(g(r02).edit().putInt(r1, r2));
    }

    public static void q(Context r02, String r1, int r2) {
        m(g(r02).edit().putInt(r1, r2));
    }

    public static void r(Context r02, CleverTapInstanceConfig r1, String r2, String r3) {
        l(g(r02).edit().putString(v(r1, r2), r3));
    }

    public static void s(Context r02, String r1, String r2) {
        l(g(r02).edit().putString(r1, r2));
    }

    public static void t(Context r02, String r1, String r2) {
        m(g(r02).edit().putString(r1, r2));
    }

    public static void u(Context r02, String r1) {
        l(g(r02).edit().remove(r1));
    }

    public static String v(CleverTapInstanceConfig r1, String r2) {
        return r2 + ":" + r1.getAccountId();
    }

    public static String w(String r1, String r2) {
        return r2 + ":" + r1;
    }
}
