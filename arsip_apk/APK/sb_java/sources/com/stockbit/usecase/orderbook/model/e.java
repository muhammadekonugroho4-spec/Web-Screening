package com.stockbit.usecase.orderbook.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f158834a;

    /* renamed from: b, reason: collision with root package name */
    public final List f158835b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158836c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f158837e;

    /* renamed from: f, reason: collision with root package name */
    public final String f158838f;

    public e(List r2, List r3, String r4, String r5, String r6, String r7) {
        p.l(r2, "bid");
        p.l(r3, "ask");
        p.l(r4, "totalFreqBid");
        p.l(r5, "totalLotBid");
        p.l(r6, "totalLotAsk");
        p.l(r7, "totalFreqAsk");
        this.f158834a = r2;
        this.f158835b = r3;
        this.f158836c = r4;
        this.d = r5;
        this.f158837e = r6;
        this.f158838f = r7;
    }

    public final List a() {
        return this.f158835b;
    }

    public final List b() {
        return this.f158834a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f158834a, r52.f158834a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158835b, r52.f158835b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f158836c, r52.f158836c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f158837e, r52.f158837e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f158838f, r52.f158838f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f158834a.hashCode() * 31) + this.f158835b.hashCode()) * 31) + this.f158836c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f158837e.hashCode()) * 31) + this.f158838f.hashCode();
    }

    public String toString() {
        return "OrderBookNegoListUIState(bid=" + this.f158834a + ", ask=" + this.f158835b + ", totalFreqBid=" + this.f158836c + ", totalLotBid=" + this.d + ", totalLotAsk=" + this.f158837e + ", totalFreqAsk=" + this.f158838f + ")";
    }
}
