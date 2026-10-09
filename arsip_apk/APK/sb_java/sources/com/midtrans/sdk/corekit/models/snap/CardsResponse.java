package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class CardsResponse {

    @SerializedName("cardhash")
    private String cardHash;

    @SerializedName("token_id")
    private String tokenId;
    private String type;

    public CardsResponse(String r1, String r2, String r3) {
        this.tokenId = r1;
        this.cardHash = r2;
        this.type = r3;
    }

    public String getCardHash() {
        return this.cardHash;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public String getType() {
        return this.type;
    }

    public void setCardHash(String r1) {
        this.cardHash = r1;
    }

    public void setTokenId(String r1) {
        this.tokenId = r1;
    }

    public void setType(String r1) {
        this.type = r1;
    }
}
