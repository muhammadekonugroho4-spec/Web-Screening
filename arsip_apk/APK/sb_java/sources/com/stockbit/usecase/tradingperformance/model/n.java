package com.stockbit.usecase.tradingperformance.model;

import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f163526a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163527b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163528c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final ProfitType f163529e;

    public n(String r2, String r3, String r4, String r5, ProfitType r6) {
        kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        kotlin.jvm.internal.p.l(r3, "equity");
        kotlin.jvm.internal.p.l(r4, "profit");
        kotlin.jvm.internal.p.l(r5, "profitPercentage");
        kotlin.jvm.internal.p.l(r6, "profitType");
        this.f163526a = r2;
        this.f163527b = r3;
        this.f163528c = r4;
        this.d = r5;
        this.f163529e = r6;
    }

    public final String a() {
        return this.f163527b;
    }

    public final String b() {
        return this.f163526a;
    }

    public final String c() {
        return this.f163528c;
    }

    public final String d() {
        return this.d;
    }

    public final ProfitType e() {
        return this.f163529e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f163526a, r52.f163526a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f163527b, r52.f163527b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f163528c, r52.f163528c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f163529e == r52.f163529e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f163526a.hashCode() * 31) + this.f163527b.hashCode()) * 31) + this.f163528c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f163529e.hashCode();
    }

    public String toString() {
        return "TotalEquityReturnUIState(label=" + this.f163526a + ", equity=" + this.f163527b + ", profit=" + this.f163528c + ", profitPercentage=" + this.d + ", profitType=" + this.f163529e + ")";
    }
}
