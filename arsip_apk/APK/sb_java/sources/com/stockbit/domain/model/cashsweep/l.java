package com.stockbit.domain.model.cashsweep;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final double f81149a;

    /* renamed from: b, reason: collision with root package name */
    public final double f81150b;

    public l(double r1, double r3) {
        this.f81149a = r1;
        this.f81150b = r3;
    }

    public final double a() {
        return this.f81149a;
    }

    public final double b() {
        return this.f81150b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof l) == true) goto L8;
        return false;
    L8:
        l r82 = (l) r8;
        if (Double.compare(this.f81149a, r82.f81149a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f81150b, r82.f81150b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f81149a) * 31) + Double.hashCode(this.f81150b);
    }

    public String toString() {
        return "ProfitLossEntity(amount=" + this.f81149a + ", percentage=" + this.f81150b + ")";
    }
}
