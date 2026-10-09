package com.stockbit.usecase.cryptotransaction.contract.entity;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f157401a;

    /* renamed from: b, reason: collision with root package name */
    public final double f157402b;

    /* renamed from: c, reason: collision with root package name */
    public final double f157403c;

    public e(double r1, double r3, double r5) {
        this.f157401a = r1;
        this.f157402b = r3;
        this.f157403c = r5;
    }

    public final double a() {
        return this.f157401a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (Double.compare(this.f157401a, r82.f157401a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f157402b, r82.f157402b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f157403c, r82.f157403c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Double.hashCode(this.f157401a) * 31) + Double.hashCode(this.f157402b)) * 31) + Double.hashCode(this.f157403c);
    }

    public String toString() {
        return "CryptoBuyBalanceEntity(availableIdr=" + this.f157401a + ", lockedIdr=" + this.f157402b + ", totalIdr=" + this.f157403c + ")";
    }
}
