package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class BillingAddress {
    private String address;
    private String city;

    @SerializedName("country_code")
    private String countryCode;

    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;
    private String phone;

    @SerializedName("postal_code")
    private String postalCode;

    public BillingAddress() {
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountryCode() {
        return this.countryCode;
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

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setAddress(String r1) {
        this.address = r1;
    }

    public void setCity(String r1) {
        this.city = r1;
    }

    public void setCountryCode(String r1) {
        this.countryCode = r1;
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

    public void setPostalCode(String r1) {
        this.postalCode = r1;
    }

    public BillingAddress(String r1, String r2, String r3, String r4, String r5, String r6, String r7) {
        this.firstName = r1;
        this.lastName = r2;
        this.address = r3;
        this.city = r4;
        this.postalCode = r5;
        this.phone = r6;
        this.countryCode = r7;
    }
}
