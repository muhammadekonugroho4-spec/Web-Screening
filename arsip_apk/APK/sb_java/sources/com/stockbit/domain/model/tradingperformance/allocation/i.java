package com.stockbit.domain.model.tradingperformance.allocation;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final double f86008a;

    /* renamed from: b, reason: collision with root package name */
    public final h f86009b;

    public i(double r2, h r4) {
        p.l(r4, "average");
        this.f86008a = r2;
        this.f86009b = r4;
    }

    public final h a() {
        return this.f86009b;
    }

    public final double b() {
        return this.f86008a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof i) == true) goto L8;
        return false;
    L8:
        i r82 = (i) r8;
        if (Double.compare(this.f86008a, r82.f86008a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f86009b, r82.f86009b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f86008a) * 31) + this.f86009b.hashCode();
    }

    public String toString() {
        return "StockAllocationPriceEntity(latest=" + this.f86008a + ", average=" + this.f86009b + ")";
    }

    public /* synthetic */ i(double r8, h r10, int r11, kotlin.jvm.internal.i r12) {
        if ((r11 & 1) == 0) goto L6;
        r8 = 0.0d;
    L6:
        if ((r11 & 2) == 0) goto L8;
        r10 = new h(0.0d, 0.0d, 3, null);
    L8:
        this(r8, r10);
    }
}
