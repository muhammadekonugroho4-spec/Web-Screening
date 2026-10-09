package com.stockbit.domain.model.bond.portfolio.detail;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final double f80810a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.domain.model.bond.portfolio.a f80811b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80812c;
    public final com.stockbit.domain.model.bond.portfolio.a d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80813e;

    /* renamed from: f, reason: collision with root package name */
    public final double f80814f;

    /* renamed from: g, reason: collision with root package name */
    public final double f80815g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80816h;

    /* renamed from: i, reason: collision with root package name */
    public final double f80817i;

    /* renamed from: j, reason: collision with root package name */
    public final double f80818j;

    /* renamed from: k, reason: collision with root package name */
    public final int f80819k;

    /* renamed from: l, reason: collision with root package name */
    public final double f80820l;

    /* renamed from: m, reason: collision with root package name */
    public final com.stockbit.domain.model.bond.portfolio.a f80821m;

    /* renamed from: n, reason: collision with root package name */
    public final com.stockbit.domain.model.bond.portfolio.a f80822n;

    /* renamed from: o, reason: collision with root package name */
    public final double f80823o;

    /* renamed from: p, reason: collision with root package name */
    public final int f80824p;

    /* renamed from: q, reason: collision with root package name */
    public final int f80825q;

    /* renamed from: r, reason: collision with root package name */
    public final double f80826r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f80827s;

    public f(double r4, com.stockbit.domain.model.bond.portfolio.a r6, String r7, com.stockbit.domain.model.bond.portfolio.a r8, String r9, double r10, double r12, String r14, double r15, double r17, int r19, double r20, com.stockbit.domain.model.bond.portfolio.a r22, com.stockbit.domain.model.bond.portfolio.a r23, double r24, int r26, int r27, double r28, boolean r30) {
        p.l(r6, "capitalGainLoss");
        p.l(r7, "createdAt");
        p.l(r8, "dailyAccruedInterest");
        p.l(r9, "groupField");
        p.l(r14, "orderCode");
        p.l(r22, "profitLoss");
        p.l(r23, "projectedReturn");
        this.f80810a = r4;
        this.f80811b = r6;
        this.f80812c = r7;
        this.d = r8;
        this.f80813e = r9;
        this.f80814f = r10;
        this.f80815g = r12;
        this.f80816h = r14;
        this.f80817i = r15;
        this.f80818j = r17;
        this.f80819k = r19;
        this.f80820l = r20;
        this.f80821m = r22;
        this.f80822n = r23;
        this.f80823o = r24;
        this.f80824p = r26;
        this.f80825q = r27;
        this.f80826r = r28;
        this.f80827s = r30;
    }

    public final String a() {
        return this.f80812c;
    }

    public final double b() {
        return this.f80814f;
    }

    public final String c() {
        return this.f80816h;
    }

    public final double d() {
        return this.f80818j;
    }

    public final int e() {
        return this.f80824p;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (Double.compare(this.f80810a, r82.f80810a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f80811b, r82.f80811b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80812c, r82.f80812c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80813e, r82.f80813e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f80814f, r82.f80814f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f80815g, r82.f80815g) == 0) goto L30;
        return false;
    L30:
        if (p.g(this.f80816h, r82.f80816h) == true) goto L33;
        return false;
    L33:
        if (Double.compare(this.f80817i, r82.f80817i) == 0) goto L36;
        return false;
    L36:
        if (Double.compare(this.f80818j, r82.f80818j) == 0) goto L39;
        return false;
    L39:
        if (this.f80819k == r82.f80819k) goto L42;
        return false;
    L42:
        if (Double.compare(this.f80820l, r82.f80820l) == 0) goto L45;
        return false;
    L45:
        if (p.g(this.f80821m, r82.f80821m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f80822n, r82.f80822n) == true) goto L51;
        return false;
    L51:
        if (Double.compare(this.f80823o, r82.f80823o) == 0) goto L54;
        return false;
    L54:
        if (this.f80824p == r82.f80824p) goto L57;
        return false;
    L57:
        if (this.f80825q == r82.f80825q) goto L60;
        return false;
    L60:
        if (Double.compare(this.f80826r, r82.f80826r) == 0) goto L63;
        return false;
    L63:
        if (this.f80827s == r82.f80827s) goto L65;
        return false;
    L65:
        return true;
    }

    public final int f() {
        return this.f80825q;
    }

    public final boolean g() {
        return this.f80827s;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((Double.hashCode(this.f80810a) * 31) + this.f80811b.hashCode()) * 31) + this.f80812c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80813e.hashCode()) * 31) + Double.hashCode(this.f80814f)) * 31) + Double.hashCode(this.f80815g)) * 31) + this.f80816h.hashCode()) * 31) + Double.hashCode(this.f80817i)) * 31) + Double.hashCode(this.f80818j)) * 31) + Integer.hashCode(this.f80819k)) * 31) + Double.hashCode(this.f80820l)) * 31) + this.f80821m.hashCode()) * 31) + this.f80822n.hashCode()) * 31) + Double.hashCode(this.f80823o)) * 31) + Integer.hashCode(this.f80824p)) * 31) + Integer.hashCode(this.f80825q)) * 31) + Double.hashCode(this.f80826r)) * 31) + Boolean.hashCode(this.f80827s);
    }

    public String toString() {
        return "BondsPortfolioDetailTransactionEntity(accruedInterest=" + this.f80810a + ", capitalGainLoss=" + this.f80811b + ", createdAt=" + this.f80812c + ", dailyAccruedInterest=" + this.d + ", groupField=" + this.f80813e + ", investedAmount=" + this.f80814f + ", marketValue=" + this.f80815g + ", orderCode=" + this.f80816h + ", pendingAmount=" + this.f80817i + ", pendingInvested=" + this.f80818j + ", pendingUnits=" + this.f80819k + ", priceRate=" + this.f80820l + ", profitLoss=" + this.f80821m + ", projectedReturn=" + this.f80822n + ", totalPortfolio=" + this.f80823o + ", totalUnits=" + this.f80824p + ", units=" + this.f80825q + ", yieldRate=" + this.f80826r + ", isStableEarn=" + this.f80827s + ")";
    }
}
