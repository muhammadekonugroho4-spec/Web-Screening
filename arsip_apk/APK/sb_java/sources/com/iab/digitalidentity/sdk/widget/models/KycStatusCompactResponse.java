package com.iab.digitalidentity.sdk.widget.models;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/iab/digitalidentity/sdk/widget/models/KycStatusCompactResponse;", "", "kycStatus", "", "rejectionTitle", "rejectionMessage", "helpArticle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHelpArticle", "()Ljava/lang/String;", "getKycStatus", "getRejectionMessage", "getRejectionTitle", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycStatusCompactResponse {
    private final String helpArticle;
    private final String kycStatus;
    private final String rejectionMessage;
    private final String rejectionTitle;

    public KycStatusCompactResponse(String r2, String r3, String r4, String r5) {
        p.l(r2, "kycStatus");
        this.kycStatus = r2;
        this.rejectionTitle = r3;
        this.rejectionMessage = r4;
        this.helpArticle = r5;
    }

    public static /* synthetic */ KycStatusCompactResponse copy$default(KycStatusCompactResponse r02, String r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.kycStatus;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.rejectionTitle;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.rejectionMessage;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.helpArticle;
    L15:
        return r02.copy(r1, r2, r3, r4);
    }

    public final String component1() {
        return this.kycStatus;
    }

    public final String component2() {
        return this.rejectionTitle;
    }

    public final String component3() {
        return this.rejectionMessage;
    }

    public final String component4() {
        return this.helpArticle;
    }

    public final KycStatusCompactResponse copy(String r2, String r3, String r4, String r5) {
        p.l(r2, "kycStatus");
        return new KycStatusCompactResponse(r2, r3, r4, r5);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof KycStatusCompactResponse) == true) goto L8;
        return false;
    L8:
        KycStatusCompactResponse r52 = (KycStatusCompactResponse) r5;
        if (p.g(this.kycStatus, r52.kycStatus) == true) goto L12;
        return false;
    L12:
        if (p.g(this.rejectionTitle, r52.rejectionTitle) == true) goto L15;
        return false;
    L15:
        if (p.g(this.rejectionMessage, r52.rejectionMessage) == true) goto L18;
        return false;
    L18:
        if (p.g(this.helpArticle, r52.helpArticle) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final String getHelpArticle() {
        return this.helpArticle;
    }

    public final String getKycStatus() {
        return this.kycStatus;
    }

    public final String getRejectionMessage() {
        return this.rejectionMessage;
    }

    public final String getRejectionTitle() {
        return this.rejectionTitle;
    }

    public int hashCode() {
        int r02 = this.kycStatus.hashCode() * 31;
        String r1 = this.rejectionTitle;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.rejectionMessage;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.helpArticle;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return r04 + r2;
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "KycStatusCompactResponse(kycStatus=" + this.kycStatus + ", rejectionTitle=" + this.rejectionTitle + ", rejectionMessage=" + this.rejectionMessage + ", helpArticle=" + this.helpArticle + ")";
    }

    public /* synthetic */ KycStatusCompactResponse(String r2, String r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r6 & 8) == 0) goto L11;
        r5 = null;
    L11:
        this(r2, r3, r4, r5);
    }
}
