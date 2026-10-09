package com.stockbit.domains.usecase.tradingaccount.model.tradingprofile;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f88553a;

    /* renamed from: b, reason: collision with root package name */
    public final d f88554b;

    /* renamed from: c, reason: collision with root package name */
    public final d f88555c;
    public final List d;

    public g(String r2, d r3, d r4, List r5) {
        p.l(r2, "riskProfileInvestmentGoal");
        p.l(r3, "riskProfileIncomeValue");
        p.l(r4, "riskProfileSourceOfIncome");
        p.l(r5, "riskProfileAdditionalIncome");
        this.f88553a = r2;
        this.f88554b = r3;
        this.f88555c = r4;
        this.d = r5;
    }

    public final List a() {
        return this.d;
    }

    public final d b() {
        return this.f88554b;
    }

    public final String c() {
        return this.f88553a;
    }

    public final d d() {
        return this.f88555c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f88553a, r52.f88553a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88554b, r52.f88554b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88555c, r52.f88555c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f88553a.hashCode() * 31) + this.f88554b.hashCode()) * 31) + this.f88555c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "TradingProfileRiskProfileUIState(riskProfileInvestmentGoal=" + this.f88553a + ", riskProfileIncomeValue=" + this.f88554b + ", riskProfileSourceOfIncome=" + this.f88555c + ", riskProfileAdditionalIncome=" + this.d + ")";
    }
}
