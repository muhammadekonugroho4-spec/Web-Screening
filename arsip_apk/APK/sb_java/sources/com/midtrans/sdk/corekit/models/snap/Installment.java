package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public class Installment {
    private boolean required;

    @SerializedName("terms")
    @Expose
    private Map<String, ArrayList<Integer>> terms;

    public Installment() {
    }

    public Map<String, ArrayList<Integer>> getTerms() {
        return this.terms;
    }

    public boolean isRequired() {
        return this.required;
    }

    public void setRequired(boolean r1) {
        this.required = r1;
    }

    public void setTerms(Map<String, ArrayList<Integer>> r1) {
        this.terms = r1;
    }
}
