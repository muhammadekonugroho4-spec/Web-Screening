package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class Gopay implements Serializable {

    @SerializedName("enable_callback")
    private boolean enableCallback;

    @SerializedName("callback_url")
    private String merchantGopayDeeplink;

    public Gopay(String r1) {
        this.merchantGopayDeeplink = r1;
        this.enableCallback = true;
    }

    public String getMerchantGopayDeeplink() {
        return this.merchantGopayDeeplink;
    }

    public void setMerchantGopayDeeplink(String r1) {
        this.merchantGopayDeeplink = r1;
        this.enableCallback = true;
    }
}
