package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class AuthModel {

    @SerializedName("X-Auth")
    private String xAuth;

    public AuthModel() {
    }

    public String getxAuth() {
        return this.xAuth;
    }

    public void setxAuth(String r1) {
        this.xAuth = r1;
    }
}
