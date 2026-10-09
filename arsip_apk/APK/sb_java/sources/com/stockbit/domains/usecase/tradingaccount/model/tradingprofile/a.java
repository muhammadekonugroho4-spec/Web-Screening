package com.stockbit.domains.usecase.tradingaccount.model.tradingprofile;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f88516a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88517b;

    public a(String r2, String r3) {
        p.l(r2, "income");
        p.l(r3, "sourceOfIncome");
        this.f88516a = r2;
        this.f88517b = r3;
    }

    public final String a() {
        return this.f88516a;
    }

    public final String b() {
        return this.f88517b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f88516a, r52.f88516a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88517b, r52.f88517b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f88516a.hashCode() * 31) + this.f88517b.hashCode();
    }

    public String toString() {
        return "TradingProfileAdditionalIncomeUIState(income=" + this.f88516a + ", sourceOfIncome=" + this.f88517b + ")";
    }
}
