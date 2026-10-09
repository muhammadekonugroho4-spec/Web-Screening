package com.stockbit.component.orderbook.model;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f73085a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f73086b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73087c;
    public final Integer d;

    static {
    }

    public g(String r1, Integer r2, String r3, Integer r4) {
        this.f73085a = r1;
        this.f73086b = r2;
        this.f73087c = r3;
        this.d = r4;
    }

    public final String a() {
        return this.f73085a;
    }

    public final Integer b() {
        return this.f73086b;
    }

    public final String c() {
        return this.f73087c;
    }

    public final Integer d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f73085a, r52.f73085a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f73086b, r52.f73086b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f73087c, r52.f73087c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.f73085a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.f73086b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f73087c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "OrderBookIEPIEVUIState(iepPrice=" + this.f73085a + ", iepPriceColor=" + this.f73086b + ", ievPrice=" + this.f73087c + ", ievPriceColor=" + this.d + ')';
    }
}
