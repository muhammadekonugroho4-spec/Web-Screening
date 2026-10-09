package com.stockbit.domain.model.movers;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final double f84381a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84382b;

    public i(double r2, String r4) {
        kotlin.jvm.internal.p.l(r4, "formatted");
        this.f84381a = r2;
        this.f84382b = r4;
    }

    public final String a() {
        return this.f84382b;
    }

    public final double b() {
        return this.f84381a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof i) == true) goto L8;
        return false;
    L8:
        i r82 = (i) r8;
        if (Double.compare(this.f84381a, r82.f84381a) == 0) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84382b, r82.f84382b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f84381a) * 31) + this.f84382b.hashCode();
    }

    public String toString() {
        return "MoversIepIevValueEntity(raw=" + this.f84381a + ", formatted=" + this.f84382b + ")";
    }
}
