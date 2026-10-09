package com.iab.digitalidentity.sdk.core.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"emptyCheckResult", "Lcom/iab/digitalidentity/sdk/core/model/CheckResult;", "getEmptyCheckResult", "()Lcom/iab/digitalidentity/sdk/core/model/CheckResult;", "OneKycSdk_universalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckResultKt {
    private static final CheckResult emptyCheckResult = null;

    static {
        emptyCheckResult = new CheckResult(-1, "", "");
    }

    public static final CheckResult getEmptyCheckResult() {
        return emptyCheckResult;
    }
}
