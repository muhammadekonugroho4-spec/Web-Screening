package com.stockbit.usecase.company.model.profile.mutualfund;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f156530a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156531b;

    /* renamed from: c, reason: collision with root package name */
    public final f f156532c;
    public final f d;

    /* renamed from: e, reason: collision with root package name */
    public final f f156533e;

    /* renamed from: f, reason: collision with root package name */
    public final f f156534f;

    /* renamed from: g, reason: collision with root package name */
    public final f f156535g;

    /* renamed from: h, reason: collision with root package name */
    public final f f156536h;

    /* renamed from: i, reason: collision with root package name */
    public final String f156537i;

    /* renamed from: j, reason: collision with root package name */
    public final String f156538j;

    /* renamed from: k, reason: collision with root package name */
    public final String f156539k;

    /* renamed from: l, reason: collision with root package name */
    public final String f156540l;

    /* renamed from: m, reason: collision with root package name */
    public final String f156541m;

    /* renamed from: n, reason: collision with root package name */
    public final String f156542n;

    public d(String r2, String r3, f r4, f r5, f r6, f r7, f r8, f r9, String r10, String r11, String r12, String r13, String r14, String r15) {
        p.l(r2, "fundManagerIco");
        p.l(r3, "custodianIco");
        p.l(r4, "cagr5year");
        p.l(r5, "maxDrawDown");
        p.l(r6, "expenseRatio");
        p.l(r7, "aum");
        p.l(r8, "fundType");
        p.l(r9, "riskLevel");
        p.l(r10, "minBuy");
        p.l(r11, "custodianBank");
        p.l(r12, "redemptionBank");
        p.l(r13, "buyFee");
        p.l(r14, "sellFee");
        p.l(r15, "averageYield");
        this.f156530a = r2;
        this.f156531b = r3;
        this.f156532c = r4;
        this.d = r5;
        this.f156533e = r6;
        this.f156534f = r7;
        this.f156535g = r8;
        this.f156536h = r9;
        this.f156537i = r10;
        this.f156538j = r11;
        this.f156539k = r12;
        this.f156540l = r13;
        this.f156541m = r14;
        this.f156542n = r15;
    }

    public final f a() {
        return this.f156534f;
    }

    public final String b() {
        return this.f156542n;
    }

    public final String c() {
        return this.f156540l;
    }

    public final String d() {
        return this.f156538j;
    }

    public final f e() {
        return this.f156533e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f156530a, r52.f156530a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156531b, r52.f156531b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156532c, r52.f156532c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f156533e, r52.f156533e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f156534f, r52.f156534f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f156535g, r52.f156535g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f156536h, r52.f156536h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f156537i, r52.f156537i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f156538j, r52.f156538j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f156539k, r52.f156539k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f156540l, r52.f156540l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f156541m, r52.f156541m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f156542n, r52.f156542n) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final f f() {
        return this.f156535g;
    }

    public final String g() {
        return this.f156537i;
    }

    public final String h() {
        return this.f156539k;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f156530a.hashCode() * 31) + this.f156531b.hashCode()) * 31) + this.f156532c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156533e.hashCode()) * 31) + this.f156534f.hashCode()) * 31) + this.f156535g.hashCode()) * 31) + this.f156536h.hashCode()) * 31) + this.f156537i.hashCode()) * 31) + this.f156538j.hashCode()) * 31) + this.f156539k.hashCode()) * 31) + this.f156540l.hashCode()) * 31) + this.f156541m.hashCode()) * 31) + this.f156542n.hashCode();
    }

    public final f i() {
        return this.f156536h;
    }

    public final String j() {
        return this.f156541m;
    }

    public String toString() {
        return "MutualFundProfileItemUIState(fundManagerIco=" + this.f156530a + ", custodianIco=" + this.f156531b + ", cagr5year=" + this.f156532c + ", maxDrawDown=" + this.d + ", expenseRatio=" + this.f156533e + ", aum=" + this.f156534f + ", fundType=" + this.f156535g + ", riskLevel=" + this.f156536h + ", minBuy=" + this.f156537i + ", custodianBank=" + this.f156538j + ", redemptionBank=" + this.f156539k + ", buyFee=" + this.f156540l + ", sellFee=" + this.f156541m + ", averageYield=" + this.f156542n + ")";
    }
}
