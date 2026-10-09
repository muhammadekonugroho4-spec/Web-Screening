package com.midtrans.sdk.uikit.models;

import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes6.dex */
public class EnabledPayments implements Serializable {
    private List<EnabledPayment> enabledPayments;

    public EnabledPayments(List r1) {
        this.enabledPayments = r1;
    }

    public List a() {
        return this.enabledPayments;
    }
}
