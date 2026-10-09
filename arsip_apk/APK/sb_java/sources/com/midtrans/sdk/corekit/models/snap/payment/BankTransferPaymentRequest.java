package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class BankTransferPaymentRequest extends BasePaymentRequest {

    @SerializedName("customer_details")
    private CustomerDetailRequest customerDetails;

    public BankTransferPaymentRequest(String r1, CustomerDetailRequest r2) {
        super(r1);
        this.customerDetails = r2;
    }

    public CustomerDetailRequest getCustomerDetails() {
        return this.customerDetails;
    }
}
