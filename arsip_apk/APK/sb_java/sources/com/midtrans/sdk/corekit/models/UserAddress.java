package com.midtrans.sdk.corekit.models;

import java.io.Serializable;

/* loaded from: classes6.dex */
public class UserAddress implements Serializable {
    private String address;
    private int addressType;
    private String city;
    private String country;
    private String zipcode;

    public UserAddress() {
    }

    public String getAddress() {
        return this.address;
    }

    public int getAddressType() {
        return this.addressType;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setAddress(String r1) {
        this.address = r1;
    }

    public void setAddressType(int r1) {
        this.addressType = r1;
    }

    public void setCity(String r1) {
        this.city = r1;
    }

    public void setCountry(String r1) {
        this.country = r1;
    }

    public void setZipcode(String r1) {
        this.zipcode = r1;
    }
}
