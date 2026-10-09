package com.stockbit.domain.model.bond;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f80741a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80742b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80743c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final double f80744e;

    /* renamed from: f, reason: collision with root package name */
    public final double f80745f;

    /* renamed from: g, reason: collision with root package name */
    public final double f80746g;

    /* renamed from: h, reason: collision with root package name */
    public final double f80747h;

    /* renamed from: i, reason: collision with root package name */
    public final double f80748i;

    public b(String r2, String r3, String r4, long r5, double r7, double r9, double r11, double r13, double r15) {
        p.l(r2, "productId");
        p.l(r3, "productName");
        p.l(r4, "productIcon");
        this.f80741a = r2;
        this.f80742b = r3;
        this.f80743c = r4;
        this.d = r5;
        this.f80744e = r7;
        this.f80745f = r9;
        this.f80746g = r11;
        this.f80747h = r13;
        this.f80748i = r15;
    }

    public final double a() {
        return this.f80746g;
    }

    public final double b() {
        return this.f80745f;
    }

    public final double c() {
        return this.f80744e;
    }

    public final String d() {
        return this.f80743c;
    }

    public final String e() {
        return this.f80741a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f80741a, r82.f80741a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80742b, r82.f80742b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80743c, r82.f80743c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (Double.compare(this.f80744e, r82.f80744e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f80745f, r82.f80745f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f80746g, r82.f80746g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f80747h, r82.f80747h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f80748i, r82.f80748i) == 0) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f80742b;
    }

    public final double g() {
        return this.f80747h;
    }

    public final double h() {
        return this.f80748i;
    }

    public int hashCode() {
        return (((((((((((((((this.f80741a.hashCode() * 31) + this.f80742b.hashCode()) * 31) + this.f80743c.hashCode()) * 31) + Long.hashCode(this.d)) * 31) + Double.hashCode(this.f80744e)) * 31) + Double.hashCode(this.f80745f)) * 31) + Double.hashCode(this.f80746g)) * 31) + Double.hashCode(this.f80747h)) * 31) + Double.hashCode(this.f80748i);
    }

    public String toString() {
        return "BondBuyPreviewEntity(productId=" + this.f80741a + ", productName=" + this.f80742b + ", productIcon=" + this.f80743c + ", minOrder=" + this.d + ", priceRate=" + this.f80744e + ", buyPriceAmount=" + this.f80745f + ", accruedInterest=" + this.f80746g + ", stampDuty=" + this.f80747h + ", totalPayment=" + this.f80748i + ")";
    }
}
