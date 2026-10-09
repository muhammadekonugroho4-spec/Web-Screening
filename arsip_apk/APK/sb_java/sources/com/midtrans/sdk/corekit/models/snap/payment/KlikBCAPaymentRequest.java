package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.params.KlikBcaPaymentParams;

/* loaded from: classes6.dex */
public class KlikBCAPaymentRequest extends BasePaymentRequest {

    @SerializedName("payment_params")
    private KlikBcaPaymentParams paymentParams;

    public KlikBCAPaymentRequest(String r1, KlikBcaPaymentParams r2) {
        super(r1);
        this.paymentParams = r2;
    }

    public KlikBcaPaymentParams getPaymentParams() {
        return this.paymentParams;
    }
}
