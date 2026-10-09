package com.stockbit.domain.model.securities.order;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final double f85555a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85556b;

    public m(double r2, String r4) {
        p.l(r4, "stopPrice");
        this.f85555a = r2;
        this.f85556b = r4;
    }

    public final String a() {
        return this.f85556b;
    }

    public final double b() {
        return this.f85555a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof m) == true) goto L8;
        return false;
    L8:
        m r82 = (m) r8;
        if (Double.compare(this.f85555a, r82.f85555a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f85556b, r82.f85556b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f85555a) * 31) + this.f85556b.hashCode();
    }

    public String toString() {
        return "TrailingStopEntity(trailPercentage=" + this.f85555a + ", stopPrice=" + this.f85556b + ")";
    }
}
