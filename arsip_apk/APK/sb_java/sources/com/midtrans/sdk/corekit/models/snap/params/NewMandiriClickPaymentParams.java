package com.midtrans.sdk.corekit.models.snap.params;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class NewMandiriClickPaymentParams {
    private String input3;
    private String token;

    @SerializedName("token_id")
    private String tokenId;

    public NewMandiriClickPaymentParams(String r1, String r2, String r3) {
        this.input3 = r3;
        this.token = r2;
        this.tokenId = r1;
    }
}
