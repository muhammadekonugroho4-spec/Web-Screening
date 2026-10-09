package com.stockbit.usecase.cashsweep.model;

/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f155049a;

    /* renamed from: b, reason: collision with root package name */
    public final double f155050b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155051c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final String f155052e;

    /* renamed from: f, reason: collision with root package name */
    public final double f155053f;

    /* renamed from: g, reason: collision with root package name */
    public final String f155054g;

    /* renamed from: h, reason: collision with root package name */
    public final double f155055h;

    /* renamed from: i, reason: collision with root package name */
    public final String f155056i;

    /* renamed from: j, reason: collision with root package name */
    public final double f155057j;

    /* renamed from: k, reason: collision with root package name */
    public final String f155058k;

    /* renamed from: l, reason: collision with root package name */
    public final double f155059l;

    public k(String r4, double r5, String r7, double r8, String r10, double r11, String r13, double r14, String r16, double r17, String r19, double r20) {
        kotlin.jvm.internal.p.l(r4, "cashSweepFundBefore");
        kotlin.jvm.internal.p.l(r7, "cashOnHandBefore");
        kotlin.jvm.internal.p.l(r10, "tradingBalanceBefore");
        kotlin.jvm.internal.p.l(r13, "cashSweepFundAfter");
        kotlin.jvm.internal.p.l(r16, "cashOnHandAfter");
        kotlin.jvm.internal.p.l(r19, "tradingBalanceAfter");
        this.f155049a = r4;
        this.f155050b = r5;
        this.f155051c = r7;
        this.d = r8;
        this.f155052e = r10;
        this.f155053f = r11;
        this.f155054g = r13;
        this.f155055h = r14;
        this.f155056i = r16;
        this.f155057j = r17;
        this.f155058k = r19;
        this.f155059l = r20;
    }

    public final String a() {
        return this.f155056i;
    }

    public final String b() {
        return this.f155051c;
    }

    public final String c() {
        return this.f155054g;
    }

    public final String d() {
        return this.f155049a;
    }

    public final String e() {
        return this.f155058k;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof k) == true) goto L8;
        return false;
    L8:
        k r82 = (k) r8;
        if (kotlin.jvm.internal.p.g(this.f155049a, r82.f155049a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f155050b, r82.f155050b) == 0) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f155051c, r82.f155051c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f155052e, r82.f155052e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f155053f, r82.f155053f) == 0) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f155054g, r82.f155054g) == true) goto L30;
        return false;
    L30:
        if (Double.compare(this.f155055h, r82.f155055h) == 0) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f155056i, r82.f155056i) == true) goto L36;
        return false;
    L36:
        if (Double.compare(this.f155057j, r82.f155057j) == 0) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f155058k, r82.f155058k) == true) goto L42;
        return false;
    L42:
        if (Double.compare(this.f155059l, r82.f155059l) == 0) goto L44;
        return false;
    L44:
        return true;
    }

    public final String f() {
        return this.f155052e;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f155049a.hashCode() * 31) + Double.hashCode(this.f155050b)) * 31) + this.f155051c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f155052e.hashCode()) * 31) + Double.hashCode(this.f155053f)) * 31) + this.f155054g.hashCode()) * 31) + Double.hashCode(this.f155055h)) * 31) + this.f155056i.hashCode()) * 31) + Double.hashCode(this.f155057j)) * 31) + this.f155058k.hashCode()) * 31) + Double.hashCode(this.f155059l);
    }

    public String toString() {
        return "DeactivatedUIState(cashSweepFundBefore=" + this.f155049a + ", cashSweepFundBeforeRaw=" + this.f155050b + ", cashOnHandBefore=" + this.f155051c + ", cashOnHandBeforeRaw=" + this.d + ", tradingBalanceBefore=" + this.f155052e + ", tradingBalanceBeforeRaw=" + this.f155053f + ", cashSweepFundAfter=" + this.f155054g + ", cashSweepFundAfterRaw=" + this.f155055h + ", cashOnHandAfter=" + this.f155056i + ", cashOnHandAfterRaw=" + this.f155057j + ", tradingBalanceAfter=" + this.f155058k + ", tradingBalanceAfterRaw=" + this.f155059l + ")";
    }

    public /* synthetic */ k(String r19, double r20, String r22, double r23, String r25, double r26, String r28, double r29, String r31, double r32, String r34, double r35, int r37, kotlin.jvm.internal.i r38) {
        String r2 = "0";
        if ((r37 & 1) == 0) goto L5;
        String r1 = "0";
    L7:
        if ((r37 & 2) == 0) goto L9;
        double r6 = 0.0d;
    L11:
        if ((r37 & 4) == 0) goto L13;
        String r3 = "0";
    L15:
        if ((r37 & 8) == 0) goto L17;
        double r8 = 0.0d;
    L19:
        if ((r37 & 16) == 0) goto L21;
        String r10 = "0";
    L23:
        if ((r37 & 32) == 0) goto L25;
        double r11 = 0.0d;
    L27:
        if ((r37 & 64) == 0) goto L29;
        String r13 = "0";
    L31:
        if ((r37 & 128) == 0) goto L33;
        double r14 = 0.0d;
    L35:
        if ((r37 & 256) == 0) goto L37;
        String r4 = "0";
    L39:
        if ((r37 & 512) == 0) goto L41;
        double r16 = 0.0d;
    L43:
        if ((r37 & 1024) != 0) goto L47;
        r2 = r34;
    L47:
        if ((r37 & 2048) == 0) goto L50;
        double r36 = 0.0d;
    L51:
        this(r1, r6, r3, r8, r10, r11, r13, r14, r4, r16, r2, r36);
        return;
    L50:
        r36 = r35;
        goto L51
    L41:
        r16 = r32;
        goto L43
    L37:
        r4 = r31;
        goto L39
    L33:
        r14 = r29;
        goto L35
    L29:
        r13 = r28;
        goto L31
    L25:
        r11 = r26;
        goto L27
    L21:
        r10 = r25;
        goto L23
    L17:
        r8 = r23;
        goto L19
    L13:
        r3 = r22;
        goto L15
    L9:
        r6 = r20;
        goto L11
    L5:
        r1 = r19;
        goto L7
    }
}
