package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.BankTransferRequestModel;

/* loaded from: classes6.dex */
public class PermataBankTransferRequestModel extends BankTransferRequestModel {

    @SerializedName("recipient_name")
    private String recipientName;

    public PermataBankTransferRequestModel() {
    }

    public String getRecipientName() {
        return this.recipientName;
    }

    public void setRecipientName(String r1) {
        this.recipientName = r1;
    }

    public PermataBankTransferRequestModel(String r1) {
        super(r1);
    }
}
