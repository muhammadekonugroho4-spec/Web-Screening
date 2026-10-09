package com.stockbit.feature.bonds.ui.sell.component;

/* loaded from: classes8.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.usecase.bonds.model.o f93392a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.usecase.bonds.model.o f93393b;

    /* renamed from: c, reason: collision with root package name */
    public final com.stockbit.usecase.bonds.model.o f93394c;
    public final boolean d;

    static {
    }

    public D(com.stockbit.usecase.bonds.model.o r2, com.stockbit.usecase.bonds.model.o r3, com.stockbit.usecase.bonds.model.o r4, boolean r5) {
        kotlin.jvm.internal.p.l(r2, "totalDailyCoupon");
        kotlin.jvm.internal.p.l(r3, "capitalGainLoss");
        kotlin.jvm.internal.p.l(r4, "totalTax");
        this.f93392a = r2;
        this.f93393b = r3;
        this.f93394c = r4;
        this.d = r5;
    }

    public final com.stockbit.usecase.bonds.model.o a() {
        return this.f93393b;
    }

    public final com.stockbit.usecase.bonds.model.o b() {
        return this.f93392a;
    }

    public final com.stockbit.usecase.bonds.model.o c() {
        return this.f93394c;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof D) == true) goto L8;
        return false;
    L8:
        D r52 = (D) r5;
        if (kotlin.jvm.internal.p.g(this.f93392a, r52.f93392a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f93393b, r52.f93393b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f93394c, r52.f93394c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f93392a.hashCode() * 31) + this.f93393b.hashCode()) * 31) + this.f93394c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "SellInfo3DetailLayoutParam(totalDailyCoupon=" + this.f93392a + ", capitalGainLoss=" + this.f93393b + ", totalTax=" + this.f93394c + ", isLoading=" + this.d + ')';
    }
}
