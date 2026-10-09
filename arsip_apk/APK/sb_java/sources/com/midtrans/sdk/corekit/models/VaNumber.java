package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class VaNumber implements Serializable {

    @SerializedName("va_number")
    private String accountNumber;
    private String bank;

    public VaNumber() {
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getBank() {
        return this.bank;
    }

    public void setAccountNumber(String r1) {
        this.accountNumber = r1;
    }

    public void setBank(String r1) {
        this.bank = r1;
    }
}
