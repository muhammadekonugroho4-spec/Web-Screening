package com.stockbit.usecase.transaction.model.confimation;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f163902a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163903b;

    public g(String r2, String r3) {
        p.l(r2, "tradingBalance");
        p.l(r3, "margin");
        this.f163902a = r2;
        this.f163903b = r3;
    }

    public final String a() {
        return this.f163903b;
    }

    public final String b() {
        return this.f163902a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f163902a, r52.f163902a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163903b, r52.f163903b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f163902a.hashCode() * 31) + this.f163903b.hashCode();
    }

    public String toString() {
        return "MarginInvestmentUIState(tradingBalance=" + this.f163902a + ", margin=" + this.f163903b + ")";
    }
}
