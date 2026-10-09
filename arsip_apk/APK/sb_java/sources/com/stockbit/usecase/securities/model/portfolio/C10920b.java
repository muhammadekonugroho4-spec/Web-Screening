package com.stockbit.usecase.securities.model.portfolio;

/* renamed from: com.stockbit.usecase.securities.model.portfolio.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10920b {

    /* renamed from: a, reason: collision with root package name */
    public final String f161721a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161722b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161723c;

    public C10920b(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "yearRate");
        kotlin.jvm.internal.p.l(r3, "paymentDate");
        kotlin.jvm.internal.p.l(r4, "distribution");
        this.f161721a = r2;
        this.f161722b = r3;
        this.f161723c = r4;
    }

    public final String a() {
        return this.f161723c;
    }

    public final String b() {
        return this.f161722b;
    }

    public final String c() {
        return this.f161721a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10920b) == true) goto L8;
        return false;
    L8:
        C10920b r52 = (C10920b) r5;
        if (kotlin.jvm.internal.p.g(this.f161721a, r52.f161721a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161722b, r52.f161722b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161723c, r52.f161723c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f161721a.hashCode() * 31) + this.f161722b.hashCode()) * 31) + this.f161723c.hashCode();
    }

    public String toString() {
        return "BondCouponUIState(yearRate=" + this.f161721a + ", paymentDate=" + this.f161722b + ", distribution=" + this.f161723c + ")";
    }
}
