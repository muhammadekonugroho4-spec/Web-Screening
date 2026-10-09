package com.iab.digitalidentity.sdk.core.network.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$OneKycSubmissionBody", "", "", "submissionId", "Lcom/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$OneKycSubmissionMetaData;", "metadata", "<init>", "(Ljava/lang/String;Lcom/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$OneKycSubmissionMetaData;)V", "Ljava/lang/String;", "getSubmissionId", "()Ljava/lang/String;", "Lcom/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$OneKycSubmissionMetaData;", "getMetadata", "()Lcom/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$OneKycSubmissionMetaData;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$OneKycSubmissionBody {

    @SerializedName("metadata")
    private final UnifiedKycResponse$OneKycSubmissionMetaData metadata;

    @SerializedName("submissionId")
    private final String submissionId;

    public UnifiedKycResponse$OneKycSubmissionBody(String r2, UnifiedKycResponse$OneKycSubmissionMetaData r3) {
        p.l(r2, "submissionId");
        this.submissionId = r2;
        this.metadata = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycResponse$OneKycSubmissionBody) == true) goto L8;
        return false;
    L8:
        UnifiedKycResponse$OneKycSubmissionBody r52 = (UnifiedKycResponse$OneKycSubmissionBody) r5;
        if (p.g(this.submissionId, r52.submissionId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.metadata, r52.metadata) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r02 = this.submissionId.hashCode() * 31;
        UnifiedKycResponse$OneKycSubmissionMetaData r1 = this.metadata;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String toString() {
        return "OneKycSubmissionBody(submissionId=" + this.submissionId + ", metadata=" + this.metadata + ")";
    }

    public /* synthetic */ UnifiedKycResponse$OneKycSubmissionBody(String r1, UnifiedKycResponse$OneKycSubmissionMetaData r2, int r3, i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }
}
