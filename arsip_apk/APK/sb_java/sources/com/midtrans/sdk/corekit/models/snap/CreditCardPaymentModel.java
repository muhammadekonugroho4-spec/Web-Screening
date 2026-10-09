package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.promo.Promo;

/* loaded from: classes6.dex */
public class CreditCardPaymentModel {
    private String bank;
    private String cardToken;
    private String installment;
    private transient boolean isFromBankPoint;
    private String maskedCardNumber;

    @SerializedName("point")
    private float pointRedeemed;
    private Promo promoSelected;
    private boolean savecard;

    public CreditCardPaymentModel(String r1) {
        this.maskedCardNumber = r1;
    }

    public String getBank() {
        return this.bank;
    }

    public String getCardToken() {
        return this.cardToken;
    }

    public String getInstallment() {
        return this.installment;
    }

    public String getMaskedCardNumber() {
        return this.maskedCardNumber;
    }

    public float getPointRedeemed() {
        return this.pointRedeemed;
    }

    public Promo getPromoSelected() {
        return this.promoSelected;
    }

    public boolean isFromBankPoint() {
        return this.isFromBankPoint;
    }

    public boolean isSavecard() {
        return this.savecard;
    }

    public void setBank(String r1) {
        this.bank = r1;
    }

    public void setFromBankPoint(boolean r1) {
        this.isFromBankPoint = r1;
    }

    public void setInstallment(String r1) {
        this.installment = r1;
    }

    public void setPointRedeemed(float r1) {
        this.pointRedeemed = r1;
    }

    public void setPromoSelected(Promo r1) {
        this.promoSelected = r1;
    }

    public CreditCardPaymentModel(String r1, boolean r2) {
        this.cardToken = r1;
        this.savecard = r2;
    }
}
