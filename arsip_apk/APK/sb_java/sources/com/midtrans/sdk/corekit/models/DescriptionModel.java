package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class DescriptionModel {

    @SerializedName("description")
    private String description;

    public DescriptionModel(String r1) {
        this.description = r1;
    }

    public String getDescription() {
        return this.description;
    }
}
