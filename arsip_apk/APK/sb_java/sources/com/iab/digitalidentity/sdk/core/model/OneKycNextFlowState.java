package com.iab.digitalidentity.sdk.core.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/OneKycNextFlowState;", "", "(Ljava/lang/String;I)V", "BLOCKED", "DOCUMENT_CAPTURE", "STATUS", "CHALLENGE", "USER_DETAIL", "CONSENT", "FORM", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum OneKycNextFlowState extends Enum<OneKycNextFlowState> {
    private static final /* synthetic */ OneKycNextFlowState[] $VALUES = null;
    public static final OneKycNextFlowState BLOCKED = null;
    public static final OneKycNextFlowState CHALLENGE = null;
    public static final OneKycNextFlowState CONSENT = null;
    public static final OneKycNextFlowState DOCUMENT_CAPTURE = null;
    public static final OneKycNextFlowState FORM = null;
    public static final OneKycNextFlowState STATUS = null;
    public static final OneKycNextFlowState USER_DETAIL = null;

    private static final /* synthetic */ OneKycNextFlowState[] $values() {
        return new OneKycNextFlowState[]{BLOCKED, DOCUMENT_CAPTURE, STATUS, CHALLENGE, USER_DETAIL, CONSENT, FORM};
    }

    static {
        BLOCKED = new OneKycNextFlowState("BLOCKED", 0);
        DOCUMENT_CAPTURE = new OneKycNextFlowState("DOCUMENT_CAPTURE", 1);
        STATUS = new OneKycNextFlowState("STATUS", 2);
        CHALLENGE = new OneKycNextFlowState("CHALLENGE", 3);
        USER_DETAIL = new OneKycNextFlowState("USER_DETAIL", 4);
        CONSENT = new OneKycNextFlowState("CONSENT", 5);
        FORM = new OneKycNextFlowState("FORM", 6);
        $VALUES = $values();
    }

    OneKycNextFlowState(String r1, int r2) {
    }

    public static OneKycNextFlowState valueOf(String r1) {
        return (OneKycNextFlowState) Enum.valueOf(OneKycNextFlowState.class, r1);
    }

    public static OneKycNextFlowState[] values() {
        return (OneKycNextFlowState[]) $VALUES.clone();
    }
}
