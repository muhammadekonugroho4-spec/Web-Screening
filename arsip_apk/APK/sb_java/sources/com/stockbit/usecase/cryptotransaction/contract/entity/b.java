package com.stockbit.usecase.cryptotransaction.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f157388a;

    /* renamed from: b, reason: collision with root package name */
    public final double f157389b;

    /* renamed from: c, reason: collision with root package name */
    public final double f157390c;

    public b(String r2, double r3, double r5) {
        p.l(r2, "orderId");
        this.f157388a = r2;
        this.f157389b = r3;
        this.f157390c = r5;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f157388a, r82.f157388a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f157389b, r82.f157389b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f157390c, r82.f157390c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f157388a.hashCode() * 31) + Double.hashCode(this.f157389b)) * 31) + Double.hashCode(this.f157390c);
    }

    public String toString() {
        return "CryptoAmendResultEntity(orderId=" + this.f157388a + ", newPrice=" + this.f157389b + ", newQuantity=" + this.f157390c + ")";
    }
}
