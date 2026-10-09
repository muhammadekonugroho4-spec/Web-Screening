package com.stockbit.domain.model.financial;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f84010a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84011b;

    /* renamed from: c, reason: collision with root package name */
    public final double f84012c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f84013e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84014f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84015g;

    public b(String r2, String r3, double r4, String r6, double r7, String r9, String r10) {
        p.l(r2, "stockCode");
        p.l(r3, "iep");
        p.l(r6, "iev");
        p.l(r9, "iepPercentageChange");
        p.l(r10, "iepPriceChange");
        this.f84010a = r2;
        this.f84011b = r3;
        this.f84012c = r4;
        this.d = r6;
        this.f84013e = r7;
        this.f84014f = r9;
        this.f84015g = r10;
    }

    public final String a() {
        return this.f84011b;
    }

    public final String b() {
        return this.f84014f;
    }

    public final String c() {
        return this.f84015g;
    }

    public final double d() {
        return this.f84012c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f84010a, r82.f84010a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84011b, r82.f84011b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f84012c, r82.f84012c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f84013e, r82.f84013e) == 0) goto L24;
        return false;
    L24:
        if (p.g(this.f84014f, r82.f84014f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84015g, r82.f84015g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final double f() {
        return this.f84013e;
    }

    public final String g() {
        return this.f84010a;
    }

    public int hashCode() {
        return (((((((((((this.f84010a.hashCode() * 31) + this.f84011b.hashCode()) * 31) + Double.hashCode(this.f84012c)) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f84013e)) * 31) + this.f84014f.hashCode()) * 31) + this.f84015g.hashCode();
    }

    public String toString() {
        return "IepIevEntity(stockCode=" + this.f84010a + ", iep=" + this.f84011b + ", iepRaw=" + this.f84012c + ", iev=" + this.d + ", ievRaw=" + this.f84013e + ", iepPercentageChange=" + this.f84014f + ", iepPriceChange=" + this.f84015g + ")";
    }
}
