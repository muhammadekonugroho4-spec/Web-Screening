package com.stockbit.component.chart.view.networkgraph;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f69940a;

    /* renamed from: b, reason: collision with root package name */
    public final double f69941b;

    static {
    }

    public f(String r2, double r3) {
        kotlin.jvm.internal.p.l(r2, "investorName");
        this.f69940a = r2;
        this.f69941b = r3;
    }

    public final String a() {
        return this.f69940a;
    }

    public final double b() {
        return this.f69941b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (kotlin.jvm.internal.p.g(this.f69940a, r82.f69940a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f69941b, r82.f69941b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f69940a.hashCode() * 31) + Double.hashCode(this.f69941b);
    }

    public String toString() {
        return "InvestorHoldingInfo(investorName=" + this.f69940a + ", percentage=" + this.f69941b + ')';
    }
}
