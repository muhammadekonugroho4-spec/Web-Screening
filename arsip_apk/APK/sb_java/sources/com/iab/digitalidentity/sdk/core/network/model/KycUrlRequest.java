package com.iab.digitalidentity.sdk.core.network.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/network/model/KycUrlRequest;", "", "", "kycType", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getKycType", "()Ljava/lang/String;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycUrlRequest {

    @SerializedName("kyc_sub_type")
    private final String kycType;

    public KycUrlRequest(String r2) {
        p.l(r2, "kycType");
        this.kycType = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof KycUrlRequest) == true) goto L9;
        return false;
    L9:
        if (p.g(this.kycType, ((KycUrlRequest) r4).kycType) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.kycType.hashCode();
    }

    public final String toString() {
        return "KycUrlRequest(kycType=" + this.kycType + ")";
    }
}
