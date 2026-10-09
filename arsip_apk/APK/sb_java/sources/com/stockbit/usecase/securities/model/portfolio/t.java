package com.stockbit.usecase.securities.model.portfolio;

import com.stockbit.usecase.securities.model.order.DebtStatusType;

/* loaded from: classes2.dex */
public final class t implements J {

    /* renamed from: a, reason: collision with root package name */
    public final double f161826a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161827b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161828c;
    public final DebtStatusType d;

    /* renamed from: e, reason: collision with root package name */
    public final double f161829e;

    public t(double r2, String r4, String r5, DebtStatusType r6, double r7) {
        kotlin.jvm.internal.p.l(r4, "debtRatioTotal");
        kotlin.jvm.internal.p.l(r5, "debtRatioMarketValue");
        kotlin.jvm.internal.p.l(r6, "debtStatusType");
        this.f161826a = r2;
        this.f161827b = r4;
        this.f161828c = r5;
        this.d = r6;
        this.f161829e = r7;
    }

    public final double A() {
        return this.f161829e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof t) == true) goto L8;
        return false;
    L8:
        t r82 = (t) r8;
        if (Double.compare(this.f161826a, r82.f161826a) == 0) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161827b, r82.f161827b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161828c, r82.f161828c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (Double.compare(this.f161829e, r82.f161829e) == 0) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.f161826a) * 31) + this.f161827b.hashCode()) * 31) + this.f161828c.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f161829e);
    }

    public String toString() {
        return "PortfolioDayTradeSeparatorUIState(debtRatioPercentage=" + this.f161826a + ", debtRatioTotal=" + this.f161827b + ", debtRatioMarketValue=" + this.f161828c + ", debtStatusType=" + this.d + ", maxForceSelling=" + this.f161829e + ")";
    }

    public final String w() {
        return this.f161828c;
    }

    public final double x() {
        return this.f161826a;
    }

    public final String y() {
        return this.f161827b;
    }

    public final DebtStatusType z() {
        return this.d;
    }
}
