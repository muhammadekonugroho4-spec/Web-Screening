package com.iab.digitalidentity.sdk.core.network.model;

import a.AbstractC2049c;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$CurrentSubmissionStatusData", "", "", "submissionUuid", NotificationCompat.CATEGORY_STATUS, "source", "", "formsNeeded", "rejectionReasonCode", "processedAt", "Lcom/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$SubmissionDetails;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$SubmissionDetails;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "getSource", "Z", "getFormsNeeded", "()Z", "getRejectionReasonCode", "getProcessedAt", "Lcom/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$SubmissionDetails;", "getDetails", "()Lcom/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$SubmissionDetails;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$CurrentSubmissionStatusData {

    @SerializedName("details")
    private final UnifiedKycResponse$SubmissionDetails details;

    @SerializedName("formsNeeded")
    private final boolean formsNeeded;

    @SerializedName("processedAt")
    private final String processedAt;

    @SerializedName("rejectionReasonCode")
    private final String rejectionReasonCode;

    @SerializedName("source")
    private final String source;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("submissionUuid")
    private final String submissionUuid;

    public UnifiedKycResponse$CurrentSubmissionStatusData(String r2, String r3, String r4, boolean r5, String r6, String r7, UnifiedKycResponse$SubmissionDetails r8) {
        p.l(r2, "submissionUuid");
        p.l(r3, NotificationCompat.CATEGORY_STATUS);
        p.l(r4, "source");
        p.l(r6, "rejectionReasonCode");
        p.l(r7, "processedAt");
        p.l(r8, "details");
        this.submissionUuid = r2;
        this.status = r3;
        this.source = r4;
        this.formsNeeded = r5;
        this.rejectionReasonCode = r6;
        this.processedAt = r7;
        this.details = r8;
    }

    public final String a() {
        return this.status;
    }

    public final String b() {
        return this.submissionUuid;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycResponse$CurrentSubmissionStatusData) == true) goto L8;
        return false;
    L8:
        UnifiedKycResponse$CurrentSubmissionStatusData r52 = (UnifiedKycResponse$CurrentSubmissionStatusData) r5;
        if (p.g(this.submissionUuid, r52.submissionUuid) == true) goto L12;
        return false;
    L12:
        if (p.g(this.status, r52.status) == true) goto L15;
        return false;
    L15:
        if (p.g(this.source, r52.source) == true) goto L18;
        return false;
    L18:
        if (this.formsNeeded == r52.formsNeeded) goto L21;
        return false;
    L21:
        if (p.g(this.rejectionReasonCode, r52.rejectionReasonCode) == true) goto L24;
        return false;
    L24:
        if (p.g(this.processedAt, r52.processedAt) == true) goto L27;
        return false;
    L27:
        if (p.g(this.details, r52.details) == true) goto L29;
        return false;
    L29:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int r02 = this.submissionUuid.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.status, r02, 31);
        int r04 = AbstractC2049c.a(this.source, r03, 31);
        boolean r2 = this.formsNeeded;
        int r22 = r2;
        if (r2 == 0) goto L5;
        r22 = 1;
    L5:
        int r05 = (r04 + r22) * 31;
        int r06 = AbstractC2049c.a(this.rejectionReasonCode, r05, 31);
        int r07 = AbstractC2049c.a(this.processedAt, r06, 31);
        return this.details.hashCode() + r07;
    }

    public final String toString() {
        return "CurrentSubmissionStatusData(submissionUuid=" + this.submissionUuid + ", status=" + this.status + ", source=" + this.source + ", formsNeeded=" + this.formsNeeded + ", rejectionReasonCode=" + this.rejectionReasonCode + ", processedAt=" + this.processedAt + ", details=" + this.details + ")";
    }
}
