package com.stockbit.domain.model.company;

import java.util.List;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f81377a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81378b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81379c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81380e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81381f;

    /* renamed from: g, reason: collision with root package name */
    public final double f81382g;

    /* renamed from: h, reason: collision with root package name */
    public final float f81383h;

    public a(List r2, String r3, String r4, String r5, String r6, String r7, double r8, float r10) {
        kotlin.jvm.internal.p.l(r2, "prices");
        kotlin.jvm.internal.p.l(r3, "timeframe");
        kotlin.jvm.internal.p.l(r4, "timeFramePriceChange");
        kotlin.jvm.internal.p.l(r5, "timeFramePercentage");
        kotlin.jvm.internal.p.l(r6, "timeFrameCagr");
        kotlin.jvm.internal.p.l(r7, "timeFrameDrawdown");
        this.f81377a = r2;
        this.f81378b = r3;
        this.f81379c = r4;
        this.d = r5;
        this.f81380e = r6;
        this.f81381f = r7;
        this.f81382g = r8;
        this.f81383h = r10;
    }

    public final double a() {
        return this.f81382g;
    }

    public final List b() {
        return this.f81377a;
    }

    public final String c() {
        return this.f81380e;
    }

    public final String d() {
        return this.f81381f;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (kotlin.jvm.internal.p.g(this.f81377a, r82.f81377a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f81378b, r82.f81378b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f81379c, r82.f81379c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f81380e, r82.f81380e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f81381f, r82.f81381f) == true) goto L27;
        return false;
    L27:
        if (Double.compare(this.f81382g, r82.f81382g) == 0) goto L30;
        return false;
    L30:
        if (Float.compare(this.f81383h, r82.f81383h) == 0) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f81379c;
    }

    public int hashCode() {
        return (((((((((((((this.f81377a.hashCode() * 31) + this.f81378b.hashCode()) * 31) + this.f81379c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81380e.hashCode()) * 31) + this.f81381f.hashCode()) * 31) + Double.hashCode(this.f81382g)) * 31) + Float.hashCode(this.f81383h);
    }

    public String toString() {
        return "CompanyChartEntity(prices=" + this.f81377a + ", timeframe=" + this.f81378b + ", timeFramePriceChange=" + this.f81379c + ", timeFramePercentage=" + this.d + ", timeFrameCagr=" + this.f81380e + ", timeFrameDrawdown=" + this.f81381f + ", previous=" + this.f81382g + ", lineWeight=" + this.f81383h + ")";
    }
}
