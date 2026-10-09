package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class BCAKlikPayDescriptionModel {
    public static final int DEFAULT_MISC_FEE = 0;
    public static final int NORMAL_TYPE = 1;
    private String description;

    @SerializedName("misc_fee")
    private int miscFee;
    private int type;

    public BCAKlikPayDescriptionModel(int r1, int r2, String r3) {
        setType(r1);
        setMiscFee(r2);
        setDescription(r3);
    }

    public String getDescription() {
        return this.description;
    }

    public int getMiscFee() {
        return this.miscFee;
    }

    public int getType() {
        return this.type;
    }

    public void setDescription(String r1) {
        this.description = r1;
    }

    public void setMiscFee(int r1) {
        this.miscFee = r1;
    }

    public void setType(int r1) {
        this.type = r1;
    }

    public BCAKlikPayDescriptionModel(int r2, String r3) {
        setType(1);
        setMiscFee(r2);
        setDescription(r3);
    }

    public BCAKlikPayDescriptionModel(String r2) {
        setType(1);
        setMiscFee(0);
        setDescription(r2);
    }
}
