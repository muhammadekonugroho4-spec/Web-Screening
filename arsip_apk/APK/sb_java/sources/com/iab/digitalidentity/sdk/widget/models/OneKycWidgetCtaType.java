package com.iab.digitalidentity.sdk.widget.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/iab/digitalidentity/sdk/widget/models/OneKycWidgetCtaType;", "", "(Ljava/lang/String;I)V", "LAUNCH_HELP", "LAUNCH_KYC", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum OneKycWidgetCtaType extends Enum<OneKycWidgetCtaType> {
    private static final /* synthetic */ OneKycWidgetCtaType[] $VALUES = null;
    public static final OneKycWidgetCtaType LAUNCH_HELP = null;
    public static final OneKycWidgetCtaType LAUNCH_KYC = null;

    private static final /* synthetic */ OneKycWidgetCtaType[] $values() {
        return new OneKycWidgetCtaType[]{LAUNCH_HELP, LAUNCH_KYC};
    }

    static {
        LAUNCH_HELP = new OneKycWidgetCtaType("LAUNCH_HELP", 0);
        LAUNCH_KYC = new OneKycWidgetCtaType("LAUNCH_KYC", 1);
        $VALUES = $values();
    }

    OneKycWidgetCtaType(String r1, int r2) {
    }

    public static OneKycWidgetCtaType valueOf(String r1) {
        return (OneKycWidgetCtaType) Enum.valueOf(OneKycWidgetCtaType.class, r1);
    }

    public static OneKycWidgetCtaType[] values() {
        return (OneKycWidgetCtaType[]) $VALUES.clone();
    }
}
