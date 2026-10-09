package com.stockbit.domain.model.tradingperformance;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f86041a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86042b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86043c;
    public final String d;

    public f(String r2, String r3, String r4, String r5) {
        p.l(r2, "totalEquityReturnInterval");
        p.l(r3, "totalEquityReturnPeriod");
        p.l(r4, "totalEquityReturnPeriodStart");
        p.l(r5, "totalEquityReturnPeriodEnd");
        this.f86041a = r2;
        this.f86042b = r3;
        this.f86043c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f86041a;
    }

    public final String b() {
        return this.f86042b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f86043c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f86041a, r52.f86041a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86042b, r52.f86042b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86043c, r52.f86043c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f86041a.hashCode() * 31) + this.f86042b.hashCode()) * 31) + this.f86043c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "TotalEquityReturnFilterEntity(totalEquityReturnInterval=" + this.f86041a + ", totalEquityReturnPeriod=" + this.f86042b + ", totalEquityReturnPeriodStart=" + this.f86043c + ", totalEquityReturnPeriodEnd=" + this.d + ")";
    }
}
