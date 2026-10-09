package com.stockbit.usecase.cryptoportfolio.contract.entity;

import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f157343a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157344b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157345c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f157346e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f157347f;

    /* renamed from: g, reason: collision with root package name */
    public final BigDecimal f157348g;

    /* renamed from: h, reason: collision with root package name */
    public final BigDecimal f157349h;

    /* renamed from: i, reason: collision with root package name */
    public final BigDecimal f157350i;

    /* renamed from: j, reason: collision with root package name */
    public final BigDecimal f157351j;

    /* renamed from: k, reason: collision with root package name */
    public final BigDecimal f157352k;

    /* renamed from: l, reason: collision with root package name */
    public final BigDecimal f157353l;

    public c(String r2, String r3, String r4, String r5, BigDecimal r6, BigDecimal r7, BigDecimal r8, BigDecimal r9, BigDecimal r10, BigDecimal r11, BigDecimal r12, BigDecimal r13) {
        p.l(r2, "symbol");
        p.l(r3, "baseAsset");
        p.l(r4, "quoteAsset");
        p.l(r5, "sbSymbol");
        p.l(r6, "totalQuantity");
        p.l(r7, "availableQuantity");
        p.l(r8, "averagePrice");
        p.l(r9, "cumulativeCost");
        p.l(r10, "livePrice");
        p.l(r11, "marketValue");
        p.l(r12, "unrealizedPnl");
        p.l(r13, "unrealizedGainPct");
        this.f157343a = r2;
        this.f157344b = r3;
        this.f157345c = r4;
        this.d = r5;
        this.f157346e = r6;
        this.f157347f = r7;
        this.f157348g = r8;
        this.f157349h = r9;
        this.f157350i = r10;
        this.f157351j = r11;
        this.f157352k = r12;
        this.f157353l = r13;
    }

    public final BigDecimal a() {
        return this.f157347f;
    }

    public final BigDecimal b() {
        return this.f157348g;
    }

    public final BigDecimal c() {
        return this.f157349h;
    }

    public final BigDecimal d() {
        return this.f157350i;
    }

    public final BigDecimal e() {
        return this.f157351j;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f157343a, r52.f157343a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157344b, r52.f157344b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157345c, r52.f157345c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157346e, r52.f157346e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157347f, r52.f157347f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f157348g, r52.f157348g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f157349h, r52.f157349h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f157350i, r52.f157350i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f157351j, r52.f157351j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f157352k, r52.f157352k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f157353l, r52.f157353l) == true) goto L44;
        return false;
    L44:
        return true;
    }

    public final String f() {
        return this.f157343a;
    }

    public final BigDecimal g() {
        return this.f157346e;
    }

    public final BigDecimal h() {
        return this.f157353l;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f157343a.hashCode() * 31) + this.f157344b.hashCode()) * 31) + this.f157345c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157346e.hashCode()) * 31) + this.f157347f.hashCode()) * 31) + this.f157348g.hashCode()) * 31) + this.f157349h.hashCode()) * 31) + this.f157350i.hashCode()) * 31) + this.f157351j.hashCode()) * 31) + this.f157352k.hashCode()) * 31) + this.f157353l.hashCode();
    }

    public final BigDecimal i() {
        return this.f157352k;
    }

    public String toString() {
        return "CryptoPortfolioHoldingEntity(symbol=" + this.f157343a + ", baseAsset=" + this.f157344b + ", quoteAsset=" + this.f157345c + ", sbSymbol=" + this.d + ", totalQuantity=" + this.f157346e + ", availableQuantity=" + this.f157347f + ", averagePrice=" + this.f157348g + ", cumulativeCost=" + this.f157349h + ", livePrice=" + this.f157350i + ", marketValue=" + this.f157351j + ", unrealizedPnl=" + this.f157352k + ", unrealizedGainPct=" + this.f157353l + ")";
    }
}
