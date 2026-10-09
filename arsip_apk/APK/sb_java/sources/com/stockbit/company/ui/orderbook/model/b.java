package com.stockbit.company.ui.orderbook.model;

import com.stockbit.usecase.securities.model.order.PortfolioType;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f67603a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67604b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67605c;
    public final PortfolioType d;

    static {
    }

    public b(String r2, String r3, String r4, PortfolioType r5) {
        p.l(r2, "avgPrice");
        p.l(r3, "balanceLot");
        p.l(r4, "availLot");
        p.l(r5, "portfolioType");
        this.f67603a = r2;
        this.f67604b = r3;
        this.f67605c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f67605c;
    }

    public final String b() {
        return this.f67603a;
    }

    public final String c() {
        return this.f67604b;
    }

    public final PortfolioType d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f67603a, r52.f67603a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f67604b, r52.f67604b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f67605c, r52.f67605c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f67603a.hashCode() * 31) + this.f67604b.hashCode()) * 31) + this.f67605c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "PortfolioDetailOrderBook(avgPrice=" + this.f67603a + ", balanceLot=" + this.f67604b + ", availLot=" + this.f67605c + ", portfolioType=" + this.d + ')';
    }
}
