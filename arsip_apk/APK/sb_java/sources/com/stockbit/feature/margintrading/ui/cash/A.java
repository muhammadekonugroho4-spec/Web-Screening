package com.stockbit.feature.margintrading.ui.cash;

import java.math.BigDecimal;

/* loaded from: classes9.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f99628a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f99629b;

    static {
    }

    public A(boolean r2, BigDecimal r3) {
        kotlin.jvm.internal.p.l(r3, "totalCashCollateral");
        this.f99628a = r2;
        this.f99629b = r3;
    }

    public final BigDecimal a() {
        return this.f99629b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof A) == true) goto L8;
        return false;
    L8:
        A r52 = (A) r5;
        if (this.f99628a == r52.f99628a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f99629b, r52.f99629b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f99628a) * 31) + this.f99629b.hashCode();
    }

    public String toString() {
        return "AddCashCollateralTotalState(isLoading=" + this.f99628a + ", totalCashCollateral=" + this.f99629b + ')';
    }
}
