package com.stockbit.component.orderbook;

/* renamed from: com.stockbit.component.orderbook.i1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6455i1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f72957a;

    /* renamed from: b, reason: collision with root package name */
    public final float f72958b;

    static {
    }

    public C6455i1(float r1, float r2) {
        this.f72957a = r1;
        this.f72958b = r2;
    }

    public final float a() {
        return this.f72957a;
    }

    public final float b() {
        return this.f72958b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C6455i1) == true) goto L8;
        return false;
    L8:
        C6455i1 r52 = (C6455i1) r5;
        if (Float.compare(this.f72957a, r52.f72957a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f72958b, r52.f72958b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Float.hashCode(this.f72957a) * 31) + Float.hashCode(this.f72958b);
    }

    public String toString() {
        return "OrderBookTableRowUIParam(lotWeight=" + this.f72957a + ", valueWeight=" + this.f72958b + ')';
    }
}
