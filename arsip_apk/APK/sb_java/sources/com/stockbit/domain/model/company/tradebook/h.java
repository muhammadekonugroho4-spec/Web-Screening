package com.stockbit.domain.model.company.tradebook;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f82042a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82043b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82044c;
    public final String d;

    public h(String r2, String r3, String r4, String r5) {
        p.l(r2, "buy");
        p.l(r3, "buyValue");
        p.l(r4, "sell");
        p.l(r5, "sellValue");
        this.f82042a = r2;
        this.f82043b = r3;
        this.f82044c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f82042a;
    }

    public final String b() {
        return this.f82043b;
    }

    public final String c() {
        return this.f82044c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f82042a, r52.f82042a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82043b, r52.f82043b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82044c, r52.f82044c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f82042a.hashCode() * 31) + this.f82043b.hashCode()) * 31) + this.f82044c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "TradeBookNetPerMinPercentageEntity(buy=" + this.f82042a + ", buyValue=" + this.f82043b + ", sell=" + this.f82044c + ", sellValue=" + this.d + ")";
    }
}
