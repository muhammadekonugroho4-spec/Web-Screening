package com.midtrans.sdk.uikit.scancard;

import java.io.Serializable;

/* loaded from: classes6.dex */
public class ScannerModel implements Serializable {
    private String cardNumber;
    private String cvv;
    private int expiredMonth;
    private int expiredYear;

    public ScannerModel(String r1, String r2, int r3, int r4) {
        setCardNumber(r1);
        setCvv(r2);
        setExpiredMonth(r3);
        setExpiredYear(r4);
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getCvv() {
        return this.cvv;
    }

    public int getExpiredMonth() {
        return this.expiredMonth;
    }

    public int getExpiredYear() {
        return this.expiredYear;
    }

    public void setCardNumber(String r1) {
        this.cardNumber = r1;
    }

    public void setCvv(String r1) {
        this.cvv = r1;
    }

    public void setExpiredMonth(int r1) {
        this.expiredMonth = r1;
    }

    public void setExpiredYear(int r1) {
        this.expiredYear = r1;
    }
}
