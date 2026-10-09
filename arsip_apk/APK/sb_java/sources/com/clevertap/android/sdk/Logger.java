package com.clevertap.android.sdk;

import android.util.Log;
import com.clevertap.android.sdk.CleverTapAPI;

/* loaded from: classes4.dex */
public final class Logger implements g0 {
    private int debugLevel;

    public Logger(int r1) {
        this.debugLevel = r1;
    }

    public static void d(String r2) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.d(Constants.CLEVERTAP_LOG_TAG, r2);
        return;
    }

    private int getDebugLevel() {
        return this.debugLevel;
    }

    private static int getStaticDebugLevel() {
        return CleverTapAPI.G();
    }

    public static void i(String r2) {
        if (getStaticDebugLevel() < CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.i(Constants.CLEVERTAP_LOG_TAG, r2);
        return;
    }

    public static void v(String r2) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.DEBUG.intValue()) goto L6;
        Log.v(Constants.CLEVERTAP_LOG_TAG, r2);
        return;
    }

    public void debug(String r3) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.d(Constants.CLEVERTAP_LOG_TAG, r3);
        return;
    }

    @Override // com.clevertap.android.sdk.g0
    public void info(String r3) {
        if (getDebugLevel() < CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.i(Constants.CLEVERTAP_LOG_TAG, r3);
        return;
    }

    public void setDebugLevel(int r1) {
        this.debugLevel = r1;
    }

    @Override // com.clevertap.android.sdk.g0
    public void verbose(String r3) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.DEBUG.intValue()) goto L6;
        Log.v(Constants.CLEVERTAP_LOG_TAG, r3);
        return;
    }

    public static void d(String r2, String r3) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.d("CleverTap:" + r2, r3);
        return;
    }

    public static void i(String r2, String r3) {
        if (getStaticDebugLevel() < CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.i("CleverTap:" + r2, r3);
        return;
    }

    public static void v(String r2, String r3) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.DEBUG.intValue()) goto L6;
        Log.v("CleverTap:" + r2, r3);
        return;
    }

    @Override // com.clevertap.android.sdk.g0
    public void debug(String r4, String r5) {
        if (getStaticDebugLevel() > CleverTapAPI.LogLevel.INFO.intValue()) goto L5;
        return;
    L5:
        if (r5.length() <= 4000) goto L8;
        Log.d("CleverTap:" + r4, r5.substring(0, 4000));
        debug(r4, r5.substring(4000));
        return;
    L8:
        Log.d("CleverTap:" + r4, r5);
    }

    @Override // com.clevertap.android.sdk.g0
    public void info(String r3, String r4) {
        if (getDebugLevel() < CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.i("CleverTap:" + r3, r4);
        return;
    }

    @Override // com.clevertap.android.sdk.g0
    public void verbose(String r4, String r5) {
        if (getStaticDebugLevel() > CleverTapAPI.LogLevel.DEBUG.intValue()) goto L5;
        return;
    L5:
        if (r5.length() <= 4000) goto L8;
        Log.v("CleverTap:" + r4, r5.substring(0, 4000));
        verbose(r4, r5.substring(4000));
        return;
    L8:
        Log.v("CleverTap:" + r4, r5);
    }

    public static void d(String r2, String r3, Throwable r4) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.d("CleverTap:" + r2, r3, r4);
        return;
    }

    public static void i(String r2, String r3, Throwable r4) {
        if (getStaticDebugLevel() < CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.i("CleverTap:" + r2, r3, r4);
        return;
    }

    public static void v(String r2, String r3, Throwable r4) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.DEBUG.intValue()) goto L6;
        Log.v("CleverTap:" + r2, r3, r4);
        return;
    }

    public void info(String r3, String r4, Throwable r5) {
        if (getDebugLevel() < CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.i("CleverTap:" + r3, r4, r5);
        return;
    }

    public static void d(String r2, Throwable r3) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.d(Constants.CLEVERTAP_LOG_TAG, r2, r3);
        return;
    }

    public static void i(String r2, Throwable r3) {
        if (getStaticDebugLevel() < CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.i(Constants.CLEVERTAP_LOG_TAG, r2, r3);
        return;
    }

    public static void v(String r2, Throwable r3) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.DEBUG.intValue()) goto L6;
        Log.v(Constants.CLEVERTAP_LOG_TAG, r2, r3);
        return;
    }

    public void info(String r3, Throwable r4) {
        if (getDebugLevel() < CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.i(Constants.CLEVERTAP_LOG_TAG, r3, r4);
        return;
    }

    @Override // com.clevertap.android.sdk.g0
    public void debug(String r3, String r4, Throwable r5) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.d("CleverTap:" + r3, r4, r5);
        return;
    }

    @Override // com.clevertap.android.sdk.g0
    public void verbose(String r3, String r4, Throwable r5) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.DEBUG.intValue()) goto L6;
        Log.v("CleverTap:" + r3, r4, r5);
        return;
    }

    public void debug(String r3, Throwable r4) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.INFO.intValue()) goto L6;
        Log.d(Constants.CLEVERTAP_LOG_TAG, r3, r4);
        return;
    }

    public void verbose(String r3, Throwable r4) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.DEBUG.intValue()) goto L6;
        Log.v(Constants.CLEVERTAP_LOG_TAG, r3, r4);
        return;
    }
}
