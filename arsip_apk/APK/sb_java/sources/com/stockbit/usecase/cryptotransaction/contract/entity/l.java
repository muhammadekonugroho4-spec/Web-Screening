package com.stockbit.usecase.cryptotransaction.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f157433a;

    /* renamed from: b, reason: collision with root package name */
    public final double f157434b;

    /* renamed from: c, reason: collision with root package name */
    public final double f157435c;
    public final double d;

    public l(String r2, double r3, double r5, double r7) {
        p.l(r2, "coinSymbol");
        this.f157433a = r2;
        this.f157434b = r3;
        this.f157435c = r5;
        this.d = r7;
    }

    public final double a() {
        return this.f157434b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof l) == true) goto L8;
        return false;
    L8:
        l r82 = (l) r8;
        if (p.g(this.f157433a, r82.f157433a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f157434b, r82.f157434b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f157435c, r82.f157435c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f157433a.hashCode() * 31) + Double.hashCode(this.f157434b)) * 31) + Double.hashCode(this.f157435c)) * 31) + Double.hashCode(this.d);
    }

    public String toString() {
        return "CryptoWalletBalanceEntity(coinSymbol=" + this.f157433a + ", availableQty=" + this.f157434b + ", lockedQty=" + this.f157435c + ", avgBuyPrice=" + this.d + ")";
    }
}
