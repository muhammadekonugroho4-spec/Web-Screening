package com.stockbit.usecase.bonds.model.portfolio;

import com.stockbit.usecase.bonds.model.j;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f154675a;

    /* renamed from: b, reason: collision with root package name */
    public final j f154676b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154677c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final String f154678e;

    /* renamed from: f, reason: collision with root package name */
    public final String f154679f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f154680g;

    public c(String r2, j r3, String r4, double r5, String r7, String r8, boolean r9) {
        p.l(r2, "orderId");
        p.l(r3, "product");
        p.l(r4, "investmentCapital");
        p.l(r7, "unit");
        p.l(r8, "buyDate");
        this.f154675a = r2;
        this.f154676b = r3;
        this.f154677c = r4;
        this.d = r5;
        this.f154678e = r7;
        this.f154679f = r8;
        this.f154680g = r9;
    }

    public final String a() {
        return this.f154679f;
    }

    public final String b() {
        return this.f154677c;
    }

    public final double c() {
        return this.d;
    }

    public final String d() {
        return this.f154675a;
    }

    public final String e() {
        return this.f154678e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f154675a, r82.f154675a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154676b, r82.f154676b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154677c, r82.f154677c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f154678e, r82.f154678e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f154679f, r82.f154679f) == true) goto L27;
        return false;
    L27:
        if (this.f154680g == r82.f154680g) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f154680g;
    }

    public int hashCode() {
        return (((((((((((this.f154675a.hashCode() * 31) + this.f154676b.hashCode()) * 31) + this.f154677c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f154678e.hashCode()) * 31) + this.f154679f.hashCode()) * 31) + Boolean.hashCode(this.f154680g);
    }

    public String toString() {
        return "BondPortfolioDetailTransactionHistoryUIState(orderId=" + this.f154675a + ", product=" + this.f154676b + ", investmentCapital=" + this.f154677c + ", investmentCapitalRaw=" + this.d + ", unit=" + this.f154678e + ", buyDate=" + this.f154679f + ", isStableEarn=" + this.f154680g + ")";
    }
}
