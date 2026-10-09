package com.stockbit.domain.model.tradingperformance.allocation;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f85991a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85992b;

    /* renamed from: c, reason: collision with root package name */
    public final double f85993c;

    public c(double r1, double r3, double r5) {
        this.f85991a = r1;
        this.f85992b = r3;
        this.f85993c = r5;
    }

    public static /* synthetic */ c b(c r7, double r8, double r10, double r12, int r14, Object r15) {
        if ((r14 & 1) == 0) goto L5;
        r8 = r7.f85991a;
    L5:
        double r1 = r8;
        if ((r14 & 2) == 0) goto L8;
        r10 = r7.f85992b;
    L8:
        double r3 = r10;
        if ((r14 & 4) == 0) goto L12;
        r12 = r7.f85993c;
    L12:
        return r7.a(r1, r3, r12);
    }

    public final c a(double r8, double r10, double r12) {
        return new c(r8, r10, r12);
    }

    public final double c() {
        return this.f85993c;
    }

    public final double d() {
        return this.f85992b;
    }

    public final double e() {
        return this.f85991a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (Double.compare(this.f85991a, r82.f85991a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85992b, r82.f85992b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f85993c, r82.f85993c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Double.hashCode(this.f85991a) * 31) + Double.hashCode(this.f85992b)) * 31) + Double.hashCode(this.f85993c);
    }

    public String toString() {
        return "PortfolioAllocationSummaryEntity(tradingBalance=" + this.f85991a + ", equity=" + this.f85992b + ", allocatedAmount=" + this.f85993c + ")";
    }

    public /* synthetic */ c(double r3, double r5, double r7, int r9, kotlin.jvm.internal.i r10) {
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
