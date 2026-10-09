package com.stockbit.domain.model.company.seasonality;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f81926a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81927b;

    /* renamed from: c, reason: collision with root package name */
    public final g f81928c;
    public final a d;

    /* renamed from: e, reason: collision with root package name */
    public final int f81929e;

    public e(d r2, List r3, g r4, a r5, int r6) {
        p.l(r2, "probability");
        p.l(r3, "priceChange");
        p.l(r4, "totalMonths");
        p.l(r5, "average");
        this.f81926a = r2;
        this.f81927b = r3;
        this.f81928c = r4;
        this.d = r5;
        this.f81929e = r6;
    }

    public final a a() {
        return this.d;
    }

    public final int b() {
        return this.f81929e;
    }

    public final List c() {
        return this.f81927b;
    }

    public final d d() {
        return this.f81926a;
    }

    public final g e() {
        return this.f81928c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f81926a, r52.f81926a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81927b, r52.f81927b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81928c, r52.f81928c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f81929e == r52.f81929e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f81926a.hashCode() * 31) + this.f81927b.hashCode()) * 31) + this.f81928c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f81929e);
    }

    public String toString() {
        return "SeasonalityEntity(probability=" + this.f81926a + ", priceChange=" + this.f81927b + ", totalMonths=" + this.f81928c + ", average=" + this.d + ", defaultLastYear=" + this.f81929e + ")";
    }
}
