package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class TransactionDetails {

    @SerializedName("gross_amount")
    private String grossAmount;

    @SerializedName("order_id")
    private String orderId;

    public TransactionDetails() {
    }

    public String getGrossAmount() {
        return this.grossAmount;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setGrossAmount(String r1) {
        this.grossAmount = r1;
    }

    public void setOrderId(String r1) {
        this.orderId = r1;
    }

    public TransactionDetails(String r1, String r2) {
        this.grossAmount = r1;
        this.orderId = r2;
    }
}
