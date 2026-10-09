package com.stockbit.domain.model.company.orderbook;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f81723a;

    /* renamed from: b, reason: collision with root package name */
    public final e f81724b;

    /* renamed from: c, reason: collision with root package name */
    public final e f81725c;
    public final OrderBookAutoRejectType d;

    public c(double r2, e r4, e r5, OrderBookAutoRejectType r6) {
        p.l(r4, "changeToPrev");
        p.l(r5, "changeToBase");
        p.l(r6, "type");
        this.f81723a = r2;
        this.f81724b = r4;
        this.f81725c = r5;
        this.d = r6;
    }

    public final e a() {
        return this.f81725c;
    }

    public final e b() {
        return this.f81724b;
    }

    public final OrderBookAutoRejectType c() {
        return this.d;
    }

    public final double d() {
        return this.f81723a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (Double.compare(this.f81723a, r82.f81723a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f81724b, r82.f81724b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81725c, r82.f81725c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f81723a) * 31) + this.f81724b.hashCode()) * 31) + this.f81725c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "OrderBookAutoRejectEntity(value=" + this.f81723a + ", changeToPrev=" + this.f81724b + ", changeToBase=" + this.f81725c + ", type=" + this.d + ")";
    }
}
