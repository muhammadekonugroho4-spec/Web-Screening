package com.stockbit.domain.model.securities.order.nego;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final double f85568a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85569b;

    /* renamed from: c, reason: collision with root package name */
    public final double f85570c;

    public d(double r1, double r3, double r5) {
        this.f85568a = r1;
        this.f85569b = r3;
        this.f85570c = r5;
    }

    public final double a() {
        return this.f85568a;
    }

    public final double b() {
        return this.f85570c;
    }

    public final double c() {
        return this.f85569b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (Double.compare(this.f85568a, r82.f85568a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85569b, r82.f85569b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f85570c, r82.f85570c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Double.hashCode(this.f85568a) * 31) + Double.hashCode(this.f85569b)) * 31) + Double.hashCode(this.f85570c);
    }

    public String toString() {
        return "OrderBookNegoEntryEntity(frequency=" + this.f85568a + ", shares=" + this.f85569b + ", price=" + this.f85570c + ")";
    }
}
