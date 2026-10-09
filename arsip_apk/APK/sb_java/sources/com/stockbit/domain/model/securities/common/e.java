package com.stockbit.domain.model.securities.common;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f85082a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85083b;

    public e(double r1, double r3) {
        this.f85082a = r1;
        this.f85083b = r3;
    }

    public final double a() {
        return this.f85082a;
    }

    public final double b() {
        return this.f85083b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (Double.compare(this.f85082a, r82.f85082a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85083b, r82.f85083b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f85082a) * 31) + Double.hashCode(this.f85083b);
    }

    public String toString() {
        return "DebtRatioRulesEntity(caution=" + this.f85082a + ", forceSell=" + this.f85083b + ")";
    }
}
