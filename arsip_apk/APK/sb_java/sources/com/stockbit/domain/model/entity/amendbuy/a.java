package com.stockbit.domain.model.entity.amendbuy;

import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f82518a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f82519b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f82520c;
    public final BigDecimal d;

    public a(BigDecimal r2, BigDecimal r3, BigDecimal r4, BigDecimal r5) {
        p.l(r2, "usedTradingBalance");
        p.l(r3, "tradingBalance");
        p.l(r4, "amountCreditLimit");
        p.l(r5, "marginBuyingPower");
        this.f82518a = r2;
        this.f82519b = r3;
        this.f82520c = r4;
        this.d = r5;
    }

    public final BigDecimal a() {
        return this.d;
    }

    public final BigDecimal b() {
        return this.f82519b;
    }

    public final BigDecimal c() {
        return this.f82518a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f82518a, r52.f82518a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82519b, r52.f82519b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82520c, r52.f82520c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f82518a.hashCode() * 31) + this.f82519b.hashCode()) * 31) + this.f82520c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "AmendBuyBalanceEntity(usedTradingBalance=" + this.f82518a + ", tradingBalance=" + this.f82519b + ", amountCreditLimit=" + this.f82520c + ", marginBuyingPower=" + this.d + ')';
    }
}
