package com.stockbit.domain.model.securities.common;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final double f85087a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85088b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85089c;
    public final double d;

    public g(double r1, double r3, int r5, double r6) {
        this.f85087a = r1;
        this.f85088b = r3;
        this.f85089c = r5;
        this.d = r6;
    }

    public final double a() {
        return this.f85087a;
    }

    public final double b() {
        return this.f85088b;
    }

    public final int c() {
        return this.f85089c;
    }

    public final double d() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof g) == true) goto L8;
        return false;
    L8:
        g r82 = (g) r8;
        if (Double.compare(this.f85087a, r82.f85087a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85088b, r82.f85088b) == 0) goto L15;
        return false;
    L15:
        if (this.f85089c == r82.f85089c) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f85087a) * 31) + Double.hashCode(this.f85088b)) * 31) + Integer.hashCode(this.f85089c)) * 31) + Double.hashCode(this.d);
    }

    public String toString() {
        return "MarginTradingEntity(atRiskRatioThreshold=" + this.f85087a + ", forceSellRatioThreshold=" + this.f85088b + ", marginCallCounter=" + this.f85089c + ", marginCallRatioThreshold=" + this.d + ")";
    }

    public /* synthetic */ g(double r3, double r5, int r7, double r8, int r10, kotlin.jvm.internal.i r11) {
        if ((r10 & 1) == 0) goto L6;
        r3 = 0.0d;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r5 = 0.0d;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r7 = 0;
    L12:
        if ((r10 & 8) == 0) goto L15;
        double r9 = 0.0d;
    L16:
        this(r3, r5, r7, r9);
        return;
    L15:
        r9 = r8;
        goto L16
    }
}
