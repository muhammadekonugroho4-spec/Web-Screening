package com.stockbit.usecase.cashsweep.model;

/* loaded from: classes11.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f155099a;

    /* renamed from: b, reason: collision with root package name */
    public final double f155100b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155101c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final String f155102e;

    /* renamed from: f, reason: collision with root package name */
    public final double f155103f;

    public u(String r2, double r3, String r5, double r6, String r8, double r9) {
        kotlin.jvm.internal.p.l(r2, "balance");
        kotlin.jvm.internal.p.l(r5, "change");
        kotlin.jvm.internal.p.l(r8, "percentage");
        this.f155099a = r2;
        this.f155100b = r3;
        this.f155101c = r5;
        this.d = r6;
        this.f155102e = r8;
        this.f155103f = r9;
    }

    public final String a() {
        return this.f155099a;
    }

    public final double b() {
        return this.f155100b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof u) == true) goto L8;
        return false;
    L8:
        u r82 = (u) r8;
        if (kotlin.jvm.internal.p.g(this.f155099a, r82.f155099a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f155100b, r82.f155100b) == 0) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f155101c, r82.f155101c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f155102e, r82.f155102e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f155103f, r82.f155103f) == 0) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f155099a.hashCode() * 31) + Double.hashCode(this.f155100b)) * 31) + this.f155101c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f155102e.hashCode()) * 31) + Double.hashCode(this.f155103f);
    }

    public String toString() {
        return "TradingBalanceUIState(balance=" + this.f155099a + ", balanceRaw=" + this.f155100b + ", change=" + this.f155101c + ", changeRaw=" + this.d + ", percentage=" + this.f155102e + ", percentageRaw=" + this.f155103f + ")";
    }

    public /* synthetic */ u(String r4, double r5, String r7, double r8, String r10, double r11, int r13, kotlin.jvm.internal.i r14) {
        if ((r13 & 1) == 0) goto L6;
        r4 = "0";
    L6:
        if ((r13 & 2) == 0) goto L9;
        r5 = 0.0d;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r7 = "0";
    L12:
        if ((r13 & 8) == 0) goto L15;
        r8 = 0.0d;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r10 = "0";
    L18:
        if ((r13 & 32) == 0) goto L21;
        double r12 = 0.0d;
    L22:
        this(r4, r5, r7, r8, r10, r12);
        return;
    L21:
        r12 = r11;
        goto L22
    }
}
