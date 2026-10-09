package com.midtrans.sdk.corekit.models.snap;

/* loaded from: classes6.dex */
public class CustomerDetails {
    private String address;
    private String email;
    private String name;
    private String phone;

    public CustomerDetails() {
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setAddress(String r1) {
        this.address = r1;
    }

    public void setEmail(String r1) {
        this.email = r1;
    }

    public void setName(String r1) {
        this.name = r1;
    }

    public void setPhone(String r1) {
        this.phone = r1;
    }

    public CustomerDetails(String r1, String r2, String r3, String r4) {
        setName(r1);
        setPhone(r2);
        setEmail(r3);
        setAddress(r4);
    }
}
