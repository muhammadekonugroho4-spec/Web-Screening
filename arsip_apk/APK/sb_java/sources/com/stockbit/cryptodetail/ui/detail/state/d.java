package com.stockbit.cryptodetail.ui.detail.state;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.cryptodetail.ui.detail.model.CryptoPriceTrend;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f79706a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79707b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79708c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final String f79709e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f79710f;

    /* renamed from: g, reason: collision with root package name */
    public final CryptoPriceTrend f79711g;

    static {
    }

    public d(String r2, String r3, String r4, double r5, String r7, boolean r8, CryptoPriceTrend r9) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        p.l(r3, "changeAmount");
        p.l(r4, "changePercent");
        p.l(r7, "usdPrice");
        p.l(r9, "trend");
        this.f79706a = r2;
        this.f79707b = r3;
        this.f79708c = r4;
        this.d = r5;
        this.f79709e = r7;
        this.f79710f = r8;
        this.f79711g = r9;
    }

    public final String a() {
        return this.f79707b;
    }

    public final String b() {
        return this.f79708c;
    }

    public final double c() {
        return this.d;
    }

    public final String d() {
        return this.f79706a;
    }

    public final CryptoPriceTrend e() {
        return this.f79711g;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (p.g(this.f79706a, r82.f79706a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f79707b, r82.f79707b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f79708c, r82.f79708c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f79709e, r82.f79709e) == true) goto L24;
        return false;
    L24:
        if (this.f79710f == r82.f79710f) goto L27;
        return false;
    L27:
        if (this.f79711g == r82.f79711g) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f79709e;
    }

    public final boolean g() {
        return this.f79710f;
    }

    public int hashCode() {
        return (((((((((((this.f79706a.hashCode() * 31) + this.f79707b.hashCode()) * 31) + this.f79708c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f79709e.hashCode()) * 31) + Boolean.hashCode(this.f79710f)) * 31) + this.f79711g.hashCode();
    }

    public String toString() {
        return "CryptoDetailHeaderDisplay(price=" + this.f79706a + ", changeAmount=" + this.f79707b + ", changePercent=" + this.f79708c + ", changePrice=" + this.d + ", usdPrice=" + this.f79709e + ", isScrubbing=" + this.f79710f + ", trend=" + this.f79711g + ')';
    }
}
