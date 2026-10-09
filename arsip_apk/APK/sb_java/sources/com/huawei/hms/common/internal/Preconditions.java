package com.huawei.hms.common.internal;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes6.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Cannot use constructor to make a new instance");
    }

    private static boolean a() {
        if (Looper.getMainLooper() != Looper.myLooper()) goto L6;
        return true;
    L6:
        return false;
    }

    public static void checkArgument(boolean r02, Object r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(String.valueOf(r1));
    }

    public static void checkHandlerThread(Handler r1) {
        checkHandlerThread(r1, "Must be called on the handler thread");
    }

    public static void checkMainThread(String r1) {
        if (a() == false) goto L6;
        return;
    L6:
        throw new IllegalStateException(r1);
    }

    public static void checkNotMainThread() {
        if (a() == true) goto L6;
        return;
    L6:
        throw new IllegalStateException("Must not be called on the main application thread");
    }

    public static <O> O checkNotNull(O r1) {
        if (r1 == null) goto L5;
        return r1;
    L5:
        throw new NullPointerException("must not refer to a null object");
    }

    public static void checkState(boolean r02, Object r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(String.valueOf(r1));
    }

    public static void checkHandlerThread(Handler r1, String r2) {
        if (Looper.myLooper() != r1.getLooper()) goto L6;
        return;
    L6:
        throw new IllegalStateException(r2);
    }

    public static <O> O checkNotNull(O r02, Object r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(String.valueOf(r1));
    }
}
