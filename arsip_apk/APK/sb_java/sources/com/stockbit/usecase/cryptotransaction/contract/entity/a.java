package com.stockbit.usecase.cryptotransaction.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f157381a;

    /* renamed from: b, reason: collision with root package name */
    public final h f157382b;

    /* renamed from: c, reason: collision with root package name */
    public final double f157383c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f157384e;

    /* renamed from: f, reason: collision with root package name */
    public final double f157385f;

    /* renamed from: g, reason: collision with root package name */
    public final e f157386g;

    /* renamed from: h, reason: collision with root package name */
    public final double f157387h;

    public a(String r2, h r3, double r4, double r6, double r8, double r10, e r12, double r13) {
        p.l(r2, "orderId");
        p.l(r3, "coin");
        p.l(r12, "buyBalance");
        this.f157381a = r2;
        this.f157382b = r3;
        this.f157383c = r4;
        this.d = r6;
        this.f157384e = r8;
        this.f157385f = r10;
        this.f157386g = r12;
        this.f157387h = r13;
    }

    public final e a() {
        return this.f157386g;
    }

    public final h b() {
        return this.f157382b;
    }

    public final double c() {
        return this.f157383c;
    }

    public final double d() {
        return this.d;
    }

    public final double e() {
        return this.f157387h;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f157381a, r82.f157381a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157382b, r82.f157382b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f157383c, r82.f157383c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f157384e, r82.f157384e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f157385f, r82.f157385f) == 0) goto L27;
        return false;
    L27:
        if (p.g(this.f157386g, r82.f157386g) == true) goto L30;
        return false;
    L30:
        if (Double.compare(this.f157387h, r82.f157387h) == 0) goto L32;
        return false;
    L32:
        return true;
    }

    public final double f() {
        return this.f157384e;
    }

    public final double g() {
        return this.f157385f;
    }

    public final String h() {
        return this.f157381a;
    }

    public int hashCode() {
        return (((((((((((((this.f157381a.hashCode() * 31) + this.f157382b.hashCode()) * 31) + Double.hashCode(this.f157383c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f157384e)) * 31) + Double.hashCode(this.f157385f)) * 31) + this.f157386g.hashCode()) * 31) + Double.hashCode(this.f157387h);
    }

    public String toString() {
        return "CryptoAmendBuyEntity(orderId=" + this.f157381a + ", coin=" + this.f157382b + ", currentPrice=" + this.f157383c + ", currentQty=" + this.d + ", newPrice=" + this.f157384e + ", newQty=" + this.f157385f + ", buyBalance=" + this.f157386g + ", fee=" + this.f157387h + ")";
    }
}
