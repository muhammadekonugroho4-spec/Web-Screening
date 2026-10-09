package com.stockbit.domain.model.company;

import java.util.List;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f81528a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81529b;

    public g(List r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "xAxis");
        kotlin.jvm.internal.p.l(r3, "chartData");
        this.f81528a = r2;
        this.f81529b = r3;
    }

    public final List a() {
        return this.f81529b;
    }

    public final List b() {
        return this.f81528a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (kotlin.jvm.internal.p.g(this.f81528a, r52.f81528a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f81529b, r52.f81529b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81528a.hashCode() * 31) + this.f81529b.hashCode();
    }

    public String toString() {
        return "CompanyFinancialEntity(xAxis=" + this.f81528a + ", chartData=" + this.f81529b + ")";
    }
}
