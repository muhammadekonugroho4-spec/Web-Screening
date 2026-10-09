package com.stockbit.usecase.cryptoportfolio.contract.entity;

import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f157354a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f157355b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f157356c;
    public final BigDecimal d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f157357e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f157358f;

    public d(BigDecimal r2, BigDecimal r3, BigDecimal r4, BigDecimal r5, BigDecimal r6, BigDecimal r7) {
        p.l(r2, "investedValue");
        p.l(r3, "availableBalance");
        p.l(r4, "reservedBalance");
        p.l(r5, "profitLoss");
        p.l(r6, "gainLossPercent");
        p.l(r7, "totalEquity");
        this.f157354a = r2;
        this.f157355b = r3;
        this.f157356c = r4;
        this.d = r5;
        this.f157357e = r6;
        this.f157358f = r7;
    }

    public final BigDecimal a() {
        return this.f157355b;
    }

    public final BigDecimal b() {
        return this.f157357e;
    }

    public final BigDecimal c() {
        return this.f157354a;
    }

    public final BigDecimal d() {
        return this.d;
    }

    public final BigDecimal e() {
        return this.f157356c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f157354a, r52.f157354a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157355b, r52.f157355b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157356c, r52.f157356c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157357e, r52.f157357e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157358f, r52.f157358f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final BigDecimal f() {
        return this.f157358f;
    }

    public int hashCode() {
        return (((((((((this.f157354a.hashCode() * 31) + this.f157355b.hashCode()) * 31) + this.f157356c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157357e.hashCode()) * 31) + this.f157358f.hashCode();
    }

    public String toString() {
        return "CryptoPortfolioSummaryEntity(investedValue=" + this.f157354a + ", availableBalance=" + this.f157355b + ", reservedBalance=" + this.f157356c + ", profitLoss=" + this.d + ", gainLossPercent=" + this.f157357e + ", totalEquity=" + this.f157358f + ")";
    }
}
