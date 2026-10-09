package com.stockbit.domain.model.company.orderbook;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f81729a;

    /* renamed from: b, reason: collision with root package name */
    public final float f81730b;

    public e(double r1, float r3) {
        this.f81729a = r1;
        this.f81730b = r3;
    }

    public final float a() {
        return this.f81730b;
    }

    public final double b() {
        return this.f81729a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (Double.compare(this.f81729a, r82.f81729a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f81730b, r82.f81730b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f81729a) * 31) + Float.hashCode(this.f81730b);
    }

    public String toString() {
        return "OrderBookChangeEntity(value=" + this.f81729a + ", percentage=" + this.f81730b + ")";
    }
}
