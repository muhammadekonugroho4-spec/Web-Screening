package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class SnapTokenDetailResponse {

    @SerializedName("token_id")
    private String tokenid;

    public SnapTokenDetailResponse() {
    }

    public String getTokenid() {
        return this.tokenid;
    }

    public void setTokenid(String r1) {
        this.tokenid = r1;
    }
}
