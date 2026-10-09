package com.iab.digitalidentity.sdk.core.network.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$ConsentUserData", "", "", "maskedName", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$ConsentUserData {

    @SerializedName("maskedName")
    private final String maskedName;

    public UnifiedKycResponse$ConsentUserData(String r2) {
        p.l(r2, "maskedName");
        this.maskedName = r2;
    }

    public final String a() {
        return this.maskedName;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof UnifiedKycResponse$ConsentUserData) == true) goto L9;
        return false;
    L9:
        if (p.g(this.maskedName, ((UnifiedKycResponse$ConsentUserData) r4).maskedName) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.maskedName.hashCode();
    }

    public final String toString() {
        return "ConsentUserData(maskedName=" + this.maskedName + ")";
    }
}
