package com.stockbit.domains.usecase.stockgroups.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final g f88419a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88420b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88421c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f88422e;

    /* renamed from: f, reason: collision with root package name */
    public final double f88423f;

    public d(g r2, String r3, String r4, double r5, double r7, double r9) {
        p.l(r2, "mainData");
        p.l(r3, "volume");
        p.l(r4, "freq");
        this.f88419a = r2;
        this.f88420b = r3;
        this.f88421c = r4;
        this.d = r5;
        this.f88422e = r7;
        this.f88423f = r9;
    }

    public static /* synthetic */ d b(d r02, g r1, String r2, String r3, double r4, double r6, double r8, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r02.f88419a;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r02.f88420b;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r02.f88421c;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = r02.f88422e;
    L18:
        if ((r10 & 32) == 0) goto L20;
        r8 = r02.f88423f;
    L20:
        double r102 = r8;
        double r82 = r6;
        double r62 = r4;
        String r5 = r3;
        g r32 = r1;
        return r02.a(r32, r2, r5, r62, r82, r102);
    }

    public final d a(g r12, String r13, String r14, double r15, double r17, double r19) {
        p.l(r12, "mainData");
        p.l(r13, "volume");
        p.l(r14, "freq");
        return new d(r12, r13, r14, r15, r17, r19);
    }

    public final String c() {
        return this.f88421c;
    }

    public final double d() {
        return this.f88423f;
    }

    public final g e() {
        return this.f88419a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (p.g(this.f88419a, r82.f88419a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88420b, r82.f88420b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88421c, r82.f88421c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f88422e, r82.f88422e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f88423f, r82.f88423f) == 0) goto L26;
        return false;
    L26:
        return true;
    }

    public final double f() {
        return this.d;
    }

    public final String g() {
        return this.f88420b;
    }

    public final double h() {
        return this.f88422e;
    }

    public int hashCode() {
        return (((((((((this.f88419a.hashCode() * 31) + this.f88420b.hashCode()) * 31) + this.f88421c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f88422e)) * 31) + Double.hashCode(this.f88423f);
    }

    public String toString() {
        return "StockGroupItemEntity(mainData=" + this.f88419a + ", volume=" + this.f88420b + ", freq=" + this.f88421c + ", valueRaw=" + this.d + ", volumeRaw=" + this.f88422e + ", freqRaw=" + this.f88423f + ")";
    }
}
