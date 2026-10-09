package com.stockbit.domain.model.tradingaccount;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f85905a;

    /* renamed from: b, reason: collision with root package name */
    public final c f85906b;

    public a(c r2, c r3) {
        p.l(r2, "income");
        p.l(r3, "sourceOfIncome");
        this.f85905a = r2;
        this.f85906b = r3;
    }

    public final c a() {
        return this.f85905a;
    }

    public final c b() {
        return this.f85906b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f85905a, r52.f85905a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85906b, r52.f85906b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85905a.hashCode() * 31) + this.f85906b.hashCode();
    }

    public String toString() {
        return "TradingAccountAdditionalIncomeEntity(income=" + this.f85905a + ", sourceOfIncome=" + this.f85906b + ")";
    }
}
