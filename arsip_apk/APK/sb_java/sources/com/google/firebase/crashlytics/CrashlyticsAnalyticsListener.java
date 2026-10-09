package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import java.util.Locale;

/* loaded from: classes6.dex */
class CrashlyticsAnalyticsListener implements AnalyticsConnector.AnalyticsConnectorListener {
    static final String CRASHLYTICS_ORIGIN = "clx";
    static final String EVENT_NAME_KEY = "name";
    static final String EVENT_ORIGIN_KEY = "_o";
    static final String EVENT_PARAMS_KEY = "params";
    private AnalyticsEventReceiver breadcrumbEventReceiver;
    private AnalyticsEventReceiver crashlyticsOriginEventReceiver;

    public CrashlyticsAnalyticsListener() {
    }

    private static void notifyEventReceiver(AnalyticsEventReceiver r02, String r1, Bundle r2) {
        if (r02 != null) goto L4;
        return;
    L4:
        r02.onEvent(r1, r2);
    }

    private void notifyEventReceivers(String r3, Bundle r4) {
        if (CRASHLYTICS_ORIGIN.equals(r4.getString(EVENT_ORIGIN_KEY)) == false) goto L5;
        AnalyticsEventReceiver r02 = this.crashlyticsOriginEventReceiver;
    L6:
        notifyEventReceiver(r02, r3, r4);
        return;
    L5:
        r02 = this.breadcrumbEventReceiver;
        goto L6
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public void onMessageTriggered(int r4, Bundle r5) {
        Logger.getLogger().v(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(r4), r5}));
        if (r5 == null) goto L13;
        String r42 = r5.getString("name");
        if (r42 == null) goto L12;
        Bundle r52 = r5.getBundle(EVENT_PARAMS_KEY);
        if (r52 != null) goto L10;
        r52 = new Bundle();
    L10:
        notifyEventReceivers(r42, r52);
        return;
    L12:
        return;
    }

    public void setBreadcrumbEventReceiver(AnalyticsEventReceiver r1) {
        this.breadcrumbEventReceiver = r1;
    }

    public void setCrashlyticsOriginEventReceiver(AnalyticsEventReceiver r1) {
        this.crashlyticsOriginEventReceiver = r1;
    }
}
