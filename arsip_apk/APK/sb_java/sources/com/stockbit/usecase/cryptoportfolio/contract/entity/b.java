package com.stockbit.usecase.cryptoportfolio.contract.entity;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f157330a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157331b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157332c;
    public final BigDecimal d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f157333e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f157334f;

    /* renamed from: g, reason: collision with root package name */
    public final BigDecimal f157335g;

    /* renamed from: h, reason: collision with root package name */
    public final BigDecimal f157336h;

    /* renamed from: i, reason: collision with root package name */
    public final BigDecimal f157337i;

    /* renamed from: j, reason: collision with root package name */
    public final BigDecimal f157338j;

    /* renamed from: k, reason: collision with root package name */
    public final BigDecimal f157339k;

    /* renamed from: l, reason: collision with root package name */
    public final BigDecimal f157340l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f157341m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f157342n;

    public b(String r2, String r3, String r4, BigDecimal r5, BigDecimal r6, BigDecimal r7, BigDecimal r8, BigDecimal r9, BigDecimal r10, BigDecimal r11, BigDecimal r12, BigDecimal r13, boolean r14, boolean r15) {
        p.l(r2, "symbol");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "iconUrl");
        p.l(r5, "balanceQuantity");
        p.l(r6, "availableQuantity");
        p.l(r7, "averagePrice");
        p.l(r8, "currentPrice");
        p.l(r9, "invested");
        p.l(r10, "marketValue");
        p.l(r11, "potentialPnL");
        p.l(r12, "pnlPercentage");
        p.l(r13, "portfolioAllocationPercent");
        this.f157330a = r2;
        this.f157331b = r3;
        this.f157332c = r4;
        this.d = r5;
        this.f157333e = r6;
        this.f157334f = r7;
        this.f157335g = r8;
        this.f157336h = r9;
        this.f157337i = r10;
        this.f157338j = r11;
        this.f157339k = r12;
        this.f157340l = r13;
        this.f157341m = r14;
        this.f157342n = r15;
    }

    public final BigDecimal a() {
        return this.f157333e;
    }

    public final BigDecimal b() {
        return this.f157334f;
    }

    public final BigDecimal c() {
        return this.d;
    }

    public final boolean d() {
        return this.f157341m;
    }

    public final boolean e() {
        return this.f157342n;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f157330a, r52.f157330a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157331b, r52.f157331b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157332c, r52.f157332c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157333e, r52.f157333e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157334f, r52.f157334f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f157335g, r52.f157335g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f157336h, r52.f157336h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f157337i, r52.f157337i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f157338j, r52.f157338j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f157339k, r52.f157339k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f157340l, r52.f157340l) == true) goto L45;
        return false;
    L45:
        if (this.f157341m == r52.f157341m) goto L48;
        return false;
    L48:
        if (this.f157342n == r52.f157342n) goto L50;
        return false;
    L50:
        return true;
    }

    public final BigDecimal f() {
        return this.f157335g;
    }

    public final String g() {
        return this.f157332c;
    }

    public final BigDecimal h() {
        return this.f157336h;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f157330a.hashCode() * 31) + this.f157331b.hashCode()) * 31) + this.f157332c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157333e.hashCode()) * 31) + this.f157334f.hashCode()) * 31) + this.f157335g.hashCode()) * 31) + this.f157336h.hashCode()) * 31) + this.f157337i.hashCode()) * 31) + this.f157338j.hashCode()) * 31) + this.f157339k.hashCode()) * 31) + this.f157340l.hashCode()) * 31) + Boolean.hashCode(this.f157341m)) * 31) + Boolean.hashCode(this.f157342n);
    }

    public final BigDecimal i() {
        return this.f157337i;
    }

    public final String j() {
        return this.f157331b;
    }

    public final BigDecimal k() {
        return this.f157339k;
    }

    public final BigDecimal l() {
        return this.f157340l;
    }

    public final BigDecimal m() {
        return this.f157338j;
    }

    public final String n() {
        return this.f157330a;
    }

    public String toString() {
        return "CryptoPortfolioDetailEntity(symbol=" + this.f157330a + ", name=" + this.f157331b + ", iconUrl=" + this.f157332c + ", balanceQuantity=" + this.d + ", availableQuantity=" + this.f157333e + ", averagePrice=" + this.f157334f + ", currentPrice=" + this.f157335g + ", invested=" + this.f157336h + ", marketValue=" + this.f157337i + ", potentialPnL=" + this.f157338j + ", pnlPercentage=" + this.f157339k + ", portfolioAllocationPercent=" + this.f157340l + ", canBuy=" + this.f157341m + ", canSell=" + this.f157342n + ")";
    }
}
