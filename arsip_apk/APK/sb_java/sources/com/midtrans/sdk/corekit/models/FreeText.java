package com.midtrans.sdk.corekit.models;

import java.util.List;

/* loaded from: classes6.dex */
public class FreeText {
    private List<FreeTextLanguage> inquiry;
    private List<FreeTextLanguage> payment;

    public FreeText(List<FreeTextLanguage> r1, List<FreeTextLanguage> r2) {
        this.inquiry = r1;
        this.payment = r2;
    }

    public void setInquiry(List<FreeTextLanguage> r1) {
        this.inquiry = r1;
    }

    public void setPayment(List<FreeTextLanguage> r1) {
        this.payment = r1;
    }
}
