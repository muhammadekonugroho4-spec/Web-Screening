package com.midtrans.sdk.corekit.models.snap.params;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class CreditCardPaymentParams {
    private String bank;

    @SerializedName("card_token")
    private String cardToken;

    @SerializedName("installment")
    private String installmentTerm;
    private transient boolean isFromBankPoint;

    @SerializedName("masked_card")
    private String maskedCard;

    @SerializedName("point")
    private float pointRedeemed;

    @SerializedName("save_card")
    private boolean saveCard;

    public CreditCardPaymentParams(String r1, Boolean r2, String r3) {
        this.cardToken = r1;
        this.saveCard = r2.booleanValue();
        this.maskedCard = r3;
    }

    public String getBank() {
        return this.bank;
    }

    public String getCardToken() {
        return this.cardToken;
    }

    public String getInstallmentTerm() {
        return this.installmentTerm;
    }

    public String getMaskedCard() {
        return this.maskedCard;
    }

    public float getPointRedeemed() {
        return this.pointRedeemed;
    }

    public boolean isFromBankPoint() {
        return this.isFromBankPoint;
    }

    public boolean isSaveCard() {
        return this.saveCard;
    }

    public void setBank(String r1) {
        this.bank = r1;
    }

    public void setCardToken(String r1) {
        this.cardToken = r1;
    }

    public void setFromBankPoint(boolean r1) {
        this.isFromBankPoint = r1;
    }

    public void setInstallmentTerm(String r1) {
        this.installmentTerm = r1;
    }

    public void setMaskedCard(String r1) {
        this.maskedCard = r1;
    }

    public void setPointRedeemed(float r1) {
        this.pointRedeemed = r1;
    }

    public void setSaveCard(boolean r1) {
        this.saveCard = r1;
    }

    public CreditCardPaymentParams(String r1, Boolean r2, String r3, String r4) {
        this.cardToken = r1;
        this.saveCard = r2.booleanValue();
        this.maskedCard = r3;
        this.installmentTerm = r4;
    }
}
