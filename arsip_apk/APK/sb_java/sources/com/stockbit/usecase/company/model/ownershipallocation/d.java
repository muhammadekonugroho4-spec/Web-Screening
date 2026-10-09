package com.stockbit.usecase.company.model.ownershipallocation;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f156406a;

    /* renamed from: b, reason: collision with root package name */
    public final double f156407b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156408c;

    public d(String r2, double r3, String r5) {
        p.l(r2, "ticker");
        p.l(r5, "logoUrl");
        this.f156406a = r2;
        this.f156407b = r3;
        this.f156408c = r5;
    }

    public final String a() {
        return this.f156408c;
    }

    public final double b() {
        return this.f156407b;
    }

    public final String c() {
        return this.f156406a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (p.g(this.f156406a, r82.f156406a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f156407b, r82.f156407b) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.f156408c, r82.f156408c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f156406a.hashCode() * 31) + Double.hashCode(this.f156407b)) * 31) + this.f156408c.hashCode();
    }

    public String toString() {
        return "HoldingInfoUIState(ticker=" + this.f156406a + ", percentage=" + this.f156407b + ", logoUrl=" + this.f156408c + ")";
    }
}
