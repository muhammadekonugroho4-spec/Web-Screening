package com.stockbit.domain.model.company.iepiev;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f81552a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81553b;

    /* renamed from: c, reason: collision with root package name */
    public final double f81554c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f81555e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81556f;

    /* renamed from: g, reason: collision with root package name */
    public final double f81557g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81558h;

    /* renamed from: i, reason: collision with root package name */
    public final int f81559i;

    public a(double r2, String r4, double r5, String r7, double r8, String r10, double r11, String r13, int r14) {
        p.l(r4, "bidPriceFormatted");
        p.l(r7, "bidQuantityFormatted");
        p.l(r10, "offerPriceFormatted");
        p.l(r13, "offerQuantityFormatted");
        this.f81552a = r2;
        this.f81553b = r4;
        this.f81554c = r5;
        this.d = r7;
        this.f81555e = r8;
        this.f81556f = r10;
        this.f81557g = r11;
        this.f81558h = r13;
        this.f81559i = r14;
    }

    public final String a() {
        return this.f81553b;
    }

    public final double b() {
        return this.f81552a;
    }

    public final String c() {
        return this.d;
    }

    public final double d() {
        return this.f81554c;
    }

    public final String e() {
        return this.f81556f;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (Double.compare(this.f81552a, r82.f81552a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f81553b, r82.f81553b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f81554c, r82.f81554c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f81555e, r82.f81555e) == 0) goto L24;
        return false;
    L24:
        if (p.g(this.f81556f, r82.f81556f) == true) goto L27;
        return false;
    L27:
        if (Double.compare(this.f81557g, r82.f81557g) == 0) goto L30;
        return false;
    L30:
        if (p.g(this.f81558h, r82.f81558h) == true) goto L33;
        return false;
    L33:
        if (this.f81559i == r82.f81559i) goto L35;
        return false;
    L35:
        return true;
    }

    public final double f() {
        return this.f81555e;
    }

    public final String g() {
        return this.f81558h;
    }

    public final double h() {
        return this.f81557g;
    }

    public int hashCode() {
        return (((((((((((((((Double.hashCode(this.f81552a) * 31) + this.f81553b.hashCode()) * 31) + Double.hashCode(this.f81554c)) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f81555e)) * 31) + this.f81556f.hashCode()) * 31) + Double.hashCode(this.f81557g)) * 31) + this.f81558h.hashCode()) * 31) + Integer.hashCode(this.f81559i);
    }

    public final int i() {
        return this.f81559i;
    }

    public String toString() {
        return "BestBidOfferEntity(bidPriceRaw=" + this.f81552a + ", bidPriceFormatted=" + this.f81553b + ", bidQuantityRaw=" + this.f81554c + ", bidQuantityFormatted=" + this.d + ", offerPriceRaw=" + this.f81555e + ", offerPriceFormatted=" + this.f81556f + ", offerQuantityRaw=" + this.f81557g + ", offerQuantityFormatted=" + this.f81558h + ", timeLeftSeconds=" + this.f81559i + ")";
    }
}
