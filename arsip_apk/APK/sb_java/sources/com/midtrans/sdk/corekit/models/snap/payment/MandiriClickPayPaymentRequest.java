package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.params.MandiriClickPayPaymentParams;

/* loaded from: classes6.dex */
public class MandiriClickPayPaymentRequest extends BasePaymentRequest {

    @SerializedName("payment_params")
    private MandiriClickPayPaymentParams paymentParams;

    public MandiriClickPayPaymentRequest(String r1, MandiriClickPayPaymentParams r2) {
        super(r1);
        this.paymentParams = r2;
    }
}
