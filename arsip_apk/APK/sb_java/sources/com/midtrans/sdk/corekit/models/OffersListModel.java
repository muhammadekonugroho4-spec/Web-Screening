package com.midtrans.sdk.corekit.models;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class OffersListModel implements Serializable {

    @SerializedName("bins")
    private ArrayList<String> bins;
    private String description;

    @SerializedName("discount_percentage")
    private int discountPercentage;

    @SerializedName("installment_terms")
    private List<String> duration;

    @SerializedName(Constants.KEY_TITLE)
    private String offerName;

    public OffersListModel() {
    }

    public ArrayList<String> getBins() {
        return this.bins;
    }

    public String getDescription() {
        return this.description;
    }

    public int getDiscountPercentage() {
        return this.discountPercentage;
    }

    public List<String> getDuration() {
        return this.duration;
    }

    public String getOfferName() {
        return this.offerName;
    }

    public void setBins(ArrayList<String> r1) {
        this.bins = r1;
    }

    public void setDescription(String r1) {
        this.description = r1;
    }

    public void setDiscountPercentage(int r1) {
        this.discountPercentage = r1;
    }

    public void setDuration(List<String> r1) {
        this.duration = r1;
    }

    public void setOfferName(String r1) {
        this.offerName = r1;
    }
}
