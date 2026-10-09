package com.stockbit.usecase.securities.param;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f161918a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161919b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161920c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f161921e;

    /* renamed from: f, reason: collision with root package name */
    public final String f161922f;

    /* renamed from: g, reason: collision with root package name */
    public final String f161923g;

    /* renamed from: h, reason: collision with root package name */
    public final String f161924h;

    /* renamed from: i, reason: collision with root package name */
    public final String f161925i;

    public a(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        p.l(r3, "buyPrice");
        p.l(r4, "shares");
        p.l(r5, "stopLossStatus");
        p.l(r6, "stopLossTriggerPrice");
        p.l(r7, "takeProfitStatus");
        p.l(r8, "takeProfitTriggerPrice");
        p.l(r9, "stopLossOrderType");
        p.l(r10, "takeProfitOrderType");
        this.f161918a = r2;
        this.f161919b = r3;
        this.f161920c = r4;
        this.d = r5;
        this.f161921e = r6;
        this.f161922f = r7;
        this.f161923g = r8;
        this.f161924h = r9;
        this.f161925i = r10;
    }

    public final String a() {
        return this.f161919b;
    }

    public final String b() {
        return this.f161918a;
    }

    public final String c() {
        return this.f161920c;
    }

    public final String d() {
        return this.f161924h;
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
        if (p.g(this.f161918a, r52.f161918a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f161919b, r52.f161919b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f161920c, r52.f161920c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f161921e, r52.f161921e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f161922f, r52.f161922f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f161923g, r52.f161923g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f161924h, r52.f161924h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f161925i, r52.f161925i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f161921e;
    }

    public final String g() {
        return this.f161925i;
    }

    public final String h() {
        return this.f161922f;
    }

    public int hashCode() {
        String r02 = this.f161918a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((((((((((((((r03 * 31) + this.f161919b.hashCode()) * 31) + this.f161920c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f161921e.hashCode()) * 31) + this.f161922f.hashCode()) * 31) + this.f161923g.hashCode()) * 31) + this.f161924h.hashCode()) * 31) + this.f161925i.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public final String i() {
        return this.f161923g;
    }

    public String toString() {
        return "AmendBracketOrderParentUIParam(newPrice=" + this.f161918a + ", buyPrice=" + this.f161919b + ", shares=" + this.f161920c + ", stopLossStatus=" + this.d + ", stopLossTriggerPrice=" + this.f161921e + ", takeProfitStatus=" + this.f161922f + ", takeProfitTriggerPrice=" + this.f161923g + ", stopLossOrderType=" + this.f161924h + ", takeProfitOrderType=" + this.f161925i + ")";
    }
}
