package com.stockbit.domain.model.securities.formula;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final double f85223a;

    /* renamed from: b, reason: collision with root package name */
    public final c f85224b;

    public h(double r2, c r4) {
        p.l(r4, "exchange");
        this.f85223a = r2;
        this.f85224b = r4;
    }

    public final double a() {
        return this.f85223a;
    }

    public final c b() {
        return this.f85224b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof h) == true) goto L8;
        return false;
    L8:
        h r82 = (h) r8;
        if (Double.compare(this.f85223a, r82.f85223a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f85224b, r82.f85224b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f85223a) * 31) + this.f85224b.hashCode();
    }

    public String toString() {
        return "PreviewFeeEntity(brokerFee=" + this.f85223a + ", exchange=" + this.f85224b + ")";
    }
}
