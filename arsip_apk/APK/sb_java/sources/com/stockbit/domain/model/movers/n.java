package com.stockbit.domain.model.movers;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final double f84392a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84393b;

    public n(double r2, String r4) {
        kotlin.jvm.internal.p.l(r4, "formatted");
        this.f84392a = r2;
        this.f84393b = r4;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof n) == true) goto L8;
        return false;
    L8:
        n r82 = (n) r8;
        if (Double.compare(this.f84392a, r82.f84392a) == 0) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84393b, r82.f84393b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f84392a) * 31) + this.f84393b.hashCode();
    }

    public String toString() {
        return "MoversNetSellEntity(raw=" + this.f84392a + ", formatted=" + this.f84393b + ")";
    }
}
