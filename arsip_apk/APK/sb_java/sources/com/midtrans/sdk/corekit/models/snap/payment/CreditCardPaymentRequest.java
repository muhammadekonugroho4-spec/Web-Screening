package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.params.CreditCardPaymentParams;
import com.midtrans.sdk.corekit.models.snap.params.PromoDetails;

/* loaded from: classes6.dex */
public class CreditCardPaymentRequest extends BasePaymentRequest {

    @SerializedName("customer_details")
    private CustomerDetailRequest customerDetails;

    @SerializedName("payment_params")
    private CreditCardPaymentParams paymentParams;

    @SerializedName("promo_details")
    private PromoDetails promoDetails;

    public CreditCardPaymentRequest(String r1, CreditCardPaymentParams r2, CustomerDetailRequest r3) {
        super(r1);
        this.paymentParams = r2;
        this.customerDetails = r3;
    }

    public CustomerDetailRequest getCustomerDetails() {
        return this.customerDetails;
    }

    public CreditCardPaymentParams getPaymentParams() {
        return this.paymentParams;
    }

    public PromoDetails getPromoDetails() {
        return this.promoDetails;
    }

    public void setPromoDetails(PromoDetails r1) {
        this.promoDetails = r1;
    }
}
