package com.google.firebase.perf.logging;

import android.util.Log;

/* loaded from: classes6.dex */
class LogWrapper {
    private static final String LOG_TAG = "FirebasePerformance";
    private static LogWrapper instance;

    private LogWrapper() {
    }

    public static synchronized LogWrapper getInstance() {
        monitor-enter(LogWrapper.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (instance != null) goto L9;
        instance = new LogWrapper();     // Catch: Throwable -> L7
    L9:
        LogWrapper r1 = instance;     // Catch: Throwable -> L7
        monitor-exit(LogWrapper.class);
        return r1;
    }

    public void d(String r2) {
        Log.d(LOG_TAG, r2);
    }

    public void e(String r2) {
        Log.e(LOG_TAG, r2);
    }

    public void i(String r2) {
        Log.i(LOG_TAG, r2);
    }

    public void v(String r2) {
        Log.v(LOG_TAG, r2);
    }

    public void w(String r2) {
        Log.w(LOG_TAG, r2);
    }
}
