package com.stockbit.domain.model.tradingperformance.allocation;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final o f86019a;

    /* renamed from: b, reason: collision with root package name */
    public final double f86020b;

    /* renamed from: c, reason: collision with root package name */
    public final List f86021c;

    public n(o r2, double r3, List r5) {
        p.l(r2, "subSector");
        p.l(r5, "stocks");
        this.f86019a = r2;
        this.f86020b = r3;
        this.f86021c = r5;
    }

    public final List a() {
        return this.f86021c;
    }

    public final o b() {
        return this.f86019a;
    }

    public final double c() {
        return this.f86020b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof n) == true) goto L8;
        return false;
    L8:
        n r82 = (n) r8;
        if (p.g(this.f86019a, r82.f86019a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f86020b, r82.f86020b) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.f86021c, r82.f86021c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f86019a.hashCode() * 31) + Double.hashCode(this.f86020b)) * 31) + this.f86021c.hashCode();
    }

    public String toString() {
        return "SubSectorAllocationEntity(subSector=" + this.f86019a + ", totalMarketValue=" + this.f86020b + ", stocks=" + this.f86021c + ")";
    }
}
