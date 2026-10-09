package com.huawei.hms.framework.common;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Process;

/* loaded from: classes6.dex */
public class ContextCompat {
    private static final String TAG = "ContextCompat";

    public ContextCompat() {
    }

    public static boolean checkSelfPermission(Context r4, String r5) {
        if (r4 == null) goto L14;
        if (r5 == null) goto L14;
        if (r4.checkPermission(r5, Process.myPid(), Process.myUid()) != 0) goto L10;
        return true;
    L10:
        return false;
    L11:
        e = move-exception;
        Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
        return false;
    L14:
        Logger.w(TAG, "param is null");
        return false;
    }

    public static Context getProtectedStorageContext(Context r1) {
        if (r1 != null) goto L6;
        Logger.w(TAG, "context is null");
        return null;
    L6:
        return r1.createDeviceProtectedStorageContext();
    }

    public static Object getSystemService(Context r2, String r3) {
        if (r2 != null) goto L11;
        Logger.w(TAG, "context is null");
        return null;
    L11:
        return r2.getSystemService(r3);
    L8:
        e = move-exception;
        Logger.e(TAG, "SystemServer error:", e);
        return null;
    }

    public static Intent registerReceiver(Context r2, BroadcastReceiver r3, IntentFilter r4) {
        if (r2 != null) goto L11;
        Logger.w(TAG, "context is null");
        return null;
    L11:
        return r2.registerReceiver(r3, r4);
    L8:
        e = move-exception;
        Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
        return null;
    }

    public static ComponentName startService(Context r2, Intent r3) {
        if (r2 != null) goto L11;
        Logger.w(TAG, "context is null");
        return null;
    L11:
        return r2.startService(r3);
    L8:
        e = move-exception;
        Logger.e(TAG, "SystemServer error:", e);
        return null;
    }

    public static void unregisterReceiver(Context r1, BroadcastReceiver r2) {
        if (r1 != null) goto L11;
        Logger.w(TAG, "context is null");
        return;
    L11:
        r1.unregisterReceiver(r2);     // Catch: RuntimeException -> L8
        return;
    L8:
        e = move-exception;
        Logger.e(TAG, "SystemServer error:", e);
    }

    public static Intent registerReceiver(Context r2, BroadcastReceiver r3, IntentFilter r4, String r5, Handler r6) {
        if (r2 != null) goto L11;
        Logger.w(TAG, "context is null");
        return null;
    L11:
        return r2.registerReceiver(r3, r4, r5, r6);
    L8:
        e = move-exception;
        Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
        return null;
    }
}
