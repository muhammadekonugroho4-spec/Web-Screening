package com.stockbit.domain.model.cashsweep;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f81106a;

    /* renamed from: b, reason: collision with root package name */
    public final double f81107b;

    /* renamed from: c, reason: collision with root package name */
    public final double f81108c;
    public final double d;

    public a(double r1, double r3, double r5, double r7) {
        this.f81106a = r1;
        this.f81107b = r3;
        this.f81108c = r5;
        this.d = r7;
    }

    public final double a() {
        return this.f81107b;
    }

    public final double b() {
        return this.f81108c;
    }

    public final double c() {
        return this.d;
    }

    public final double d() {
        return this.f81106a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (Double.compare(this.f81106a, r82.f81106a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f81107b, r82.f81107b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f81108c, r82.f81108c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f81106a) * 31) + Double.hashCode(this.f81107b)) * 31) + Double.hashCode(this.f81108c)) * 31) + Double.hashCode(this.d);
    }

    public String toString() {
        return "AmountDetailsEntity(withdrawBalance=" + this.f81106a + ", cashSweep=" + this.f81107b + ", fee=" + this.f81108c + ", total=" + this.d + ")";
    }
}
