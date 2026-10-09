package com.stockbit.usecase.orderbook.model;

import com.stockbit.usecase.securities.model.OrderBookColorType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: A, reason: collision with root package name */
    public final String f158839A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f158840B;

    /* renamed from: C, reason: collision with root package name */
    public final String f158841C;

    /* renamed from: a, reason: collision with root package name */
    public final String f158842a;

    /* renamed from: b, reason: collision with root package name */
    public final OrderBookColorType f158843b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158844c;
    public final OrderBookColorType d;

    /* renamed from: e, reason: collision with root package name */
    public final String f158845e;

    /* renamed from: f, reason: collision with root package name */
    public final OrderBookColorType f158846f;

    /* renamed from: g, reason: collision with root package name */
    public final String f158847g;

    /* renamed from: h, reason: collision with root package name */
    public final OrderBookColorType f158848h;

    /* renamed from: i, reason: collision with root package name */
    public final String f158849i;

    /* renamed from: j, reason: collision with root package name */
    public final OrderBookColorType f158850j;

    /* renamed from: k, reason: collision with root package name */
    public final String f158851k;

    /* renamed from: l, reason: collision with root package name */
    public final OrderBookColorType f158852l;

    /* renamed from: m, reason: collision with root package name */
    public final String f158853m;

    /* renamed from: n, reason: collision with root package name */
    public final OrderBookColorType f158854n;

    /* renamed from: o, reason: collision with root package name */
    public final String f158855o;

    /* renamed from: p, reason: collision with root package name */
    public final OrderBookColorType f158856p;

    /* renamed from: q, reason: collision with root package name */
    public final String f158857q;

    /* renamed from: r, reason: collision with root package name */
    public final OrderBookColorType f158858r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f158859s;

    /* renamed from: t, reason: collision with root package name */
    public final double f158860t;

    /* renamed from: u, reason: collision with root package name */
    public final String f158861u;

    /* renamed from: v, reason: collision with root package name */
    public final com.stockbit.usecase.orderbook.model.orderqueue.a f158862v;

    /* renamed from: w, reason: collision with root package name */
    public final String f158863w;

    /* renamed from: x, reason: collision with root package name */
    public final String f158864x;

    /* renamed from: y, reason: collision with root package name */
    public final int f158865y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f158866z;

    public f(String r17, OrderBookColorType r18, String r19, OrderBookColorType r20, String r21, OrderBookColorType r22, String r23, OrderBookColorType r24, String r25, OrderBookColorType r26, String r27, OrderBookColorType r28, String r29, OrderBookColorType r30, String r31, OrderBookColorType r32, String r33, OrderBookColorType r34, boolean r35, double r36, String r38, com.stockbit.usecase.orderbook.model.orderqueue.a r39, String r40, String r41, int r42, boolean r43, String r44, boolean r45, String r46) {
        p.l(r17, "openPrice");
        p.l(r18, "openPriceColor");
        p.l(r19, "closePrice");
        p.l(r20, "closePriceColor");
        p.l(r21, "highPrice");
        p.l(r22, "highPriceColor");
        p.l(r23, "lowPrice");
        p.l(r24, "lowPriceColor");
        p.l(r25, "fBuyPrice");
        p.l(r26, "fBuyPriceColor");
        p.l(r27, "lot");
        p.l(r28, "lotColor");
        p.l(r29, "value");
        p.l(r30, "valueColor");
        p.l(r31, "averagePrice");
        p.l(r32, "averagePriceColor");
        p.l(r33, "fSellPrice");
        p.l(r34, "fSellPriceColor");
        p.l(r38, "previousPriceFormatted");
        p.l(r40, "araPrice");
        p.l(r41, "nextAraPrice");
        p.l(r44, "arbPrice");
        p.l(r46, "totalFreq");
        this.f158842a = r17;
        this.f158843b = r18;
        this.f158844c = r19;
        this.d = r20;
        this.f158845e = r21;
        this.f158846f = r22;
        this.f158847g = r23;
        this.f158848h = r24;
        this.f158849i = r25;
        this.f158850j = r26;
        this.f158851k = r27;
        this.f158852l = r28;
        this.f158853m = r29;
        this.f158854n = r30;
        this.f158855o = r31;
        this.f158856p = r32;
        this.f158857q = r33;
        this.f158858r = r34;
        this.f158859s = r35;
        this.f158860t = r36;
        this.f158861u = r38;
        this.f158862v = r39;
        this.f158863w = r40;
        this.f158864x = r41;
        this.f158865y = r42;
        this.f158866z = r43;
        this.f158839A = r44;
        this.f158840B = r45;
        this.f158841C = r46;
    }

    public final boolean A() {
        return this.f158840B;
    }

    public final boolean B() {
        return this.f158859s;
    }

    public final String a() {
        return this.f158863w;
    }

    public final String b() {
        return this.f158839A;
    }

    public final String c() {
        return this.f158855o;
    }

    public final OrderBookColorType d() {
        return this.f158856p;
    }

    public final String e() {
        return this.f158844c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (p.g(this.f158842a, r82.f158842a) == true) goto L12;
        return false;
    L12:
        if (this.f158843b == r82.f158843b) goto L15;
        return false;
    L15:
        if (p.g(this.f158844c, r82.f158844c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (p.g(this.f158845e, r82.f158845e) == true) goto L24;
        return false;
    L24:
        if (this.f158846f == r82.f158846f) goto L27;
        return false;
    L27:
        if (p.g(this.f158847g, r82.f158847g) == true) goto L30;
        return false;
    L30:
        if (this.f158848h == r82.f158848h) goto L33;
        return false;
    L33:
        if (p.g(this.f158849i, r82.f158849i) == true) goto L36;
        return false;
    L36:
        if (this.f158850j == r82.f158850j) goto L39;
        return false;
    L39:
        if (p.g(this.f158851k, r82.f158851k) == true) goto L42;
        return false;
    L42:
        if (this.f158852l == r82.f158852l) goto L45;
        return false;
    L45:
        if (p.g(this.f158853m, r82.f158853m) == true) goto L48;
        return false;
    L48:
        if (this.f158854n == r82.f158854n) goto L51;
        return false;
    L51:
        if (p.g(this.f158855o, r82.f158855o) == true) goto L54;
        return false;
    L54:
        if (this.f158856p == r82.f158856p) goto L57;
        return false;
    L57:
        if (p.g(this.f158857q, r82.f158857q) == true) goto L60;
        return false;
    L60:
        if (this.f158858r == r82.f158858r) goto L63;
        return false;
    L63:
        if (this.f158859s == r82.f158859s) goto L66;
        return false;
    L66:
        if (Double.compare(this.f158860t, r82.f158860t) == 0) goto L69;
        return false;
    L69:
        if (p.g(this.f158861u, r82.f158861u) == true) goto L72;
        return false;
    L72:
        if (p.g(this.f158862v, r82.f158862v) == true) goto L75;
        return false;
    L75:
        if (p.g(this.f158863w, r82.f158863w) == true) goto L78;
        return false;
    L78:
        if (p.g(this.f158864x, r82.f158864x) == true) goto L81;
        return false;
    L81:
        if (this.f158865y == r82.f158865y) goto L84;
        return false;
    L84:
        if (this.f158866z == r82.f158866z) goto L87;
        return false;
    L87:
        if (p.g(this.f158839A, r82.f158839A) == true) goto L90;
        return false;
    L90:
        if (this.f158840B == r82.f158840B) goto L93;
        return false;
    L93:
        if (p.g(this.f158841C, r82.f158841C) == true) goto L95;
        return false;
    L95:
        return true;
    }

    public final int f() {
        return this.f158865y;
    }

    public final String g() {
        return this.f158849i;
    }

    public final OrderBookColorType h() {
        return this.f158850j;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((((((((((((((((((((((((((this.f158842a.hashCode() * 31) + this.f158843b.hashCode()) * 31) + this.f158844c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f158845e.hashCode()) * 31) + this.f158846f.hashCode()) * 31) + this.f158847g.hashCode()) * 31) + this.f158848h.hashCode()) * 31) + this.f158849i.hashCode()) * 31) + this.f158850j.hashCode()) * 31) + this.f158851k.hashCode()) * 31) + this.f158852l.hashCode()) * 31) + this.f158853m.hashCode()) * 31) + this.f158854n.hashCode()) * 31) + this.f158855o.hashCode()) * 31) + this.f158856p.hashCode()) * 31) + this.f158857q.hashCode()) * 31) + this.f158858r.hashCode()) * 31) + Boolean.hashCode(this.f158859s)) * 31) + Double.hashCode(this.f158860t)) * 31) + this.f158861u.hashCode()) * 31;
        com.stockbit.usecase.orderbook.model.orderqueue.a r1 = this.f158862v;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((((((((((r02 + r12) * 31) + this.f158863w.hashCode()) * 31) + this.f158864x.hashCode()) * 31) + Integer.hashCode(this.f158865y)) * 31) + Boolean.hashCode(this.f158866z)) * 31) + this.f158839A.hashCode()) * 31) + Boolean.hashCode(this.f158840B)) * 31) + this.f158841C.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String i() {
        return this.f158857q;
    }

    public final OrderBookColorType j() {
        return this.f158858r;
    }

    public final String k() {
        return this.f158845e;
    }

    public final OrderBookColorType l() {
        return this.f158846f;
    }

    public final com.stockbit.usecase.orderbook.model.orderqueue.a m() {
        return this.f158862v;
    }

    public final String n() {
        return this.f158851k;
    }

    public final OrderBookColorType o() {
        return this.f158852l;
    }

    public final String p() {
        return this.f158847g;
    }

    public final OrderBookColorType q() {
        return this.f158848h;
    }

    public final String r() {
        return this.f158864x;
    }

    public final String s() {
        return this.f158842a;
    }

    public final OrderBookColorType t() {
        return this.f158843b;
    }

    public String toString() {
        return "OrderBookOHLCUiState(openPrice=" + this.f158842a + ", openPriceColor=" + this.f158843b + ", closePrice=" + this.f158844c + ", closePriceColor=" + this.d + ", highPrice=" + this.f158845e + ", highPriceColor=" + this.f158846f + ", lowPrice=" + this.f158847g + ", lowPriceColor=" + this.f158848h + ", fBuyPrice=" + this.f158849i + ", fBuyPriceColor=" + this.f158850j + ", lot=" + this.f158851k + ", lotColor=" + this.f158852l + ", value=" + this.f158853m + ", valueColor=" + this.f158854n + ", averagePrice=" + this.f158855o + ", averagePriceColor=" + this.f158856p + ", fSellPrice=" + this.f158857q + ", fSellPriceColor=" + this.f158858r + ", isForeignGroupVisible=" + this.f158859s + ", previousPrice=" + this.f158860t + ", previousPriceFormatted=" + this.f158861u + ", iepIevState=" + this.f158862v + ", araPrice=" + this.f158863w + ", nextAraPrice=" + this.f158864x + ", countDownAra=" + this.f158865y + ", isAraVisible=" + this.f158866z + ", arbPrice=" + this.f158839A + ", isArbVisible=" + this.f158840B + ", totalFreq=" + this.f158841C + ")";
    }

    public final double u() {
        return this.f158860t;
    }

    public final String v() {
        return this.f158861u;
    }

    public final String w() {
        return this.f158841C;
    }

    public final String x() {
        return this.f158853m;
    }

    public final OrderBookColorType y() {
        return this.f158854n;
    }

    public final boolean z() {
        return this.f158866z;
    }
}
