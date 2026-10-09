package com.midtrans.sdk.corekit.models.snap;

import java.util.List;

/* loaded from: classes6.dex */
public class BankTransfer {
    private List<String> banks;

    public BankTransfer() {
    }

    public List<String> getBanks() {
        return this.banks;
    }

    public void setBanks(List<String> r1) {
        this.banks = r1;
    }

    public BankTransfer(List<String> r1) {
        setBanks(r1);
    }
}
