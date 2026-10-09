package com.stockbit.domain.model.company.orderbook;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f81719a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81720b;

    public a(double r2, String r4) {
        p.l(r4, "formatted");
        this.f81719a = r2;
        this.f81720b = r4;
    }

    public final String a() {
        return this.f81720b;
    }

    public final double b() {
        return this.f81719a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (Double.compare(this.f81719a, r82.f81719a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f81720b, r82.f81720b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f81719a) * 31) + this.f81720b.hashCode();
    }

    public String toString() {
        return "DecimalValueEntity(raw=" + this.f81719a + ", formatted=" + this.f81720b + ")";
    }
}
