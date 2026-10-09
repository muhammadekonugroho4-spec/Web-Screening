package com.stockbit.domain.model.bond.portfolio.detail;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f80807a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80808b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80809c;
    public final double d;

    public e(double r2, String r4, String r5, double r6) {
        p.l(r4, "maturityDate");
        p.l(r5, "nextCouponDate");
        this.f80807a = r2;
        this.f80808b = r4;
        this.f80809c = r5;
        this.d = r6;
    }

    public final double a() {
        return this.f80807a;
    }

    public final String b() {
        return this.f80808b;
    }

    public final String c() {
        return this.f80809c;
    }

    public final double d() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (Double.compare(this.f80807a, r82.f80807a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f80808b, r82.f80808b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80809c, r82.f80809c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f80807a) * 31) + this.f80808b.hashCode()) * 31) + this.f80809c.hashCode()) * 31) + Double.hashCode(this.d);
    }

    public String toString() {
        return "BondsPortfolioDetailMetaEntity(couponRate=" + this.f80807a + ", maturityDate=" + this.f80808b + ", nextCouponDate=" + this.f80809c + ", sellPriceRate=" + this.d + ")";
    }
}
