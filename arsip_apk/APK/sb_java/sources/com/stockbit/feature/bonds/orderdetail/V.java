package com.stockbit.feature.bonds.orderdetail;

/* loaded from: classes8.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.usecase.bonds.model.o f92419a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.usecase.bonds.model.o f92420b;

    /* renamed from: c, reason: collision with root package name */
    public final String f92421c;
    public final com.stockbit.usecase.bonds.model.o d;

    /* renamed from: e, reason: collision with root package name */
    public final String f92422e;

    static {
    }

    public V(com.stockbit.usecase.bonds.model.o r2, com.stockbit.usecase.bonds.model.o r3, String r4, com.stockbit.usecase.bonds.model.o r5, String r6) {
        kotlin.jvm.internal.p.l(r2, "accruedInterest");
        kotlin.jvm.internal.p.l(r3, "capitalGainLoss");
        kotlin.jvm.internal.p.l(r4, "taxBond");
        kotlin.jvm.internal.p.l(r5, "profitAndLossNett");
        kotlin.jvm.internal.p.l(r6, "profitAndLossNettPercentage");
        this.f92419a = r2;
        this.f92420b = r3;
        this.f92421c = r4;
        this.d = r5;
        this.f92422e = r6;
    }

    public final com.stockbit.usecase.bonds.model.o a() {
        return this.f92419a;
    }

    public final com.stockbit.usecase.bonds.model.o b() {
        return this.f92420b;
    }

    public final com.stockbit.usecase.bonds.model.o c() {
        return this.d;
    }

    public final String d() {
        return this.f92422e;
    }

    public final String e() {
        return this.f92421c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof V) == true) goto L8;
        return false;
    L8:
        V r52 = (V) r5;
        if (kotlin.jvm.internal.p.g(this.f92419a, r52.f92419a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f92420b, r52.f92420b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f92421c, r52.f92421c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f92422e, r52.f92422e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f92419a.hashCode() * 31) + this.f92420b.hashCode()) * 31) + this.f92421c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f92422e.hashCode();
    }

    public String toString() {
        return "OrderFinalDataLayoutParam(accruedInterest=" + this.f92419a + ", capitalGainLoss=" + this.f92420b + ", taxBond=" + this.f92421c + ", profitAndLossNett=" + this.d + ", profitAndLossNettPercentage=" + this.f92422e + ')';
    }
}
