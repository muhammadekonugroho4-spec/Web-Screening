package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class CustomerDetails {

    @SerializedName("billing_address")
    private BillingAddress billingAddress;

    @SerializedName("customer_identifier")
    private String customerIdentifier;
    private String email;

    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;
    private String phone;

    @SerializedName("shipping_address")
    private ShippingAddress shippingAddress;

    public CustomerDetails() {
    }

    public BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    public String getCustomerIdentifier() {
        return this.customerIdentifier;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public ShippingAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public void setBillingAddress(BillingAddress r1) {
        this.billingAddress = r1;
    }

    public void setCustomerIdentifier(String r1) {
        this.customerIdentifier = r1;
    }

    public void setEmail(String r1) {
        this.email = r1;
    }

    public void setFirstName(String r1) {
        this.firstName = r1;
    }

    public void setLastName(String r1) {
        this.lastName = r1;
    }

    public void setPhone(String r1) {
        this.phone = r1;
    }

    public void setShippingAddress(ShippingAddress r1) {
        this.shippingAddress = r1;
    }

    public CustomerDetails(String r1, String r2, String r3, String r4) {
        this.firstName = r1;
        this.lastName = r2;
        this.email = r3;
        this.phone = r4;
    }
}
