package com.midtrans.sdk.corekit.models;

/* loaded from: classes6.dex */
public class CreditCardFromScanner {
    private String cardNumber;
    private String cvv;
    private String expired;

    public CreditCardFromScanner(String r1, String r2, String r3) {
        setCardNumber(r1);
        setCvv(r2);
        setExpired(r3);
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getCvv() {
        return this.cvv;
    }

    public String getExpired() {
        return this.expired;
    }

    public void setCardNumber(String r1) {
        this.cardNumber = r1;
    }

    public void setCvv(String r1) {
        this.cvv = r1;
    }

    public void setExpired(String r1) {
        this.expired = r1;
    }
}
