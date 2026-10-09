package com.stockbit.usecase.cryptotransaction.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f157426a;

    /* renamed from: b, reason: collision with root package name */
    public final double f157427b;

    /* renamed from: c, reason: collision with root package name */
    public final double f157428c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f157429e;

    /* renamed from: f, reason: collision with root package name */
    public final double f157430f;

    /* renamed from: g, reason: collision with root package name */
    public final double f157431g;

    /* renamed from: h, reason: collision with root package name */
    public final double f157432h;

    public k(String r2, double r3, double r5, double r7, double r9, double r11, double r13, double r15) {
        p.l(r2, "coinSymbol");
        this.f157426a = r2;
        this.f157427b = r3;
        this.f157428c = r5;
        this.d = r7;
        this.f157429e = r9;
        this.f157430f = r11;
        this.f157431g = r13;
        this.f157432h = r15;
    }

    public final double a() {
        return this.f157428c;
    }

    public final double b() {
        return this.d;
    }

    public final String c() {
        return this.f157426a;
    }

    public final double d() {
        return this.f157430f;
    }

    public final double e() {
        return this.f157427b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof k) == true) goto L8;
        return false;
    L8:
        k r82 = (k) r8;
        if (p.g(this.f157426a, r82.f157426a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f157427b, r82.f157427b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f157428c, r82.f157428c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f157429e, r82.f157429e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f157430f, r82.f157430f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f157431g, r82.f157431g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f157432h, r82.f157432h) == 0) goto L32;
        return false;
    L32:
        return true;
    }

    public final double f() {
        return this.f157431g;
    }

    public final double g() {
        return this.f157429e;
    }

    public final double h() {
        return this.f157432h;
    }

    public int hashCode() {
        return (((((((((((((this.f157426a.hashCode() * 31) + Double.hashCode(this.f157427b)) * 31) + Double.hashCode(this.f157428c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f157429e)) * 31) + Double.hashCode(this.f157430f)) * 31) + Double.hashCode(this.f157431g)) * 31) + Double.hashCode(this.f157432h);
    }

    public String toString() {
        return "CryptoTickerEntity(coinSymbol=" + this.f157426a + ", lastPrice=" + this.f157427b + ", changeAmount=" + this.f157428c + ", changePct=" + this.d + ", usdPrice=" + this.f157429e + ", high24h=" + this.f157430f + ", low24h=" + this.f157431g + ", volume24h=" + this.f157432h + ")";
    }
}
