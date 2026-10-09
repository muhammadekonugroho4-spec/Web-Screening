package com.stockbit.domain.model.emitten;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f82213a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82214b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82215c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82216e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82217f;

    /* renamed from: g, reason: collision with root package name */
    public final double f82218g;

    /* renamed from: h, reason: collision with root package name */
    public final double f82219h;

    /* renamed from: i, reason: collision with root package name */
    public final double f82220i;

    /* renamed from: j, reason: collision with root package name */
    public final double f82221j;

    public b(String r2, String r3, String r4, String r5, String r6, String r7, double r8, double r10, double r12, double r14) {
        p.l(r2, "annualCouponRate");
        p.l(r3, "couponDistribution");
        p.l(r4, "dueDate");
        p.l(r5, "issuedDate");
        p.l(r6, "minimumOrder");
        p.l(r7, "nextCouponDate");
        this.f82213a = r2;
        this.f82214b = r3;
        this.f82215c = r4;
        this.d = r5;
        this.f82216e = r6;
        this.f82217f = r7;
        this.f82218g = r8;
        this.f82219h = r10;
        this.f82220i = r12;
        this.f82221j = r14;
    }

    public final String a() {
        return this.f82213a;
    }

    public final double b() {
        return this.f82218g;
    }

    public final String c() {
        return this.f82214b;
    }

    public final String d() {
        return this.f82215c;
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
        if (p.g(this.f82213a, r82.f82213a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82214b, r82.f82214b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82215c, r82.f82215c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82216e, r82.f82216e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82217f, r82.f82217f) == true) goto L27;
        return false;
    L27:
        if (Double.compare(this.f82218g, r82.f82218g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f82219h, r82.f82219h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f82220i, r82.f82220i) == 0) goto L36;
        return false;
    L36:
        if (Double.compare(this.f82221j, r82.f82221j) == 0) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f82216e;
    }

    public final String g() {
        return this.f82217f;
    }

    public final double h() {
        return this.f82220i;
    }

    public int hashCode() {
        return (((((((((((((((((this.f82213a.hashCode() * 31) + this.f82214b.hashCode()) * 31) + this.f82215c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82216e.hashCode()) * 31) + this.f82217f.hashCode()) * 31) + Double.hashCode(this.f82218g)) * 31) + Double.hashCode(this.f82219h)) * 31) + Double.hashCode(this.f82220i)) * 31) + Double.hashCode(this.f82221j);
    }

    public final double i() {
        return this.f82219h;
    }

    public final double j() {
        return this.f82221j;
    }

    public String toString() {
        return "EmittenFinItemsEntity(annualCouponRate=" + this.f82213a + ", couponDistribution=" + this.f82214b + ", dueDate=" + this.f82215c + ", issuedDate=" + this.d + ", minimumOrder=" + this.f82216e + ", nextCouponDate=" + this.f82217f + ", buyPrice=" + this.f82218g + ", sellPrice=" + this.f82219h + ", performance=" + this.f82220i + ", yield=" + this.f82221j + ")";
    }
}
