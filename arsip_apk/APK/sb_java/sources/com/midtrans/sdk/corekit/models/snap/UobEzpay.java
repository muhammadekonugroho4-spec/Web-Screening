package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class UobEzpay implements Serializable {

    @SerializedName("callback_url")
    private String callbackUrl;

    public UobEzpay(String r1) {
        this.callbackUrl = r1;
    }
}
