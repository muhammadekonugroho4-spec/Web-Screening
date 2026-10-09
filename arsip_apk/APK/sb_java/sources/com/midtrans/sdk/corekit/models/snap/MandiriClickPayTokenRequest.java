package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class MandiriClickPayTokenRequest {

    @SerializedName("card_number")
    public String cardNumber;

    @SerializedName("client_key")
    public String clientKey;

    public MandiriClickPayTokenRequest(String r1, String r2) {
        this.cardNumber = r1;
        this.clientKey = r2;
    }
}
