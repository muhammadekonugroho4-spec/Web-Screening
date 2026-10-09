package com.stockbit.domain.model.movers;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final double f84404a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84405b;

    public r(double r2, String r4) {
        kotlin.jvm.internal.p.l(r4, "formatted");
        this.f84404a = r2;
        this.f84405b = r4;
    }

    public final String a() {
        return this.f84405b;
    }

    public final double b() {
        return this.f84404a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof r) == true) goto L8;
        return false;
    L8:
        r r82 = (r) r8;
        if (Double.compare(this.f84404a, r82.f84404a) == 0) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84405b, r82.f84405b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f84404a) * 31) + this.f84405b.hashCode();
    }

    public String toString() {
        return "MoversValueEntity(raw=" + this.f84404a + ", formatted=" + this.f84405b + ")";
    }
}
