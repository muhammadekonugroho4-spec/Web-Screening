package com.stockbit.feature.bonds.model;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f92364a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92365b;

    /* renamed from: c, reason: collision with root package name */
    public final String f92366c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f92367e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f92368f;

    static {
    }

    public h(String r2, String r3, String r4, String r5, boolean r6, boolean r7) {
        p.l(r2, "accruedInterestExcludeTax");
        p.l(r3, "profitLossNett");
        p.l(r4, "estimationAmountExcludeTax");
        p.l(r5, "totalTax");
        this.f92364a = r2;
        this.f92365b = r3;
        this.f92366c = r4;
        this.d = r5;
        this.f92367e = r6;
        this.f92368f = r7;
    }

    public final String a() {
        return this.f92364a;
    }

    public final String b() {
        return this.f92366c;
    }

    public final String c() {
        return this.f92365b;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.f92367e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f92364a, r52.f92364a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f92365b, r52.f92365b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f92366c, r52.f92366c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f92367e == r52.f92367e) goto L24;
        return false;
    L24:
        if (this.f92368f == r52.f92368f) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f92368f;
    }

    public int hashCode() {
        return (((((((((this.f92364a.hashCode() * 31) + this.f92365b.hashCode()) * 31) + this.f92366c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f92367e)) * 31) + Boolean.hashCode(this.f92368f);
    }

    public String toString() {
        return "BondSellTaxData(accruedInterestExcludeTax=" + this.f92364a + ", profitLossNett=" + this.f92365b + ", estimationAmountExcludeTax=" + this.f92366c + ", totalTax=" + this.d + ", isFreeFromTax=" + this.f92367e + ", isProfit=" + this.f92368f + ')';
    }
}
