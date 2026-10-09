package com.stockbit.domain.model.bond.portfolio.list;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f80828a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.domain.model.bond.portfolio.a f80829b;

    /* renamed from: c, reason: collision with root package name */
    public final com.stockbit.domain.model.bond.portfolio.a f80830c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f80831e;

    /* renamed from: f, reason: collision with root package name */
    public final double f80832f;

    /* renamed from: g, reason: collision with root package name */
    public final double f80833g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80834h;

    /* renamed from: i, reason: collision with root package name */
    public final double f80835i;

    /* renamed from: j, reason: collision with root package name */
    public final com.stockbit.domain.model.bond.portfolio.b f80836j;

    /* renamed from: k, reason: collision with root package name */
    public final com.stockbit.domain.model.bond.portfolio.a f80837k;

    /* renamed from: l, reason: collision with root package name */
    public final com.stockbit.domain.model.bond.portfolio.a f80838l;

    /* renamed from: m, reason: collision with root package name */
    public final double f80839m;

    /* renamed from: n, reason: collision with root package name */
    public final String f80840n;

    /* renamed from: o, reason: collision with root package name */
    public final String f80841o;

    /* renamed from: p, reason: collision with root package name */
    public final double f80842p;

    public a(double r8, com.stockbit.domain.model.bond.portfolio.a r10, com.stockbit.domain.model.bond.portfolio.a r11, double r12, double r14, double r16, double r18, String r20, double r21, com.stockbit.domain.model.bond.portfolio.b r23, com.stockbit.domain.model.bond.portfolio.a r24, com.stockbit.domain.model.bond.portfolio.a r25, double r26, String r28, String r29, double r30) {
        p.l(r10, "capitalGainLoss");
        p.l(r11, "dailyAccruedInterest");
        p.l(r20, "pendingUnits");
        p.l(r23, "product");
        p.l(r24, "profitLoss");
        p.l(r25, "projectedReturn");
        p.l(r28, "totalUnits");
        p.l(r29, "units");
        this.f80828a = r8;
        this.f80829b = r10;
        this.f80830c = r11;
        this.d = r12;
        this.f80831e = r14;
        this.f80832f = r16;
        this.f80833g = r18;
        this.f80834h = r20;
        this.f80835i = r21;
        this.f80836j = r23;
        this.f80837k = r24;
        this.f80838l = r25;
        this.f80839m = r26;
        this.f80840n = r28;
        this.f80841o = r29;
        this.f80842p = r30;
    }

    public final double a() {
        return this.f80831e;
    }

    public final double b() {
        return this.f80835i;
    }

    public final com.stockbit.domain.model.bond.portfolio.b c() {
        return this.f80836j;
    }

    public final com.stockbit.domain.model.bond.portfolio.a d() {
        return this.f80837k;
    }

    public final double e() {
        return this.f80839m;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (Double.compare(this.f80828a, r82.f80828a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f80829b, r82.f80829b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80830c, r82.f80830c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f80831e, r82.f80831e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f80832f, r82.f80832f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f80833g, r82.f80833g) == 0) goto L30;
        return false;
    L30:
        if (p.g(this.f80834h, r82.f80834h) == true) goto L33;
        return false;
    L33:
        if (Double.compare(this.f80835i, r82.f80835i) == 0) goto L36;
        return false;
    L36:
        if (p.g(this.f80836j, r82.f80836j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f80837k, r82.f80837k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f80838l, r82.f80838l) == true) goto L45;
        return false;
    L45:
        if (Double.compare(this.f80839m, r82.f80839m) == 0) goto L48;
        return false;
    L48:
        if (p.g(this.f80840n, r82.f80840n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f80841o, r82.f80841o) == true) goto L54;
        return false;
    L54:
        if (Double.compare(this.f80842p, r82.f80842p) == 0) goto L56;
        return false;
    L56:
        return true;
    }

    public final String f() {
        return this.f80840n;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Double.hashCode(this.f80828a) * 31) + this.f80829b.hashCode()) * 31) + this.f80830c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f80831e)) * 31) + Double.hashCode(this.f80832f)) * 31) + Double.hashCode(this.f80833g)) * 31) + this.f80834h.hashCode()) * 31) + Double.hashCode(this.f80835i)) * 31) + this.f80836j.hashCode()) * 31) + this.f80837k.hashCode()) * 31) + this.f80838l.hashCode()) * 31) + Double.hashCode(this.f80839m)) * 31) + this.f80840n.hashCode()) * 31) + this.f80841o.hashCode()) * 31) + Double.hashCode(this.f80842p);
    }

    public String toString() {
        return "BondsPortfolioListDetailEntity(accruedInterest=" + this.f80828a + ", capitalGainLoss=" + this.f80829b + ", dailyAccruedInterest=" + this.f80830c + ", investedAmount=" + this.d + ", marketValue=" + this.f80831e + ", pendingAmount=" + this.f80832f + ", pendingInvested=" + this.f80833g + ", pendingUnits=" + this.f80834h + ", priceRate=" + this.f80835i + ", product=" + this.f80836j + ", profitLoss=" + this.f80837k + ", projectedReturn=" + this.f80838l + ", totalPortfolio=" + this.f80839m + ", totalUnits=" + this.f80840n + ", units=" + this.f80841o + ", yieldRate=" + this.f80842p + ")";
    }
}
