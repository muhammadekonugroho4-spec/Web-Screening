package com.iab.digitalidentity.sdk.core.network.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$CreateChallengeData", "", "", "challengeId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$CreateChallengeData {

    @SerializedName("challengeId")
    private final String challengeId;

    public UnifiedKycResponse$CreateChallengeData(String r2) {
        p.l(r2, "challengeId");
        this.challengeId = r2;
    }

    public final String a() {
        return this.challengeId;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof UnifiedKycResponse$CreateChallengeData) == true) goto L9;
        return false;
    L9:
        if (p.g(this.challengeId, ((UnifiedKycResponse$CreateChallengeData) r4).challengeId) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.challengeId.hashCode();
    }

    public final String toString() {
        return "CreateChallengeData(challengeId=" + this.challengeId + ")";
    }
}
