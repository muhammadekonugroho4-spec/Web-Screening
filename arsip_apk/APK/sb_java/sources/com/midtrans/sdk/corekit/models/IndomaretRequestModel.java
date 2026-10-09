package com.midtrans.sdk.corekit.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes6.dex */
public class IndomaretRequestModel {
    private CstoreEntity cstore;

    @SerializedName("customer_details")
    private CustomerDetails customerDetails;
    private List<ItemDetails> item_details;

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    private String paymentType;

    @SerializedName("transaction_details")
    private TransactionDetails transactionDetails;

    public IndomaretRequestModel() {
    }

    public CstoreEntity getCstore() {
        return this.cstore;
    }

    public CustomerDetails getCustomerDetails() {
        return this.customerDetails;
    }

    public List<ItemDetails> getItem_details() {
        return this.item_details;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public void setCstore(CstoreEntity r1) {
        this.cstore = r1;
    }

    public void setCustomerDetails(CustomerDetails r1) {
        this.customerDetails = r1;
    }

    public void setItem_details(List<ItemDetails> r1) {
        this.item_details = r1;
    }

    public void setPaymentType(String r1) {
        this.paymentType = r1;
    }

    public void setTransactionDetails(TransactionDetails r1) {
        this.transactionDetails = r1;
    }
}
