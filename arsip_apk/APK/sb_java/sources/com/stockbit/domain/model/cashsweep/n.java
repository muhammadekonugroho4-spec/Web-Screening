package com.stockbit.domain.model.cashsweep;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final double f81153a;

    /* renamed from: b, reason: collision with root package name */
    public final double f81154b;

    public n(double r1, double r3) {
        this.f81153a = r1;
        this.f81154b = r3;
    }

    public final double a() {
        return this.f81153a;
    }

    public final double b() {
        return this.f81154b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof n) == true) goto L8;
        return false;
    L8:
        n r82 = (n) r8;
        if (Double.compare(this.f81153a, r82.f81153a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f81154b, r82.f81154b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f81153a) * 31) + Double.hashCode(this.f81154b);
    }

    public String toString() {
        return "TradingBalanceChangeEntity(amount=" + this.f81153a + ", percentage=" + this.f81154b + ")";
    }
}
