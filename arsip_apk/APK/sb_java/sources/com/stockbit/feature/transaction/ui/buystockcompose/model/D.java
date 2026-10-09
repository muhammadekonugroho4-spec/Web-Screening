package com.stockbit.feature.transaction.ui.buystockcompose.model;

/* loaded from: classes9.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final String f111458a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111459b;

    /* renamed from: c, reason: collision with root package name */
    public final String f111460c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f111461e;

    /* renamed from: f, reason: collision with root package name */
    public final String f111462f;

    /* renamed from: g, reason: collision with root package name */
    public final String f111463g;

    /* renamed from: h, reason: collision with root package name */
    public final String f111464h;

    /* renamed from: i, reason: collision with root package name */
    public final String f111465i;

    /* renamed from: j, reason: collision with root package name */
    public final String f111466j;

    /* renamed from: k, reason: collision with root package name */
    public final String f111467k;

    /* renamed from: l, reason: collision with root package name */
    public final String f111468l;

    static {
    }

    public D(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13) {
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
        this.f111458a = r2;
        this.f111459b = r3;
        this.f111460c = r4;
        this.d = r5;
        this.f111461e = r6;
        this.f111462f = r7;
        this.f111463g = r8;
        this.f111464h = r9;
        this.f111465i = r10;
        this.f111466j = r11;
        this.f111467k = r12;
        this.f111468l = r13;
    }

    public final String a() {
        return this.f111460c;
    }

    public final String b() {
        return this.f111468l;
    }

    public final String c() {
        return this.f111458a;
    }

    public final String d() {
        return this.f111462f;
    }

    public final String e() {
        return this.f111461e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof D) == true) goto L8;
        return false;
    L8:
        D r52 = (D) r5;
        if (kotlin.jvm.internal.p.g(this.f111458a, r52.f111458a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f111459b, r52.f111459b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f111460c, r52.f111460c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f111461e, r52.f111461e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f111462f, r52.f111462f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f111463g, r52.f111463g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f111464h, r52.f111464h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f111465i, r52.f111465i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f111466j, r52.f111466j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f111467k, r52.f111467k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f111468l, r52.f111468l) == true) goto L44;
        return false;
    L44:
        return true;
    }

    public final String f() {
        return this.f111463g;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.f111464h;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f111458a.hashCode() * 31) + this.f111459b.hashCode()) * 31) + this.f111460c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f111461e.hashCode()) * 31) + this.f111462f.hashCode()) * 31) + this.f111463g.hashCode()) * 31) + this.f111464h.hashCode()) * 31) + this.f111465i.hashCode()) * 31) + this.f111466j.hashCode()) * 31) + this.f111467k.hashCode()) * 31) + this.f111468l.hashCode();
    }

    public final String i() {
        return this.f111466j;
    }

    public final String j() {
        return this.f111459b;
    }

    public final String k() {
        return this.f111467k;
    }

    public final String l() {
        return this.f111465i;
    }

    public String toString() {
        return "SellFormulaUIState(buyFee=" + this.f111458a + ", sellFee=" + this.f111459b + ", brokerFee=" + this.f111460c + ", formulaSellAmountExchangeFee=" + this.d + ", exchangeFeeTotalSell=" + this.f111461e + ", exchangeFeeTotalBuy=" + this.f111462f + ", formulaCalculatedSell=" + this.f111463g + ", portionDeductToTB=" + this.f111464h + ", sellProfitLoss=" + this.f111465i + ", sellAmountInvested=" + this.f111466j + ", sellGain=" + this.f111467k + ", buyAmountBrokerFee=" + this.f111468l + ')';
    }

    public /* synthetic */ D(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, int r14, kotlin.jvm.internal.i r15) {
        if ((r14 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r14 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r14 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r14 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r14 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r14 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r14 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r14 & 128) == 0) goto L27;
        r9 = "";
    L27:
        if ((r14 & 256) == 0) goto L30;
        r10 = "";
    L30:
        if ((r14 & 512) == 0) goto L33;
        r11 = "";
    L33:
        if ((r14 & 1024) == 0) goto L36;
        r12 = "";
    L36:
        if ((r14 & 2048) == 0) goto L39;
        String r142 = "";
    L38:
        String r132 = r12;
        String r122 = r11;
        String r112 = r10;
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102, r112, r122, r132, r142);
        return;
    L39:
        r142 = r13;
        goto L38
    }
}
