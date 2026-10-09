package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class SaveCardResponse {

    @SerializedName("status_code")
    private int code;
    private String message;

    @SerializedName("status_message")
    private String status;

    public SaveCardResponse() {
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStatus() {
        return this.status;
    }

    public void setCode(int r1) {
        this.code = r1;
    }

    public void setMessage(String r1) {
        this.message = r1;
    }

    public void setStatus(String r1) {
        this.status = r1;
    }
}
