package com.midtrans.sdk.corekit.core;

import android.util.Log;

/* loaded from: classes6.dex */
public class Logger {
    public static boolean enabled = false;

    static {
    }

    public Logger() {
    }

    public static void d(String r2) {
        if (enabled == false) goto L6;
        Log.d(Constants.TAG, "" + r2);
        return;
    }

    public static void e(String r2) {
        if (enabled == false) goto L6;
        Log.e(Constants.TAG, "" + r2);
        return;
    }

    public static void i(String r2) {
        if (enabled == false) goto L6;
        Log.i(Constants.TAG, "" + r2);
        return;
    }

    public static void d(String r2, String r3) {
        if (enabled == false) goto L6;
        Log.d("" + r2, "" + r3);
        return;
    }

    public static void e(String r02, String r1) {
    }

    public static void i(String r2, String r3) {
        if (enabled == false) goto L6;
        Log.i("" + r2, "" + r3);
        return;
    }

    public static void e(String r02, Throwable r1) {
    }
}
