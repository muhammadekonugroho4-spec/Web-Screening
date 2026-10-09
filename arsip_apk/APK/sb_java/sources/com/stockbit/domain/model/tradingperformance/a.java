package com.stockbit.domain.model.tradingperformance;

import kotlin.jvm.internal.i;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f85985a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85986b;

    public a(double r1, double r3) {
        this.f85985a = r1;
        this.f85986b = r3;
    }

    public final double a() {
        return this.f85985a;
    }

    public final double b() {
        return this.f85986b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (Double.compare(this.f85985a, r82.f85985a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85986b, r82.f85986b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f85985a) * 31) + Double.hashCode(this.f85986b);
    }

    public String toString() {
        return "AmountPercentageEntity(amount=" + this.f85985a + ", percentage=" + this.f85986b + ")";
    }

    public /* synthetic */ a(double r3, double r5, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = 0.0d;
    L6:
        if ((r7 & 2) == 0) goto L8;
        r5 = 0.0d;
    L8:
        this(r3, r5);
    }
}
