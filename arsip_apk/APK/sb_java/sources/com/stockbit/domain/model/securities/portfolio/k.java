package com.stockbit.domain.model.securities.portfolio;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final double f85705a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85706b;

    /* renamed from: c, reason: collision with root package name */
    public final double f85707c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f85708e;

    /* renamed from: f, reason: collision with root package name */
    public final double f85709f;

    /* renamed from: g, reason: collision with root package name */
    public final double f85710g;

    /* renamed from: h, reason: collision with root package name */
    public final double f85711h;

    /* renamed from: i, reason: collision with root package name */
    public final double f85712i;

    /* renamed from: j, reason: collision with root package name */
    public final e f85713j;

    public k(double r3, double r5, double r7, double r9, double r11, double r13, double r15, double r17, double r19, e r21) {
        p.l(r21, "debt");
        this.f85705a = r3;
        this.f85706b = r5;
        this.f85707c = r7;
        this.d = r9;
        this.f85708e = r11;
        this.f85709f = r13;
        this.f85710g = r15;
        this.f85711h = r17;
        this.f85712i = r19;
        this.f85713j = r21;
    }

    public final double a() {
        return this.f85711h;
    }

    public final double b() {
        return this.f85705a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof k) == true) goto L8;
        return false;
    L8:
        k r82 = (k) r8;
        if (Double.compare(this.f85705a, r82.f85705a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85706b, r82.f85706b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f85707c, r82.f85707c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f85708e, r82.f85708e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f85709f, r82.f85709f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f85710g, r82.f85710g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f85711h, r82.f85711h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f85712i, r82.f85712i) == 0) goto L36;
        return false;
    L36:
        if (p.g(this.f85713j, r82.f85713j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((Double.hashCode(this.f85705a) * 31) + Double.hashCode(this.f85706b)) * 31) + Double.hashCode(this.f85707c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f85708e)) * 31) + Double.hashCode(this.f85709f)) * 31) + Double.hashCode(this.f85710g)) * 31) + Double.hashCode(this.f85711h)) * 31) + Double.hashCode(this.f85712i)) * 31) + this.f85713j.hashCode();
    }

    public String toString() {
        return "PortfolioSummaryInfoEntity(tradingBalance=" + this.f85705a + ", amountInvested=" + this.f85706b + ", amountAllocated=" + this.f85707c + ", amountCreditLimit=" + this.d + ", unrealisedProfitLoss=" + this.f85708e + ", realisedProfitLoss=" + this.f85709f + ", profitLoss=" + this.f85710g + ", equity=" + this.f85711h + ", gain=" + this.f85712i + ", debt=" + this.f85713j + ")";
    }

    public /* synthetic */ k(double r32, double r34, double r36, double r38, double r40, double r42, double r44, double r46, double r48, e r50, int r51, kotlin.jvm.internal.i r52) {
        double r2 = 0.0d;
        if ((r51 & 1) == 0) goto L5;
        double r4 = 0.0d;
    L7:
        if ((r51 & 2) == 0) goto L9;
        double r6 = 0.0d;
    L11:
        if ((r51 & 4) == 0) goto L13;
        double r8 = 0.0d;
    L15:
        if ((r51 & 8) == 0) goto L17;
        double r10 = 0.0d;
    L19:
        if ((r51 & 16) == 0) goto L21;
        double r12 = 0.0d;
    L23:
        if ((r51 & 32) == 0) goto L25;
        double r14 = 0.0d;
    L27:
        if ((r51 & 64) == 0) goto L29;
        double r16 = 0.0d;
    L31:
        if ((r51 & 128) == 0) goto L33;
        double r18 = 0.0d;
    L35:
        if ((r51 & 256) != 0) goto L39;
        r2 = r48;
    L39:
        if ((r51 & 512) == 0) goto L42;
        e r512 = new e(0.0d, 0.0d, 0.0d, 0, 0.0d, 31, null);
    L43:
        this(r4, r6, r8, r10, r12, r14, r16, r18, r2, r512);
        return;
    L42:
        r512 = r50;
        goto L43
    L33:
        r18 = r46;
        goto L35
    L29:
        r16 = r44;
        goto L31
    L25:
        r14 = r42;
        goto L27
    L21:
        r12 = r40;
        goto L23
    L17:
        r10 = r38;
        goto L19
    L13:
        r8 = r36;
        goto L15
    L9:
        r6 = r34;
        goto L11
    L5:
        r4 = r32;
        goto L7
    }
}
