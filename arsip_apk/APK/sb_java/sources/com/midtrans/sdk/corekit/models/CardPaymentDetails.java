package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class CardPaymentDetails {
    private String bank;

    @SerializedName("bins")
    private ArrayList<String> binsArray;

    @SerializedName("installment_term")
    private String instalmentTerm;
    private boolean recurring;

    @SerializedName("save_token_id")
    private boolean saveTokenId;

    @SerializedName("token_id")
    private String tokenId;

    public CardPaymentDetails(String r1, String r2, boolean r3) {
        this.bank = r1;
        this.tokenId = r2;
        this.saveTokenId = r3;
    }

    public String getBank() {
        return this.bank;
    }

    public ArrayList<String> getBinsArray() {
        return this.binsArray;
    }

    public String getInstalmentTerm() {
        return this.instalmentTerm;
    }

    public boolean getSaveTokenId() {
        return this.saveTokenId;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public boolean isRecurring() {
        return this.recurring;
    }

    public boolean isSaveTokenId() {
        return this.saveTokenId;
    }

    public void setBank(String r1) {
        this.bank = r1;
    }

    public void setBinsArray(ArrayList<String> r1) {
        this.binsArray = r1;
    }

    public void setInstalmentTerm(String r1) {
        this.instalmentTerm = r1;
    }

    public void setRecurring(boolean r1) {
        this.recurring = r1;
    }

    public void setSaveTokenId(boolean r1) {
        this.saveTokenId = r1;
    }

    public void setTokenId(String r1) {
        this.tokenId = r1;
    }

    public CardPaymentDetails(String r1, String r2, boolean r3, String r4, ArrayList<String> r5) {
        this.bank = r1;
        this.tokenId = r2;
        this.saveTokenId = r3;
        this.instalmentTerm = r4;
        this.binsArray = r5;
    }
}
