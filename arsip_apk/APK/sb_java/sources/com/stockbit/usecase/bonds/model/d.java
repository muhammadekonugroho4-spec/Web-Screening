package com.stockbit.usecase.bonds.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f154532a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154533b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154534c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f154535e;

    /* renamed from: f, reason: collision with root package name */
    public final double f154536f;

    /* renamed from: g, reason: collision with root package name */
    public final double f154537g;

    /* renamed from: h, reason: collision with root package name */
    public final List f154538h;

    /* renamed from: i, reason: collision with root package name */
    public final List f154539i;

    /* renamed from: j, reason: collision with root package name */
    public final List f154540j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f154541k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f154542l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f154543m;

    public d(List r4, String r5, String r6, String r7, double r8, double r10, double r12, List r14, List r15, List r16, boolean r17, boolean r18, boolean r19) {
        p.l(r4, "chartPoints");
        p.l(r5, "latestYieldPercent");
        p.l(r6, "latestBuyPricePercent");
        p.l(r7, "latestSellPricePercent");
        p.l(r14, "listOfYieldPercent");
        p.l(r15, "listOfBuyPricePercent");
        p.l(r16, "listOfSellPricePercent");
        this.f154532a = r4;
        this.f154533b = r5;
        this.f154534c = r6;
        this.d = r7;
        this.f154535e = r8;
        this.f154536f = r10;
        this.f154537g = r12;
        this.f154538h = r14;
        this.f154539i = r15;
        this.f154540j = r16;
        this.f154541k = r17;
        this.f154542l = r18;
        this.f154543m = r19;
    }

    public final List a() {
        return this.f154532a;
    }

    public final List b() {
        return this.f154539i;
    }

    public final List c() {
        return this.f154540j;
    }

    public final List d() {
        return this.f154538h;
    }

    public final boolean e() {
        return this.f154542l;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (p.g(this.f154532a, r82.f154532a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154533b, r82.f154533b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154534c, r82.f154534c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f154535e, r82.f154535e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f154536f, r82.f154536f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f154537g, r82.f154537g) == 0) goto L30;
        return false;
    L30:
        if (p.g(this.f154538h, r82.f154538h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f154539i, r82.f154539i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f154540j, r82.f154540j) == true) goto L39;
        return false;
    L39:
        if (this.f154541k == r82.f154541k) goto L42;
        return false;
    L42:
        if (this.f154542l == r82.f154542l) goto L45;
        return false;
    L45:
        if (this.f154543m == r82.f154543m) goto L47;
        return false;
    L47:
        return true;
    }

    public final boolean f() {
        return this.f154543m;
    }

    public final boolean g() {
        return this.f154541k;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f154532a.hashCode() * 31) + this.f154533b.hashCode()) * 31) + this.f154534c.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f154535e)) * 31) + Double.hashCode(this.f154536f)) * 31) + Double.hashCode(this.f154537g)) * 31) + this.f154538h.hashCode()) * 31) + this.f154539i.hashCode()) * 31) + this.f154540j.hashCode()) * 31) + Boolean.hashCode(this.f154541k)) * 31) + Boolean.hashCode(this.f154542l)) * 31) + Boolean.hashCode(this.f154543m);
    }

    public String toString() {
        return "BondChartsUIState(chartPoints=" + this.f154532a + ", latestYieldPercent=" + this.f154533b + ", latestBuyPricePercent=" + this.f154534c + ", latestSellPricePercent=" + this.d + ", latestYieldRaw=" + this.f154535e + ", latestBuyPriceRaw=" + this.f154536f + ", latestSellPriceRaw=" + this.f154537g + ", listOfYieldPercent=" + this.f154538h + ", listOfBuyPricePercent=" + this.f154539i + ", listOfSellPricePercent=" + this.f154540j + ", isYieldAllSame=" + this.f154541k + ", isBuyAllSame=" + this.f154542l + ", isSellAllSame=" + this.f154543m + ")";
    }
}
