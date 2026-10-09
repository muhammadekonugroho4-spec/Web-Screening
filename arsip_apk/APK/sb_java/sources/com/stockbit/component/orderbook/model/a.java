package com.stockbit.component.orderbook.model;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final OrderbookBidAskUIState f73035a;

    /* renamed from: b, reason: collision with root package name */
    public final OrderbookBidAskUIState f73036b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73037c;

    static {
    }

    public a(OrderbookBidAskUIState r1, OrderbookBidAskUIState r2, String r3) {
        this.f73035a = r1;
        this.f73036b = r2;
        this.f73037c = r3;
    }

    public final OrderbookBidAskUIState a() {
        return this.f73036b;
    }

    public final OrderbookBidAskUIState b() {
        return this.f73035a;
    }

    public final String c() {
        return this.f73037c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f73035a, r52.f73035a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f73036b, r52.f73036b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f73037c, r52.f73037c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        OrderbookBidAskUIState r02 = this.f73035a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        OrderbookBidAskUIState r2 = this.f73036b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f73037c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "BidAskItemUiState(bid=" + this.f73035a + ", ask=" + this.f73036b + ", previousPrice=" + this.f73037c + ')';
    }
}
