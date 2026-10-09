package com.stockbit.domain.model.bond.portfolio;

import kotlin.jvm.internal.i;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f80771a;

    /* renamed from: b, reason: collision with root package name */
    public final double f80772b;

    public a(double r1, double r3) {
        this.f80771a = r1;
        this.f80772b = r3;
    }

    public final double a() {
        return this.f80771a;
    }

    public final double b() {
        return this.f80772b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (Double.compare(this.f80771a, r82.f80771a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f80772b, r82.f80772b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f80771a) * 31) + Double.hashCode(this.f80772b);
    }

    public String toString() {
        return "BondsPortfolioAmountPercentageEntity(amount=" + this.f80771a + ", percentage=" + this.f80772b + ")";
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
