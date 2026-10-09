package com.midtrans.sdk.corekit.models.snap;

/* loaded from: classes6.dex */
public class PaymentOptions {
    private boolean creditCard3dSecure;
    private boolean saveCard;

    public PaymentOptions() {
    }

    public boolean isCreditCard3dSecure() {
        return this.creditCard3dSecure;
    }

    public boolean isSaveCard() {
        return this.saveCard;
    }

    public void setCreditCard3dSecure(boolean r1) {
        this.creditCard3dSecure = r1;
    }

    public void setSaveCard(boolean r1) {
        this.saveCard = r1;
    }

    public PaymentOptions(boolean r1, boolean r2) {
        setCreditCard3dSecure(r1);
        setSaveCard(r2);
    }
}
