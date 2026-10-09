package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.params.NewMandiriClickPaymentParams;

/* loaded from: classes6.dex */
public class NewMandiriClickPayPaymentRequest extends BasePaymentRequest {

    @SerializedName("payment_params")
    private NewMandiriClickPaymentParams paymentParams;

    public NewMandiriClickPayPaymentRequest(String r1, NewMandiriClickPaymentParams r2) {
        super(r1);
        this.paymentParams = r2;
    }
}
