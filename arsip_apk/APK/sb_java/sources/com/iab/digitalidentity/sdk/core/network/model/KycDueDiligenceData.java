package com.iab.digitalidentity.sdk.core.network.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/network/model/KycDueDiligenceData;", "", "", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycDueDiligenceData {

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    /* JADX WARN: Multi-variable type inference failed */
    public KycDueDiligenceData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof KycDueDiligenceData) == true) goto L9;
        return false;
    L9:
        if (p.g(this.status, ((KycDueDiligenceData) r4).status) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        String r02 = this.status;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public final String toString() {
        return "KycDueDiligenceData(status=" + this.status + ")";
    }

    public KycDueDiligenceData(String r1) {
        this.status = r1;
    }

    public /* synthetic */ KycDueDiligenceData(String r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
