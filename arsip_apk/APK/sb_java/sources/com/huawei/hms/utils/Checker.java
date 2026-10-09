package com.huawei.hms.utils;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class Checker {
    private Checker() {
    }

    public static void assertHandlerThread(Handler r1) {
        assertHandlerThread(r1, "Must be called on the handler thread");
    }

    public static void assertNonEmpty(String r1) {
        if (TextUtils.isEmpty(r1) == true) goto L6;
        return;
    L6:
        throw new IllegalStateException("Given String is empty or null");
    }

    public static <T> T assertNonNull(T r1) {
        if (r1 == null) goto L5;
        return r1;
    L5:
        throw new NullPointerException("Null reference");
    }

    public static void assertNotUiThread(String r2) {
        if (Looper.myLooper() == Looper.getMainLooper()) goto L6;
        return;
    L6:
        throw new IllegalStateException(r2);
    }

    public static void assertUiThread(String r2) {
        if (Looper.myLooper() != Looper.getMainLooper()) goto L6;
        return;
    L6:
        throw new IllegalStateException(r2);
    }

    public static String checkNonEmpty(String r1) {
        if (TextUtils.isEmpty(r1) == true) goto L6;
        return r1;
    L6:
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static <T> T checkNonNull(T r1) {
        if (r1 == null) goto L5;
        return r1;
    L5:
        throw new NullPointerException("Null reference");
    }

    public static int checkNonZero(int r1) {
        if (r1 == 0) goto L5;
        return r1;
    L5:
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static long checkNotZero(long r2) {
        if (r2 == 0) goto L6;
        return r2;
    L6:
        throw new IllegalArgumentException("Given Long is zero");
    }

    public static void assertHandlerThread(Handler r1, String r2) {
        if (Looper.myLooper() != r1.getLooper()) goto L6;
        return;
    L6:
        throw new IllegalStateException(r2);
    }

    public static <T> T assertNonNull(T r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(String.valueOf(r1));
    }

    public static <T> T checkNonNull(T r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(String.valueOf(r1));
    }

    public static int checkNonZero(int r02, String r1) {
        if (r02 == 0) goto L5;
        return r02;
    L5:
        throw new IllegalArgumentException(String.valueOf(r1));
    }

    public static long checkNotZero(long r2, String r4) {
        if (r2 == 0) goto L6;
        return r2;
    L6:
        throw new IllegalArgumentException(String.valueOf(r4));
    }

    public static void assertNonEmpty(String r02, String r1) {
        if (TextUtils.isEmpty(r02) == true) goto L6;
        return;
    L6:
        throw new IllegalStateException(String.valueOf(r1));
    }

    public static String checkNonEmpty(String r1, String r2) {
        if (TextUtils.isEmpty(r1) == true) goto L6;
        return r1;
    L6:
        throw new IllegalArgumentException(String.valueOf(r2));
    }
}
