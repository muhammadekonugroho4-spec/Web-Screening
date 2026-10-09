package com.stockbit.feature.transaction.ui.nego.orderstock.model;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final double f114954a;

    /* renamed from: b, reason: collision with root package name */
    public final double f114955b;

    static {
    }

    public k(double r1, double r3) {
        this.f114954a = r1;
        this.f114955b = r3;
    }

    public final k a(double r2, double r4) {
        return new k(r2, r4);
    }

    public final boolean b() {
        if (this.f114954a <= 0.0d) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean c() {
        if (this.f114955b != 0.0d) goto L5;
        boolean r02 = true;
    L7:
        return !r02;
    L5:
        r02 = false;
        goto L7
    }

    public final double d() {
        return this.f114954a;
    }

    public final double e() {
        return this.f114955b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof k) == true) goto L8;
        return false;
    L8:
        k r82 = (k) r8;
        if (Double.compare(this.f114954a, r82.f114954a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f114955b, r82.f114955b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f114954a) * 31) + Double.hashCode(this.f114955b);
    }

    public String toString() {
        return "OrderNegoConfigUIState(maxAmount=" + this.f114954a + ", minAmount=" + this.f114955b + ')';
    }

    public /* synthetic */ k(double r3, double r5, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = 0.0d;
    L6:
        if ((r7 & 2) == 0) goto L8;
        r5 = 0.0d;
    L8:
        this(r3, r5);
    }
}
