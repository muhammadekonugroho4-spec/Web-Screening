package com.stockbit.usecase.brokeractivity.model;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final double f154777a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154778b;

    public b(double r2, String r4) {
        kotlin.jvm.internal.p.l(r4, "valueFormatted");
        this.f154777a = r2;
        this.f154778b = r4;
    }

    public final double a() {
        return this.f154777a;
    }

    public final String b() {
        return this.f154778b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (Double.compare(this.f154777a, r82.f154777a) == 0) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f154778b, r82.f154778b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f154777a) * 31) + this.f154778b.hashCode();
    }

    public String toString() {
        return "BrokerActivityChartItemUIState(value=" + this.f154777a + ", valueFormatted=" + this.f154778b + ")";
    }
}
