package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class TransactionCancelResponse {

    @SerializedName("status_code")
    private String statusCode;

    @SerializedName("status_message")
    private String statusMessage;

    public TransactionCancelResponse() {
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public void setStatusMessage(String r1) {
        this.statusMessage = r1;
    }

    public void setStatus_code(String r1) {
        this.statusCode = r1;
    }
}
