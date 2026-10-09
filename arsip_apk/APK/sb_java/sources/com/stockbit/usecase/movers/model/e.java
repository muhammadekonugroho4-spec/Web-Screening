package com.stockbit.usecase.movers.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f158531a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158532b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158533c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f158534e;

    /* renamed from: f, reason: collision with root package name */
    public final String f158535f;

    /* renamed from: g, reason: collision with root package name */
    public final double f158536g;

    /* renamed from: h, reason: collision with root package name */
    public final String f158537h;

    /* renamed from: i, reason: collision with root package name */
    public final String f158538i;

    /* renamed from: j, reason: collision with root package name */
    public final String f158539j;

    public e(String r2, String r3, String r4, String r5, String r6, String r7, double r8, String r10, String r11, String r12) {
        p.l(r2, "value");
        p.l(r3, "volume");
        p.l(r4, "freq");
        p.l(r5, "netForeign");
        p.l(r6, "netForeignBuy");
        p.l(r7, "netForeignSell");
        p.l(r10, FirebaseAnalytics.Param.PRICE);
        p.l(r11, "change");
        p.l(r12, "percentage");
        this.f158531a = r2;
        this.f158532b = r3;
        this.f158533c = r4;
        this.d = r5;
        this.f158534e = r6;
        this.f158535f = r7;
        this.f158536g = r8;
        this.f158537h = r10;
        this.f158538i = r11;
        this.f158539j = r12;
    }

    public final String a() {
        return this.f158538i;
    }

    public final String b() {
        return this.f158533c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f158534e;
    }

    public final String e() {
        return this.f158535f;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (p.g(this.f158531a, r82.f158531a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158532b, r82.f158532b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f158533c, r82.f158533c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f158534e, r82.f158534e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f158535f, r82.f158535f) == true) goto L27;
        return false;
    L27:
        if (Double.compare(this.f158536g, r82.f158536g) == 0) goto L30;
        return false;
    L30:
        if (p.g(this.f158537h, r82.f158537h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f158538i, r82.f158538i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f158539j, r82.f158539j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f158539j;
    }

    public final String g() {
        return this.f158537h;
    }

    public final double h() {
        return this.f158536g;
    }

    public int hashCode() {
        return (((((((((((((((((this.f158531a.hashCode() * 31) + this.f158532b.hashCode()) * 31) + this.f158533c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f158534e.hashCode()) * 31) + this.f158535f.hashCode()) * 31) + Double.hashCode(this.f158536g)) * 31) + this.f158537h.hashCode()) * 31) + this.f158538i.hashCode()) * 31) + this.f158539j.hashCode();
    }

    public final String i() {
        return this.f158531a;
    }

    public final String j() {
        return this.f158532b;
    }

    public String toString() {
        return "TopMoversUIState(value=" + this.f158531a + ", volume=" + this.f158532b + ", freq=" + this.f158533c + ", netForeign=" + this.d + ", netForeignBuy=" + this.f158534e + ", netForeignSell=" + this.f158535f + ", priceRaw=" + this.f158536g + ", price=" + this.f158537h + ", change=" + this.f158538i + ", percentage=" + this.f158539j + ")";
    }
}
