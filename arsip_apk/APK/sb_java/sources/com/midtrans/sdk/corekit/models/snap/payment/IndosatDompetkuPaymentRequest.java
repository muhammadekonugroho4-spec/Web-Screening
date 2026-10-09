package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.params.IndosatDompetkuPaymentParams;

/* loaded from: classes6.dex */
public class IndosatDompetkuPaymentRequest extends BasePaymentRequest {

    @SerializedName("payment_params")
    public IndosatDompetkuPaymentParams paymentParams;

    public IndosatDompetkuPaymentRequest(String r1, IndosatDompetkuPaymentParams r2) {
        super(r1);
        this.paymentParams = r2;
    }
}
