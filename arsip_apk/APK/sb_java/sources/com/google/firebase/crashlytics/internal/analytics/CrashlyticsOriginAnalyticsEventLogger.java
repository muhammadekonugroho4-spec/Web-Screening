package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* loaded from: classes6.dex */
public class CrashlyticsOriginAnalyticsEventLogger implements AnalyticsEventLogger {
    static final String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = "clx";
    private final AnalyticsConnector analyticsConnector;

    public CrashlyticsOriginAnalyticsEventLogger(AnalyticsConnector r1) {
        this.analyticsConnector = r1;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(String r3, Bundle r4) {
        this.analyticsConnector.logEvent(FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS, r3, r4);
    }
}
