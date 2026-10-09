package com.stockbit.domain.model.financial;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84002a;

    /* renamed from: b, reason: collision with root package name */
    public final double f84003b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84004c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84005e;

    /* renamed from: f, reason: collision with root package name */
    public final double f84006f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84007g;

    /* renamed from: h, reason: collision with root package name */
    public final double f84008h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84009i;

    public a(String r2, double r3, String r5, double r6, String r8, double r9, String r11, double r12, String r14) {
        p.l(r2, "stockCode");
        p.l(r5, "bidPriceFormatted");
        p.l(r8, "bidQuantityFormatted");
        p.l(r11, "offerPriceFormatted");
        p.l(r14, "offerQuantityFormatted");
        this.f84002a = r2;
        this.f84003b = r3;
        this.f84004c = r5;
        this.d = r6;
        this.f84005e = r8;
        this.f84006f = r9;
        this.f84007g = r11;
        this.f84008h = r12;
        this.f84009i = r14;
    }

    public final String a() {
        return this.f84004c;
    }

    public final double b() {
        return this.f84003b;
    }

    public final String c() {
        return this.f84005e;
    }

    public final String d() {
        return this.f84007g;
    }

    public final double e() {
        return this.f84006f;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f84002a, r82.f84002a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f84003b, r82.f84003b) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.f84004c, r82.f84004c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f84005e, r82.f84005e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f84006f, r82.f84006f) == 0) goto L27;
        return false;
    L27:
        if (p.g(this.f84007g, r82.f84007g) == true) goto L30;
        return false;
    L30:
        if (Double.compare(this.f84008h, r82.f84008h) == 0) goto L33;
        return false;
    L33:
        if (p.g(this.f84009i, r82.f84009i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f84009i;
    }

    public final String g() {
        return this.f84002a;
    }

    public int hashCode() {
        return (((((((((((((((this.f84002a.hashCode() * 31) + Double.hashCode(this.f84003b)) * 31) + this.f84004c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f84005e.hashCode()) * 31) + Double.hashCode(this.f84006f)) * 31) + this.f84007g.hashCode()) * 31) + Double.hashCode(this.f84008h)) * 31) + this.f84009i.hashCode();
    }

    public String toString() {
        return "BestBidOfferEntity(stockCode=" + this.f84002a + ", bidPriceRaw=" + this.f84003b + ", bidPriceFormatted=" + this.f84004c + ", bidQuantityRaw=" + this.d + ", bidQuantityFormatted=" + this.f84005e + ", offerPriceRaw=" + this.f84006f + ", offerPriceFormatted=" + this.f84007g + ", offerQuantityRaw=" + this.f84008h + ", offerQuantityFormatted=" + this.f84009i + ")";
    }
}
