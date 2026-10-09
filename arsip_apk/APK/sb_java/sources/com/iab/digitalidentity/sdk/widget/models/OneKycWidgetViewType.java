package com.iab.digitalidentity.sdk.widget.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/iab/digitalidentity/sdk/widget/models/OneKycWidgetViewType;", "", "(Ljava/lang/String;I)V", "LOADING", "KYC_STATE_VIEW", "ERROR", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum OneKycWidgetViewType extends Enum<OneKycWidgetViewType> {
    private static final /* synthetic */ OneKycWidgetViewType[] $VALUES = null;
    public static final OneKycWidgetViewType ERROR = null;
    public static final OneKycWidgetViewType KYC_STATE_VIEW = null;
    public static final OneKycWidgetViewType LOADING = null;

    private static final /* synthetic */ OneKycWidgetViewType[] $values() {
        return new OneKycWidgetViewType[]{LOADING, KYC_STATE_VIEW, ERROR};
    }

    static {
        LOADING = new OneKycWidgetViewType("LOADING", 0);
        KYC_STATE_VIEW = new OneKycWidgetViewType("KYC_STATE_VIEW", 1);
        ERROR = new OneKycWidgetViewType("ERROR", 2);
        $VALUES = $values();
    }

    OneKycWidgetViewType(String r1, int r2) {
    }

    public static OneKycWidgetViewType valueOf(String r1) {
        return (OneKycWidgetViewType) Enum.valueOf(OneKycWidgetViewType.class, r1);
    }

    public static OneKycWidgetViewType[] values() {
        return (OneKycWidgetViewType[]) $VALUES.clone();
    }
}
