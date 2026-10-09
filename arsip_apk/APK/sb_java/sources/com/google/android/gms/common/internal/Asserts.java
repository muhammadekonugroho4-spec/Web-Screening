package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkMainThread(String r4) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L5;
        return;
    L5:
        Log.e("Asserts", "checkMainThread: current thread " + String.valueOf(Thread.currentThread()) + " IS NOT the main thread " + String.valueOf(Looper.getMainLooper().getThread()) + "!");
        throw new IllegalStateException(r4);
    }

    @KeepForSdk
    public static void checkNotMainThread(String r4) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) goto L5;
        return;
    L5:
        Log.e("Asserts", "checkNotMainThread: current thread " + String.valueOf(Thread.currentThread()) + " IS the main thread " + String.valueOf(Looper.getMainLooper().getThread()) + "!");
        throw new IllegalStateException(r4);
    }

    @KeepForSdk
    public static void checkNotNull(Object r1) {
        if (r1 == null) goto L5;
        return;
    L5:
        throw new IllegalArgumentException("null reference");
    }

    @KeepForSdk
    public static void checkNull(Object r1) {
        if (r1 != null) goto L5;
        return;
    L5:
        throw new IllegalArgumentException("non-null reference");
    }

    @KeepForSdk
    public static void checkState(boolean r02) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException();
    }

    @KeepForSdk
    public static void checkNotNull(Object r02, Object r1) {
        if (r02 == null) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(String.valueOf(r1));
    }

    @KeepForSdk
    public static void checkNull(Object r02, Object r1) {
        if (r02 != null) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(String.valueOf(r1));
    }

    @KeepForSdk
    public static void checkState(boolean r02, Object r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(String.valueOf(r1));
    }
}
