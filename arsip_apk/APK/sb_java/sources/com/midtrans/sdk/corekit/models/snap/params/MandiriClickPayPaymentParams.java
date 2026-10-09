package com.midtrans.sdk.corekit.models.snap.params;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class MandiriClickPayPaymentParams {
    private String input3;

    @SerializedName("mandiri_card_no")
    private String mandiriCardNumber;

    @SerializedName("token_response")
    private String tokenResponse;

    public MandiriClickPayPaymentParams(String r1, String r2, String r3) {
        this.mandiriCardNumber = r1;
        this.input3 = r2;
        this.tokenResponse = r3;
    }
}
