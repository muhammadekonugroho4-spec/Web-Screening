package com.stockbit.datasource.param.securities;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f80074a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80075b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80076c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80077e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80078f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80079g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80080h;

    public a(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        p.l(r2, "buyPrice");
        p.l(r3, "shares");
        p.l(r4, "stopLossStatus");
        p.l(r5, "stopLossTriggerPrice");
        p.l(r6, "takeProfitStatus");
        p.l(r7, "takeProfitTriggerPrice");
        p.l(r8, "stopLossOrderType");
        p.l(r9, "takeProfitOrderType");
        this.f80074a = r2;
        this.f80075b = r3;
        this.f80076c = r4;
        this.d = r5;
        this.f80077e = r6;
        this.f80078f = r7;
        this.f80079g = r8;
        this.f80080h = r9;
    }

    public final String a() {
        return this.f80074a;
    }

    public final String b() {
        return this.f80075b;
    }

    public final String c() {
        return this.f80079g;
    }

    public final String d() {
        return this.f80076c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f80074a, r52.f80074a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80075b, r52.f80075b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80076c, r52.f80076c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80077e, r52.f80077e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f80078f, r52.f80078f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f80079g, r52.f80079g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f80080h, r52.f80080h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f80080h;
    }

    public final String g() {
        return this.f80077e;
    }

    public final String h() {
        return this.f80078f;
    }

    public int hashCode() {
        return (((((((((((((this.f80074a.hashCode() * 31) + this.f80075b.hashCode()) * 31) + this.f80076c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80077e.hashCode()) * 31) + this.f80078f.hashCode()) * 31) + this.f80079g.hashCode()) * 31) + this.f80080h.hashCode();
    }

    public String toString() {
        return "AmendBracketOrderParentDataParam(buyPrice=" + this.f80074a + ", shares=" + this.f80075b + ", stopLossStatus=" + this.f80076c + ", stopLossTriggerPrice=" + this.d + ", takeProfitStatus=" + this.f80077e + ", takeProfitTriggerPrice=" + this.f80078f + ", stopLossOrderType=" + this.f80079g + ", takeProfitOrderType=" + this.f80080h + ")";
    }
}
