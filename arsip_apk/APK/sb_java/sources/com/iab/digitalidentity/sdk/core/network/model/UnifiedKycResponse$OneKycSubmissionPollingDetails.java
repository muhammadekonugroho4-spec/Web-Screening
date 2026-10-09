package com.iab.digitalidentity.sdk.core.network.model;

import a.AbstractC2049c;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$OneKycSubmissionPollingDetails", "", "", "attemptsRemaining", "", "failureReasonTitle", "failureReasonMessage", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$OneKycSubmissionPollingDetails {

    @SerializedName("attemptsRemaining")
    private final Integer attemptsRemaining;

    @SerializedName("failureReasonMessage")
    private final String failureReasonMessage;

    @SerializedName("failureReasonTitle")
    private final String failureReasonTitle;

    public UnifiedKycResponse$OneKycSubmissionPollingDetails() {
        Integer r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final Integer a() {
        return this.attemptsRemaining;
    }

    public final String b() {
        return this.failureReasonMessage;
    }

    public final String c() {
        return this.failureReasonTitle;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycResponse$OneKycSubmissionPollingDetails) == true) goto L8;
        return false;
    L8:
        UnifiedKycResponse$OneKycSubmissionPollingDetails r52 = (UnifiedKycResponse$OneKycSubmissionPollingDetails) r5;
        if (p.g(this.attemptsRemaining, r52.attemptsRemaining) == true) goto L12;
        return false;
    L12:
        if (p.g(this.failureReasonTitle, r52.failureReasonTitle) == true) goto L15;
        return false;
    L15:
        if (p.g(this.failureReasonMessage, r52.failureReasonMessage) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        Integer r02 = this.attemptsRemaining;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        String r2 = this.failureReasonTitle;
        int r04 = AbstractC2049c.a(r2, r03 * 31, 31);
        return this.failureReasonMessage.hashCode() + r04;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String toString() {
        return "OneKycSubmissionPollingDetails(attemptsRemaining=" + this.attemptsRemaining + ", failureReasonTitle=" + this.failureReasonTitle + ", failureReasonMessage=" + this.failureReasonMessage + ")";
    }

    public UnifiedKycResponse$OneKycSubmissionPollingDetails(Integer r2, String r3, String r4) {
        p.l(r3, "failureReasonTitle");
        p.l(r4, "failureReasonMessage");
        this.attemptsRemaining = r2;
        this.failureReasonTitle = r3;
        this.failureReasonMessage = r4;
    }

    public /* synthetic */ UnifiedKycResponse$OneKycSubmissionPollingDetails(Integer r2, String r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
