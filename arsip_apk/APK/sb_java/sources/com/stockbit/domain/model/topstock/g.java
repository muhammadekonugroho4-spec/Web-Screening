package com.stockbit.domain.model.topstock;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f85902a;

    /* renamed from: b, reason: collision with root package name */
    public final f f85903b;

    /* renamed from: c, reason: collision with root package name */
    public final f f85904c;

    public g(f r2, f r3, f r4) {
        p.l(r2, "buySummary");
        p.l(r3, "sellSummary");
        p.l(r4, "netSummary");
        this.f85902a = r2;
        this.f85903b = r3;
        this.f85904c = r4;
    }

    public final f a() {
        return this.f85902a;
    }

    public final f b() {
        return this.f85904c;
    }

    public final f c() {
        return this.f85903b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f85902a, r52.f85902a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85903b, r52.f85903b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85904c, r52.f85904c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85902a.hashCode() * 31) + this.f85903b.hashCode()) * 31) + this.f85904c.hashCode();
    }

    public String toString() {
        return "TopStockSummaryEntity(buySummary=" + this.f85902a + ", sellSummary=" + this.f85903b + ", netSummary=" + this.f85904c + ")";
    }
}
