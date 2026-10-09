package com.iab.digitalidentity.sdk.core.model;

import androidx.core.app.NotificationCompat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"getOneKycEligibilityStatusFromString", "Lcom/iab/digitalidentity/sdk/core/model/UnifiedKycEligibilityStatus;", NotificationCompat.CATEGORY_STATUS, "", "OneKycSdk_universalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycEligibilityStatusKt {
    public static final UnifiedKycEligibilityStatus getOneKycEligibilityStatusFromString(String r2) {
        if (r2 == null) goto L5;
        String r22 = r2.toUpperCase(Locale.ROOT);
        p.k(r22, "this as java.lang.String).toUpperCase(Locale.ROOT)");
    L6:
        if (r22 != null) goto L8;
    L45:
        return null;
    L8:
        switch(r22.hashCode()) {
            case -2101044708: goto L41;
            case -1680088021: goto L36;
            case -1111865883: goto L31;
            case -1013099211: goto L26;
            case -215634307: goto L21;
            case 1779164758: goto L16;
            case 1967871671: goto L11;
            default: goto L45;
        };
    L11:
        if (r22.equals("APPROVED") == false) goto L45;
        return UnifiedKycEligibilityStatus.APPROVED;
    L16:
        if (r22.equals("AWAITING_APPROVAL") == false) goto L45;
        return UnifiedKycEligibilityStatus.AWAITING_APPROVAL;
    L21:
        if (r22.equals("NON_PROGRESSIVE_ELIGIBLE") == false) goto L45;
        return UnifiedKycEligibilityStatus.NON_PROGRESSIVE_ELIGIBLE;
    L26:
        if (r22.equals("PARTNER_BLOCKED") == false) goto L45;
        return UnifiedKycEligibilityStatus.PARTNER_BLOCKED;
    L31:
        if (r22.equals("FORMS_NEEDED") == false) goto L45;
        return UnifiedKycEligibilityStatus.FORMS_NEEDED;
    L36:
        if (r22.equals("PROGRESSIVE_ELIGIBLE") == false) goto L45;
        return UnifiedKycEligibilityStatus.PROGRESSIVE_ELIGIBLE;
    L41:
        if (r22.equals("ONEKYC_BLOCKED") == false) goto L45;
        return UnifiedKycEligibilityStatus.ONEKYC_BLOCKED;
    L5:
        r22 = null;
        goto L6
    }
}
