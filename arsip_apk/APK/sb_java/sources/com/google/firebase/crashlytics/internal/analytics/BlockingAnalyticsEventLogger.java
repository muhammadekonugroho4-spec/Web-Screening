package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class BlockingAnalyticsEventLogger implements AnalyticsEventReceiver, AnalyticsEventLogger {
    static final String APP_EXCEPTION_EVENT_NAME = "_ae";
    private final CrashlyticsOriginAnalyticsEventLogger baseAnalyticsEventLogger;
    private boolean callbackReceived;
    private CountDownLatch eventLatch;
    private final Object latchLock;
    private final TimeUnit timeUnit;
    private final int timeout;

    public BlockingAnalyticsEventLogger(CrashlyticsOriginAnalyticsEventLogger r2, int r3, TimeUnit r4) {
        this.latchLock = new Object();
        this.callbackReceived = false;
        this.baseAnalyticsEventLogger = r2;
        this.timeout = r3;
        this.timeUnit = r4;
    }

    public boolean isCallbackReceived() {
        return this.callbackReceived;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(String r6, Bundle r7) {
        Object r02 = this.latchLock;
        monitor-enter(r02);
        Logger.getLogger().v("Logging event " + r6 + " to Firebase Analytics with params " + r7);     // Catch: Throwable -> L8
        this.eventLatch = new CountDownLatch(1);     // Catch: Throwable -> L8
        this.callbackReceived = false;     // Catch: Throwable -> L8
        this.baseAnalyticsEventLogger.logEvent(r6, r7);     // Catch: Throwable -> L8
        Logger.getLogger().v("Awaiting app exception callback from Analytics...");     // Catch: Throwable -> L8
    L12:
        Logger.getLogger().e("Interrupted while awaiting app exception callback from Analytics listener.");     // Catch: Throwable -> L8
    L13:
        this.eventLatch = null;     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L6:
        if (this.eventLatch.await(this.timeout, this.timeUnit) == false) goto L10;
        this.callbackReceived = true;     // Catch: Throwable -> L8 InterruptedException -> L12
        Logger.getLogger().v("App exception callback received from Analytics listener.");     // Catch: Throwable -> L8 InterruptedException -> L12
    L18:
    L10:
        Logger.getLogger().w("Timeout exceeded while awaiting app exception callback from Analytics listener.");     // Catch: Throwable -> L8 InterruptedException -> L12
    L8:
        th = move-exception;
        throw th;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(String r2, Bundle r3) {
        CountDownLatch r32 = this.eventLatch;
        if (r32 != null) goto L6;
        return;
    L6:
        if (APP_EXCEPTION_EVENT_NAME.equals(r2) == false) goto L9;
        r32.countDown();
        return;
    }
}
