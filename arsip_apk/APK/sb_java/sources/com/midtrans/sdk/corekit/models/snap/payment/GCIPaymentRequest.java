package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.params.GCIPaymentParams;

/* loaded from: classes6.dex */
public class GCIPaymentRequest {

    @SerializedName("payment_params")
    private GCIPaymentParams paymentParams;

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    private String paymentType;

    public GCIPaymentRequest(GCIPaymentParams r1, String r2) {
        this.paymentParams = r1;
        this.paymentType = r2;
    }

    public GCIPaymentParams getPaymentParams() {
        return this.paymentParams;
    }
}
