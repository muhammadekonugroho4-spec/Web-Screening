package com.stockbit.usecase.cashsweep.model;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f155077a;

    /* renamed from: b, reason: collision with root package name */
    public final double f155078b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f155079c;

    public q(String r2, double r3, boolean r5) {
        kotlin.jvm.internal.p.l(r2, "balance");
        this.f155077a = r2;
        this.f155078b = r3;
        this.f155079c = r5;
    }

    public final String a() {
        return this.f155077a;
    }

    public final double b() {
        return this.f155078b;
    }

    public final boolean c() {
        return this.f155079c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof q) == true) goto L8;
        return false;
    L8:
        q r82 = (q) r8;
        if (kotlin.jvm.internal.p.g(this.f155077a, r82.f155077a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f155078b, r82.f155078b) == 0) goto L15;
        return false;
    L15:
        if (this.f155079c == r82.f155079c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f155077a.hashCode() * 31) + Double.hashCode(this.f155078b)) * 31) + Boolean.hashCode(this.f155079c);
    }

    public String toString() {
        return "PendingRedemptionUIState(balance=" + this.f155077a + ", balanceRaw=" + this.f155078b + ", isShowed=" + this.f155079c + ")";
    }

    public /* synthetic */ q(String r1, double r2, boolean r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = "0";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = 0.0d;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = false;
    L11:
        this(r1, r2, r4);
    }
}
