package com.stockbit.domain.model.entity.securities;

import java.math.BigDecimal;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f83481a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f83482b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f83483c;
    public final BigDecimal d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f83484e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f83485f;

    /* renamed from: g, reason: collision with root package name */
    public final BigDecimal f83486g;

    /* renamed from: h, reason: collision with root package name */
    public final BigDecimal f83487h;

    public c(BigDecimal r2, BigDecimal r3, BigDecimal r4, BigDecimal r5, BigDecimal r6, BigDecimal r7, BigDecimal r8, BigDecimal r9) {
        kotlin.jvm.internal.p.l(r2, "tradingBalance");
        kotlin.jvm.internal.p.l(r3, "tradingLimit");
        kotlin.jvm.internal.p.l(r4, "dayTradeBuyingPower");
        kotlin.jvm.internal.p.l(r5, "dayTradeLeverage");
        kotlin.jvm.internal.p.l(r6, "marginTradingBalance");
        kotlin.jvm.internal.p.l(r7, "marginTradingPower");
        kotlin.jvm.internal.p.l(r8, "marginTotalDebt");
        kotlin.jvm.internal.p.l(r9, "marginTotalCollateral");
        this.f83481a = r2;
        this.f83482b = r3;
        this.f83483c = r4;
        this.d = r5;
        this.f83484e = r6;
        this.f83485f = r7;
        this.f83486g = r8;
        this.f83487h = r9;
    }

    public final BigDecimal a() {
        return this.f83483c;
    }

    public final BigDecimal b() {
        return this.d;
    }

    public final BigDecimal c() {
        return this.f83487h;
    }

    public final BigDecimal d() {
        return this.f83486g;
    }

    public final BigDecimal e() {
        return this.f83484e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (kotlin.jvm.internal.p.g(this.f83481a, r52.f83481a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83482b, r52.f83482b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83483c, r52.f83483c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f83484e, r52.f83484e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f83485f, r52.f83485f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f83486g, r52.f83486g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f83487h, r52.f83487h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final BigDecimal f() {
        return this.f83485f;
    }

    public final BigDecimal g() {
        return this.f83481a;
    }

    public final BigDecimal h() {
        return this.f83482b;
    }

    public int hashCode() {
        return (((((((((((((this.f83481a.hashCode() * 31) + this.f83482b.hashCode()) * 31) + this.f83483c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f83484e.hashCode()) * 31) + this.f83485f.hashCode()) * 31) + this.f83486g.hashCode()) * 31) + this.f83487h.hashCode();
    }

    public String toString() {
        return "CashInfo(tradingBalance=" + this.f83481a + ", tradingLimit=" + this.f83482b + ", dayTradeBuyingPower=" + this.f83483c + ", dayTradeLeverage=" + this.d + ", marginTradingBalance=" + this.f83484e + ", marginTradingPower=" + this.f83485f + ", marginTotalDebt=" + this.f83486g + ", marginTotalCollateral=" + this.f83487h + ')';
    }
}
