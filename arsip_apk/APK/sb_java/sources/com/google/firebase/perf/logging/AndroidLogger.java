package com.google.firebase.perf.logging;

import java.util.Locale;

/* loaded from: classes6.dex */
public class AndroidLogger {
    private static volatile AndroidLogger instance;
    private boolean isLogcatEnabled;
    private final LogWrapper logWrapper;

    public AndroidLogger(LogWrapper r2) {
        this.isLogcatEnabled = false;
        if (r2 != null) goto L5;
        r2 = LogWrapper.getInstance();
    L5:
        this.logWrapper = r2;
    }

    public static AndroidLogger getInstance() {
        if (instance != null) goto L16;
        monitor-enter(AndroidLogger.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (instance != null) goto L11;
        instance = new AndroidLogger();     // Catch: Throwable -> L9
    L11:
        monitor-exit(AndroidLogger.class);     // Catch: Throwable -> L9
    L16:
        return instance;
    }

    public void debug(String r2) {
        if (this.isLogcatEnabled == false) goto L6;
        this.logWrapper.d(r2);
        return;
    }

    public void error(String r2) {
        if (this.isLogcatEnabled == false) goto L6;
        this.logWrapper.e(r2);
        return;
    }

    public void info(String r2) {
        if (this.isLogcatEnabled == false) goto L6;
        this.logWrapper.i(r2);
        return;
    }

    public boolean isLogcatEnabled() {
        return this.isLogcatEnabled;
    }

    public void setLogcatEnabled(boolean r1) {
        this.isLogcatEnabled = r1;
    }

    public void verbose(String r2) {
        if (this.isLogcatEnabled == false) goto L6;
        this.logWrapper.v(r2);
        return;
    }

    public void warn(String r2) {
        if (this.isLogcatEnabled == false) goto L6;
        this.logWrapper.w(r2);
        return;
    }

    public void debug(String r3, Object... r4) {
        if (this.isLogcatEnabled == false) goto L6;
        this.logWrapper.d(String.format(Locale.ENGLISH, r3, r4));
        return;
    }

    public void error(String r3, Object... r4) {
        if (this.isLogcatEnabled == false) goto L6;
        this.logWrapper.e(String.format(Locale.ENGLISH, r3, r4));
        return;
    }

    public void info(String r3, Object... r4) {
        if (this.isLogcatEnabled == false) goto L6;
        this.logWrapper.i(String.format(Locale.ENGLISH, r3, r4));
        return;
    }

    public void verbose(String r3, Object... r4) {
        if (this.isLogcatEnabled == false) goto L6;
        this.logWrapper.v(String.format(Locale.ENGLISH, r3, r4));
        return;
    }

    public void warn(String r3, Object... r4) {
        if (this.isLogcatEnabled == false) goto L6;
        this.logWrapper.w(String.format(Locale.ENGLISH, r3, r4));
        return;
    }

    private AndroidLogger() {
        this(null);
    }
}
