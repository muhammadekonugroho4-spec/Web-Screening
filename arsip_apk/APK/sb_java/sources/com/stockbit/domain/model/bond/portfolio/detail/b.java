package com.stockbit.domain.model.bond.portfolio.detail;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final double f80782a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.domain.model.bond.portfolio.a f80783b;

    /* renamed from: c, reason: collision with root package name */
    public final a f80784c;
    public final com.stockbit.domain.model.bond.portfolio.a d;

    /* renamed from: e, reason: collision with root package name */
    public final double f80785e;

    /* renamed from: f, reason: collision with root package name */
    public final double f80786f;

    /* renamed from: g, reason: collision with root package name */
    public final double f80787g;

    /* renamed from: h, reason: collision with root package name */
    public final double f80788h;

    /* renamed from: i, reason: collision with root package name */
    public final int f80789i;

    /* renamed from: j, reason: collision with root package name */
    public final double f80790j;

    /* renamed from: k, reason: collision with root package name */
    public final com.stockbit.domain.model.bond.portfolio.b f80791k;

    /* renamed from: l, reason: collision with root package name */
    public final com.stockbit.domain.model.bond.portfolio.a f80792l;

    /* renamed from: m, reason: collision with root package name */
    public final com.stockbit.domain.model.bond.portfolio.a f80793m;

    /* renamed from: n, reason: collision with root package name */
    public final double f80794n;

    /* renamed from: o, reason: collision with root package name */
    public final double f80795o;

    /* renamed from: p, reason: collision with root package name */
    public final com.stockbit.domain.model.bond.portfolio.a f80796p;

    /* renamed from: q, reason: collision with root package name */
    public final int f80797q;

    /* renamed from: r, reason: collision with root package name */
    public final List f80798r;

    /* renamed from: s, reason: collision with root package name */
    public final int f80799s;

    /* renamed from: t, reason: collision with root package name */
    public final double f80800t;

    /* renamed from: u, reason: collision with root package name */
    public final double f80801u;

    public b(double r7, com.stockbit.domain.model.bond.portfolio.a r9, a r10, com.stockbit.domain.model.bond.portfolio.a r11, double r12, double r14, double r16, double r18, int r20, double r21, com.stockbit.domain.model.bond.portfolio.b r23, com.stockbit.domain.model.bond.portfolio.a r24, com.stockbit.domain.model.bond.portfolio.a r25, double r26, double r28, com.stockbit.domain.model.bond.portfolio.a r30, int r31, List r32, int r33, double r34, double r36) {
        p.l(r9, "capitalGainLoss");
        p.l(r10, "couponHistories");
        p.l(r11, "dailyAccruedInterest");
        p.l(r23, "product");
        p.l(r24, "profitLoss");
        p.l(r25, "projectedReturn");
        p.l(r30, "totalProfitLoss");
        p.l(r32, "transactions");
        this.f80782a = r7;
        this.f80783b = r9;
        this.f80784c = r10;
        this.d = r11;
        this.f80785e = r12;
        this.f80786f = r14;
        this.f80787g = r16;
        this.f80788h = r18;
        this.f80789i = r20;
        this.f80790j = r21;
        this.f80791k = r23;
        this.f80792l = r24;
        this.f80793m = r25;
        this.f80794n = r26;
        this.f80795o = r28;
        this.f80796p = r30;
        this.f80797q = r31;
        this.f80798r = r32;
        this.f80799s = r33;
        this.f80800t = r34;
        this.f80801u = r36;
    }

    public final double a() {
        return this.f80782a;
    }

    public final com.stockbit.domain.model.bond.portfolio.a b() {
        return this.f80783b;
    }

    public final a c() {
        return this.f80784c;
    }

    public final com.stockbit.domain.model.bond.portfolio.a d() {
        return this.d;
    }

    public final double e() {
        return this.f80785e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (Double.compare(this.f80782a, r82.f80782a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f80783b, r82.f80783b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80784c, r82.f80784c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f80785e, r82.f80785e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f80786f, r82.f80786f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f80787g, r82.f80787g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f80788h, r82.f80788h) == 0) goto L33;
        return false;
    L33:
        if (this.f80789i == r82.f80789i) goto L36;
        return false;
    L36:
        if (Double.compare(this.f80790j, r82.f80790j) == 0) goto L39;
        return false;
    L39:
        if (p.g(this.f80791k, r82.f80791k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f80792l, r82.f80792l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f80793m, r82.f80793m) == true) goto L48;
        return false;
    L48:
        if (Double.compare(this.f80794n, r82.f80794n) == 0) goto L51;
        return false;
    L51:
        if (Double.compare(this.f80795o, r82.f80795o) == 0) goto L54;
        return false;
    L54:
        if (p.g(this.f80796p, r82.f80796p) == true) goto L57;
        return false;
    L57:
        if (this.f80797q == r82.f80797q) goto L60;
        return false;
    L60:
        if (p.g(this.f80798r, r82.f80798r) == true) goto L63;
        return false;
    L63:
        if (this.f80799s == r82.f80799s) goto L66;
        return false;
    L66:
        if (Double.compare(this.f80800t, r82.f80800t) == 0) goto L69;
        return false;
    L69:
        if (Double.compare(this.f80801u, r82.f80801u) == 0) goto L71;
        return false;
    L71:
        return true;
    }

    public final double f() {
        return this.f80788h;
    }

    public final double g() {
        return this.f80790j;
    }

    public final com.stockbit.domain.model.bond.portfolio.b h() {
        return this.f80791k;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((Double.hashCode(this.f80782a) * 31) + this.f80783b.hashCode()) * 31) + this.f80784c.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f80785e)) * 31) + Double.hashCode(this.f80786f)) * 31) + Double.hashCode(this.f80787g)) * 31) + Double.hashCode(this.f80788h)) * 31) + Integer.hashCode(this.f80789i)) * 31) + Double.hashCode(this.f80790j)) * 31) + this.f80791k.hashCode()) * 31) + this.f80792l.hashCode()) * 31) + this.f80793m.hashCode()) * 31) + Double.hashCode(this.f80794n)) * 31) + Double.hashCode(this.f80795o)) * 31) + this.f80796p.hashCode()) * 31) + Integer.hashCode(this.f80797q)) * 31) + this.f80798r.hashCode()) * 31) + Integer.hashCode(this.f80799s)) * 31) + Double.hashCode(this.f80800t)) * 31) + Double.hashCode(this.f80801u);
    }

    public final com.stockbit.domain.model.bond.portfolio.a i() {
        return this.f80792l;
    }

    public final com.stockbit.domain.model.bond.portfolio.a j() {
        return this.f80793m;
    }

    public final double k() {
        return this.f80801u;
    }

    public final double l() {
        return this.f80794n;
    }

    public final double m() {
        return this.f80795o;
    }

    public final com.stockbit.domain.model.bond.portfolio.a n() {
        return this.f80796p;
    }

    public final int o() {
        return this.f80797q;
    }

    public final List p() {
        return this.f80798r;
    }

    public final double q() {
        return this.f80800t;
    }

    public String toString() {
        return "BondsPortfolioDetailEntity(accruedInterest=" + this.f80782a + ", capitalGainLoss=" + this.f80783b + ", couponHistories=" + this.f80784c + ", dailyAccruedInterest=" + this.d + ", investedAmount=" + this.f80785e + ", marketValue=" + this.f80786f + ", pendingAmount=" + this.f80787g + ", pendingInvested=" + this.f80788h + ", pendingUnits=" + this.f80789i + ", priceRate=" + this.f80790j + ", product=" + this.f80791k + ", profitLoss=" + this.f80792l + ", projectedReturn=" + this.f80793m + ", sellerCoupon=" + this.f80794n + ", totalPortfolio=" + this.f80795o + ", totalProfitLoss=" + this.f80796p + ", totalUnits=" + this.f80797q + ", transactions=" + this.f80798r + ", units=" + this.f80799s + ", yieldRate=" + this.f80800t + ", sellPrice=" + this.f80801u + ")";
    }
}
