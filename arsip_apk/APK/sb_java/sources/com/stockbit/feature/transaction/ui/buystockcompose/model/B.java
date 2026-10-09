package com.stockbit.feature.transaction.ui.buystockcompose.model;

/* loaded from: classes9.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final double f111434a;

    /* renamed from: b, reason: collision with root package name */
    public final double f111435b;

    /* renamed from: c, reason: collision with root package name */
    public final double f111436c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f111437e;

    /* renamed from: f, reason: collision with root package name */
    public final double f111438f;

    /* renamed from: g, reason: collision with root package name */
    public final double f111439g;

    /* renamed from: h, reason: collision with root package name */
    public final double f111440h;

    static {
    }

    public B(double r1, double r3, double r5, double r7, double r9, double r11, double r13, double r15) {
        this.f111434a = r1;
        this.f111435b = r3;
        this.f111436c = r5;
        this.d = r7;
        this.f111437e = r9;
        this.f111438f = r11;
        this.f111439g = r13;
        this.f111440h = r15;
    }

    public static /* synthetic */ B b(B r18, double r19, double r21, double r23, double r25, double r27, double r29, double r31, double r33, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        double r2 = r18.f111434a;
    L7:
        if ((r35 & 2) == 0) goto L9;
        double r4 = r18.f111435b;
    L11:
        if ((r35 & 4) == 0) goto L13;
        double r6 = r18.f111436c;
    L15:
        if ((r35 & 8) == 0) goto L17;
        double r8 = r18.d;
    L19:
        if ((r35 & 16) == 0) goto L21;
        double r10 = r18.f111437e;
    L23:
        if ((r35 & 32) == 0) goto L25;
        double r12 = r18.f111438f;
    L27:
        if ((r35 & 64) == 0) goto L29;
        double r14 = r18.f111439g;
    L31:
        if ((r35 & 128) == 0) goto L34;
        double r34 = r18.f111440h;
        double r20 = r2;
    L36:
        return r18.a(r20, r4, r6, r8, r10, r12, r14, r34);
    L34:
        r34 = r33;
        r20 = r2;
        goto L36
    L29:
        r14 = r31;
        goto L31
    L25:
        r12 = r29;
        goto L27
    L21:
        r10 = r27;
        goto L23
    L17:
        r8 = r25;
        goto L19
    L13:
        r6 = r23;
        goto L15
    L9:
        r4 = r21;
        goto L11
    L5:
        r2 = r19;
        goto L7
    }

    public final B a(double r18, double r20, double r22, double r24, double r26, double r28, double r30, double r32) {
        return new B(r18, r20, r22, r24, r26, r28, r30, r32);
    }

    public final double c() {
        return this.f111439g;
    }

    public final double d() {
        return this.f111438f;
    }

    public final double e() {
        return this.f111437e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof B) == true) goto L8;
        return false;
    L8:
        B r82 = (B) r8;
        if (Double.compare(this.f111434a, r82.f111434a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f111435b, r82.f111435b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f111436c, r82.f111436c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f111437e, r82.f111437e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f111438f, r82.f111438f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f111439g, r82.f111439g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f111440h, r82.f111440h) == 0) goto L32;
        return false;
    L32:
        return true;
    }

    public final double f() {
        return this.f111435b;
    }

    public final double g() {
        return this.f111436c;
    }

    public final double h() {
        return this.f111434a;
    }

    public int hashCode() {
        return (((((((((((((Double.hashCode(this.f111434a) * 31) + Double.hashCode(this.f111435b)) * 31) + Double.hashCode(this.f111436c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f111437e)) * 31) + Double.hashCode(this.f111438f)) * 31) + Double.hashCode(this.f111439g)) * 31) + Double.hashCode(this.f111440h);
    }

    public final double i() {
        return this.f111440h;
    }

    public String toString() {
        return "MarginUIState(marginRatio=" + this.f111434a + ", marginAtRiskRatioThreshold=" + this.f111435b + ", marginCallRatioThreshold=" + this.f111436c + ", marginForceSellRatioThreshold=" + this.d + ", debtTotal=" + this.f111437e + ", debtMarketValue=" + this.f111438f + ", collateralValueFromOrder=" + this.f111439g + ", orderDebt=" + this.f111440h + ')';
    }

    public /* synthetic */ B(double r19, double r21, double r23, double r25, double r27, double r29, double r31, double r33, int r35, kotlin.jvm.internal.i r36) {
        if ((r35 & 1) == 0) goto L5;
        double r4 = 0.0d;
    L7:
        if ((r35 & 2) == 0) goto L9;
        double r6 = 0.0d;
    L11:
        if ((r35 & 4) == 0) goto L13;
        double r8 = 0.0d;
    L15:
        if ((r35 & 8) == 0) goto L17;
        double r10 = 0.0d;
    L19:
        if ((r35 & 16) == 0) goto L21;
        double r12 = 0.0d;
    L23:
        if ((r35 & 32) == 0) goto L25;
        double r14 = 0.0d;
    L27:
        if ((r35 & 64) == 0) goto L29;
        double r16 = 0.0d;
    L31:
        if ((r35 & 128) == 0) goto L34;
        double r34 = 0.0d;
    L35:
        this(r4, r6, r8, r10, r12, r14, r16, r34);
        return;
    L34:
        r34 = r33;
        goto L35
    L29:
        r16 = r31;
        goto L31
    L25:
        r14 = r29;
        goto L27
    L21:
        r12 = r27;
        goto L23
    L17:
        r10 = r25;
        goto L19
    L13:
        r8 = r23;
        goto L15
    L9:
        r6 = r21;
        goto L11
    L5:
        r4 = r19;
        goto L7
    }
}
