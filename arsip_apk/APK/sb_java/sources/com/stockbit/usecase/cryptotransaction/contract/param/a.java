package com.stockbit.usecase.cryptotransaction.contract.param;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f157436a;

    /* renamed from: b, reason: collision with root package name */
    public final double f157437b;

    /* renamed from: c, reason: collision with root package name */
    public final double f157438c;

    public a(String r2, double r3, double r5) {
        p.l(r2, "orderId");
        this.f157436a = r2;
        this.f157437b = r3;
        this.f157438c = r5;
    }

    public final double a() {
        return this.f157437b;
    }

    public final double b() {
        return this.f157438c;
    }

    public final String c() {
        return this.f157436a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f157436a, r82.f157436a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f157437b, r82.f157437b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f157438c, r82.f157438c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f157436a.hashCode() * 31) + Double.hashCode(this.f157437b)) * 31) + Double.hashCode(this.f157438c);
    }

    public String toString() {
        return "PostCryptoAmendBuyParam(orderId=" + this.f157436a + ", newPrice=" + this.f157437b + ", newQuantity=" + this.f157438c + ")";
    }
}
