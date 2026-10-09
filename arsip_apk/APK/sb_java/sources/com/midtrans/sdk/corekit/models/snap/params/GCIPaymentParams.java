package com.midtrans.sdk.corekit.models.snap.params;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class GCIPaymentParams {

    @SerializedName("card_number")
    private String cardNumber;

    @SerializedName("pin")
    private String password;

    public GCIPaymentParams(String r1, String r2) {
        this.cardNumber = r1;
        this.password = r2;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getPassword() {
        return this.password;
    }
}
