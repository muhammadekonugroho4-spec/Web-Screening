package com.stockbit.domain.model.company.orderbook;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f81721a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81722b;

    public b(String r2, boolean r3) {
        p.l(r2, "value");
        this.f81721a = r2;
        this.f81722b = r3;
    }

    public final String a() {
        return this.f81721a;
    }

    public final boolean b() {
        return this.f81722b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f81721a, r52.f81721a) == true) goto L12;
        return false;
    L12:
        if (this.f81722b == r52.f81722b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81721a.hashCode() * 31) + Boolean.hashCode(this.f81722b);
    }

    public String toString() {
        return "OrderBookAraArbEntity(value=" + this.f81721a + ", isVisible=" + this.f81722b + ")";
    }
}
