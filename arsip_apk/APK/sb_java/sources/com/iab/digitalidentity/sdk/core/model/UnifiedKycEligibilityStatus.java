package com.iab.digitalidentity.sdk.core.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/UnifiedKycEligibilityStatus;", "", "(Ljava/lang/String;I)V", "ONEKYC_BLOCKED", "PARTNER_BLOCKED", "NON_PROGRESSIVE_ELIGIBLE", "PROGRESSIVE_ELIGIBLE", "APPROVED", "AWAITING_APPROVAL", "FORMS_NEEDED", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum UnifiedKycEligibilityStatus extends Enum<UnifiedKycEligibilityStatus> {
    private static final /* synthetic */ UnifiedKycEligibilityStatus[] $VALUES = null;
    public static final UnifiedKycEligibilityStatus APPROVED = null;
    public static final UnifiedKycEligibilityStatus AWAITING_APPROVAL = null;
    public static final UnifiedKycEligibilityStatus FORMS_NEEDED = null;
    public static final UnifiedKycEligibilityStatus NON_PROGRESSIVE_ELIGIBLE = null;
    public static final UnifiedKycEligibilityStatus ONEKYC_BLOCKED = null;
    public static final UnifiedKycEligibilityStatus PARTNER_BLOCKED = null;
    public static final UnifiedKycEligibilityStatus PROGRESSIVE_ELIGIBLE = null;

    private static final /* synthetic */ UnifiedKycEligibilityStatus[] $values() {
        return new UnifiedKycEligibilityStatus[]{ONEKYC_BLOCKED, PARTNER_BLOCKED, NON_PROGRESSIVE_ELIGIBLE, PROGRESSIVE_ELIGIBLE, APPROVED, AWAITING_APPROVAL, FORMS_NEEDED};
    }

    static {
        ONEKYC_BLOCKED = new UnifiedKycEligibilityStatus("ONEKYC_BLOCKED", 0);
        PARTNER_BLOCKED = new UnifiedKycEligibilityStatus("PARTNER_BLOCKED", 1);
        NON_PROGRESSIVE_ELIGIBLE = new UnifiedKycEligibilityStatus("NON_PROGRESSIVE_ELIGIBLE", 2);
        PROGRESSIVE_ELIGIBLE = new UnifiedKycEligibilityStatus("PROGRESSIVE_ELIGIBLE", 3);
        APPROVED = new UnifiedKycEligibilityStatus("APPROVED", 4);
        AWAITING_APPROVAL = new UnifiedKycEligibilityStatus("AWAITING_APPROVAL", 5);
        FORMS_NEEDED = new UnifiedKycEligibilityStatus("FORMS_NEEDED", 6);
        $VALUES = $values();
    }

    UnifiedKycEligibilityStatus(String r1, int r2) {
    }

    public static UnifiedKycEligibilityStatus valueOf(String r1) {
        return (UnifiedKycEligibilityStatus) Enum.valueOf(UnifiedKycEligibilityStatus.class, r1);
    }

    public static UnifiedKycEligibilityStatus[] values() {
        return (UnifiedKycEligibilityStatus[]) $VALUES.clone();
    }
}
