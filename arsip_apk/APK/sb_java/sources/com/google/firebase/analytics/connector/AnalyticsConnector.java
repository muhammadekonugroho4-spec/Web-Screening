package com.google.firebase.analytics.connector;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.annotations.DeferredApi;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public interface AnalyticsConnector {

    @KeepForSdk
    public interface AnalyticsConnectorHandle {
        @KeepForSdk
        void registerEventNames(Set<String> r1);

        @KeepForSdk
        void unregister();

        @KeepForSdk
        void unregisterEventNames();
    }

    @KeepForSdk
    public interface AnalyticsConnectorListener {
        @KeepForSdk
        void onMessageTriggered(int r1, Bundle r2);
    }

    @KeepForSdk
    public static class ConditionalUserProperty {

        @KeepForSdk
        public boolean active;

        @KeepForSdk
        public long creationTimestamp;

        @KeepForSdk
        public String expiredEventName;

        @KeepForSdk
        public Bundle expiredEventParams;

        @KeepForSdk
        public String name;

        @KeepForSdk
        public String origin;

        @KeepForSdk
        public long timeToLive;

        @KeepForSdk
        public String timedOutEventName;

        @KeepForSdk
        public Bundle timedOutEventParams;

        @KeepForSdk
        public String triggerEventName;

        @KeepForSdk
        public long triggerTimeout;

        @KeepForSdk
        public String triggeredEventName;

        @KeepForSdk
        public Bundle triggeredEventParams;

        @KeepForSdk
        public long triggeredTimestamp;

        @KeepForSdk
        public Object value;

        public ConditionalUserProperty() {
        }
    }

    @KeepForSdk
    void clearConditionalUserProperty(String r1, String r2, Bundle r3);

    @KeepForSdk
    List<ConditionalUserProperty> getConditionalUserProperties(String r1, String r2);

    @KeepForSdk
    int getMaxUserProperties(String r1);

    @KeepForSdk
    Map<String, Object> getUserProperties(boolean r1);

    @KeepForSdk
    void logEvent(String r1, String r2, Bundle r3);

    @KeepForSdk
    @DeferredApi
    AnalyticsConnectorHandle registerAnalyticsConnectorListener(String r1, AnalyticsConnectorListener r2);

    @KeepForSdk
    void setConditionalUserProperty(ConditionalUserProperty r1);

    @KeepForSdk
    void setUserProperty(String r1, String r2, Object r3);
}
