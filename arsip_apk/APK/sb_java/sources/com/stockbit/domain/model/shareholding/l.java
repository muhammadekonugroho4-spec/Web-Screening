package com.stockbit.domain.model.shareholding;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final double f85791a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85792b;

    public l(double r2, String r4) {
        p.l(r4, "formatted");
        this.f85791a = r2;
        this.f85792b = r4;
    }

    public final String a() {
        return this.f85792b;
    }

    public final double b() {
        return this.f85791a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof l) == true) goto L8;
        return false;
    L8:
        l r82 = (l) r8;
        if (Double.compare(this.f85791a, r82.f85791a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f85792b, r82.f85792b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f85791a) * 31) + this.f85792b.hashCode();
    }

    public String toString() {
        return "ShareholdingPercentageEntity(raw=" + this.f85791a + ", formatted=" + this.f85792b + ")";
    }
}
