package com.iab.digitalidentity.sdk.widget.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/iab/digitalidentity/sdk/widget/models/GopayPlusWidgetCtaType;", "", "(Ljava/lang/String;I)V", "RETRY_KYC", "RETRY_UPLOAD", "GUIDELINE", "OK_GOT_IT", "HELP", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum GopayPlusWidgetCtaType extends Enum<GopayPlusWidgetCtaType> {
    private static final /* synthetic */ GopayPlusWidgetCtaType[] $VALUES = null;
    public static final GopayPlusWidgetCtaType GUIDELINE = null;
    public static final GopayPlusWidgetCtaType HELP = null;
    public static final GopayPlusWidgetCtaType OK_GOT_IT = null;
    public static final GopayPlusWidgetCtaType RETRY_KYC = null;
    public static final GopayPlusWidgetCtaType RETRY_UPLOAD = null;

    private static final /* synthetic */ GopayPlusWidgetCtaType[] $values() {
        return new GopayPlusWidgetCtaType[]{RETRY_KYC, RETRY_UPLOAD, GUIDELINE, OK_GOT_IT, HELP};
    }

    static {
        RETRY_KYC = new GopayPlusWidgetCtaType("RETRY_KYC", 0);
        RETRY_UPLOAD = new GopayPlusWidgetCtaType("RETRY_UPLOAD", 1);
        GUIDELINE = new GopayPlusWidgetCtaType("GUIDELINE", 2);
        OK_GOT_IT = new GopayPlusWidgetCtaType("OK_GOT_IT", 3);
        HELP = new GopayPlusWidgetCtaType("HELP", 4);
        $VALUES = $values();
    }

    GopayPlusWidgetCtaType(String r1, int r2) {
    }

    public static GopayPlusWidgetCtaType valueOf(String r1) {
        return (GopayPlusWidgetCtaType) Enum.valueOf(GopayPlusWidgetCtaType.class, r1);
    }

    public static GopayPlusWidgetCtaType[] values() {
        return (GopayPlusWidgetCtaType[]) $VALUES.clone();
    }
}
