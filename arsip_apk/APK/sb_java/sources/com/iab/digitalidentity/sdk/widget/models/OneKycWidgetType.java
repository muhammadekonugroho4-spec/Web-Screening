package com.iab.digitalidentity.sdk.widget.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/iab/digitalidentity/sdk/widget/models/OneKycWidgetType;", "", "(Ljava/lang/String;I)V", "AWAITING_IDENTITY_APPROVAL", "AWAITING_PARTNER_APPROVAL", "IDENTITY_REJECTED", "PARTNER_REJECTED", "APPROVED", "DEFAULT", "RESUME", "UPLOAD_FAILED", "NETWORK_ERROR", "SERVER_ERROR", "LOADING", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum OneKycWidgetType extends Enum<OneKycWidgetType> {
    private static final /* synthetic */ OneKycWidgetType[] $VALUES = null;
    public static final OneKycWidgetType APPROVED = null;
    public static final OneKycWidgetType AWAITING_IDENTITY_APPROVAL = null;
    public static final OneKycWidgetType AWAITING_PARTNER_APPROVAL = null;
    public static final OneKycWidgetType DEFAULT = null;
    public static final OneKycWidgetType IDENTITY_REJECTED = null;
    public static final OneKycWidgetType LOADING = null;
    public static final OneKycWidgetType NETWORK_ERROR = null;
    public static final OneKycWidgetType PARTNER_REJECTED = null;
    public static final OneKycWidgetType RESUME = null;
    public static final OneKycWidgetType SERVER_ERROR = null;
    public static final OneKycWidgetType UPLOAD_FAILED = null;

    private static final /* synthetic */ OneKycWidgetType[] $values() {
        return new OneKycWidgetType[]{AWAITING_IDENTITY_APPROVAL, AWAITING_PARTNER_APPROVAL, IDENTITY_REJECTED, PARTNER_REJECTED, APPROVED, DEFAULT, RESUME, UPLOAD_FAILED, NETWORK_ERROR, SERVER_ERROR, LOADING};
    }

    static {
        AWAITING_IDENTITY_APPROVAL = new OneKycWidgetType("AWAITING_IDENTITY_APPROVAL", 0);
        AWAITING_PARTNER_APPROVAL = new OneKycWidgetType("AWAITING_PARTNER_APPROVAL", 1);
        IDENTITY_REJECTED = new OneKycWidgetType("IDENTITY_REJECTED", 2);
        PARTNER_REJECTED = new OneKycWidgetType("PARTNER_REJECTED", 3);
        APPROVED = new OneKycWidgetType("APPROVED", 4);
        DEFAULT = new OneKycWidgetType("DEFAULT", 5);
        RESUME = new OneKycWidgetType("RESUME", 6);
        UPLOAD_FAILED = new OneKycWidgetType("UPLOAD_FAILED", 7);
        NETWORK_ERROR = new OneKycWidgetType("NETWORK_ERROR", 8);
        SERVER_ERROR = new OneKycWidgetType("SERVER_ERROR", 9);
        LOADING = new OneKycWidgetType("LOADING", 10);
        $VALUES = $values();
    }

    OneKycWidgetType(String r1, int r2) {
    }

    public static OneKycWidgetType valueOf(String r1) {
        return (OneKycWidgetType) Enum.valueOf(OneKycWidgetType.class, r1);
    }

    public static OneKycWidgetType[] values() {
        return (OneKycWidgetType[]) $VALUES.clone();
    }
}
