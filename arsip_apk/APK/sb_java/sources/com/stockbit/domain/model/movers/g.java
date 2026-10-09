package com.stockbit.domain.model.movers;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final double f84373a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84374b;

    public g(double r2, String r4) {
        kotlin.jvm.internal.p.l(r4, "formatted");
        this.f84373a = r2;
        this.f84374b = r4;
    }

    public final String a() {
        return this.f84374b;
    }

    public final double b() {
        return this.f84373a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof g) == true) goto L8;
        return false;
    L8:
        g r82 = (g) r8;
        if (Double.compare(this.f84373a, r82.f84373a) == 0) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84374b, r82.f84374b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f84373a) * 31) + this.f84374b.hashCode();
    }

    public String toString() {
        return "MoversFrequencyEntity(raw=" + this.f84373a + ", formatted=" + this.f84374b + ")";
    }
}
