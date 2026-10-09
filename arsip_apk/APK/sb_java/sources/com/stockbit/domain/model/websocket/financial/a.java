package com.stockbit.domain.model.websocket.financial;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f87244a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.domain.model.company.orderbook.a f87245b;

    /* renamed from: c, reason: collision with root package name */
    public final com.stockbit.domain.model.company.orderbook.a f87246c;
    public final com.stockbit.domain.model.company.orderbook.a d;

    public a(String r2, com.stockbit.domain.model.company.orderbook.a r3, com.stockbit.domain.model.company.orderbook.a r4, com.stockbit.domain.model.company.orderbook.a r5) {
        p.l(r2, "symbol");
        this.f87244a = r2;
        this.f87245b = r3;
        this.f87246c = r4;
        this.d = r5;
    }

    public final com.stockbit.domain.model.company.orderbook.a a() {
        return this.f87246c;
    }

    public final com.stockbit.domain.model.company.orderbook.a b() {
        return this.d;
    }

    public final com.stockbit.domain.model.company.orderbook.a c() {
        return this.f87245b;
    }

    public final String d() {
        return this.f87244a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f87244a, r52.f87244a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87245b, r52.f87245b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87246c, r52.f87246c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = this.f87244a.hashCode() * 31;
        com.stockbit.domain.model.company.orderbook.a r1 = this.f87245b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        com.stockbit.domain.model.company.orderbook.a r13 = this.f87246c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        com.stockbit.domain.model.company.orderbook.a r15 = this.d;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return r04 + r2;
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "LivePriceV3WebSocketEntity(symbol=" + this.f87244a + ", lastPrice=" + this.f87245b + ", change=" + this.f87246c + ", changePercentage=" + this.d + ")";
    }
}
