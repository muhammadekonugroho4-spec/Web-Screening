package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class SaveCardRequest implements Serializable {

    @SerializedName("status_code")
    private String code;

    @SerializedName("cardhash")
    private String maskedCard;

    @SerializedName("token_id")
    private String savedTokenId;

    @SerializedName("transaction_id")
    private String transactionId;
    private String type;

    public SaveCardRequest() {
    }

    public String getCode() {
        return this.code;
    }

    public String getMaskedCard() {
        return this.maskedCard;
    }

    public String getSavedTokenId() {
        return this.savedTokenId;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getType() {
        return this.type;
    }

    public void setCode(String r1) {
        this.code = r1;
    }

    public void setMaskedCard(String r1) {
        this.maskedCard = r1;
    }

    public void setSavedTokenId(String r1) {
        this.savedTokenId = r1;
    }

    public void setTransactionId(String r1) {
        this.transactionId = r1;
    }

    public SaveCardRequest(String r1, String r2, String r3) {
        this.type = r3;
        this.savedTokenId = r1;
        this.maskedCard = r2;
    }
}
