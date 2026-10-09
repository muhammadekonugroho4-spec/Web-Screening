package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class BankTransferRequestModel implements Serializable {

    @SerializedName("va_number")
    private String vaNumber;

    public BankTransferRequestModel() {
    }

    public String getVaNumber() {
        return this.vaNumber;
    }

    public void setVaNumber(String r1) {
        this.vaNumber = r1;
    }

    public BankTransferRequestModel(String r1) {
        setVaNumber(r1);
    }
}
