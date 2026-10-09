package com.stockbit.usecase.company.model.ownershipallocation;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f156415a;

    /* renamed from: b, reason: collision with root package name */
    public final double f156416b;

    public f(String r2, double r3) {
        p.l(r2, "investorName");
        this.f156415a = r2;
        this.f156416b = r3;
    }

    public final String a() {
        return this.f156415a;
    }

    public final double b() {
        return this.f156416b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (p.g(this.f156415a, r82.f156415a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f156416b, r82.f156416b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156415a.hashCode() * 31) + Double.hashCode(this.f156416b);
    }

    public String toString() {
        return "InvestorHoldingInfoUIState(investorName=" + this.f156415a + ", percentage=" + this.f156416b + ")";
    }
}
