package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.BankTransferRequestModel;

/* loaded from: classes6.dex */
public class BcaBankTransferRequestModel extends BankTransferRequestModel {

    @SerializedName("free_text")
    private FreeText freeText;

    @SerializedName("sub_company_code")
    private String subCompanyCode;

    public BcaBankTransferRequestModel() {
    }

    public String getSubCompanyCode() {
        return this.subCompanyCode;
    }

    public void setSubCompanyCode(String r1) {
        this.subCompanyCode = r1;
    }

    public BcaBankTransferRequestModel(String r1) {
        super(r1);
    }

    public BcaBankTransferRequestModel(String r1, FreeText r2) {
        super(r1);
        this.freeText = r2;
    }
}
