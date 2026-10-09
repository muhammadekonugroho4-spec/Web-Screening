package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes6.dex */
public class QrisPaymentParameter {

    @SerializedName("acquirer")
    public List<String> acquirer;

    public QrisPaymentParameter(List<String> r1) {
        this.acquirer = r1;
    }
}
