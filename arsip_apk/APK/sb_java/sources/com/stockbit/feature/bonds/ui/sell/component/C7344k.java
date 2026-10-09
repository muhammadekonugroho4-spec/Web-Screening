package com.stockbit.feature.bonds.ui.sell.component;

import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.stockbit.feature.bonds.ui.sell.component.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7344k {

    /* renamed from: a, reason: collision with root package name */
    public final double f93421a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.usecase.bonds.model.o f93422b;

    /* renamed from: c, reason: collision with root package name */
    public final com.stockbit.usecase.bonds.model.o f93423c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final com.stockbit.usecase.bonds.model.o f93424e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f93425f;

    static {
    }

    public C7344k(double r2, com.stockbit.usecase.bonds.model.o r4, com.stockbit.usecase.bonds.model.o r5, String r6, com.stockbit.usecase.bonds.model.o r7, boolean r8) {
        kotlin.jvm.internal.p.l(r4, "accruedInterestExcludeTax");
        kotlin.jvm.internal.p.l(r5, FirebaseAnalytics.Param.TAX);
        kotlin.jvm.internal.p.l(r6, "stampDuty");
        kotlin.jvm.internal.p.l(r7, "sellerCoupon");
        this.f93421a = r2;
        this.f93422b = r4;
        this.f93423c = r5;
        this.d = r6;
        this.f93424e = r7;
        this.f93425f = r8;
    }

    public final com.stockbit.usecase.bonds.model.o a() {
        return this.f93422b;
    }

    public final double b() {
        return this.f93421a;
    }

    public final com.stockbit.usecase.bonds.model.o c() {
        return this.f93424e;
    }

    public final String d() {
        return this.d;
    }

    public final com.stockbit.usecase.bonds.model.o e() {
        return this.f93423c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C7344k) == true) goto L8;
        return false;
    L8:
        C7344k r82 = (C7344k) r8;
        if (Double.compare(this.f93421a, r82.f93421a) == 0) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f93422b, r82.f93422b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f93423c, r82.f93423c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f93424e, r82.f93424e) == true) goto L24;
        return false;
    L24:
        if (this.f93425f == r82.f93425f) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f93425f;
    }

    public int hashCode() {
        return (((((((((Double.hashCode(this.f93421a) * 31) + this.f93422b.hashCode()) * 31) + this.f93423c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f93424e.hashCode()) * 31) + Boolean.hashCode(this.f93425f);
    }

    public String toString() {
        return "SellInfo1DetailLayoutParam(sellAmount=" + this.f93421a + ", accruedInterestExcludeTax=" + this.f93422b + ", tax=" + this.f93423c + ", stampDuty=" + this.d + ", sellerCoupon=" + this.f93424e + ", isLoading=" + this.f93425f + ')';
    }
}
