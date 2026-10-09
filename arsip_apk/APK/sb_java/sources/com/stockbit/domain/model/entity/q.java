package com.stockbit.domain.model.entity;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public String f82797a;

    /* renamed from: b, reason: collision with root package name */
    public String f82798b;

    /* renamed from: c, reason: collision with root package name */
    public String f82799c;

    public q(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        this.f82797a = r2;
        this.f82798b = r3;
        this.f82799c = r4;
    }

    public final String a() {
        return this.f82798b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (kotlin.jvm.internal.p.g(this.f82797a, r52.f82797a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82798b, r52.f82798b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82799c, r52.f82799c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f82797a.hashCode() * 31;
        String r1 = this.f82798b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f82799c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "ReferralStock(id=" + this.f82797a + ", stockCode=" + this.f82798b + ", stockName=" + this.f82799c + ')';
    }
}
