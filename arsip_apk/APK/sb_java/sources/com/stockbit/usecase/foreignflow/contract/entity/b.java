package com.stockbit.usecase.foreignflow.contract.entity;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f157872a;

    /* renamed from: b, reason: collision with root package name */
    public final List f157873b;

    /* renamed from: c, reason: collision with root package name */
    public final a f157874c;

    public b(List r2, List r3, a r4) {
        p.l(r2, "prices");
        p.l(r3, "netValues");
        p.l(r4, "dateRange");
        this.f157872a = r2;
        this.f157873b = r3;
        this.f157874c = r4;
    }

    public final a a() {
        return this.f157874c;
    }

    public final List b() {
        return this.f157873b;
    }

    public final List c() {
        return this.f157872a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f157872a, r52.f157872a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157873b, r52.f157873b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157874c, r52.f157874c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f157872a.hashCode() * 31) + this.f157873b.hashCode()) * 31) + this.f157874c.hashCode();
    }

    public String toString() {
        return "ForeignFlowHistoricalEntity(prices=" + this.f157872a + ", netValues=" + this.f157873b + ", dateRange=" + this.f157874c + ")";
    }
}
