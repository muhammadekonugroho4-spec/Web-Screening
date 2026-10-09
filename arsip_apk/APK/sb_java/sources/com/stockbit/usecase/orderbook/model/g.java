package com.stockbit.usecase.orderbook.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final OrderBookType f158867a;

    /* renamed from: b, reason: collision with root package name */
    public final List f158868b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158869c;
    public final String d;

    public g(OrderBookType r2, List r3, String r4, String r5) {
        p.l(r2, "type");
        p.l(r3, "bidAsk");
        p.l(r4, "totalLot");
        p.l(r5, "totalFreq");
        this.f158867a = r2;
        this.f158868b = r3;
        this.f158869c = r4;
        this.d = r5;
    }

    public final List a() {
        return this.f158868b;
    }

    public final OrderBookType b() {
        return this.f158867a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (this.f158867a == r52.f158867a) goto L12;
        return false;
    L12:
        if (p.g(this.f158868b, r52.f158868b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f158869c, r52.f158869c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f158867a.hashCode() * 31) + this.f158868b.hashCode()) * 31) + this.f158869c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "OrderBookWebSocketUIState(type=" + this.f158867a + ", bidAsk=" + this.f158868b + ", totalLot=" + this.f158869c + ", totalFreq=" + this.d + ")";
    }
}
