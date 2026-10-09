package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class Token {

    @SerializedName("error_messages")
    private ArrayList<String> errorMessages;

    @SerializedName("token")
    private String tokenId;

    public Token() {
    }

    public ArrayList<String> getErrorMessage() {
        return this.errorMessages;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public void setTokenId(String r1) {
        this.tokenId = r1;
    }
}
