package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedApi;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class WakeLockHolder {
    private static final String EXTRA_WAKEFUL_INTENT = "com.google.firebase.iid.WakeLockHolder.wakefulintent";
    static final long WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS = 0;
    private static final Object syncObject = null;
    private static WakeLock wakeLock;

    static {
        WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS = TimeUnit.MINUTES.toMillis(1);
        syncObject = new Object();
    }

    public WakeLockHolder() {
    }

    public static /* synthetic */ void a(Intent r02, Task r1) {
        completeWakefulIntent(r02);
    }

    @RestrictedApi(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    public static void acquireWakeLock(Intent r2, long r3) {
        Object r02 = syncObject;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (wakeLock == null) goto L9;
        setAsWakefulIntent(r2, true);     // Catch: Throwable -> L7
        wakeLock.acquire(r3);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
    }

    private static void checkAndInitWakeLock(Context r3) {
        if (wakeLock != null) goto L6;
        WakeLock r02 = new WakeLock(r3, 1, "wake:com.google.firebase.iid.WakeLockHolder");
        wakeLock = r02;
        r02.setReferenceCounted(true);
        return;
    }

    public static void completeWakefulIntent(Intent r2) {
        Object r02 = syncObject;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (wakeLock != null) goto L7;
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return;
    L7:
        if (isWakefulIntent(r2) == false) goto L11;
        setAsWakefulIntent(r2, false);     // Catch: Throwable -> L9
        wakeLock.release();     // Catch: Throwable -> L9
        goto L11
    }

    @RestrictedApi(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    public static void initWakeLock(Context r1) {
        Object r02 = syncObject;
        monitor-enter(r02);
        checkAndInitWakeLock(r1);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public static boolean isWakefulIntent(Intent r2) {
        return r2.getBooleanExtra(EXTRA_WAKEFUL_INTENT, false);
    }

    @RestrictedApi(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    public static void reset() {
        Object r02 = syncObject;
        monitor-enter(r02);
        wakeLock = null;     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @SuppressLint({"TaskMainThread"})
    public static void sendWakefulServiceIntent(Context r3, WithinAppServiceConnection r4, final Intent r5) {
        Object r02 = syncObject;
        monitor-enter(r02);
        checkAndInitWakeLock(r3);     // Catch: Throwable -> L7
        boolean r32 = isWakefulIntent(r5);     // Catch: Throwable -> L7
        setAsWakefulIntent(r5, true);     // Catch: Throwable -> L7
        if (r32 == true) goto L9;
        wakeLock.acquire(WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);     // Catch: Throwable -> L7
    L9:
        r4.sendIntent(r5).addOnCompleteListener(new H(r5));     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    private static void setAsWakefulIntent(Intent r1, boolean r2) {
        r1.putExtra(EXTRA_WAKEFUL_INTENT, r2);
    }

    public static ComponentName startWakefulService(Context r3, Intent r4) {
        Object r02 = syncObject;
        monitor-enter(r02);
        checkAndInitWakeLock(r3);     // Catch: Throwable -> L9
        boolean r1 = isWakefulIntent(r4);     // Catch: Throwable -> L9
        setAsWakefulIntent(r4, true);     // Catch: Throwable -> L9
        ComponentName r32 = r3.startService(r4);     // Catch: Throwable -> L9
        if (r32 == null) goto L7;
        if (r1 == true) goto L13;
        wakeLock.acquire(WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);     // Catch: Throwable -> L9
    L13:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r32;
    L7:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return null;
    L9:
        th = move-exception;
        throw th;
    }
}
