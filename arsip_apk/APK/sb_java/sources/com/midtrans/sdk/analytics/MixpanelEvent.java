package com.midtrans.sdk.analytics;

/* loaded from: classes6.dex */
public class MixpanelEvent {
    private String event;
    private MixpanelProperties properties;

    public MixpanelEvent() {
    }

    public String getEvent() {
        return this.event;
    }

    public MixpanelProperties getProperties() {
        return this.properties;
    }

    public void setEvent(String r1) {
        this.event = r1;
    }

    public void setProperties(MixpanelProperties r1) {
        this.properties = r1;
    }
}
