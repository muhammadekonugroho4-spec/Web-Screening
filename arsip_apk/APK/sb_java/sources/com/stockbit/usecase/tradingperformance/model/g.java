package com.stockbit.usecase.tradingperformance.model;

import java.util.List;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final j f163483a;

    /* renamed from: b, reason: collision with root package name */
    public final List f163484b;

    public g(j r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "totalOther");
        kotlin.jvm.internal.p.l(r3, "stocks");
        this.f163483a = r2;
        this.f163484b = r3;
    }

    public final List a() {
        return this.f163484b;
    }

    public final j b() {
        return this.f163483a;
    }

    public final boolean c() {
        return !this.f163484b.isEmpty();
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (kotlin.jvm.internal.p.g(this.f163483a, r52.f163483a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f163484b, r52.f163484b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f163483a.hashCode() * 31) + this.f163484b.hashCode();
    }

    public String toString() {
        return "OtherStockAllocationItemUIState(totalOther=" + this.f163483a + ", stocks=" + this.f163484b + ")";
    }
}
