package com.stockbit.usecase.cashsweep.model;

/* loaded from: classes11.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f155071a;

    /* renamed from: b, reason: collision with root package name */
    public final double f155072b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f155073c;

    public o(String r2, double r3, boolean r5) {
        kotlin.jvm.internal.p.l(r2, "balance");
        this.f155071a = r2;
        this.f155072b = r3;
        this.f155073c = r5;
    }

    public final String a() {
        return this.f155071a;
    }

    public final double b() {
        return this.f155072b;
    }

    public final boolean c() {
        return this.f155073c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof o) == true) goto L8;
        return false;
    L8:
        o r82 = (o) r8;
        if (kotlin.jvm.internal.p.g(this.f155071a, r82.f155071a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f155072b, r82.f155072b) == 0) goto L15;
        return false;
    L15:
        if (this.f155073c == r82.f155073c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f155071a.hashCode() * 31) + Double.hashCode(this.f155072b)) * 31) + Boolean.hashCode(this.f155073c);
    }

    public String toString() {
        return "PendingCashUIState(balance=" + this.f155071a + ", balanceRaw=" + this.f155072b + ", isShowed=" + this.f155073c + ")";
    }

    public /* synthetic */ o(String r1, double r2, boolean r4, int r5, kotlin.jvm.internal.i r6) {
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
