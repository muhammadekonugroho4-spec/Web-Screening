package com.midtrans.sdk.corekit.models;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class GetOffersResponseModel {

    @SerializedName("status_code")
    private int code;

    @SerializedName("status_message")
    private String message;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private OffersResponseModel offers;

    public GetOffersResponseModel() {
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public OffersResponseModel getOffers() {
        return this.offers;
    }

    public void setCode(int r1) {
        this.code = r1;
    }

    public void setMessage(String r1) {
        this.message = r1;
    }

    public void setOffers(OffersResponseModel r1) {
        this.offers = r1;
    }
}
