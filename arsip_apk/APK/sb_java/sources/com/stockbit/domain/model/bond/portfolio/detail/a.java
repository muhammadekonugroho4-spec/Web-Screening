package com.stockbit.domain.model.bond.portfolio.detail;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f80778a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80779b;

    /* renamed from: c, reason: collision with root package name */
    public final double f80780c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f80781e;

    public a(List r2, String r3, double r4, double r6, double r8) {
        p.l(r2, "histories");
        p.l(r3, "historyCount");
        this.f80778a = r2;
        this.f80779b = r3;
        this.f80780c = r4;
        this.d = r6;
        this.f80781e = r8;
    }

    public final List a() {
        return this.f80778a;
    }

    public final double b() {
        return this.f80780c;
    }

    public final double c() {
        return this.f80781e;
    }

    public final double d() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f80778a, r82.f80778a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80779b, r82.f80779b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f80780c, r82.f80780c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f80781e, r82.f80781e) == 0) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f80778a.hashCode() * 31) + this.f80779b.hashCode()) * 31) + Double.hashCode(this.f80780c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f80781e);
    }

    public String toString() {
        return "BondsPortfolioDetailCouponHistoriesEntity(histories=" + this.f80778a + ", historyCount=" + this.f80779b + ", total=" + this.f80780c + ", totalUserCoupon=" + this.d + ", totalSellerCoupon=" + this.f80781e + ")";
    }
}
