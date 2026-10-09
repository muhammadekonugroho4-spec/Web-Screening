package com.stockbit.domain.model.tradingperformance.allocation;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final double f86010a;

    /* renamed from: b, reason: collision with root package name */
    public final double f86011b;

    public j(double r1, double r3) {
        this.f86010a = r1;
        this.f86011b = r3;
    }

    public final double a() {
        return this.f86010a;
    }

    public final double b() {
        return this.f86011b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof j) == true) goto L8;
        return false;
    L8:
        j r82 = (j) r8;
        if (Double.compare(this.f86010a, r82.f86010a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f86011b, r82.f86011b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f86010a) * 31) + Double.hashCode(this.f86011b);
    }

    public String toString() {
        return "StockAllocationQuantityAvailableEntity(lot=" + this.f86010a + ", share=" + this.f86011b + ")";
    }

    public /* synthetic */ j(double r3, double r5, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = 0.0d;
    L6:
        if ((r7 & 2) == 0) goto L8;
        r5 = 0.0d;
    L8:
        this(r3, r5);
    }
}
