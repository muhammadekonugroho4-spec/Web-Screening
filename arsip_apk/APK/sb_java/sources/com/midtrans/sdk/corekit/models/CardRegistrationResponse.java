package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class CardRegistrationResponse {

    @SerializedName("masked_card")
    private String maskedCard;

    @SerializedName("saved_token_id")
    private String savedTokenId;

    @SerializedName("status_code")
    private String statusCode;

    @SerializedName("status_message")
    private String statusMessage;

    @SerializedName("transaction_id")
    private String transactionId;

    public CardRegistrationResponse() {
    }

    public String getMaskedCard() {
        return this.maskedCard;
    }

    public String getSavedTokenId() {
        return this.savedTokenId;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setMaskedCard(String r1) {
        this.maskedCard = r1;
    }

    public void setSavedTokenId(String r1) {
        this.savedTokenId = r1;
    }

    public void setStatusCode(String r1) {
        this.statusCode = r1;
    }

    public void setStatusMessage(String r1) {
        this.statusMessage = r1;
    }

    public void setTransactionId(String r1) {
        this.transactionId = r1;
    }
}
