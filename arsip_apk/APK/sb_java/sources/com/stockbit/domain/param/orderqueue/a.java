package com.stockbit.domain.param.orderqueue;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f87431a;

    /* renamed from: b, reason: collision with root package name */
    public final Float f87432b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87433c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87434e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87435f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87436g;

    /* renamed from: h, reason: collision with root package name */
    public final String f87437h;

    /* renamed from: i, reason: collision with root package name */
    public final String f87438i;

    /* renamed from: j, reason: collision with root package name */
    public final String f87439j;

    /* renamed from: k, reason: collision with root package name */
    public final String f87440k;

    /* renamed from: l, reason: collision with root package name */
    public final int f87441l;

    /* renamed from: m, reason: collision with root package name */
    public final String f87442m;

    /* renamed from: n, reason: collision with root package name */
    public final String f87443n;

    public a(String r2, Float r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, int r13, String r14, String r15) {
        p.l(r2, "symbol");
        p.l(r8, "actionType");
        p.l(r9, "orderStatus");
        p.l(r10, "boardType");
        p.l(r12, "sortDirection");
        this.f87431a = r2;
        this.f87432b = r3;
        this.f87433c = r4;
        this.d = r5;
        this.f87434e = r6;
        this.f87435f = r7;
        this.f87436g = r8;
        this.f87437h = r9;
        this.f87438i = r10;
        this.f87439j = r11;
        this.f87440k = r12;
        this.f87441l = r13;
        this.f87442m = r14;
        this.f87443n = r15;
    }

    public final String a() {
        return this.f87436g;
    }

    public final String b() {
        return this.f87438i;
    }

    public final String c() {
        return this.f87433c;
    }

    public final String d() {
        return this.f87435f;
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
        if (p.g(this.f87431a, r52.f87431a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87432b, r52.f87432b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87433c, r52.f87433c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f87434e, r52.f87434e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f87435f, r52.f87435f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f87436g, r52.f87436g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f87437h, r52.f87437h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f87438i, r52.f87438i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f87439j, r52.f87439j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f87440k, r52.f87440k) == true) goto L42;
        return false;
    L42:
        if (this.f87441l == r52.f87441l) goto L45;
        return false;
    L45:
        if (p.g(this.f87442m, r52.f87442m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f87443n, r52.f87443n) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final int f() {
        return this.f87441l;
    }

    public final String g() {
        return this.f87437h;
    }

    public final Float h() {
        return this.f87432b;
    }

    public int hashCode() {
        int r02 = this.f87431a.hashCode() * 31;
        Float r1 = this.f87432b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f87433c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.f87434e;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.f87435f;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (((((((r06 + r110) * 31) + this.f87436g.hashCode()) * 31) + this.f87437h.hashCode()) * 31) + this.f87438i.hashCode()) * 31;
        String r111 = this.f87439j;
        if (r111 != null) goto L25;
        int r112 = 0;
    L26:
        int r08 = (((((r07 + r112) * 31) + this.f87440k.hashCode()) * 31) + Integer.hashCode(this.f87441l)) * 31;
        String r113 = this.f87442m;
        if (r113 != null) goto L29;
        int r114 = 0;
    L30:
        int r09 = (r08 + r114) * 31;
        String r115 = this.f87443n;
        if (r115 == null) goto L35;
        r2 = r115.hashCode();
    L35:
        return r09 + r2;
    L29:
        r114 = r113.hashCode();
        goto L30
    L25:
        r112 = r111.hashCode();
        goto L26
    L21:
        r110 = r19.hashCode();
        goto L22
    L17:
        r18 = r17.hashCode();
        goto L18
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.f87434e;
    }

    public final String j() {
        return this.f87439j;
    }

    public final String k() {
        return this.f87440k;
    }

    public final String l() {
        return this.f87431a;
    }

    public final String m() {
        return this.f87443n;
    }

    public final String n() {
        return this.f87442m;
    }

    public String toString() {
        return "GetOrderQueueDomainParam(symbol=" + this.f87431a + ", price=" + this.f87432b + ", firstExchangeOrderNumber=" + this.f87433c + ", lastExchangeOrderNumber=" + this.d + ", searchExchangeOrderNumber=" + this.f87434e + ", jumpExchangeOrderNumber=" + this.f87435f + ", actionType=" + this.f87436g + ", orderStatus=" + this.f87437h + ", boardType=" + this.f87438i + ", sortBy=" + this.f87439j + ", sortDirection=" + this.f87440k + ", limit=" + this.f87441l + ", timeStart=" + this.f87442m + ", timeEnd=" + this.f87443n + ")";
    }
}
