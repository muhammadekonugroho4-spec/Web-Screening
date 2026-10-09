package com.stockbit.domain.model.tradingperformance.allocation;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final double f86014a;

    /* renamed from: b, reason: collision with root package name */
    public final j f86015b;

    /* renamed from: c, reason: collision with root package name */
    public final k f86016c;

    public l(double r2, j r4, k r5) {
        p.l(r4, "available");
        p.l(r5, "balance");
        this.f86014a = r2;
        this.f86015b = r4;
        this.f86016c = r5;
    }

    public final j a() {
        return this.f86015b;
    }

    public final k b() {
        return this.f86016c;
    }

    public final double c() {
        return this.f86014a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof l) == true) goto L8;
        return false;
    L8:
        l r82 = (l) r8;
        if (Double.compare(this.f86014a, r82.f86014a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f86015b, r82.f86015b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86016c, r82.f86016c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Double.hashCode(this.f86014a) * 31) + this.f86015b.hashCode()) * 31) + this.f86016c.hashCode();
    }

    public String toString() {
        return "StockAllocationQuantityEntity(stockOnHand=" + this.f86014a + ", available=" + this.f86015b + ", balance=" + this.f86016c + ")";
    }

    public /* synthetic */ l(double r8, j r10, k r11, int r12, kotlin.jvm.internal.i r13) {
        if ((r12 & 1) == 0) goto L6;
        r8 = 0.0d;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r10 = new j(0.0d, 0.0d, 3, null);
    L9:
        if ((r12 & 4) == 0) goto L11;
        r11 = new k(0.0d, 0.0d, 3, null);
    L11:
        this(r8, r10, r11);
    }
}
