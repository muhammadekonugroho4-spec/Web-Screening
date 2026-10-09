package com.stockbit.domain.param.securities;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f87453a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87454b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87455c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87456e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87457f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87458g;

    /* renamed from: h, reason: collision with root package name */
    public final String f87459h;

    public a(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        kotlin.jvm.internal.p.l(r2, "buyPrice");
        kotlin.jvm.internal.p.l(r3, "shares");
        kotlin.jvm.internal.p.l(r4, "stopLossStatus");
        kotlin.jvm.internal.p.l(r5, "stopLossTriggerPrice");
        kotlin.jvm.internal.p.l(r6, "takeProfitStatus");
        kotlin.jvm.internal.p.l(r7, "takeProfitTriggerPrice");
        kotlin.jvm.internal.p.l(r8, "stopLossOrderType");
        kotlin.jvm.internal.p.l(r9, "takeProfitOrderType");
        this.f87453a = r2;
        this.f87454b = r3;
        this.f87455c = r4;
        this.d = r5;
        this.f87456e = r6;
        this.f87457f = r7;
        this.f87458g = r8;
        this.f87459h = r9;
    }

    public final String a() {
        return this.f87453a;
    }

    public final String b() {
        return this.f87454b;
    }

    public final String c() {
        return this.f87458g;
    }

    public final String d() {
        return this.f87455c;
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
        if (kotlin.jvm.internal.p.g(this.f87453a, r52.f87453a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f87454b, r52.f87454b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f87455c, r52.f87455c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f87456e, r52.f87456e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f87457f, r52.f87457f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f87458g, r52.f87458g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f87459h, r52.f87459h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f87459h;
    }

    public final String g() {
        return this.f87456e;
    }

    public final String h() {
        return this.f87457f;
    }

    public int hashCode() {
        return (((((((((((((this.f87453a.hashCode() * 31) + this.f87454b.hashCode()) * 31) + this.f87455c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f87456e.hashCode()) * 31) + this.f87457f.hashCode()) * 31) + this.f87458g.hashCode()) * 31) + this.f87459h.hashCode();
    }

    public String toString() {
        return "AmendBracketOrderParentDomainParam(buyPrice=" + this.f87453a + ", shares=" + this.f87454b + ", stopLossStatus=" + this.f87455c + ", stopLossTriggerPrice=" + this.d + ", takeProfitStatus=" + this.f87456e + ", takeProfitTriggerPrice=" + this.f87457f + ", stopLossOrderType=" + this.f87458g + ", takeProfitOrderType=" + this.f87459h + ")";
    }
}
