package com.iab.digitalidentity.sdk.core.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/UnifiedKycFlowType;", "", "(Ljava/lang/String;I)V", "PROGRESSIVE", "NON_PROGRESSIVE", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum UnifiedKycFlowType extends Enum<UnifiedKycFlowType> {
    private static final /* synthetic */ UnifiedKycFlowType[] $VALUES = null;
    public static final UnifiedKycFlowType NON_PROGRESSIVE = null;
    public static final UnifiedKycFlowType PROGRESSIVE = null;

    private static final /* synthetic */ UnifiedKycFlowType[] $values() {
        return new UnifiedKycFlowType[]{PROGRESSIVE, NON_PROGRESSIVE};
    }

    static {
        PROGRESSIVE = new UnifiedKycFlowType("PROGRESSIVE", 0);
        NON_PROGRESSIVE = new UnifiedKycFlowType("NON_PROGRESSIVE", 1);
        $VALUES = $values();
    }

    UnifiedKycFlowType(String r1, int r2) {
    }

    public static UnifiedKycFlowType valueOf(String r1) {
        return (UnifiedKycFlowType) Enum.valueOf(UnifiedKycFlowType.class, r1);
    }

    public static UnifiedKycFlowType[] values() {
        return (UnifiedKycFlowType[]) $VALUES.clone();
    }
}
