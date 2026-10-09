package com.iab.digitalidentity.sdk.core.network.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$ChallengeSubmissionResponseData", "", "", "challengeStatus", "verificationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$ChallengeSubmissionResponseData {

    @SerializedName("challengeStatus")
    private final String challengeStatus;

    @SerializedName("verificationToken")
    private final String verificationToken;

    /* JADX WARN: Multi-variable type inference failed */
    public UnifiedKycResponse$ChallengeSubmissionResponseData() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.challengeStatus;
    }

    public final String b() {
        return this.verificationToken;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycResponse$ChallengeSubmissionResponseData) == true) goto L8;
        return false;
    L8:
        UnifiedKycResponse$ChallengeSubmissionResponseData r52 = (UnifiedKycResponse$ChallengeSubmissionResponseData) r5;
        if (p.g(this.challengeStatus, r52.challengeStatus) == true) goto L12;
        return false;
    L12:
        if (p.g(this.verificationToken, r52.verificationToken) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        String r02 = this.challengeStatus;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.verificationToken;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String toString() {
        return "ChallengeSubmissionResponseData(challengeStatus=" + this.challengeStatus + ", verificationToken=" + this.verificationToken + ")";
    }

    public UnifiedKycResponse$ChallengeSubmissionResponseData(String r1, String r2) {
        this.challengeStatus = r1;
        this.verificationToken = r2;
    }

    public /* synthetic */ UnifiedKycResponse$ChallengeSubmissionResponseData(String r1, String r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = null;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
