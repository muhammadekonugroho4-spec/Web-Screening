package com.stockbit.usecase.securities.model;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f160340a;

    /* renamed from: b, reason: collision with root package name */
    public final double f160341b;

    /* renamed from: c, reason: collision with root package name */
    public final double f160342c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f160343e;

    public a(double r1, double r3, double r5, double r7, double r9) {
        this.f160340a = r1;
        this.f160341b = r3;
        this.f160342c = r5;
        this.d = r7;
        this.f160343e = r9;
    }

    public final double a() {
        return this.f160341b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (Double.compare(this.f160340a, r82.f160340a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f160341b, r82.f160341b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f160342c, r82.f160342c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f160343e, r82.f160343e) == 0) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.f160340a) * 31) + Double.hashCode(this.f160341b)) * 31) + Double.hashCode(this.f160342c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f160343e);
    }

    public String toString() {
        return "CashInfoUIState(tradeLimit=" + this.f160340a + ", tradeBalance=" + this.f160341b + ", dayTradeBuyingPower=" + this.f160342c + ", dayTradeLeverage=" + this.d + ", dayTradeTradingBalance=" + this.f160343e + ")";
    }
}
