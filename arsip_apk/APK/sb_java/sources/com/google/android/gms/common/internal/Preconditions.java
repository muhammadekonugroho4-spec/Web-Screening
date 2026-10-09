package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkArgument(boolean r02) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException();
    }

    @KeepForSdk
    public static double checkArgumentInRange(double r1, double r3, double r5, String r7) {
        if (r1 < r3) goto L10;
        if (r1 > r5) goto L8;
        return r1;
    L8:
        throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", new Object[]{r7, Double.valueOf(r3), Double.valueOf(r5)}));
    L10:
        throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", new Object[]{r7, Double.valueOf(r3), Double.valueOf(r5)}));
    }

    @KeepForSdk
    public static void checkHandlerThread(Handler r4) {
        Looper r02 = Looper.myLooper();
        if (r02 == r4.getLooper()) goto L9;
        if (r02 == null) goto L6;
        String r03 = r02.getThread().getName();
    L8:
        throw new IllegalStateException("Must be called on " + r4.getLooper().getThread().getName() + " thread, but got " + r03 + ".");
    L6:
        r03 = "null current looper";
        goto L8
    }

    @KeepForSdk
    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    @KeepForSdk
    public static String checkNotEmpty(String r1) {
        if (TextUtils.isEmpty(r1) == true) goto L6;
        return r1;
    L6:
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread() {
        checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
    }

    @KeepForSdk
    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    @KeepForSdk
    public static <T> T checkNotNull(T r1) {
        if (r1 == null) goto L5;
        return r1;
    L5:
        throw new NullPointerException("null reference");
    }

    @KeepForSdk
    public static int checkNotZero(int r1) {
        if (r1 == 0) goto L5;
        return r1;
    L5:
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @KeepForSdk
    public static void checkState(boolean r02) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException();
    }

    public static String zza(String r7, Object... r8) {
        StringBuilder r1 = new StringBuilder(r7.length() + 48);
        int r02 = 0;
        int r2 = 0;
    L4:
        if (r02 >= 3) goto L9;
        int r4 = r7.indexOf("%s", r2);
        if (r4 == (-1)) goto L9;
        r1.append(r7.substring(r2, r4));
        r1.append(r8[r02]);
        r2 = r4 + 2;
        r02 = r02 + 1;
    L9:
        r1.append(r7.substring(r2));
        if (r02 >= 3) goto L16;
        r1.append(" [");
        int r72 = r02 + 1;
        r1.append(r8[r02]);
    L12:
        if (r72 >= 3) goto L14;
        r1.append(", ");
        r1.append(r8[r72]);
        r72 = r72 + 1;
        goto L12
    L14:
        r1.append(com.clevertap.android.sdk.Constants.AES_SUFFIX);
    L16:
        return r1.toString();
    }

    @KeepForSdk
    public static void checkArgument(boolean r02, Object r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(String.valueOf(r1));
    }

    @KeepForSdk
    public static void checkMainThread(String r1) {
        if (com.google.android.gms.common.util.zzd.zza() == false) goto L6;
        return;
    L6:
        throw new IllegalStateException(r1);
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread(String r2) {
        Looper r02 = Looper.myLooper();
        if (r02 != null) goto L5;
        return;
    L5:
        if (java.util.Objects.equals(r02.getThread().getName(), "GoogleApiHandler") == true) goto L8;
        return;
    L8:
        throw new IllegalStateException(r2);
    }

    @KeepForSdk
    public static void checkNotMainThread(String r1) {
        if (com.google.android.gms.common.util.zzd.zza() == true) goto L6;
        return;
    L6:
        throw new IllegalStateException(r1);
    }

    @KeepForSdk
    public static <T> T checkNotNull(T r02, Object r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(String.valueOf(r1));
    }

    @KeepForSdk
    public static int checkNotZero(int r02, Object r1) {
        if (r02 == 0) goto L5;
        return r02;
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

    @KeepForSdk
    public static void checkArgument(boolean r02, String r1, Object... r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(String.format(r1, r2));
    }

    @KeepForSdk
    public static String checkNotEmpty(String r1, Object r2) {
        if (TextUtils.isEmpty(r1) == true) goto L6;
        return r1;
    L6:
        throw new IllegalArgumentException(String.valueOf(r2));
    }

    @KeepForSdk
    public static long checkNotZero(long r2) {
        if (r2 == 0) goto L6;
        return r2;
    L6:
        throw new IllegalArgumentException("Given Long is zero");
    }

    @KeepForSdk
    public static void checkState(boolean r02, String r1, Object... r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(String.format(r1, r2));
    }

    @KeepForSdk
    public static float checkArgumentInRange(float r1, float r2, float r3, String r4) {
        if (r1 < r2) goto L10;
        if (r1 > r3) goto L8;
        return r1;
    L8:
        throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", new Object[]{r4, Float.valueOf(r2), Float.valueOf(r3)}));
    L10:
        throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", new Object[]{r4, Float.valueOf(r2), Float.valueOf(r3)}));
    }

    @KeepForSdk
    public static long checkNotZero(long r2, Object r4) {
        if (r2 == 0) goto L6;
        return r2;
    L6:
        throw new IllegalArgumentException(String.valueOf(r4));
    }

    @KeepForSdk
    public static int checkArgumentInRange(int r02, int r1, int r2, String r3) {
        if (r02 < r1) goto L8;
        if (r02 > r2) goto L6;
        return r02;
    L6:
        throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", new Object[]{r3, Integer.valueOf(r1), Integer.valueOf(r2)}));
    L8:
        throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", new Object[]{r3, Integer.valueOf(r1), Integer.valueOf(r2)}));
    }

    @KeepForSdk
    public static void checkHandlerThread(Handler r1, String r2) {
        if (Looper.myLooper() != r1.getLooper()) goto L6;
        return;
    L6:
        throw new IllegalStateException(r2);
    }

    @KeepForSdk
    public static long checkArgumentInRange(long r1, long r3, long r5, String r7) {
        if (r1 < r3) goto L10;
        if (r1 > r5) goto L8;
        return r1;
    L8:
        throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", new Object[]{r7, Long.valueOf(r3), Long.valueOf(r5)}));
    L10:
        throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", new Object[]{r7, Long.valueOf(r3), Long.valueOf(r5)}));
    }
}
