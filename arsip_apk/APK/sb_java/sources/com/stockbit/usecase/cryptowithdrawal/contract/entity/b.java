package com.stockbit.usecase.cryptowithdrawal.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final double f157492a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157493b;

    public b(double r2, String r4) {
        p.l(r4, "formattedWithdrawable");
        this.f157492a = r2;
        this.f157493b = r4;
    }

    public final String a() {
        return this.f157493b;
    }

    public final double b() {
        return this.f157492a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (Double.compare(this.f157492a, r82.f157492a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f157493b, r82.f157493b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f157492a) * 31) + this.f157493b.hashCode();
    }

    public String toString() {
        return "CryptoWithdrawalBalanceEntity(withdrawable=" + this.f157492a + ", formattedWithdrawable=" + this.f157493b + ")";
    }
}
