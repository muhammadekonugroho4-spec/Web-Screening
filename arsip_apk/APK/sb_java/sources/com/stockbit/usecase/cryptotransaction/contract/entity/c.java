package com.stockbit.usecase.cryptotransaction.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f157391a;

    /* renamed from: b, reason: collision with root package name */
    public final h f157392b;

    /* renamed from: c, reason: collision with root package name */
    public final double f157393c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f157394e;

    /* renamed from: f, reason: collision with root package name */
    public final double f157395f;

    /* renamed from: g, reason: collision with root package name */
    public final l f157396g;

    /* renamed from: h, reason: collision with root package name */
    public final double f157397h;

    public c(String r2, h r3, double r4, double r6, double r8, double r10, l r12, double r13) {
        p.l(r2, "orderId");
        p.l(r3, "coin");
        p.l(r12, "walletBalance");
        this.f157391a = r2;
        this.f157392b = r3;
        this.f157393c = r4;
        this.d = r6;
        this.f157394e = r8;
        this.f157395f = r10;
        this.f157396g = r12;
        this.f157397h = r13;
    }

    public final h a() {
        return this.f157392b;
    }

    public final double b() {
        return this.f157393c;
    }

    public final double c() {
        return this.d;
    }

    public final double d() {
        return this.f157397h;
    }

    public final double e() {
        return this.f157394e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f157391a, r82.f157391a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157392b, r82.f157392b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f157393c, r82.f157393c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f157394e, r82.f157394e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f157395f, r82.f157395f) == 0) goto L27;
        return false;
    L27:
        if (p.g(this.f157396g, r82.f157396g) == true) goto L30;
        return false;
    L30:
        if (Double.compare(this.f157397h, r82.f157397h) == 0) goto L32;
        return false;
    L32:
        return true;
    }

    public final double f() {
        return this.f157395f;
    }

    public final String g() {
        return this.f157391a;
    }

    public final l h() {
        return this.f157396g;
    }

    public int hashCode() {
        return (((((((((((((this.f157391a.hashCode() * 31) + this.f157392b.hashCode()) * 31) + Double.hashCode(this.f157393c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f157394e)) * 31) + Double.hashCode(this.f157395f)) * 31) + this.f157396g.hashCode()) * 31) + Double.hashCode(this.f157397h);
    }

    public String toString() {
        return "CryptoAmendSellEntity(orderId=" + this.f157391a + ", coin=" + this.f157392b + ", currentPrice=" + this.f157393c + ", currentQty=" + this.d + ", newPrice=" + this.f157394e + ", newQty=" + this.f157395f + ", walletBalance=" + this.f157396g + ", fee=" + this.f157397h + ")";
    }
}
