package com.google.firebase.appcheck.internal.util;

import android.util.Log;

/* loaded from: classes6.dex */
public class Logger {
    static final Logger DEFAULT_LOGGER = null;
    public static final String TAG = "FirebaseAppCheck";
    private int logLevel;
    private final String tag;

    static {
        DEFAULT_LOGGER = new Logger(TAG);
    }

    public Logger(String r1) {
        this.tag = r1;
        this.logLevel = 4;
    }

    private boolean canLog(int r2) {
        if (this.logLevel > r2) goto L5;
        return true;
    L5:
        if (Log.isLoggable(this.tag, r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    public void d(String r2, Throwable r3) {
        if (canLog(3) == false) goto L6;
        Log.d(this.tag, r2, r3);
        return;
    }

    public void e(String r2, Throwable r3) {
        if (canLog(6) == false) goto L6;
        Log.e(this.tag, r2, r3);
        return;
    }

    public void i(String r2, Throwable r3) {
        if (canLog(4) == false) goto L6;
        Log.i(this.tag, r2, r3);
        return;
    }

    public void log(int r2, String r3) {
        log(r2, r3, false);
    }

    public void v(String r2, Throwable r3) {
        if (canLog(2) == false) goto L6;
        Log.v(this.tag, r2, r3);
        return;
    }

    public void w(String r2, Throwable r3) {
        if (canLog(5) == false) goto L6;
        Log.w(this.tag, r2, r3);
        return;
    }

    public void log(int r1, String r2, boolean r3) {
        if (r3 == false) goto L4;
    L7:
        Log.println(r1, this.tag, r2);
        return;
    L4:
        if (canLog(r1) == true) goto L7;
    }

    public void d(String r2) {
        d(r2, null);
    }

    public void e(String r2) {
        e(r2, null);
    }

    public void i(String r2) {
        i(r2, null);
    }

    public void v(String r2) {
        v(r2, null);
    }

    public void w(String r2) {
        w(r2, null);
    }
}
