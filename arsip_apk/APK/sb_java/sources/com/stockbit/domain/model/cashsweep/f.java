package com.stockbit.domain.model.cashsweep;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final double f81130a;

    /* renamed from: b, reason: collision with root package name */
    public final l f81131b;

    /* renamed from: c, reason: collision with root package name */
    public final double f81132c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f81133e;

    public f(double r2, l r4, double r5, double r7, double r9) {
        p.l(r4, "profitLoss");
        this.f81130a = r2;
        this.f81131b = r4;
        this.f81132c = r5;
        this.d = r7;
        this.f81133e = r9;
    }

    public final double a() {
        return this.f81132c;
    }

    public final double b() {
        return this.d;
    }

    public final double c() {
        return this.f81133e;
    }

    public final l d() {
        return this.f81131b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (Double.compare(this.f81130a, r82.f81130a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f81131b, r82.f81131b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f81132c, r82.f81132c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f81133e, r82.f81133e) == 0) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.f81130a) * 31) + this.f81131b.hashCode()) * 31) + Double.hashCode(this.f81132c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f81133e);
    }

    public String toString() {
        return "CashSweepMoneyEntity(portfolioAmount=" + this.f81130a + ", profitLoss=" + this.f81131b + ", investedAmount=" + this.f81132c + ", marketValueAmount=" + this.d + ", pendingInvestedAmount=" + this.f81133e + ")";
    }
}
