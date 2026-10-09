package com.midtrans.sdk.corekit.models.snap;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes6.dex */
public class PromoResponse implements Serializable {
    private List<String> bins;

    @SerializedName("discount_amount")
    private int discountAmount;

    @SerializedName("discount_type")
    private String discountType;

    @SerializedName(FirebaseAnalytics.Param.END_DATE)
    private String endDate;

    /* renamed from: id, reason: collision with root package name */
    private int f42210id;

    @SerializedName("promo_code")
    private String promoCode;

    @SerializedName("sponsor_message_en")
    private String sponsorMessageEn;

    @SerializedName("sponsor_message_id")
    private String sponsorMessageId;

    @SerializedName("sponsor_name")
    private String sponsorName;

    @SerializedName(FirebaseAnalytics.Param.START_DATE)
    private String startDate;

    public PromoResponse() {
    }

    public List<String> getBins() {
        return this.bins;
    }

    public int getDiscountAmount() {
        return this.discountAmount;
    }

    public String getDiscountType() {
        return this.discountType;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public int getId() {
        return this.f42210id;
    }

    public String getPromoCode() {
        return this.promoCode;
    }

    public String getSponsorMessageEn() {
        return this.sponsorMessageEn;
    }

    public String getSponsorMessageId() {
        return this.sponsorMessageId;
    }

    public String getSponsorName() {
        return this.sponsorName;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setBins(List<String> r1) {
        this.bins = r1;
    }

    public void setDiscountAmount(int r1) {
        this.discountAmount = r1;
    }

    public void setDiscountType(String r1) {
        this.discountType = r1;
    }

    public void setEndDate(String r1) {
        this.endDate = r1;
    }

    public void setId(int r1) {
        this.f42210id = r1;
    }

    public void setPromoCode(String r1) {
        this.promoCode = r1;
    }

    public void setSponsorMessageEn(String r1) {
        this.sponsorMessageEn = r1;
    }

    public void setSponsorMessageId(String r1) {
        this.sponsorMessageId = r1;
    }

    public void setSponsorName(String r1) {
        this.sponsorName = r1;
    }

    public void setStartDate(String r1) {
        this.startDate = r1;
    }
}
