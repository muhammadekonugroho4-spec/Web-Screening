package com.stockbit.domain.model.company.tradebook;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f82023a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82024b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82025c;
    public final String d;

    public e(String r2, String r3, String r4, String r5) {
        p.l(r2, "buy");
        p.l(r3, "buyValue");
        p.l(r4, "sell");
        p.l(r5, "sellValue");
        this.f82023a = r2;
        this.f82024b = r3;
        this.f82025c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f82023a;
    }

    public final String b() {
        return this.f82024b;
    }

    public final String c() {
        return this.f82025c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f82023a, r52.f82023a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82024b, r52.f82024b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82025c, r52.f82025c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f82023a.hashCode() * 31) + this.f82024b.hashCode()) * 31) + this.f82025c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "TradeBookChartNetPerMinPercentageEntity(buy=" + this.f82023a + ", buyValue=" + this.f82024b + ", sell=" + this.f82025c + ", sellValue=" + this.d + ")";
    }
}
