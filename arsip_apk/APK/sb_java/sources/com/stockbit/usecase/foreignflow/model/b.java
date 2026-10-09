package com.stockbit.usecase.foreignflow.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f157923a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.usecase.foreignflow.contract.entity.a f157924b;

    public b(List r2, com.stockbit.usecase.foreignflow.contract.entity.a r3) {
        p.l(r2, "points");
        p.l(r3, "dateRange");
        this.f157923a = r2;
        this.f157924b = r3;
    }

    public final com.stockbit.usecase.foreignflow.contract.entity.a a() {
        return this.f157924b;
    }

    public final List b() {
        return this.f157923a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f157923a, r52.f157923a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157924b, r52.f157924b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f157923a.hashCode() * 31) + this.f157924b.hashCode();
    }

    public String toString() {
        return "ForeignFlowHistoricalResult(points=" + this.f157923a + ", dateRange=" + this.f157924b + ")";
    }
}
