package com.stockbit.domain.model.company.iepiev;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final double f81567a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81568b;

    public d(double r2, String r4) {
        p.l(r4, "formatted");
        this.f81567a = r2;
        this.f81568b = r4;
    }

    public static /* synthetic */ d b(d r02, double r1, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f81567a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r3 = r02.f81568b;
    L9:
        return r02.a(r1, r3);
    }

    public final d a(double r2, String r4) {
        p.l(r4, "formatted");
        return new d(r2, r4);
    }

    public final String c() {
        return this.f81568b;
    }

    public final double d() {
        return this.f81567a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (Double.compare(this.f81567a, r82.f81567a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f81568b, r82.f81568b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f81567a) * 31) + this.f81568b.hashCode();
    }

    public String toString() {
        return "PriceFeedItemEntity(raw=" + this.f81567a + ", formatted=" + this.f81568b + ")";
    }
}
