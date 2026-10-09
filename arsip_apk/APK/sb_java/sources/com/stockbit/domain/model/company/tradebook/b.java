package com.stockbit.domain.model.company.tradebook;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f81987a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81988b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81989c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81990e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81991f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81992g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81993h;

    /* renamed from: i, reason: collision with root package name */
    public final String f81994i;

    /* renamed from: j, reason: collision with root package name */
    public final String f81995j;

    /* renamed from: k, reason: collision with root package name */
    public final String f81996k;

    /* renamed from: l, reason: collision with root package name */
    public final e f81997l;

    /* renamed from: m, reason: collision with root package name */
    public final e f81998m;

    public b(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, e r13, e r14) {
        p.l(r2, "buyLot");
        p.l(r3, "sellLot");
        p.l(r4, "buyPercentage");
        p.l(r5, "sellPercentage");
        p.l(r6, "totalLot");
        p.l(r7, "buyValuePercentage");
        p.l(r8, "sellValuePercentage");
        p.l(r9, "bigMoneyBuyPercentage");
        p.l(r10, "bigMoneySellPercentage");
        p.l(r11, "bigMoneyBuyValuePercentage");
        p.l(r12, "bigMoneySellValuePercentage");
        p.l(r13, "bigMoneyNetPerMinPercentage");
        p.l(r14, "overallNetPerMinPercentage");
        this.f81987a = r2;
        this.f81988b = r3;
        this.f81989c = r4;
        this.d = r5;
        this.f81990e = r6;
        this.f81991f = r7;
        this.f81992g = r8;
        this.f81993h = r9;
        this.f81994i = r10;
        this.f81995j = r11;
        this.f81996k = r12;
        this.f81997l = r13;
        this.f81998m = r14;
    }

    public final e a() {
        return this.f81997l;
    }

    public final e b() {
        return this.f81998m;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f81987a, r52.f81987a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81988b, r52.f81988b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81989c, r52.f81989c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81990e, r52.f81990e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81991f, r52.f81991f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81992g, r52.f81992g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81993h, r52.f81993h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f81994i, r52.f81994i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f81995j, r52.f81995j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f81996k, r52.f81996k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f81997l, r52.f81997l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f81998m, r52.f81998m) == true) goto L47;
        return false;
    L47:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f81987a.hashCode() * 31) + this.f81988b.hashCode()) * 31) + this.f81989c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81990e.hashCode()) * 31) + this.f81991f.hashCode()) * 31) + this.f81992g.hashCode()) * 31) + this.f81993h.hashCode()) * 31) + this.f81994i.hashCode()) * 31) + this.f81995j.hashCode()) * 31) + this.f81996k.hashCode()) * 31) + this.f81997l.hashCode()) * 31) + this.f81998m.hashCode();
    }

    public String toString() {
        return "TradeBookChartBookTotalEntity(buyLot=" + this.f81987a + ", sellLot=" + this.f81988b + ", buyPercentage=" + this.f81989c + ", sellPercentage=" + this.d + ", totalLot=" + this.f81990e + ", buyValuePercentage=" + this.f81991f + ", sellValuePercentage=" + this.f81992g + ", bigMoneyBuyPercentage=" + this.f81993h + ", bigMoneySellPercentage=" + this.f81994i + ", bigMoneyBuyValuePercentage=" + this.f81995j + ", bigMoneySellValuePercentage=" + this.f81996k + ", bigMoneyNetPerMinPercentage=" + this.f81997l + ", overallNetPerMinPercentage=" + this.f81998m + ")";
    }
}
