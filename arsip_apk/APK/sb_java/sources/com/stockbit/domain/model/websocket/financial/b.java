package com.stockbit.domain.model.websocket.financial;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.domain.model.company.orderbook.a f87247a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.domain.model.company.orderbook.a f87248b;

    /* renamed from: c, reason: collision with root package name */
    public final com.stockbit.domain.model.company.orderbook.a f87249c;

    public b(com.stockbit.domain.model.company.orderbook.a r2, com.stockbit.domain.model.company.orderbook.a r3, com.stockbit.domain.model.company.orderbook.a r4) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        p.l(r3, "volume");
        this.f87247a = r2;
        this.f87248b = r3;
        this.f87249c = r4;
    }

    public final com.stockbit.domain.model.company.orderbook.a a() {
        return this.f87249c;
    }

    public final com.stockbit.domain.model.company.orderbook.a b() {
        return this.f87247a;
    }

    public final com.stockbit.domain.model.company.orderbook.a c() {
        return this.f87248b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f87247a, r52.f87247a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87248b, r52.f87248b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87249c, r52.f87249c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f87247a.hashCode() * 31) + this.f87248b.hashCode()) * 31;
        com.stockbit.domain.model.company.orderbook.a r1 = this.f87249c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "OrderBookV3LevelWebSocketEntity(price=" + this.f87247a + ", volume=" + this.f87248b + ", frequency=" + this.f87249c + ")";
    }
}
