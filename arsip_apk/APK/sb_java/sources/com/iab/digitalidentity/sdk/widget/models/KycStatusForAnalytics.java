package com.iab.digitalidentity.sdk.widget.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/iab/digitalidentity/sdk/widget/models/KycStatusForAnalytics;", "", "(Ljava/lang/String;I)V", "UPLOADING", "EDD_TRIGGER", "PENDING_TIMER", "PENDING_TIMER_EXHAUSTED", "FAILURE", "SUCCESS", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum KycStatusForAnalytics extends Enum<KycStatusForAnalytics> {
    private static final /* synthetic */ KycStatusForAnalytics[] $VALUES = null;
    public static final KycStatusForAnalytics EDD_TRIGGER = null;
    public static final KycStatusForAnalytics FAILURE = null;
    public static final KycStatusForAnalytics PENDING_TIMER = null;
    public static final KycStatusForAnalytics PENDING_TIMER_EXHAUSTED = null;
    public static final KycStatusForAnalytics SUCCESS = null;
    public static final KycStatusForAnalytics UPLOADING = null;

    private static final /* synthetic */ KycStatusForAnalytics[] $values() {
        return new KycStatusForAnalytics[]{UPLOADING, EDD_TRIGGER, PENDING_TIMER, PENDING_TIMER_EXHAUSTED, FAILURE, SUCCESS};
    }

    static {
        UPLOADING = new KycStatusForAnalytics("UPLOADING", 0);
        EDD_TRIGGER = new KycStatusForAnalytics("EDD_TRIGGER", 1);
        PENDING_TIMER = new KycStatusForAnalytics("PENDING_TIMER", 2);
        PENDING_TIMER_EXHAUSTED = new KycStatusForAnalytics("PENDING_TIMER_EXHAUSTED", 3);
        FAILURE = new KycStatusForAnalytics("FAILURE", 4);
        SUCCESS = new KycStatusForAnalytics("SUCCESS", 5);
        $VALUES = $values();
    }

    KycStatusForAnalytics(String r1, int r2) {
    }

    public static KycStatusForAnalytics valueOf(String r1) {
        return (KycStatusForAnalytics) Enum.valueOf(KycStatusForAnalytics.class, r1);
    }

    public static KycStatusForAnalytics[] values() {
        return (KycStatusForAnalytics[]) $VALUES.clone();
    }
}
