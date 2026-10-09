package com.stockbit.usecase.securities.param;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.usecase.securities.model.order.PortfolioType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f161973a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161974b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161975c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f161976e;

    /* renamed from: f, reason: collision with root package name */
    public final String f161977f;

    /* renamed from: g, reason: collision with root package name */
    public final String f161978g;

    /* renamed from: h, reason: collision with root package name */
    public final String f161979h;

    /* renamed from: i, reason: collision with root package name */
    public final String f161980i;

    /* renamed from: j, reason: collision with root package name */
    public final String f161981j;

    /* renamed from: k, reason: collision with root package name */
    public final PortfolioType f161982k;

    /* renamed from: l, reason: collision with root package name */
    public final String f161983l;

    /* renamed from: m, reason: collision with root package name */
    public final String f161984m;

    /* renamed from: n, reason: collision with root package name */
    public final String f161985n;

    public i(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, PortfolioType r12, String r13, String r14, String r15) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        p.l(r3, "shares");
        p.l(r4, "gtc");
        p.l(r5, "uiref");
        p.l(r6, "symbol");
        p.l(r7, "boardType");
        p.l(r8, "splitQty");
        p.l(r9, "splitMethod");
        p.l(r10, "splitRangeMin");
        p.l(r11, "splitRangeMax");
        p.l(r12, "portfolioType");
        p.l(r13, "companyType");
        p.l(r14, "multiplier");
        p.l(r15, "platformType");
        this.f161973a = r2;
        this.f161974b = r3;
        this.f161975c = r4;
        this.d = r5;
        this.f161976e = r6;
        this.f161977f = r7;
        this.f161978g = r8;
        this.f161979h = r9;
        this.f161980i = r10;
        this.f161981j = r11;
        this.f161982k = r12;
        this.f161983l = r13;
        this.f161984m = r14;
        this.f161985n = r15;
    }

    public final String a() {
        return this.f161977f;
    }

    public final String b() {
        return this.f161983l;
    }

    public final String c() {
        return this.f161975c;
    }

    public final String d() {
        return this.f161984m;
    }

    public final String e() {
        return this.f161985n;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f161973a, r52.f161973a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f161974b, r52.f161974b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f161975c, r52.f161975c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f161976e, r52.f161976e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f161977f, r52.f161977f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f161978g, r52.f161978g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f161979h, r52.f161979h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f161980i, r52.f161980i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f161981j, r52.f161981j) == true) goto L39;
        return false;
    L39:
        if (this.f161982k == r52.f161982k) goto L42;
        return false;
    L42:
        if (p.g(this.f161983l, r52.f161983l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f161984m, r52.f161984m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f161985n, r52.f161985n) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final PortfolioType f() {
        return this.f161982k;
    }

    public final String g() {
        return this.f161973a;
    }

    public final String h() {
        return this.f161974b;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f161973a.hashCode() * 31) + this.f161974b.hashCode()) * 31) + this.f161975c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f161976e.hashCode()) * 31) + this.f161977f.hashCode()) * 31) + this.f161978g.hashCode()) * 31) + this.f161979h.hashCode()) * 31) + this.f161980i.hashCode()) * 31) + this.f161981j.hashCode()) * 31) + this.f161982k.hashCode()) * 31) + this.f161983l.hashCode()) * 31) + this.f161984m.hashCode()) * 31) + this.f161985n.hashCode();
    }

    public final String i() {
        return this.f161979h;
    }

    public final String j() {
        return this.f161978g;
    }

    public final String k() {
        return this.f161981j;
    }

    public final String l() {
        return this.f161980i;
    }

    public final String m() {
        return this.f161976e;
    }

    public final String n() {
        return this.d;
    }

    public String toString() {
        return "PostOrderBuyUIParam(price=" + this.f161973a + ", shares=" + this.f161974b + ", gtc=" + this.f161975c + ", uiref=" + this.d + ", symbol=" + this.f161976e + ", boardType=" + this.f161977f + ", splitQty=" + this.f161978g + ", splitMethod=" + this.f161979h + ", splitRangeMin=" + this.f161980i + ", splitRangeMax=" + this.f161981j + ", portfolioType=" + this.f161982k + ", companyType=" + this.f161983l + ", multiplier=" + this.f161984m + ", platformType=" + this.f161985n + ")";
    }
}
