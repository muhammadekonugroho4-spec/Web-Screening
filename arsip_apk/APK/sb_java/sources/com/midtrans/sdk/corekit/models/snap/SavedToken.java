package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class SavedToken {
    public static final String ONE_CLICK = "one_click";
    public static final String TWO_CLICKS = "two_clicks";

    @SerializedName("expires_at")
    private String expiresAt;
    private boolean fromHostApp;

    @SerializedName("masked_card")
    private String maskedCard;
    private String token;

    @SerializedName("token_type")
    private String tokenType;

    public SavedToken() {
    }

    public String getExpiresAt() {
        return this.expiresAt;
    }

    public String getMaskedCard() {
        return this.maskedCard;
    }

    public String getToken() {
        return this.token;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public void setExpiresAt(String r1) {
        this.expiresAt = r1;
    }

    public void setMaskedCard(String r1) {
        this.maskedCard = r1;
    }

    public void setToken(String r1) {
        this.token = r1;
    }

    public void setTokenType(String r1) {
        this.tokenType = r1;
    }
}
