package com.stockbit.domain.model.securities.formula;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final double f85183a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85184b;

    public d(double r1, double r3) {
        this.f85183a = r1;
        this.f85184b = r3;
    }

    public final double a() {
        return this.f85183a;
    }

    public final double b() {
        return this.f85184b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (Double.compare(this.f85183a, r82.f85183a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85184b, r82.f85184b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f85183a) * 31) + Double.hashCode(this.f85184b);
    }

    public String toString() {
        return "FeeEntity(buy=" + this.f85183a + ", sell=" + this.f85184b + ")";
    }
}
