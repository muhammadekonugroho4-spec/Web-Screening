package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class RegisterCardResponse extends TransactionResponse implements Serializable {

    @SerializedName("user_id")
    private String userId;

    public RegisterCardResponse(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        super(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String r1) {
        this.userId = r1;
    }
}
