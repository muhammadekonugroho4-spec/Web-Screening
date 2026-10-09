package com.stockbit.usecase.orderbook.model;

import com.stockbit.usecase.securities.model.OrderBookColorType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f158828a;

    /* renamed from: b, reason: collision with root package name */
    public final OrderBookColorType f158829b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158830c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final OrderBookColorType f158831e;

    /* renamed from: f, reason: collision with root package name */
    public final String f158832f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f158833g;

    public d(String r2, OrderBookColorType r3, String r4, String r5, OrderBookColorType r6, String r7, Integer r8) {
        p.l(r2, "bestBidPrice");
        p.l(r3, "bestBidPriceColor");
        p.l(r4, "bestBidQuantity");
        p.l(r5, "bestAskPrice");
        p.l(r6, "bestAskPriceColor");
        p.l(r7, "bestAskQuantity");
        this.f158828a = r2;
        this.f158829b = r3;
        this.f158830c = r4;
        this.d = r5;
        this.f158831e = r6;
        this.f158832f = r7;
        this.f158833g = r8;
    }

    public final String a() {
        return this.d;
    }

    public final OrderBookColorType b() {
        return this.f158831e;
    }

    public final String c() {
        return this.f158832f;
    }

    public final String d() {
        return this.f158828a;
    }

    public final OrderBookColorType e() {
        return this.f158829b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f158828a, r52.f158828a) == true) goto L12;
        return false;
    L12:
        if (this.f158829b == r52.f158829b) goto L15;
        return false;
    L15:
        if (p.g(this.f158830c, r52.f158830c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f158831e == r52.f158831e) goto L24;
        return false;
    L24:
        if (p.g(this.f158832f, r52.f158832f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f158833g, r52.f158833g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f158830c;
    }

    public final Integer g() {
        return this.f158833g;
    }

    public int hashCode() {
        int r02 = ((((((((((this.f158828a.hashCode() * 31) + this.f158829b.hashCode()) * 31) + this.f158830c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f158831e.hashCode()) * 31) + this.f158832f.hashCode()) * 31;
        Integer r1 = this.f158833g;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "OrderBookBestBidAskUIState(bestBidPrice=" + this.f158828a + ", bestBidPriceColor=" + this.f158829b + ", bestBidQuantity=" + this.f158830c + ", bestAskPrice=" + this.d + ", bestAskPriceColor=" + this.f158831e + ", bestAskQuantity=" + this.f158832f + ", timeLeftSeconds=" + this.f158833g + ")";
    }
}
