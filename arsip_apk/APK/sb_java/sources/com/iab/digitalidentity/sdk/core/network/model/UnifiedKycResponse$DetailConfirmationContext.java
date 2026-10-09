package com.iab.digitalidentity.sdk.core.network.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$DetailConfirmationContext", "", "", "userDetailConfirmation", "<init>", "(Z)V", "Z", "getUserDetailConfirmation", "()Z", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$DetailConfirmationContext {

    @SerializedName("userDetailConfirmation")
    private final boolean userDetailConfirmation;

    public UnifiedKycResponse$DetailConfirmationContext(boolean r1) {
        this.userDetailConfirmation = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof UnifiedKycResponse$DetailConfirmationContext) == true) goto L9;
        return false;
    L9:
        if (this.userDetailConfirmation == ((UnifiedKycResponse$DetailConfirmationContext) r4).userDetailConfirmation) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        boolean r02 = this.userDetailConfirmation;
        if (r02 == false) goto L6;
        return 1;
    L6:
        return r02 ? 1 : 0;
    }

    public final String toString() {
        return "DetailConfirmationContext(userDetailConfirmation=" + this.userDetailConfirmation + ")";
    }
}
