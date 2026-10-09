package com.stockbit.domain.model.movers;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final double f84390a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84391b;

    public m(double r2, String r4) {
        kotlin.jvm.internal.p.l(r4, "formatted");
        this.f84390a = r2;
        this.f84391b = r4;
    }

    public final String a() {
        return this.f84391b;
    }

    public final double b() {
        return this.f84390a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof m) == true) goto L8;
        return false;
    L8:
        m r82 = (m) r8;
        if (Double.compare(this.f84390a, r82.f84390a) == 0) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84391b, r82.f84391b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f84390a) * 31) + this.f84391b.hashCode();
    }

    public String toString() {
        return "MoversNetForeignSellEntity(raw=" + this.f84390a + ", formatted=" + this.f84391b + ")";
    }
}
