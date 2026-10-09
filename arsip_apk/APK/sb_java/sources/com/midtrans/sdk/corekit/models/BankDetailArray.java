package com.midtrans.sdk.corekit.models;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class BankDetailArray implements Serializable {
    private ArrayList<BankDetail> bankDetails;

    public BankDetailArray() {
    }

    public ArrayList<BankDetail> getBankDetails() {
        return this.bankDetails;
    }

    public void setBankDetails(ArrayList<BankDetail> r1) {
        this.bankDetails = r1;
    }
}
