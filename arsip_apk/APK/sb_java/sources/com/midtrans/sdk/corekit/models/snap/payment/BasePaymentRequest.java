package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class BasePaymentRequest {

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    public String paymentType;

    public BasePaymentRequest(String r1) {
        this.paymentType = r1;
    }
}
