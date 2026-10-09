package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class SnapTransactionDetails {
    private String currency;

    @SerializedName("gross_amount")
    private Double grossAmount;

    @SerializedName("order_id")
    private String orderId;

    public SnapTransactionDetails(String r1, Double r2) {
        setOrderId(r1);
        setGrossAmount(r2);
    }

    public Double getGrossAmount() {
        return this.grossAmount;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setCurrency(String r1) {
        this.currency = r1;
    }

    public void setGrossAmount(Double r1) {
        this.grossAmount = r1;
    }

    public void setOrderId(String r1) {
        this.orderId = r1;
    }
}
