package com.stockbit.domain.model.company.comparison;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f81437a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81438b;

    public d(String r2, List r3) {
        p.l(r2, "metricGroupName");
        p.l(r3, "metrics");
        this.f81437a = r2;
        this.f81438b = r3;
    }

    public final String a() {
        return this.f81437a;
    }

    public final List b() {
        return this.f81438b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f81437a, r52.f81437a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81438b, r52.f81438b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81437a.hashCode() * 31) + this.f81438b.hashCode();
    }

    public String toString() {
        return "MetricGroupItemEntity(metricGroupName=" + this.f81437a + ", metrics=" + this.f81438b + ")";
    }
}
