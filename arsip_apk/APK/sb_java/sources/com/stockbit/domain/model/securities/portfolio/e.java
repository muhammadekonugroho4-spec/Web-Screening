package com.stockbit.domain.model.securities.portfolio;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f85623a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85624b;

    /* renamed from: c, reason: collision with root package name */
    public final double f85625c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final double f85626e;

    public e(double r1, double r3, double r5, long r7, double r9) {
        this.f85623a = r1;
        this.f85624b = r3;
        this.f85625c = r5;
        this.d = r7;
        this.f85626e = r9;
    }

    public static /* synthetic */ e b(e r11, double r12, double r14, double r16, long r18, double r20, int r22, Object r23) {
        if ((r22 & 1) == 0) goto L5;
        r12 = r11.f85623a;
    L5:
        double r1 = r12;
        if ((r22 & 2) == 0) goto L8;
        r14 = r11.f85624b;
    L8:
        double r3 = r14;
        if ((r22 & 4) == 0) goto L11;
        double r5 = r11.f85625c;
    L13:
        if ((r22 & 8) == 0) goto L15;
        long r7 = r11.d;
    L17:
        if ((r22 & 16) == 0) goto L20;
        double r9 = r11.f85626e;
    L22:
        return r11.a(r1, r3, r5, r7, r9);
    L20:
        r9 = r20;
        goto L22
    L15:
        r7 = r18;
        goto L17
    L11:
        r5 = r16;
        goto L13
    }

    public final e a(double r12, double r14, double r16, long r18, double r20) {
        return new e(r12, r14, r16, r18, r20);
    }

    public final double c() {
        return this.f85626e;
    }

    public final long d() {
        return this.d;
    }

    public final double e() {
        return this.f85625c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (Double.compare(this.f85623a, r82.f85623a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85624b, r82.f85624b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f85625c, r82.f85625c) == 0) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (Double.compare(this.f85626e, r82.f85626e) == 0) goto L23;
        return false;
    L23:
        return true;
    }

    public final double f() {
        return this.f85623a;
    }

    public final double g() {
        return this.f85624b;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.f85623a) * 31) + Double.hashCode(this.f85624b)) * 31) + Double.hashCode(this.f85625c)) * 31) + Long.hashCode(this.d)) * 31) + Double.hashCode(this.f85626e);
    }

    public String toString() {
        return "PortfolioDebtEntity(debtRatio=" + this.f85623a + ", debtTotal=" + this.f85624b + ", debtMarketValue=" + this.f85625c + ", bufferValue=" + this.d + ", bufferPercentage=" + this.f85626e + ")";
    }

    public /* synthetic */ e(double r3, double r5, double r7, long r9, double r11, int r13, kotlin.jvm.internal.i r14) {
        if ((r13 & 1) == 0) goto L6;
        r3 = 0.0d;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r5 = 0.0d;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r7 = 0.0d;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r9 = 0;
    L15:
        if ((r13 & 16) == 0) goto L18;
        double r12 = 0.0d;
    L19:
        this(r3, r5, r7, r9, r12);
        return;
    L18:
        r12 = r11;
        goto L19
    }
}
