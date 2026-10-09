package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.MerchantPreferences;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class MerchantData {

    @SerializedName("acquiring_banks")
    private List<String> acquiringBanks;

    @SerializedName("client_key")
    private String clientKey;

    @SerializedName("enabled_principles")
    private List<String> enabledPrinciples;

    @SerializedName("merchant_id")
    private String merchantId;

    @SerializedName("point_banks")
    private ArrayList<String> pointBanks;
    private MerchantPreferences preference;

    @SerializedName("priority_card_feature")
    private String priorityCardFeature;

    @SerializedName("recurring_mid_is_active")
    private Boolean recurringMidIsActive;

    public MerchantData() {
    }

    public List<String> getAcquiringBanks() {
        return this.acquiringBanks;
    }

    public String getClientKey() {
        return this.clientKey;
    }

    public List<String> getEnabledPrinciples() {
        return this.enabledPrinciples;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public ArrayList<String> getPointBanks() {
        return this.pointBanks;
    }

    public MerchantPreferences getPreference() {
        return this.preference;
    }

    public String getPriorityCardFeature() {
        return this.priorityCardFeature;
    }

    public Boolean getRecurringMidIsActive() {
        return this.recurringMidIsActive;
    }

    public void setAcquiringBanks(List<String> r1) {
        this.acquiringBanks = r1;
    }

    public void setClientKey(String r1) {
        this.clientKey = r1;
    }

    public void setEnabledPrinciples(List<String> r1) {
        this.enabledPrinciples = r1;
    }

    public void setMerchantId(String r1) {
        this.merchantId = r1;
    }

    public void setPointBanks(ArrayList<String> r1) {
        this.pointBanks = r1;
    }

    public void setPreference(MerchantPreferences r1) {
        this.preference = r1;
    }

    public void setPriorityCardFeature(String r1) {
        this.priorityCardFeature = r1;
    }

    public void setRecurringMidIsActive(Boolean r1) {
        this.recurringMidIsActive = r1;
    }
}
