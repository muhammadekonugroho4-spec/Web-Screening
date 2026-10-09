package com.stockbit.stream.contract.ui.model;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f139596a;

    /* renamed from: b, reason: collision with root package name */
    public final double f139597b;

    /* renamed from: c, reason: collision with root package name */
    public final double f139598c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f139599e;

    public b(String r2, double r3, double r5, double r7, double r9) {
        p.l(r2, "symbol");
        this.f139596a = r2;
        this.f139597b = r3;
        this.f139598c = r5;
        this.d = r7;
        this.f139599e = r9;
    }

    public final double a() {
        return this.d;
    }

    public final double b() {
        return this.f139598c;
    }

    public final double c() {
        return this.f139597b;
    }

    public final double d() {
        return this.f139599e;
    }

    public final String e() {
        return this.f139596a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f139596a, r82.f139596a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f139597b, r82.f139597b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f139598c, r82.f139598c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f139599e, r82.f139599e) == 0) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f139596a.hashCode() * 31) + Double.hashCode(this.f139597b)) * 31) + Double.hashCode(this.f139598c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f139599e);
    }

    public String toString() {
        return "CryptoInvestmentContractState(symbol=" + this.f139596a + ", marketValue=" + this.f139597b + ", gainFraction=" + this.f139598c + ", avgPrice=" + this.d + ", pnl=" + this.f139599e + ')';
    }
}
