package com.stockbit.usecase.cryptotransaction.contract.param;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f157439a;

    /* renamed from: b, reason: collision with root package name */
    public final double f157440b;

    /* renamed from: c, reason: collision with root package name */
    public final double f157441c;

    public b(String r2, double r3, double r5) {
        p.l(r2, "orderId");
        this.f157439a = r2;
        this.f157440b = r3;
        this.f157441c = r5;
    }

    public final double a() {
        return this.f157440b;
    }

    public final double b() {
        return this.f157441c;
    }

    public final String c() {
        return this.f157439a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f157439a, r82.f157439a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f157440b, r82.f157440b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f157441c, r82.f157441c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f157439a.hashCode() * 31) + Double.hashCode(this.f157440b)) * 31) + Double.hashCode(this.f157441c);
    }

    public String toString() {
        return "PostCryptoAmendSellParam(orderId=" + this.f157439a + ", newPrice=" + this.f157440b + ", newQuantity=" + this.f157441c + ")";
    }
}
