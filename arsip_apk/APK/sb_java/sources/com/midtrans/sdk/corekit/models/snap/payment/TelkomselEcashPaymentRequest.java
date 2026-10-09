package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.params.TelkomselCashPaymentParams;

/* loaded from: classes6.dex */
public class TelkomselEcashPaymentRequest extends BasePaymentRequest {

    @SerializedName("payment_params")
    private TelkomselCashPaymentParams paymentParams;

    public TelkomselEcashPaymentRequest(String r1, TelkomselCashPaymentParams r2) {
        super(r1);
        this.paymentParams = r2;
    }
}
