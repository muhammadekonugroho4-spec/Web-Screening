package com.stockbit.domain.model.entity.virtual;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f83848a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83849b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83850c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f83851e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83852f;

    /* renamed from: g, reason: collision with root package name */
    public final String f83853g;

    /* renamed from: h, reason: collision with root package name */
    public final String f83854h;

    /* renamed from: i, reason: collision with root package name */
    public final String f83855i;

    /* renamed from: j, reason: collision with root package name */
    public final String f83856j;

    /* renamed from: k, reason: collision with root package name */
    public final String f83857k;

    public d(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11) {
        this.f83848a = r1;
        this.f83849b = r2;
        this.f83850c = r3;
        this.d = r4;
        this.f83851e = r5;
        this.f83852f = r6;
        this.f83853g = r7;
        this.f83854h = r8;
        this.f83855i = r9;
        this.f83856j = r10;
        this.f83857k = r11;
    }

    public final String a() {
        return this.f83856j;
    }

    public final String b() {
        return this.f83848a;
    }

    public final String c() {
        return this.f83852f;
    }

    public final String d() {
        return this.f83854h;
    }

    public final String e() {
        return this.f83855i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f83848a, r52.f83848a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83849b, r52.f83849b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83850c, r52.f83850c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83851e, r52.f83851e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83852f, r52.f83852f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f83853g, r52.f83853g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f83854h, r52.f83854h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f83855i, r52.f83855i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f83856j, r52.f83856j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f83857k, r52.f83857k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f83853g;
    }

    public final String g() {
        return this.f83857k;
    }

    public final String h() {
        return this.f83851e;
    }

    public int hashCode() {
        String r02 = this.f83848a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f83849b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f83850c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f83851e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f83852f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f83853g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f83854h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f83855i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f83856j;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.f83857k;
        if (r219 == null) goto L47;
        r1 = r219.hashCode();
    L47:
        return r013 + r1;
    L41:
        r218 = r217.hashCode();
        goto L42
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String i() {
        return this.f83849b;
    }

    public final String j() {
        return this.d;
    }

    public String toString() {
        return "TradingFormulaDataEntity(buyLot=" + this.f83848a + ", sellLot=" + this.f83849b + ", sellMarket=" + this.f83850c + ", sellProfitloss=" + this.d + ", sellGain=" + this.f83851e + ", portfolio=" + this.f83852f + ", portfolioProfitloss=" + this.f83853g + ", portfolioEquity=" + this.f83854h + ", portfolioGain=" + this.f83855i + ", buyFee=" + this.f83856j + ", sellFee=" + this.f83857k + ')';
    }
}
