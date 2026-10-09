package com.stockbit.usecase.cashsweep.model;

/* loaded from: classes11.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f155074a;

    /* renamed from: b, reason: collision with root package name */
    public final double f155075b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f155076c;

    public p(String r2, double r3, boolean r5) {
        kotlin.jvm.internal.p.l(r2, "balance");
        this.f155074a = r2;
        this.f155075b = r3;
        this.f155076c = r5;
    }

    public final String a() {
        return this.f155074a;
    }

    public final double b() {
        return this.f155075b;
    }

    public final boolean c() {
        return this.f155076c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof p) == true) goto L8;
        return false;
    L8:
        p r82 = (p) r8;
        if (kotlin.jvm.internal.p.g(this.f155074a, r82.f155074a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f155075b, r82.f155075b) == 0) goto L15;
        return false;
    L15:
        if (this.f155076c == r82.f155076c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f155074a.hashCode() * 31) + Double.hashCode(this.f155075b)) * 31) + Boolean.hashCode(this.f155076c);
    }

    public String toString() {
        return "PendingInvestedUIState(balance=" + this.f155074a + ", balanceRaw=" + this.f155075b + ", isShowed=" + this.f155076c + ")";
    }

    public /* synthetic */ p(String r1, double r2, boolean r4, int r5, kotlin.jvm.internal.i r6) {
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
