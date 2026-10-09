package com.iab.digitalidentity.sdk.core.network.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import d0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$ErrorDetails", "Landroid/os/Parcelable;", "", "challengeId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getChallengeId", "()Ljava/lang/String;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$ErrorDetails implements Parcelable {
    public static final Parcelable.Creator<UnifiedKycResponse$ErrorDetails> CREATOR = null;

    @SerializedName("challengeId")
    private final String challengeId;

    static {
        CREATOR = new i();
    }

    public UnifiedKycResponse$ErrorDetails(String r2) {
        p.l(r2, "challengeId");
        this.challengeId = r2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof UnifiedKycResponse$ErrorDetails) == true) goto L9;
        return false;
    L9:
        if (p.g(this.challengeId, ((UnifiedKycResponse$ErrorDetails) r4).challengeId) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.challengeId.hashCode();
    }

    public final String toString() {
        return "ErrorDetails(challengeId=" + this.challengeId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "out");
        r1.writeString(this.challengeId);
    }
}
