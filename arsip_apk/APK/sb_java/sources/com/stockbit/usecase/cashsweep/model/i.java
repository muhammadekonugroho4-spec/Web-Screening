package com.stockbit.usecase.cashsweep.model;

/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f155044a;

    /* renamed from: b, reason: collision with root package name */
    public final a f155045b;

    public i(int r2, a r3) {
        kotlin.jvm.internal.p.l(r3, "amountDetails");
        this.f155044a = r2;
        this.f155045b = r3;
    }

    public final a a() {
        return this.f155045b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f155044a == r52.f155044a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f155045b, r52.f155045b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f155044a) * 31) + this.f155045b.hashCode();
    }

    public String toString() {
        return "CashSweepWithdrawPreviewUIState(processingDays=" + this.f155044a + ", amountDetails=" + this.f155045b + ")";
    }
}
