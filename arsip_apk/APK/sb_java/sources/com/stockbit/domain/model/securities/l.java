package com.stockbit.domain.model.securities;

import com.clevertap.android.sdk.Constants;
import java.math.BigDecimal;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f85333a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85334b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f85335c;
    public final BigDecimal d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f85336e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f85337f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85338g;

    /* renamed from: h, reason: collision with root package name */
    public final String f85339h;

    /* renamed from: i, reason: collision with root package name */
    public final double f85340i;

    /* renamed from: j, reason: collision with root package name */
    public final double f85341j;

    /* renamed from: k, reason: collision with root package name */
    public final double f85342k;

    /* renamed from: l, reason: collision with root package name */
    public final double f85343l;

    /* renamed from: m, reason: collision with root package name */
    public final double f85344m;

    public l(String r2, String r3, BigDecimal r4, BigDecimal r5, BigDecimal r6, BigDecimal r7, String r8, String r9, double r10, double r12, double r14, double r16, double r18) {
        kotlin.jvm.internal.p.l(r2, "productName");
        kotlin.jvm.internal.p.l(r3, Constants.KEY_ICON);
        kotlin.jvm.internal.p.l(r4, "stampDuty");
        kotlin.jvm.internal.p.l(r5, "accruedInterest");
        kotlin.jvm.internal.p.l(r6, "accruedInterestExcludeTax");
        kotlin.jvm.internal.p.l(r7, "accruedInterestNett");
        kotlin.jvm.internal.p.l(r8, "bondsPrice");
        kotlin.jvm.internal.p.l(r9, "couponTaxPercentage");
        this.f85333a = r2;
        this.f85334b = r3;
        this.f85335c = r4;
        this.d = r5;
        this.f85336e = r6;
        this.f85337f = r7;
        this.f85338g = r8;
        this.f85339h = r9;
        this.f85340i = r10;
        this.f85341j = r12;
        this.f85342k = r14;
        this.f85343l = r16;
        this.f85344m = r18;
    }

    public final BigDecimal a() {
        return this.d;
    }

    public final BigDecimal b() {
        return this.f85336e;
    }

    public final BigDecimal c() {
        return this.f85337f;
    }

    public final String d() {
        return this.f85338g;
    }

    public final double e() {
        return this.f85340i;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof l) == true) goto L8;
        return false;
    L8:
        l r82 = (l) r8;
        if (kotlin.jvm.internal.p.g(this.f85333a, r82.f85333a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f85334b, r82.f85334b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f85335c, r82.f85335c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f85336e, r82.f85336e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f85337f, r82.f85337f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f85338g, r82.f85338g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f85339h, r82.f85339h) == true) goto L33;
        return false;
    L33:
        if (Double.compare(this.f85340i, r82.f85340i) == 0) goto L36;
        return false;
    L36:
        if (Double.compare(this.f85341j, r82.f85341j) == 0) goto L39;
        return false;
    L39:
        if (Double.compare(this.f85342k, r82.f85342k) == 0) goto L42;
        return false;
    L42:
        if (Double.compare(this.f85343l, r82.f85343l) == 0) goto L45;
        return false;
    L45:
        if (Double.compare(this.f85344m, r82.f85344m) == 0) goto L47;
        return false;
    L47:
        return true;
    }

    public final String f() {
        return this.f85339h;
    }

    public final double g() {
        return this.f85341j;
    }

    public final String h() {
        return this.f85334b;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f85333a.hashCode() * 31) + this.f85334b.hashCode()) * 31) + this.f85335c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85336e.hashCode()) * 31) + this.f85337f.hashCode()) * 31) + this.f85338g.hashCode()) * 31) + this.f85339h.hashCode()) * 31) + Double.hashCode(this.f85340i)) * 31) + Double.hashCode(this.f85341j)) * 31) + Double.hashCode(this.f85342k)) * 31) + Double.hashCode(this.f85343l)) * 31) + Double.hashCode(this.f85344m);
    }

    public final String i() {
        return this.f85333a;
    }

    public final double j() {
        return this.f85344m;
    }

    public final BigDecimal k() {
        return this.f85335c;
    }

    public final double l() {
        return this.f85342k;
    }

    public final double m() {
        return this.f85343l;
    }

    public String toString() {
        return "RealizedBondsEntity(productName=" + this.f85333a + ", icon=" + this.f85334b + ", stampDuty=" + this.f85335c + ", accruedInterest=" + this.d + ", accruedInterestExcludeTax=" + this.f85336e + ", accruedInterestNett=" + this.f85337f + ", bondsPrice=" + this.f85338g + ", couponTaxPercentage=" + this.f85339h + ", capitalGainLossNett=" + this.f85340i + ", dailyAccruedInterest=" + this.f85341j + ", totalRealized=" + this.f85342k + ", totalRealizedPercentage=" + this.f85343l + ", sellerCoupon=" + this.f85344m + ")";
    }
}
