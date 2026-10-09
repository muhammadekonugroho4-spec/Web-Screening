package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class DeleteCardResponse {

    @SerializedName("status_code")
    private int code;

    @SerializedName("message")
    private String error;

    @SerializedName("status_message")
    private String message;

    public DeleteCardResponse() {
    }

    public int getCode() {
        return this.code;
    }

    public String getError() {
        return this.error;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(int r1) {
        this.code = r1;
    }

    public void setError(String r1) {
        this.error = r1;
    }

    public void setMessage(String r1) {
        this.message = r1;
    }
}
