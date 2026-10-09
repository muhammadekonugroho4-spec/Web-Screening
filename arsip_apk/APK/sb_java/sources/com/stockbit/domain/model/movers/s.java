package com.stockbit.domain.model.movers;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final double f84406a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84407b;

    public s(double r2, String r4) {
        kotlin.jvm.internal.p.l(r4, "formatted");
        this.f84406a = r2;
        this.f84407b = r4;
    }

    public final String a() {
        return this.f84407b;
    }

    public final double b() {
        return this.f84406a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof s) == true) goto L8;
        return false;
    L8:
        s r82 = (s) r8;
        if (Double.compare(this.f84406a, r82.f84406a) == 0) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84407b, r82.f84407b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f84406a) * 31) + this.f84407b.hashCode();
    }

    public String toString() {
        return "MoversVolumeEntity(raw=" + this.f84406a + ", formatted=" + this.f84407b + ")";
    }
}
