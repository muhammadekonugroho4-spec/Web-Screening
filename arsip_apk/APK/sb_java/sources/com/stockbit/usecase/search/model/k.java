package com.stockbit.usecase.search.model;

import com.stockbit.usecase.search.type.MarketProfitLossUIType;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f160023a;

    /* renamed from: b, reason: collision with root package name */
    public final MarketProfitLossUIType f160024b;

    public k(String r2, MarketProfitLossUIType r3) {
        kotlin.jvm.internal.p.l(r2, "formatted");
        kotlin.jvm.internal.p.l(r3, "profitLossType");
        this.f160023a = r2;
        this.f160024b = r3;
    }

    public final String a() {
        return this.f160023a;
    }

    public final MarketProfitLossUIType b() {
        return this.f160024b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f160023a, r52.f160023a) == true) goto L12;
        return false;
    L12:
        if (this.f160024b == r52.f160024b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f160023a.hashCode() * 31) + this.f160024b.hashCode();
    }

    public String toString() {
        return "MarketIHSGOrderBookFormattedPriceUIState(formatted=" + this.f160023a + ", profitLossType=" + this.f160024b + ")";
    }

    public /* synthetic */ k(String r1, MarketProfitLossUIType r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "-";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = MarketProfitLossUIType.NEUTRAL;
    L8:
        this(r1, r2);
    }
}
