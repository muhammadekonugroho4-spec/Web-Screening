package com.stockbit.feature.bonds.ui.sell.component;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.usecase.bonds.model.o f93446a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.usecase.bonds.model.o f93447b;

    /* renamed from: c, reason: collision with root package name */
    public final com.stockbit.usecase.bonds.model.o f93448c;
    public final boolean d;

    static {
    }

    public v(com.stockbit.usecase.bonds.model.o r2, com.stockbit.usecase.bonds.model.o r3, com.stockbit.usecase.bonds.model.o r4, boolean r5) {
        kotlin.jvm.internal.p.l(r2, "accruedInterest");
        kotlin.jvm.internal.p.l(r3, "capitalGainLossNett");
        kotlin.jvm.internal.p.l(r4, FirebaseAnalytics.Param.TAX);
        this.f93446a = r2;
        this.f93447b = r3;
        this.f93448c = r4;
        this.d = r5;
    }

    public final com.stockbit.usecase.bonds.model.o a() {
        return this.f93446a;
    }

    public final com.stockbit.usecase.bonds.model.o b() {
        return this.f93447b;
    }

    public final com.stockbit.usecase.bonds.model.o c() {
        return this.f93448c;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof v) == true) goto L8;
        return false;
    L8:
        v r52 = (v) r5;
        if (kotlin.jvm.internal.p.g(this.f93446a, r52.f93446a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f93447b, r52.f93447b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f93448c, r52.f93448c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f93446a.hashCode() * 31) + this.f93447b.hashCode()) * 31) + this.f93448c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "SellInfo2DetailLayoutParam(accruedInterest=" + this.f93446a + ", capitalGainLossNett=" + this.f93447b + ", tax=" + this.f93448c + ", isLoading=" + this.d + ')';
    }
}
