package com.stockbit.usecase.cashsweep.model;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f155017a;

    /* renamed from: b, reason: collision with root package name */
    public final double f155018b;

    public c(String r2, double r3) {
        kotlin.jvm.internal.p.l(r2, "balance");
        this.f155017a = r2;
        this.f155018b = r3;
    }

    public final String a() {
        return this.f155017a;
    }

    public final double b() {
        return this.f155018b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (kotlin.jvm.internal.p.g(this.f155017a, r82.f155017a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f155018b, r82.f155018b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f155017a.hashCode() * 31) + Double.hashCode(this.f155018b);
    }

    public String toString() {
        return "CashOnHandUIState(balance=" + this.f155017a + ", balanceRaw=" + this.f155018b + ")";
    }

    public /* synthetic */ c(String r1, double r2, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = "0";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r2 = 0.0d;
    L8:
        this(r1, r2);
    }
}
