package com.stockbit.domain.model.securities.order;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final double f85421a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85422b;

    /* renamed from: c, reason: collision with root package name */
    public final double f85423c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f85424e;

    /* renamed from: f, reason: collision with root package name */
    public final double f85425f;

    /* renamed from: g, reason: collision with root package name */
    public final double f85426g;

    /* renamed from: h, reason: collision with root package name */
    public final double f85427h;

    /* renamed from: i, reason: collision with root package name */
    public final double f85428i;

    /* renamed from: j, reason: collision with root package name */
    public final double f85429j;

    public d(double r1, double r3, double r5, double r7, double r9, double r11, double r13, double r15, double r17, double r19) {
        this.f85421a = r1;
        this.f85422b = r3;
        this.f85423c = r5;
        this.d = r7;
        this.f85424e = r9;
        this.f85425f = r11;
        this.f85426g = r13;
        this.f85427h = r15;
        this.f85428i = r17;
        this.f85429j = r19;
    }

    public static /* synthetic */ d b(d r18, double r19, double r21, double r23, double r25, double r27, double r29, double r31, double r33, double r35, double r37, int r39, Object r40) {
        if ((r39 & 1) == 0) goto L5;
        double r2 = r18.f85421a;
    L7:
        if ((r39 & 2) == 0) goto L9;
        double r4 = r18.f85422b;
    L11:
        if ((r39 & 4) == 0) goto L13;
        double r6 = r18.f85423c;
    L15:
        if ((r39 & 8) == 0) goto L17;
        double r8 = r18.d;
    L19:
        if ((r39 & 16) == 0) goto L21;
        double r10 = r18.f85424e;
    L23:
        if ((r39 & 32) == 0) goto L25;
        double r12 = r18.f85425f;
    L27:
        if ((r39 & 64) == 0) goto L29;
        double r14 = r18.f85426g;
    L30:
        double r16 = r2;
        if ((r39 & 128) == 0) goto L33;
        double r22 = r18.f85427h;
    L34:
        double r192 = r22;
        if ((r39 & 256) == 0) goto L37;
        double r24 = r18.f85428i;
    L39:
        if ((r39 & 512) == 0) goto L42;
        double r36 = r24;
        double r38 = r18.f85429j;
    L44:
        return r18.a(r16, r4, r6, r8, r10, r12, r14, r192, r36, r38);
    L42:
        r38 = r37;
        r36 = r24;
        goto L44
    L37:
        r24 = r35;
        goto L39
    L33:
        r22 = r33;
        goto L34
    L29:
        r14 = r31;
        goto L30
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

    public final d a(double r22, double r24, double r26, double r28, double r30, double r32, double r34, double r36, double r38, double r40) {
        return new d(r22, r24, r26, r28, r30, r32, r34, r36, r38, r40);
    }

    public final double c() {
        return this.f85421a;
    }

    public final double d() {
        return this.f85422b;
    }

    public final double e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (Double.compare(this.f85421a, r82.f85421a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85422b, r82.f85422b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f85423c, r82.f85423c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f85424e, r82.f85424e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f85425f, r82.f85425f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f85426g, r82.f85426g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f85427h, r82.f85427h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f85428i, r82.f85428i) == 0) goto L36;
        return false;
    L36:
        if (Double.compare(this.f85429j, r82.f85429j) == 0) goto L38;
        return false;
    L38:
        return true;
    }

    public final double f() {
        return this.f85424e;
    }

    public final double g() {
        return this.f85423c;
    }

    public final double h() {
        return this.f85425f;
    }

    public int hashCode() {
        return (((((((((((((((((Double.hashCode(this.f85421a) * 31) + Double.hashCode(this.f85422b)) * 31) + Double.hashCode(this.f85423c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f85424e)) * 31) + Double.hashCode(this.f85425f)) * 31) + Double.hashCode(this.f85426g)) * 31) + Double.hashCode(this.f85427h)) * 31) + Double.hashCode(this.f85428i)) * 31) + Double.hashCode(this.f85429j);
    }

    public final double i() {
        return this.f85426g;
    }

    public final double j() {
        return this.f85428i;
    }

    public final double k() {
        return this.f85427h;
    }

    public final double l() {
        return this.f85429j;
    }

    public String toString() {
        return "OrderAmountEntity(matchedBrokerFee=" + this.f85421a + ", matchedExchangeFee=" + this.f85422b + ", openFee=" + this.f85423c + ", matchedInvestedAmountWithFee=" + this.d + ", matchedInvestedAmountWithoutFee=" + this.f85424e + ", orderRequestWithFee=" + this.f85425f + ", orderRequestWithoutFee=" + this.f85426g + ", totalOpenLot=" + this.f85427h + ", totalDoneLot=" + this.f85428i + ", totalRequestLot=" + this.f85429j + ")";
    }

    public /* synthetic */ d(double r23, double r25, double r27, double r29, double r31, double r33, double r35, double r37, double r39, double r41, int r43, kotlin.jvm.internal.i r44) {
        if ((r43 & 1) == 0) goto L5;
        double r4 = 0.0d;
    L7:
        if ((r43 & 2) == 0) goto L9;
        double r6 = 0.0d;
    L11:
        if ((r43 & 4) == 0) goto L13;
        double r8 = 0.0d;
    L15:
        if ((r43 & 8) == 0) goto L17;
        double r10 = 0.0d;
    L19:
        if ((r43 & 16) == 0) goto L21;
        double r12 = 0.0d;
    L23:
        if ((r43 & 32) == 0) goto L25;
        double r14 = 0.0d;
    L27:
        if ((r43 & 64) == 0) goto L29;
        double r16 = 0.0d;
    L31:
        if ((r43 & 128) == 0) goto L33;
        double r18 = 0.0d;
    L35:
        if ((r43 & 256) == 0) goto L37;
        double r20 = 0.0d;
    L39:
        if ((r43 & 512) == 0) goto L42;
        double r42 = 0.0d;
    L43:
        this(r4, r6, r8, r10, r12, r14, r16, r18, r20, r42);
        return;
    L42:
        r42 = r41;
        goto L43
    L37:
        r20 = r39;
        goto L39
    L33:
        r18 = r37;
        goto L35
    L29:
        r16 = r35;
        goto L31
    L25:
        r14 = r33;
        goto L27
    L21:
        r12 = r31;
        goto L23
    L17:
        r10 = r29;
        goto L19
    L13:
        r8 = r27;
        goto L15
    L9:
        r6 = r25;
        goto L11
    L5:
        r4 = r23;
        goto L7
    }
}
