package com.stockbit.domain.model.company.comparison;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f81442a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81443b;

    public f(String r2, String r3) {
        p.l(r2, "symbol");
        p.l(r3, "value");
        this.f81442a = r2;
        this.f81443b = r3;
    }

    public final String a() {
        return this.f81442a;
    }

    public final String b() {
        return this.f81443b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f81442a, r52.f81442a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81443b, r52.f81443b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81442a.hashCode() * 31) + this.f81443b.hashCode();
    }

    public String toString() {
        return "MetricRatioItemEntity(symbol=" + this.f81442a + ", value=" + this.f81443b + ")";
    }
}
