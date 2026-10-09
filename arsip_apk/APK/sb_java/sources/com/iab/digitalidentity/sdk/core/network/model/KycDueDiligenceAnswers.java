package com.iab.digitalidentity.sdk.core.network.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/network/model/KycDueDiligenceAnswers;", "", "", "sourceOfFunds", "purposeOfRelationship", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getSourceOfFunds", "()Ljava/lang/String;", "setSourceOfFunds", "(Ljava/lang/String;)V", "getPurposeOfRelationship", "setPurposeOfRelationship", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycDueDiligenceAnswers {

    @SerializedName("purpose_of_relationship")
    private String purposeOfRelationship;

    @SerializedName("source_of_funds")
    private String sourceOfFunds;

    /* JADX WARN: Multi-variable type inference failed */
    public KycDueDiligenceAnswers() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof KycDueDiligenceAnswers) == true) goto L8;
        return false;
    L8:
        KycDueDiligenceAnswers r52 = (KycDueDiligenceAnswers) r5;
        if (p.g(this.sourceOfFunds, r52.sourceOfFunds) == true) goto L12;
        return false;
    L12:
        if (p.g(this.purposeOfRelationship, r52.purposeOfRelationship) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r02 = this.sourceOfFunds.hashCode() * 31;
        return this.purposeOfRelationship.hashCode() + r02;
    }

    public final String toString() {
        return "KycDueDiligenceAnswers(sourceOfFunds=" + this.sourceOfFunds + ", purposeOfRelationship=" + this.purposeOfRelationship + ")";
    }

    public KycDueDiligenceAnswers(String r2, String r3) {
        p.l(r2, "sourceOfFunds");
        p.l(r3, "purposeOfRelationship");
        this.sourceOfFunds = r2;
        this.purposeOfRelationship = r3;
    }

    public /* synthetic */ KycDueDiligenceAnswers(String r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
