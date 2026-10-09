package com.stockbit.domain.model.company.comparison;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f81435a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81436b;

    public c(List r2, List r3) {
        p.l(r2, "symbols");
        p.l(r3, "metricGroups");
        this.f81435a = r2;
        this.f81436b = r3;
    }

    public final List a() {
        return this.f81436b;
    }

    public final List b() {
        return this.f81435a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f81435a, r52.f81435a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81436b, r52.f81436b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81435a.hashCode() * 31) + this.f81436b.hashCode();
    }

    public String toString() {
        return "CompanyRatioEntity(symbols=" + this.f81435a + ", metricGroups=" + this.f81436b + ")";
    }
}
