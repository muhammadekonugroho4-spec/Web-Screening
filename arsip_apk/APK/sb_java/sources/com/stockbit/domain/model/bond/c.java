package com.stockbit.domain.model.bond;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f80749a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80750b;

    /* renamed from: c, reason: collision with root package name */
    public final double f80751c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f80752e;

    /* renamed from: f, reason: collision with root package name */
    public final double f80753f;

    /* renamed from: g, reason: collision with root package name */
    public final double f80754g;

    /* renamed from: h, reason: collision with root package name */
    public final double f80755h;

    /* renamed from: i, reason: collision with root package name */
    public final double f80756i;

    /* renamed from: j, reason: collision with root package name */
    public final double f80757j;

    /* renamed from: k, reason: collision with root package name */
    public final double f80758k;

    /* renamed from: l, reason: collision with root package name */
    public final int f80759l;

    /* renamed from: m, reason: collision with root package name */
    public final double f80760m;

    /* renamed from: n, reason: collision with root package name */
    public final double f80761n;

    /* renamed from: o, reason: collision with root package name */
    public final double f80762o;

    /* renamed from: p, reason: collision with root package name */
    public final double f80763p;

    /* renamed from: q, reason: collision with root package name */
    public final double f80764q;

    /* renamed from: r, reason: collision with root package name */
    public final String f80765r;

    /* renamed from: s, reason: collision with root package name */
    public final double f80766s;

    /* renamed from: t, reason: collision with root package name */
    public final double f80767t;

    /* renamed from: u, reason: collision with root package name */
    public final double f80768u;

    /* renamed from: v, reason: collision with root package name */
    public final String f80769v;

    public c(String r4, String r5, double r6, double r8, double r10, double r12, double r14, double r16, double r18, double r20, double r22, int r24, double r25, double r27, double r29, double r31, double r33, String r35, double r36, double r38, double r40, String r42) {
        p.l(r4, "productSymbol");
        p.l(r5, "productName");
        p.l(r35, "profitLossNettPercentage");
        p.l(r42, "totalRealizedAmountPercentage");
        this.f80749a = r4;
        this.f80750b = r5;
        this.f80751c = r6;
        this.d = r8;
        this.f80752e = r10;
        this.f80753f = r12;
        this.f80754g = r14;
        this.f80755h = r16;
        this.f80756i = r18;
        this.f80757j = r20;
        this.f80758k = r22;
        this.f80759l = r24;
        this.f80760m = r25;
        this.f80761n = r27;
        this.f80762o = r29;
        this.f80763p = r31;
        this.f80764q = r33;
        this.f80765r = r35;
        this.f80766s = r36;
        this.f80767t = r38;
        this.f80768u = r40;
        this.f80769v = r42;
    }

    public final double a() {
        return this.f80762o;
    }

    public final int b() {
        return this.f80759l;
    }

    public final double c() {
        return this.f80766s;
    }

    public final double d() {
        return this.f80763p;
    }

    public final double e() {
        return this.f80756i;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f80749a, r82.f80749a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80750b, r82.f80750b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f80751c, r82.f80751c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f80752e, r82.f80752e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f80753f, r82.f80753f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f80754g, r82.f80754g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f80755h, r82.f80755h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f80756i, r82.f80756i) == 0) goto L36;
        return false;
    L36:
        if (Double.compare(this.f80757j, r82.f80757j) == 0) goto L39;
        return false;
    L39:
        if (Double.compare(this.f80758k, r82.f80758k) == 0) goto L42;
        return false;
    L42:
        if (this.f80759l == r82.f80759l) goto L45;
        return false;
    L45:
        if (Double.compare(this.f80760m, r82.f80760m) == 0) goto L48;
        return false;
    L48:
        if (Double.compare(this.f80761n, r82.f80761n) == 0) goto L51;
        return false;
    L51:
        if (Double.compare(this.f80762o, r82.f80762o) == 0) goto L54;
        return false;
    L54:
        if (Double.compare(this.f80763p, r82.f80763p) == 0) goto L57;
        return false;
    L57:
        if (Double.compare(this.f80764q, r82.f80764q) == 0) goto L60;
        return false;
    L60:
        if (p.g(this.f80765r, r82.f80765r) == true) goto L63;
        return false;
    L63:
        if (Double.compare(this.f80766s, r82.f80766s) == 0) goto L66;
        return false;
    L66:
        if (Double.compare(this.f80767t, r82.f80767t) == 0) goto L69;
        return false;
    L69:
        if (Double.compare(this.f80768u, r82.f80768u) == 0) goto L72;
        return false;
    L72:
        if (p.g(this.f80769v, r82.f80769v) == true) goto L74;
        return false;
    L74:
        return true;
    }

    public final double f() {
        return this.f80761n;
    }

    public final double g() {
        return this.f80755h;
    }

    public final double h() {
        return this.f80760m;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((this.f80749a.hashCode() * 31) + this.f80750b.hashCode()) * 31) + Double.hashCode(this.f80751c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f80752e)) * 31) + Double.hashCode(this.f80753f)) * 31) + Double.hashCode(this.f80754g)) * 31) + Double.hashCode(this.f80755h)) * 31) + Double.hashCode(this.f80756i)) * 31) + Double.hashCode(this.f80757j)) * 31) + Double.hashCode(this.f80758k)) * 31) + Integer.hashCode(this.f80759l)) * 31) + Double.hashCode(this.f80760m)) * 31) + Double.hashCode(this.f80761n)) * 31) + Double.hashCode(this.f80762o)) * 31) + Double.hashCode(this.f80763p)) * 31) + Double.hashCode(this.f80764q)) * 31) + this.f80765r.hashCode()) * 31) + Double.hashCode(this.f80766s)) * 31) + Double.hashCode(this.f80767t)) * 31) + Double.hashCode(this.f80768u)) * 31) + this.f80769v.hashCode();
    }

    public final double i() {
        return this.f80757j;
    }

    public final String j() {
        return this.f80750b;
    }

    public final String k() {
        return this.f80749a;
    }

    public final double l() {
        return this.f80758k;
    }

    public final double m() {
        return this.f80764q;
    }

    public final String n() {
        return this.f80765r;
    }

    public final double o() {
        return this.f80751c;
    }

    public final double p() {
        return this.f80767t;
    }

    public final double q() {
        return this.f80754g;
    }

    public final double r() {
        return this.f80768u;
    }

    public final String s() {
        return this.f80769v;
    }

    public final double t() {
        return this.f80753f;
    }

    public String toString() {
        return "BondPreviewSellEntity(productSymbol=" + this.f80749a + ", productName=" + this.f80750b + ", sellPrice=" + this.f80751c + ", sellAmount=" + this.d + ", accruedInterest=" + this.f80752e + ", totalTax=" + this.f80753f + ", stampDuty=" + this.f80754g + ", estimationDisburse=" + this.f80755h + ", dailyAccruedInterest=" + this.f80756i + ", investedAmount=" + this.f80757j + ", profitLossNet=" + this.f80758k + ", availableUnits=" + this.f80759l + ", estimationSellAmount=" + this.f80760m + ", estimationAmountExcludeTax=" + this.f80761n + ", accruedInterestExcludeTax=" + this.f80762o + ", capitalGainLossNett=" + this.f80763p + ", profitLossNett=" + this.f80764q + ", profitLossNettPercentage=" + this.f80765r + ", capitalGainLoss=" + this.f80766s + ", sellerCoupon=" + this.f80767t + ", totalRealizedAmount=" + this.f80768u + ", totalRealizedAmountPercentage=" + this.f80769v + ")";
    }
}
