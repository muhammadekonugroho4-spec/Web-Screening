package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class KlikBCADescriptionModel {
    private String description;

    @SerializedName("user_id")
    private String userId;

    public KlikBCADescriptionModel() {
    }

    public String getDescription() {
        return this.description;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setDescription(String r1) {
        this.description = r1;
    }

    public void setUserId(String r1) {
        this.userId = r1;
    }

    public KlikBCADescriptionModel(String r1, String r2) {
        setDescription(r1);
        setUserId(r2);
    }
}
