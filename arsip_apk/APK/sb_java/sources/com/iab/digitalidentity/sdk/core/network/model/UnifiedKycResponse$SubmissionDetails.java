package com.iab.digitalidentity.sdk.core.network.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$SubmissionDetails", "", "", "formFlow", "rejectionReasonTitle", "rejectionReasonMessage", "waitTimeInSeconds", "waitMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getFormFlow", "()Ljava/lang/String;", "getRejectionReasonTitle", "getRejectionReasonMessage", "getWaitTimeInSeconds", "getWaitMessage", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$SubmissionDetails {

    @SerializedName("formFlow")
    private final String formFlow;

    @SerializedName("rejectionReasonMessage")
    private final String rejectionReasonMessage;

    @SerializedName("rejectionReasonTitle")
    private final String rejectionReasonTitle;

    @SerializedName("waitMessage")
    private final String waitMessage;

    @SerializedName("waitTimeInSeconds")
    private final String waitTimeInSeconds;

    public UnifiedKycResponse$SubmissionDetails(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "formFlow");
        this.formFlow = r2;
        this.rejectionReasonTitle = r3;
        this.rejectionReasonMessage = r4;
        this.waitTimeInSeconds = r5;
        this.waitMessage = r6;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycResponse$SubmissionDetails) == true) goto L8;
        return false;
    L8:
        UnifiedKycResponse$SubmissionDetails r52 = (UnifiedKycResponse$SubmissionDetails) r5;
        if (p.g(this.formFlow, r52.formFlow) == true) goto L12;
        return false;
    L12:
        if (p.g(this.rejectionReasonTitle, r52.rejectionReasonTitle) == true) goto L15;
        return false;
    L15:
        if (p.g(this.rejectionReasonMessage, r52.rejectionReasonMessage) == true) goto L18;
        return false;
    L18:
        if (p.g(this.waitTimeInSeconds, r52.waitTimeInSeconds) == true) goto L21;
        return false;
    L21:
        if (p.g(this.waitMessage, r52.waitMessage) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int hashCode() {
        int r02 = this.formFlow.hashCode() * 31;
        String r1 = this.rejectionReasonTitle;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.rejectionReasonMessage;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.waitTimeInSeconds;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.waitMessage;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return r05 + r2;
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "SubmissionDetails(formFlow=" + this.formFlow + ", rejectionReasonTitle=" + this.rejectionReasonTitle + ", rejectionReasonMessage=" + this.rejectionReasonMessage + ", waitTimeInSeconds=" + this.waitTimeInSeconds + ", waitMessage=" + this.waitMessage + ")";
    }
}
