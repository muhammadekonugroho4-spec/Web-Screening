package com.iab.digitalidentity.sdk.core.model;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"getUnifiedKycFlowTypeFromString", "Lcom/iab/digitalidentity/sdk/core/model/UnifiedKycFlowType;", "flowType", "", "OneKycSdk_universalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycFlowTypeKt {
    public static final UnifiedKycFlowType getUnifiedKycFlowTypeFromString(String r2) {
        if (r2 == null) goto L5;
        String r22 = r2.toUpperCase(Locale.ROOT);
        p.k(r22, "this as java.lang.String).toUpperCase(Locale.ROOT)");
    L7:
        if (p.g(r22, "PROGRESSIVE") == false) goto L11;
        return UnifiedKycFlowType.PROGRESSIVE;
    L11:
        if (p.g(r22, "NON_PROGRESSIVE") == true) goto L13;
        return null;
    L13:
        return UnifiedKycFlowType.NON_PROGRESSIVE;
    L5:
        r22 = null;
        goto L7
    }
}
