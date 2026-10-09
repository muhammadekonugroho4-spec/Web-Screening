package com.midtrans.sdk.corekit.models.snap.params;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class PromoDetails {

    @SerializedName("discounted_gross_amount")
    private Double discountedGrossAmount;

    @SerializedName("promo_id")
    private Long promoId;

    public PromoDetails(Long r1, Double r2) {
        this.promoId = r1;
        this.discountedGrossAmount = r2;
    }
}
