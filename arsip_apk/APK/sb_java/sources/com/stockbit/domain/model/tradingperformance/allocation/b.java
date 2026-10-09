package com.stockbit.domain.model.tradingperformance.allocation;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f85989a;

    /* renamed from: b, reason: collision with root package name */
    public final a f85990b;

    public b(c r2, a r3) {
        p.l(r2, "summary");
        p.l(r3, "portfolio");
        this.f85989a = r2;
        this.f85990b = r3;
    }

    public static /* synthetic */ b b(b r02, c r1, a r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f85989a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f85990b;
    L9:
        return r02.a(r1, r2);
    }

    public final b a(c r2, a r3) {
        p.l(r2, "summary");
        p.l(r3, "portfolio");
        return new b(r2, r3);
    }

    public final a c() {
        return this.f85990b;
    }

    public final c d() {
        return this.f85989a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f85989a, r52.f85989a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85990b, r52.f85990b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85989a.hashCode() * 31) + this.f85990b.hashCode();
    }

    public String toString() {
        return "PortfolioAllocationEntity(summary=" + this.f85989a + ", portfolio=" + this.f85990b + ")";
    }

    public /* synthetic */ b(c r10, a r11, int r12, kotlin.jvm.internal.i r13) {
        if ((r12 & 1) == 0) goto L6;
        r10 = new c(0.0d, 0.0d, 0.0d, 7, null);
    L6:
        if ((r12 & 2) == 0) goto L8;
        r11 = new a(null, null, 3, null);
    L8:
        this(r10, r11);
    }
}
