package com.stockbit.domain.model.cashsweep;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f81141a;

    /* renamed from: b, reason: collision with root package name */
    public final a f81142b;

    public i(int r2, a r3) {
        p.l(r3, "amountDetails");
        this.f81141a = r2;
        this.f81142b = r3;
    }

    public final a a() {
        return this.f81142b;
    }

    public final int b() {
        return this.f81141a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f81141a == r52.f81141a) goto L12;
        return false;
    L12:
        if (p.g(this.f81142b, r52.f81142b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f81141a) * 31) + this.f81142b.hashCode();
    }

    public String toString() {
        return "CashSweepWithdrawPreviewEntity(processingDays=" + this.f81141a + ", amountDetails=" + this.f81142b + ")";
    }
}
