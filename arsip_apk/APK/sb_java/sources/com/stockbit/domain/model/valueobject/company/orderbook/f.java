package com.stockbit.domain.model.valueobject.company.orderbook;

import kotlin.jvm.internal.i;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final double f86806a;

    /* renamed from: b, reason: collision with root package name */
    public double f86807b;

    /* renamed from: c, reason: collision with root package name */
    public double f86808c;
    public double d;

    public f(double r1, double r3, double r5, double r7) {
        this.f86806a = r1;
        this.f86807b = r3;
        this.f86808c = r5;
        this.d = r7;
    }

    public final double a() {
        return this.d;
    }

    public final double b() {
        return this.f86807b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (Double.compare(this.f86806a, r82.f86806a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f86807b, r82.f86807b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f86808c, r82.f86808c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f86806a) * 31) + Double.hashCode(this.f86807b)) * 31) + Double.hashCode(this.f86808c)) * 31) + Double.hashCode(this.d);
    }

    public String toString() {
        return "BandarDetectorDataDetail(vol=" + this.f86806a + ", percent=" + this.f86807b + ", amount=" + this.f86808c + ", accdist=" + this.d + ')';
    }

    public /* synthetic */ f(double r3, double r5, double r7, double r9, int r11, i r12) {
        if ((r11 & 1) == 0) goto L6;
        r3 = 0.0d;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r5 = 0.0d;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r7 = 0.0d;
    L12:
        if ((r11 & 8) == 0) goto L15;
        double r10 = 0.0d;
    L16:
        this(r3, r5, r7, r10);
        return;
    L15:
        r10 = r9;
        goto L16
    }
}
