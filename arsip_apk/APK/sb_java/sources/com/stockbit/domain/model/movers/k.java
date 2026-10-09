package com.stockbit.domain.model.movers;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final double f84386a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84387b;

    public k(double r2, String r4) {
        kotlin.jvm.internal.p.l(r4, "formatted");
        this.f84386a = r2;
        this.f84387b = r4;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof k) == true) goto L8;
        return false;
    L8:
        k r82 = (k) r8;
        if (Double.compare(this.f84386a, r82.f84386a) == 0) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84387b, r82.f84387b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f84386a) * 31) + this.f84387b.hashCode();
    }

    public String toString() {
        return "MoversNetBuyEntity(raw=" + this.f84386a + ", formatted=" + this.f84387b + ")";
    }
}
