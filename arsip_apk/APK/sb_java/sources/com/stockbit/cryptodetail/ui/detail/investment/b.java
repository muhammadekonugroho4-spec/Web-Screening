package com.stockbit.cryptodetail.ui.detail.investment;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f79649a;

    /* renamed from: b, reason: collision with root package name */
    public final double f79650b;

    /* renamed from: c, reason: collision with root package name */
    public final double f79651c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f79652e;

    static {
    }

    public b(String r2, double r3, double r5, double r7, double r9) {
        p.l(r2, "symbol");
        this.f79649a = r2;
        this.f79650b = r3;
        this.f79651c = r5;
        this.d = r7;
        this.f79652e = r9;
    }

    public final double a() {
        return this.d;
    }

    public final double b() {
        return this.f79651c;
    }

    public final double c() {
        return this.f79650b;
    }

    public final double d() {
        return this.f79652e;
    }

    public final String e() {
        return this.f79649a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f79649a, r82.f79649a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f79650b, r82.f79650b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f79651c, r82.f79651c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f79652e, r82.f79652e) == 0) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f79649a.hashCode() * 31) + Double.hashCode(this.f79650b)) * 31) + Double.hashCode(this.f79651c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f79652e);
    }

    public String toString() {
        return "CryptoInvestmentUIData(symbol=" + this.f79649a + ", marketValue=" + this.f79650b + ", gainFraction=" + this.f79651c + ", avgPrice=" + this.d + ", pnl=" + this.f79652e + ')';
    }
}
