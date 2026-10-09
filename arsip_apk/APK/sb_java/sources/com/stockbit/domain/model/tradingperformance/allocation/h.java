package com.stockbit.domain.model.tradingperformance.allocation;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final double f86006a;

    /* renamed from: b, reason: collision with root package name */
    public final double f86007b;

    public h(double r1, double r3) {
        this.f86006a = r1;
        this.f86007b = r3;
    }

    public final double a() {
        return this.f86007b;
    }

    public final double b() {
        return this.f86006a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof h) == true) goto L8;
        return false;
    L8:
        h r82 = (h) r8;
        if (Double.compare(this.f86006a, r82.f86006a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f86007b, r82.f86007b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f86006a) * 31) + Double.hashCode(this.f86007b);
    }

    public String toString() {
        return "StockAllocationPriceAverageEntity(price=" + this.f86006a + ", fee=" + this.f86007b + ")";
    }

    public /* synthetic */ h(double r3, double r5, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = 0.0d;
    L6:
        if ((r7 & 2) == 0) goto L8;
        r5 = 0.0d;
    L8:
        this(r3, r5);
    }
}
