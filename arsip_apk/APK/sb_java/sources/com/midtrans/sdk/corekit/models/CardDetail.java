package com.midtrans.sdk.corekit.models;

import java.io.Serializable;

/* loaded from: classes6.dex */
public class CardDetail implements Serializable {
    private String bankName;
    private String cardHolderName;
    private String cardNumber;
    private String cardType;
    private String cvv;
    private String expiryDate;

    public CardDetail() {
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getCardHolderName() {
        return this.cardHolderName;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getCvv() {
        return this.cvv;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public void getFormatedCardNumber() {
    }

    public void setBankName(String r1) {
        this.bankName = r1;
    }

    public void setCardHolderName(String r1) {
        this.cardHolderName = r1;
    }

    public void setCardNumber(String r1) {
        this.cardNumber = r1;
    }

    public void setCardType(String r1) {
        this.cardType = r1;
    }

    public void setCvv(String r1) {
        this.cvv = r1;
    }

    public void setExpiryDate(String r1) {
        this.expiryDate = r1;
    }
}
