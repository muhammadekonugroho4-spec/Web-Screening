package com.stockbit.domain.model.movers;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final double f84388a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84389b;

    public l(double r2, String r4) {
        kotlin.jvm.internal.p.l(r4, "formatted");
        this.f84388a = r2;
        this.f84389b = r4;
    }

    public final String a() {
        return this.f84389b;
    }

    public final double b() {
        return this.f84388a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof l) == true) goto L8;
        return false;
    L8:
        l r82 = (l) r8;
        if (Double.compare(this.f84388a, r82.f84388a) == 0) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84389b, r82.f84389b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f84388a) * 31) + this.f84389b.hashCode();
    }

    public String toString() {
        return "MoversNetForeignBuyEntity(raw=" + this.f84388a + ", formatted=" + this.f84389b + ")";
    }
}
