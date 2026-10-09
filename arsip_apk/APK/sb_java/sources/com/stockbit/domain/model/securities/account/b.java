package com.stockbit.domain.model.securities.account;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final double f85012a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85013b;

    public b(double r1, double r3) {
        this.f85012a = r1;
        this.f85013b = r3;
    }

    public final double a() {
        return this.f85012a;
    }

    public final double b() {
        return this.f85013b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (Double.compare(this.f85012a, r82.f85012a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85013b, r82.f85013b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f85012a) * 31) + Double.hashCode(this.f85013b);
    }

    public String toString() {
        return "BalanceInfoEntity(buyingPower=" + this.f85012a + ", tradingBalance=" + this.f85013b + ")";
    }
}
