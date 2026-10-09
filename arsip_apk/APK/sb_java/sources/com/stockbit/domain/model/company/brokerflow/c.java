package com.stockbit.domain.model.company.brokerflow;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f81427a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81428b;

    public c(double r2, String r4) {
        p.l(r4, "formatted");
        this.f81427a = r2;
        this.f81428b = r4;
    }

    public final String a() {
        return this.f81428b;
    }

    public final double b() {
        return this.f81427a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (Double.compare(this.f81427a, r82.f81427a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f81428b, r82.f81428b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f81427a) * 31) + this.f81428b.hashCode();
    }

    public String toString() {
        return "BrokerFlowOhlcEntity(raw=" + this.f81427a + ", formatted=" + this.f81428b + ")";
    }
}
