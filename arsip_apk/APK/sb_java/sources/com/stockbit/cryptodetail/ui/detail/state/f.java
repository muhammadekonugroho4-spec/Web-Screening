package com.stockbit.cryptodetail.ui.detail.state;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f79712a;

    /* renamed from: b, reason: collision with root package name */
    public final double f79713b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79714c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f79715e;

    /* renamed from: f, reason: collision with root package name */
    public final double f79716f;

    /* renamed from: g, reason: collision with root package name */
    public final double f79717g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f79718h;

    static {
    }

    public f(String r2, double r3, String r5, String r6, String r7, double r8, double r10, boolean r12) {
        p.l(r2, "lastPrice");
        p.l(r5, "usdPrice");
        p.l(r6, "changePercent");
        p.l(r7, "changeAmount");
        this.f79712a = r2;
        this.f79713b = r3;
        this.f79714c = r5;
        this.d = r6;
        this.f79715e = r7;
        this.f79716f = r8;
        this.f79717g = r10;
        this.f79718h = r12;
    }

    public final String a() {
        return this.f79715e;
    }

    public final String b() {
        return this.d;
    }

    public final double c() {
        return this.f79716f;
    }

    public final String d() {
        return this.f79712a;
    }

    public final double e() {
        return this.f79713b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (p.g(this.f79712a, r82.f79712a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f79713b, r82.f79713b) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.f79714c, r82.f79714c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f79715e, r82.f79715e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f79716f, r82.f79716f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f79717g, r82.f79717g) == 0) goto L30;
        return false;
    L30:
        if (this.f79718h == r82.f79718h) goto L32;
        return false;
    L32:
        return true;
    }

    public final double f() {
        return this.f79717g;
    }

    public final String g() {
        return this.f79714c;
    }

    public int hashCode() {
        return (((((((((((((this.f79712a.hashCode() * 31) + Double.hashCode(this.f79713b)) * 31) + this.f79714c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f79715e.hashCode()) * 31) + Double.hashCode(this.f79716f)) * 31) + Double.hashCode(this.f79717g)) * 31) + Boolean.hashCode(this.f79718h);
    }

    public String toString() {
        return "CryptoDetailHeaderUIData(lastPrice=" + this.f79712a + ", lastPriceRaw=" + this.f79713b + ", usdPrice=" + this.f79714c + ", changePercent=" + this.d + ", changeAmount=" + this.f79715e + ", changePrice=" + this.f79716f + ", openPrice=" + this.f79717g + ", isPositive=" + this.f79718h + ')';
    }
}
