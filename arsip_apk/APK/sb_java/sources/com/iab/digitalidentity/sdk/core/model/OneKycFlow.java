package com.iab.digitalidentity.sdk.core.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/OneKycFlow;", "", "(Ljava/lang/String;I)V", "KTP_SCAN", "STANDALONE_LIVENESS", "FACE_VERIFICATION", "STANDALONE_IDENTITY_VERIFICATION", "KYC", "CHALLENGE", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum OneKycFlow extends Enum<OneKycFlow> {
    private static final /* synthetic */ OneKycFlow[] $VALUES = null;
    public static final OneKycFlow CHALLENGE = null;
    public static final OneKycFlow FACE_VERIFICATION = null;
    public static final OneKycFlow KTP_SCAN = null;
    public static final OneKycFlow KYC = null;
    public static final OneKycFlow STANDALONE_IDENTITY_VERIFICATION = null;
    public static final OneKycFlow STANDALONE_LIVENESS = null;

    private static final /* synthetic */ OneKycFlow[] $values() {
        return new OneKycFlow[]{KTP_SCAN, STANDALONE_LIVENESS, FACE_VERIFICATION, STANDALONE_IDENTITY_VERIFICATION, KYC, CHALLENGE};
    }

    static {
        KTP_SCAN = new OneKycFlow("KTP_SCAN", 0);
        STANDALONE_LIVENESS = new OneKycFlow("STANDALONE_LIVENESS", 1);
        FACE_VERIFICATION = new OneKycFlow("FACE_VERIFICATION", 2);
        STANDALONE_IDENTITY_VERIFICATION = new OneKycFlow("STANDALONE_IDENTITY_VERIFICATION", 3);
        KYC = new OneKycFlow("KYC", 4);
        CHALLENGE = new OneKycFlow("CHALLENGE", 5);
        $VALUES = $values();
    }

    OneKycFlow(String r1, int r2) {
    }

    public static OneKycFlow valueOf(String r1) {
        return (OneKycFlow) Enum.valueOf(OneKycFlow.class, r1);
    }

    public static OneKycFlow[] values() {
        return (OneKycFlow[]) $VALUES.clone();
    }
}
