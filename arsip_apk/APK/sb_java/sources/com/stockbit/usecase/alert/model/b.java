package com.stockbit.usecase.alert.model;

import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f154349a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154350b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154351c;
    public final PriceAlertOperatorType d;

    /* renamed from: e, reason: collision with root package name */
    public final String f154352e;

    /* renamed from: f, reason: collision with root package name */
    public final String f154353f;

    /* renamed from: g, reason: collision with root package name */
    public final String f154354g;

    /* renamed from: h, reason: collision with root package name */
    public final String f154355h;

    /* renamed from: i, reason: collision with root package name */
    public final String f154356i;

    public b(String r2, String r3, String r4, PriceAlertOperatorType r5, String r6, String r7, String r8, String r9, String r10) {
        p.l(r2, "symbol");
        p.l(r3, "companyName");
        p.l(r4, "operator");
        p.l(r5, "operatorType");
        p.l(r6, "operatorSign");
        p.l(r7, "value");
        p.l(r8, "country");
        p.l(r9, "valueFormatted");
        p.l(r10, "symbol2");
        this.f154349a = r2;
        this.f154350b = r3;
        this.f154351c = r4;
        this.d = r5;
        this.f154352e = r6;
        this.f154353f = r7;
        this.f154354g = r8;
        this.f154355h = r9;
        this.f154356i = r10;
    }

    public final String a() {
        return this.f154350b;
    }

    public final String b() {
        return this.f154354g;
    }

    public final String c() {
        return this.f154351c;
    }

    public final String d() {
        return this.f154352e;
    }

    public final PriceAlertOperatorType e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f154349a, r52.f154349a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154350b, r52.f154350b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154351c, r52.f154351c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f154352e, r52.f154352e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f154353f, r52.f154353f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f154354g, r52.f154354g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f154355h, r52.f154355h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f154356i, r52.f154356i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f154349a;
    }

    public final String g() {
        return this.f154356i;
    }

    public final String h() {
        return this.f154353f;
    }

    public int hashCode() {
        return (((((((((((((((this.f154349a.hashCode() * 31) + this.f154350b.hashCode()) * 31) + this.f154351c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f154352e.hashCode()) * 31) + this.f154353f.hashCode()) * 31) + this.f154354g.hashCode()) * 31) + this.f154355h.hashCode()) * 31) + this.f154356i.hashCode();
    }

    public final String i() {
        return this.f154355h;
    }

    public String toString() {
        return "AlertCommandUIState(symbol=" + this.f154349a + ", companyName=" + this.f154350b + ", operator=" + this.f154351c + ", operatorType=" + this.d + ", operatorSign=" + this.f154352e + ", value=" + this.f154353f + ", country=" + this.f154354g + ", valueFormatted=" + this.f154355h + ", symbol2=" + this.f154356i + ")";
    }
}
