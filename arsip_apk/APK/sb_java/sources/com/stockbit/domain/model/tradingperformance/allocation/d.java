package com.stockbit.domain.model.tradingperformance.allocation;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f85994a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85995b;

    public d(e r2, double r3) {
        p.l(r2, "unrealised");
        this.f85994a = r2;
        this.f85995b = r3;
    }

    public final d a(e r2, double r3) {
        p.l(r2, "unrealised");
        return new d(r2, r3);
    }

    public final double b() {
        return this.f85995b;
    }

    public final e c() {
        return this.f85994a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (p.g(this.f85994a, r82.f85994a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85995b, r82.f85995b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85994a.hashCode() * 31) + Double.hashCode(this.f85995b);
    }

    public String toString() {
        return "StockAllocationAssetEntity(unrealised=" + this.f85994a + ", amountInvested=" + this.f85995b + ")";
    }

    public /* synthetic */ d(e r10, double r11, int r13, kotlin.jvm.internal.i r14) {
        if ((r13 & 1) == 0) goto L6;
        r10 = new e(0.0d, 0.0d, 0.0d, 7, null);
    L6:
        if ((r13 & 2) == 0) goto L8;
        r11 = 0.0d;
    L8:
        this(r10, r11);
    }
}
