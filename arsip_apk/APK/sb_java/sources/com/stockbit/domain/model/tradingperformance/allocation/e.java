package com.stockbit.domain.model.tradingperformance.allocation;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f85996a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85997b;

    /* renamed from: c, reason: collision with root package name */
    public final double f85998c;

    public e(double r1, double r3, double r5) {
        this.f85996a = r1;
        this.f85997b = r3;
        this.f85998c = r5;
    }

    public final double a() {
        return this.f85998c;
    }

    public final double b() {
        return this.f85996a;
    }

    public final double c() {
        return this.f85997b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (Double.compare(this.f85996a, r82.f85996a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85997b, r82.f85997b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f85998c, r82.f85998c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Double.hashCode(this.f85996a) * 31) + Double.hashCode(this.f85997b)) * 31) + Double.hashCode(this.f85998c);
    }

    public String toString() {
        return "StockAllocationAssetUnrealisedEntity(marketValue=" + this.f85996a + ", profitLoss=" + this.f85997b + ", gain=" + this.f85998c + ")";
    }

    public /* synthetic */ e(double r3, double r5, double r7, int r9, kotlin.jvm.internal.i r10) {
        if ((r9 & 1) == 0) goto L6;
        r3 = 0.0d;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r5 = 0.0d;
    L9:
        if ((r9 & 4) == 0) goto L12;
        double r8 = 0.0d;
    L13:
        this(r3, r5, r8);
        return;
    L12:
        r8 = r7;
        goto L13
    }
}
