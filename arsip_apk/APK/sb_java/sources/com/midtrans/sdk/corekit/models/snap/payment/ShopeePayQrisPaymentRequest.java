package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class ShopeePayQrisPaymentRequest {

    @SerializedName("payment_params")
    public QrisPaymentParameter paymentParam;

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    public String paymentType;

    public ShopeePayQrisPaymentRequest(String r1, QrisPaymentParameter r2) {
        this.paymentType = r1;
        this.paymentParam = r2;
    }
}
