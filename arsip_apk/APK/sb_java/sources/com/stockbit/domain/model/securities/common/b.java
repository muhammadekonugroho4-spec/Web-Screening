package com.stockbit.domain.model.securities.common;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final double f85066a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85067b;

    /* renamed from: c, reason: collision with root package name */
    public final double f85068c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f85069e;

    /* renamed from: f, reason: collision with root package name */
    public final double f85070f;

    /* renamed from: g, reason: collision with root package name */
    public final double f85071g;

    /* renamed from: h, reason: collision with root package name */
    public final double f85072h;

    /* renamed from: i, reason: collision with root package name */
    public final double f85073i;

    public b(double r1, double r3, double r5, double r7, double r9, double r11, double r13, double r15, double r17) {
        this.f85066a = r1;
        this.f85067b = r3;
        this.f85068c = r5;
        this.d = r7;
        this.f85069e = r9;
        this.f85070f = r11;
        this.f85071g = r13;
        this.f85072h = r15;
        this.f85073i = r17;
    }

    public final double a() {
        return this.f85068c;
    }

    public final double b() {
        return this.d;
    }

    public final double c() {
        return this.f85069e;
    }

    public final double d() {
        return this.f85070f;
    }

    public final double e() {
        return this.f85073i;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (Double.compare(this.f85066a, r82.f85066a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85067b, r82.f85067b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f85068c, r82.f85068c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f85069e, r82.f85069e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f85070f, r82.f85070f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f85071g, r82.f85071g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f85072h, r82.f85072h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f85073i, r82.f85073i) == 0) goto L35;
        return false;
    L35:
        return true;
    }

    public final double f() {
        return this.f85072h;
    }

    public final double g() {
        return this.f85071g;
    }

    public final double h() {
        return this.f85067b;
    }

    public int hashCode() {
        return (((((((((((((((Double.hashCode(this.f85066a) * 31) + Double.hashCode(this.f85067b)) * 31) + Double.hashCode(this.f85068c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f85069e)) * 31) + Double.hashCode(this.f85070f)) * 31) + Double.hashCode(this.f85071g)) * 31) + Double.hashCode(this.f85072h)) * 31) + Double.hashCode(this.f85073i);
    }

    public final double i() {
        return this.f85066a;
    }

    public String toString() {
        return "CashInfoEntity(tradeLimit=" + this.f85066a + ", tradeBalance=" + this.f85067b + ", dayTradeBuyingPower=" + this.f85068c + ", dayTradeLeverage=" + this.d + ", dayTradeTradingBalance=" + this.f85069e + ", marginBuyingPower=" + this.f85070f + ", marginTradingBalance=" + this.f85071g + ", marginTotalDebt=" + this.f85072h + ", marginTotalCollateral=" + this.f85073i + ")";
    }
}
