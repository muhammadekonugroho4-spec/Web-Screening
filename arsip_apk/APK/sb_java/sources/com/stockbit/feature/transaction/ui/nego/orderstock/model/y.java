package com.stockbit.feature.transaction.ui.nego.orderstock.model;

/* loaded from: classes9.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f115024a;

    /* renamed from: b, reason: collision with root package name */
    public final String f115025b;

    /* renamed from: c, reason: collision with root package name */
    public final String f115026c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f115027e;

    /* renamed from: f, reason: collision with root package name */
    public final String f115028f;

    /* renamed from: g, reason: collision with root package name */
    public final String f115029g;

    /* renamed from: h, reason: collision with root package name */
    public final String f115030h;

    /* renamed from: i, reason: collision with root package name */
    public final String f115031i;

    /* renamed from: j, reason: collision with root package name */
    public final String f115032j;

    /* renamed from: k, reason: collision with root package name */
    public final String f115033k;

    /* renamed from: l, reason: collision with root package name */
    public final String f115034l;

    /* renamed from: m, reason: collision with root package name */
    public final double f115035m;

    static {
    }

    public y(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, double r14) {
        kotlin.jvm.internal.p.l(r2, "buyFee");
        kotlin.jvm.internal.p.l(r3, "sellFee");
        kotlin.jvm.internal.p.l(r4, "brokerFee");
        kotlin.jvm.internal.p.l(r5, "formulaSellAmountExchangeFee");
        kotlin.jvm.internal.p.l(r6, "exchangeFeeTotalSell");
        kotlin.jvm.internal.p.l(r7, "exchangeFeeTotalBuy");
        kotlin.jvm.internal.p.l(r8, "formulaCalculatedSell");
        kotlin.jvm.internal.p.l(r9, "portionDeductToTB");
        kotlin.jvm.internal.p.l(r10, "sellProfitLoss");
        kotlin.jvm.internal.p.l(r11, "sellAmountInvested");
        kotlin.jvm.internal.p.l(r12, "sellGain");
        kotlin.jvm.internal.p.l(r13, "buyAmountBrokerFee");
        this.f115024a = r2;
        this.f115025b = r3;
        this.f115026c = r4;
        this.d = r5;
        this.f115027e = r6;
        this.f115028f = r7;
        this.f115029g = r8;
        this.f115030h = r9;
        this.f115031i = r10;
        this.f115032j = r11;
        this.f115033k = r12;
        this.f115034l = r13;
        this.f115035m = r14;
    }

    public final String a() {
        return this.f115026c;
    }

    public final String b() {
        return this.f115034l;
    }

    public final String c() {
        return this.f115024a;
    }

    public final String d() {
        return this.f115028f;
    }

    public final String e() {
        return this.f115027e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof y) == true) goto L8;
        return false;
    L8:
        y r82 = (y) r8;
        if (kotlin.jvm.internal.p.g(this.f115024a, r82.f115024a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f115025b, r82.f115025b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f115026c, r82.f115026c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f115027e, r82.f115027e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f115028f, r82.f115028f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f115029g, r82.f115029g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f115030h, r82.f115030h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f115031i, r82.f115031i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f115032j, r82.f115032j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f115033k, r82.f115033k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f115034l, r82.f115034l) == true) goto L45;
        return false;
    L45:
        if (Double.compare(this.f115035m, r82.f115035m) == 0) goto L47;
        return false;
    L47:
        return true;
    }

    public final String f() {
        return this.f115029g;
    }

    public final String g() {
        return this.d;
    }

    public final double h() {
        return this.f115035m;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f115024a.hashCode() * 31) + this.f115025b.hashCode()) * 31) + this.f115026c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f115027e.hashCode()) * 31) + this.f115028f.hashCode()) * 31) + this.f115029g.hashCode()) * 31) + this.f115030h.hashCode()) * 31) + this.f115031i.hashCode()) * 31) + this.f115032j.hashCode()) * 31) + this.f115033k.hashCode()) * 31) + this.f115034l.hashCode()) * 31) + Double.hashCode(this.f115035m);
    }

    public final String i() {
        return this.f115030h;
    }

    public final String j() {
        return this.f115032j;
    }

    public final String k() {
        return this.f115025b;
    }

    public final String l() {
        return this.f115033k;
    }

    public final String m() {
        return this.f115031i;
    }

    public String toString() {
        return "SellNegoFormulaUIState(buyFee=" + this.f115024a + ", sellFee=" + this.f115025b + ", brokerFee=" + this.f115026c + ", formulaSellAmountExchangeFee=" + this.d + ", exchangeFeeTotalSell=" + this.f115027e + ", exchangeFeeTotalBuy=" + this.f115028f + ", formulaCalculatedSell=" + this.f115029g + ", portionDeductToTB=" + this.f115030h + ", sellProfitLoss=" + this.f115031i + ", sellAmountInvested=" + this.f115032j + ", sellGain=" + this.f115033k + ", buyAmountBrokerFee=" + this.f115034l + ", otcFee=" + this.f115035m + ')';
    }

    public /* synthetic */ y(String r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, double r28, int r30, kotlin.jvm.internal.i r31) {
        String r2 = "";
        if ((r30 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r30 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r30 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r30 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r30 & 16) == 0) goto L21;
        String r6 = "";
    L23:
        if ((r30 & 32) == 0) goto L25;
        String r7 = "";
    L27:
        if ((r30 & 64) == 0) goto L29;
        String r8 = "";
    L31:
        if ((r30 & 128) == 0) goto L33;
        String r9 = "";
    L35:
        if ((r30 & 256) == 0) goto L37;
        String r10 = "";
    L39:
        if ((r30 & 512) == 0) goto L41;
        String r11 = "";
    L43:
        if ((r30 & 1024) == 0) goto L45;
        String r12 = "";
    L47:
        if ((r30 & 2048) != 0) goto L51;
        r2 = r27;
    L51:
        if ((r30 & 4096) == 0) goto L54;
        double r29 = 0.0d;
    L55:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r2, r29);
        return;
    L54:
        r29 = r28;
        goto L55
    L45:
        r12 = r26;
        goto L47
    L41:
        r11 = r25;
        goto L43
    L37:
        r10 = r24;
        goto L39
    L33:
        r9 = r23;
        goto L35
    L29:
        r8 = r22;
        goto L31
    L25:
        r7 = r21;
        goto L27
    L21:
        r6 = r20;
        goto L23
    L17:
        r5 = r19;
        goto L19
    L13:
        r4 = r18;
        goto L15
    L9:
        r3 = r17;
        goto L11
    L5:
        r1 = r16;
        goto L7
    }
}
