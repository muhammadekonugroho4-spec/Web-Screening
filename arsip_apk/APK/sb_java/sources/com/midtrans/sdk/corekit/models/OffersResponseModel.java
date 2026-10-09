package com.midtrans.sdk.corekit.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class OffersResponseModel {

    @SerializedName(FirebaseAnalytics.Param.DISCOUNT)
    private ArrayList<OffersListModel> binpromo;

    @SerializedName("installment")
    private ArrayList<OffersListModel> installments;

    public OffersResponseModel() {
        this.binpromo = new ArrayList();
        this.installments = new ArrayList();
    }

    public ArrayList<OffersListModel> getBinpromo() {
        return this.binpromo;
    }

    public ArrayList<OffersListModel> getInstallments() {
        return this.installments;
    }

    public void setBinpromo(ArrayList<OffersListModel> r1) {
        this.binpromo = r1;
    }

    public void setInstallments(ArrayList<OffersListModel> r1) {
        this.installments = r1;
    }
}
