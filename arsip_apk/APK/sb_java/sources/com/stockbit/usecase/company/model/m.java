package com.stockbit.usecase.company.model;

import java.util.List;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final List f156321a;

    /* renamed from: b, reason: collision with root package name */
    public final List f156322b;

    public m(List r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "xAxis");
        kotlin.jvm.internal.p.l(r3, "chartData");
        this.f156321a = r2;
        this.f156322b = r3;
    }

    public final List a() {
        return this.f156322b;
    }

    public final List b() {
        return this.f156321a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (kotlin.jvm.internal.p.g(this.f156321a, r52.f156321a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156322b, r52.f156322b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156321a.hashCode() * 31) + this.f156322b.hashCode();
    }

    public String toString() {
        return "CompanyFinancialUIState(xAxis=" + this.f156321a + ", chartData=" + this.f156322b + ")";
    }
}
