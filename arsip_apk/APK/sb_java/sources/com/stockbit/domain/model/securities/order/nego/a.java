package com.stockbit.domain.model.securities.order.nego;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f85557a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85558b;

    public a(double r1, double r3) {
        this.f85557a = r1;
        this.f85558b = r3;
    }

    public final double a() {
        return this.f85557a;
    }

    public final double b() {
        return this.f85558b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (Double.compare(this.f85557a, r82.f85557a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85558b, r82.f85558b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f85557a) * 31) + Double.hashCode(this.f85558b);
    }

    public String toString() {
        return "AraArbNegoEntity(ara=" + this.f85557a + ", arb=" + this.f85558b + ")";
    }
}
