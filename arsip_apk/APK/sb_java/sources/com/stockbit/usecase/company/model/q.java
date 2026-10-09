package com.stockbit.usecase.company.model;

import java.util.List;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public List f156553a;

    /* renamed from: b, reason: collision with root package name */
    public List f156554b;

    public q(List r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "symbols");
        kotlin.jvm.internal.p.l(r3, "metricGroups");
        this.f156553a = r2;
        this.f156554b = r3;
    }

    public final List a() {
        return this.f156554b;
    }

    public final List b() {
        return this.f156553a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (kotlin.jvm.internal.p.g(this.f156553a, r52.f156553a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156554b, r52.f156554b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156553a.hashCode() * 31) + this.f156554b.hashCode();
    }

    public String toString() {
        return "CompanyRatioUIState(symbols=" + this.f156553a + ", metricGroups=" + this.f156554b + ")";
    }
}
