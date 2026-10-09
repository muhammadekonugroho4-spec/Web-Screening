package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class TransactionDetails {

    @SerializedName("gross_amount")
    private double amount;
    private String currency;

    @SerializedName("order_id")
    private String orderId;

    public TransactionDetails() {
    }

    public double getAmount() {
        return this.amount;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setAmount(Double r3) {
        this.amount = r3.doubleValue();
    }

    public void setOrderId(String r1) {
        this.orderId = r1;
    }

    public TransactionDetails(String r1, Double r2) {
        setOrderId(r1);
        setAmount(r2);
    }
}
