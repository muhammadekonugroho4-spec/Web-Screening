package com.stockbit.usecase.cashsweep.model;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f155012a;

    /* renamed from: b, reason: collision with root package name */
    public final double f155013b;

    /* renamed from: c, reason: collision with root package name */
    public final double f155014c;
    public final double d;

    public a(double r1, double r3, double r5, double r7) {
        this.f155012a = r1;
        this.f155013b = r3;
        this.f155014c = r5;
        this.d = r7;
    }

    public final double a() {
        return this.f155013b;
    }

    public final double b() {
        return this.f155014c;
    }

    public final double c() {
        return this.d;
    }

    public final double d() {
        return this.f155012a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (Double.compare(this.f155012a, r82.f155012a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f155013b, r82.f155013b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f155014c, r82.f155014c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f155012a) * 31) + Double.hashCode(this.f155013b)) * 31) + Double.hashCode(this.f155014c)) * 31) + Double.hashCode(this.d);
    }

    public String toString() {
        return "AmountDetailsUIState(withdrawBalance=" + this.f155012a + ", cashSweep=" + this.f155013b + ", fee=" + this.f155014c + ", total=" + this.d + ")";
    }
}
