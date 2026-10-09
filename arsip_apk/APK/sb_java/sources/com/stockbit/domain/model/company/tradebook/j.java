package com.stockbit.domain.model.company.tradebook;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f82046a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82047b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82048c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82049e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82050f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82051g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82052h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82053i;

    /* renamed from: j, reason: collision with root package name */
    public final String f82054j;

    /* renamed from: k, reason: collision with root package name */
    public final String f82055k;

    /* renamed from: l, reason: collision with root package name */
    public final String f82056l;

    /* renamed from: m, reason: collision with root package name */
    public final String f82057m;

    /* renamed from: n, reason: collision with root package name */
    public final String f82058n;

    /* renamed from: o, reason: collision with root package name */
    public final String f82059o;

    /* renamed from: p, reason: collision with root package name */
    public final String f82060p;

    /* renamed from: q, reason: collision with root package name */
    public final h f82061q;

    /* renamed from: r, reason: collision with root package name */
    public final h f82062r;

    public j(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, h r33, h r34) {
        p.l(r17, "buyFrequency");
        p.l(r18, "sellFrequency");
        p.l(r19, "buyLot");
        p.l(r20, "sellLot");
        p.l(r21, "buyPercent");
        p.l(r22, "sellPercent");
        p.l(r23, "totalFrequency");
        p.l(r24, "totalLot");
        p.l(r25, "preLot");
        p.l(r26, "postLot");
        p.l(r27, "preFrequency");
        p.l(r28, "postFrequency");
        p.l(r29, "buyValuePercentage");
        p.l(r30, "sellValuePercentage");
        p.l(r31, "buyValue");
        p.l(r32, "sellValue");
        p.l(r33, "bigMoneyNetPerMinPercentage");
        p.l(r34, "overallNetPerMinPercentage");
        this.f82046a = r17;
        this.f82047b = r18;
        this.f82048c = r19;
        this.d = r20;
        this.f82049e = r21;
        this.f82050f = r22;
        this.f82051g = r23;
        this.f82052h = r24;
        this.f82053i = r25;
        this.f82054j = r26;
        this.f82055k = r27;
        this.f82056l = r28;
        this.f82057m = r29;
        this.f82058n = r30;
        this.f82059o = r31;
        this.f82060p = r32;
        this.f82061q = r33;
        this.f82062r = r34;
    }

    public final h a() {
        return this.f82061q;
    }

    public final String b() {
        return this.f82046a;
    }

    public final String c() {
        return this.f82048c;
    }

    public final String d() {
        return this.f82049e;
    }

    public final String e() {
        return this.f82059o;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f82046a, r52.f82046a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82047b, r52.f82047b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82048c, r52.f82048c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82049e, r52.f82049e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82050f, r52.f82050f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82051g, r52.f82051g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82052h, r52.f82052h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f82053i, r52.f82053i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f82054j, r52.f82054j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f82055k, r52.f82055k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f82056l, r52.f82056l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f82057m, r52.f82057m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f82058n, r52.f82058n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f82059o, r52.f82059o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f82060p, r52.f82060p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f82061q, r52.f82061q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f82062r, r52.f82062r) == true) goto L62;
        return false;
    L62:
        return true;
    }

    public final h f() {
        return this.f82062r;
    }

    public final String g() {
        return this.f82056l;
    }

    public final String h() {
        return this.f82054j;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.f82046a.hashCode() * 31) + this.f82047b.hashCode()) * 31) + this.f82048c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82049e.hashCode()) * 31) + this.f82050f.hashCode()) * 31) + this.f82051g.hashCode()) * 31) + this.f82052h.hashCode()) * 31) + this.f82053i.hashCode()) * 31) + this.f82054j.hashCode()) * 31) + this.f82055k.hashCode()) * 31) + this.f82056l.hashCode()) * 31) + this.f82057m.hashCode()) * 31) + this.f82058n.hashCode()) * 31) + this.f82059o.hashCode()) * 31) + this.f82060p.hashCode()) * 31) + this.f82061q.hashCode()) * 31) + this.f82062r.hashCode();
    }

    public final String i() {
        return this.f82055k;
    }

    public final String j() {
        return this.f82053i;
    }

    public final String k() {
        return this.f82047b;
    }

    public final String l() {
        return this.d;
    }

    public final String m() {
        return this.f82050f;
    }

    public final String n() {
        return this.f82060p;
    }

    public final String o() {
        return this.f82051g;
    }

    public final String p() {
        return this.f82052h;
    }

    public String toString() {
        return "TradeBookTotalEntity(buyFrequency=" + this.f82046a + ", sellFrequency=" + this.f82047b + ", buyLot=" + this.f82048c + ", sellLot=" + this.d + ", buyPercent=" + this.f82049e + ", sellPercent=" + this.f82050f + ", totalFrequency=" + this.f82051g + ", totalLot=" + this.f82052h + ", preLot=" + this.f82053i + ", postLot=" + this.f82054j + ", preFrequency=" + this.f82055k + ", postFrequency=" + this.f82056l + ", buyValuePercentage=" + this.f82057m + ", sellValuePercentage=" + this.f82058n + ", buyValue=" + this.f82059o + ", sellValue=" + this.f82060p + ", bigMoneyNetPerMinPercentage=" + this.f82061q + ", overallNetPerMinPercentage=" + this.f82062r + ")";
    }
}
