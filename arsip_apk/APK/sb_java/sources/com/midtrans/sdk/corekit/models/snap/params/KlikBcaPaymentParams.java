package com.midtrans.sdk.corekit.models.snap.params;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class KlikBcaPaymentParams {

    @SerializedName("user_id")
    private String userId;

    public KlikBcaPaymentParams(String r1) {
        this.userId = r1;
    }

    public String getUserId() {
        return this.userId;
    }
}
