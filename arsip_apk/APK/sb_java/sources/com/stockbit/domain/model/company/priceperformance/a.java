package com.stockbit.domain.model.company.priceperformance;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f81775a;

    /* renamed from: b, reason: collision with root package name */
    public final double f81776b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81777c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f81778e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81779f;

    /* renamed from: g, reason: collision with root package name */
    public final double f81780g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81781h;

    /* renamed from: i, reason: collision with root package name */
    public final double f81782i;

    public a(String r2, double r3, String r5, String r6, double r7, String r9, double r10, String r12, double r13) {
        p.l(r2, "timeFrame");
        p.l(r5, "percentageFormatted");
        p.l(r6, "closePriceFormatted");
        p.l(r9, "highFormatted");
        p.l(r12, "lowFormatted");
        this.f81775a = r2;
        this.f81776b = r3;
        this.f81777c = r5;
        this.d = r6;
        this.f81778e = r7;
        this.f81779f = r9;
        this.f81780g = r10;
        this.f81781h = r12;
        this.f81782i = r13;
    }

    public final String a() {
        return this.d;
    }

    public final double b() {
        return this.f81778e;
    }

    public final String c() {
        return this.f81779f;
    }

    public final double d() {
        return this.f81780g;
    }

    public final String e() {
        return this.f81781h;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f81775a, r82.f81775a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f81776b, r82.f81776b) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.f81777c, r82.f81777c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f81778e, r82.f81778e) == 0) goto L24;
        return false;
    L24:
        if (p.g(this.f81779f, r82.f81779f) == true) goto L27;
        return false;
    L27:
        if (Double.compare(this.f81780g, r82.f81780g) == 0) goto L30;
        return false;
    L30:
        if (p.g(this.f81781h, r82.f81781h) == true) goto L33;
        return false;
    L33:
        if (Double.compare(this.f81782i, r82.f81782i) == 0) goto L35;
        return false;
    L35:
        return true;
    }

    public final double f() {
        return this.f81782i;
    }

    public final String g() {
        return this.f81777c;
    }

    public final double h() {
        return this.f81776b;
    }

    public int hashCode() {
        return (((((((((((((((this.f81775a.hashCode() * 31) + Double.hashCode(this.f81776b)) * 31) + this.f81777c.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f81778e)) * 31) + this.f81779f.hashCode()) * 31) + Double.hashCode(this.f81780g)) * 31) + this.f81781h.hashCode()) * 31) + Double.hashCode(this.f81782i);
    }

    public final String i() {
        return this.f81775a;
    }

    public String toString() {
        return "PricePerformanceEntity(timeFrame=" + this.f81775a + ", percentageRaw=" + this.f81776b + ", percentageFormatted=" + this.f81777c + ", closePriceFormatted=" + this.d + ", closePriceRaw=" + this.f81778e + ", highFormatted=" + this.f81779f + ", highRaw=" + this.f81780g + ", lowFormatted=" + this.f81781h + ", lowRaw=" + this.f81782i + ")";
    }
}
