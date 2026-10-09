package com.midtrans.sdk.corekit.models;

import com.midtrans.sdk.corekit.models.promo.Promo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class PaymentDetails {
    private List<com.midtrans.sdk.corekit.models.snap.ItemDetails> itemDetailsList;
    private Promo promoSelected;
    private com.midtrans.sdk.corekit.models.snap.TransactionDetails transactionDetails;

    public PaymentDetails(com.midtrans.sdk.corekit.models.snap.TransactionDetails r5, List<com.midtrans.sdk.corekit.models.snap.ItemDetails> r6) {
        if (r5 == null) goto L5;
        this.transactionDetails = new com.midtrans.sdk.corekit.models.snap.TransactionDetails(r5.getOrderId(), Double.valueOf(r5.getAmount()));
    L5:
        if (r6 == null) goto L8;
        this.itemDetailsList = new ArrayList(r6);
        return;
    }

    public void changePaymentDetails(List<com.midtrans.sdk.corekit.models.snap.ItemDetails> r2, double r3) {
        com.midtrans.sdk.corekit.models.snap.TransactionDetails r02 = this.transactionDetails;
        if (r02 == null) goto L6;
        r02.setAmount(Double.valueOf(r3));
        this.itemDetailsList = r2;
        return;
    }

    public List<com.midtrans.sdk.corekit.models.snap.ItemDetails> getItemDetailsList() {
        return this.itemDetailsList;
    }

    public Promo getPromoSelected() {
        return this.promoSelected;
    }

    public double getTotalAmount() {
        com.midtrans.sdk.corekit.models.snap.TransactionDetails r02 = this.transactionDetails;
        if (r02 != null) goto L5;
        return 0.0d;
    L5:
        return r02.getAmount();
    }

    public com.midtrans.sdk.corekit.models.snap.TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public void setItemDetailsList(List<com.midtrans.sdk.corekit.models.snap.ItemDetails> r1) {
        this.itemDetailsList = r1;
    }

    public void setPromoSelected(Promo r1) {
        this.promoSelected = r1;
    }

    public void setTotalAmount(double r2) {
        com.midtrans.sdk.corekit.models.snap.TransactionDetails r02 = this.transactionDetails;
        if (r02 == null) goto L6;
        r02.setAmount(Double.valueOf(r2));
        return;
    }

    public void setTransactionDetails(com.midtrans.sdk.corekit.models.snap.TransactionDetails r1) {
        this.transactionDetails = r1;
    }
}
