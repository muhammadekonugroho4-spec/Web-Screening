package com.midtrans.sdk.corekit.models;

import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class BankDetail implements Serializable {
    private String Bank_code;
    private String Bin;
    private String Bin_class;
    private String Bin_type;
    private String Card_association;
    private String Country;
    private String Created_at;
    private String Id;
    private String Issuing_bank;
    private String Updated_at;

    public BankDetail() {
    }

    public String getBank_code() {
        return this.Bank_code;
    }

    public String getBin() {
        if (TextUtils.isEmpty(this.Bin) == false) goto L7;
        return "";
    L7:
        return this.Bin;
    }

    public String getBin_class() {
        return this.Bin_class;
    }

    public String getBin_type() {
        return this.Bin_type;
    }

    public String getCard_association() {
        if (TextUtils.isEmpty(this.Card_association) == false) goto L7;
        return "";
    L7:
        return this.Card_association;
    }

    public String getCountry() {
        return this.Country;
    }

    public String getCreated_at() {
        return this.Created_at;
    }

    public String getId() {
        return this.Id;
    }

    public String getIssuing_bank() {
        if (TextUtils.isEmpty(this.Issuing_bank) == false) goto L7;
        return "";
    L7:
        return this.Issuing_bank;
    }

    public String getUpdated_at() {
        return this.Updated_at;
    }

    public void setBank_code(String r1) {
        this.Bank_code = r1;
    }

    public void setBin(String r1) {
        this.Bin = r1;
    }

    public void setBin_class(String r1) {
        this.Bin_class = r1;
    }

    public void setBin_type(String r1) {
        this.Bin_type = r1;
    }

    public void setCard_association(String r1) {
        this.Card_association = r1;
    }

    public void setCountry(String r1) {
        this.Country = r1;
    }

    public void setCreated_at(String r1) {
        this.Created_at = r1;
    }

    public void setId(String r1) {
        this.Id = r1;
    }

    public void setIssuing_bank(String r1) {
        this.Issuing_bank = r1;
    }

    public void setUpdated_at(String r1) {
        this.Updated_at = r1;
    }
}
