package com.stockbit.stockgroups.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f138908a;

    /* renamed from: b, reason: collision with root package name */
    public final double f138909b;

    /* renamed from: c, reason: collision with root package name */
    public final String f138910c;
    public final String d;

    static {
    }

    public g(String r2, double r3, String r5, String r6) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        p.l(r5, "change");
        p.l(r6, "percentage");
        this.f138908a = r2;
        this.f138909b = r3;
        this.f138910c = r5;
        this.d = r6;
    }

    public final String a() {
        return this.f138910c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f138908a;
    }

    public final double d() {
        return this.f138909b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof g) == true) goto L8;
        return false;
    L8:
        g r82 = (g) r8;
        if (p.g(this.f138908a, r82.f138908a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f138909b, r82.f138909b) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.f138910c, r82.f138910c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f138908a.hashCode() * 31) + Double.hashCode(this.f138909b)) * 31) + this.f138910c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "StockItemPriceDetail(price=" + this.f138908a + ", priceRaw=" + this.f138909b + ", change=" + this.f138910c + ", percentage=" + this.d + ')';
    }
}
