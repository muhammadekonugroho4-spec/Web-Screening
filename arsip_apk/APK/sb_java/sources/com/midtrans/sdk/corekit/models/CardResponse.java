package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class CardResponse {

    @SerializedName("status_code")
    private int code;
    private ArrayList<SaveCardRequest> data;

    @SerializedName("status_message")
    private String status;

    public CardResponse() {
    }

    public int getCode() {
        return this.code;
    }

    public ArrayList<SaveCardRequest> getData() {
        return this.data;
    }

    public String getStatus() {
        return this.status;
    }

    public void setCode(int r1) {
        this.code = r1;
    }

    public void setData(ArrayList<SaveCardRequest> r1) {
        this.data = r1;
    }

    public void setStatus(String r1) {
        this.status = r1;
    }
}
