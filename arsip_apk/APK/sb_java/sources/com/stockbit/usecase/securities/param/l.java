package com.stockbit.usecase.securities.param;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.usecase.securities.model.order.PortfolioType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f162007a;

    /* renamed from: b, reason: collision with root package name */
    public final String f162008b;

    /* renamed from: c, reason: collision with root package name */
    public final String f162009c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f162010e;

    /* renamed from: f, reason: collision with root package name */
    public final String f162011f;

    /* renamed from: g, reason: collision with root package name */
    public final String f162012g;

    /* renamed from: h, reason: collision with root package name */
    public final String f162013h;

    /* renamed from: i, reason: collision with root package name */
    public final String f162014i;

    /* renamed from: j, reason: collision with root package name */
    public final String f162015j;

    /* renamed from: k, reason: collision with root package name */
    public final PortfolioType f162016k;

    /* renamed from: l, reason: collision with root package name */
    public final String f162017l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f162018m;

    /* renamed from: n, reason: collision with root package name */
    public final String f162019n;

    public l(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, PortfolioType r12, String r13, boolean r14, String r15) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        p.l(r3, "shares");
        p.l(r4, "gtc");
        p.l(r5, "uiref");
        p.l(r6, "symbol");
        p.l(r7, "boardtype");
        p.l(r8, "splitMethod");
        p.l(r9, "splitQty");
        p.l(r10, "splitRangeMin");
        p.l(r11, "splitRangeMax");
        p.l(r12, "portfolioType");
        p.l(r13, "companyType");
        p.l(r15, "platformOrderType");
        this.f162007a = r2;
        this.f162008b = r3;
        this.f162009c = r4;
        this.d = r5;
        this.f162010e = r6;
        this.f162011f = r7;
        this.f162012g = r8;
        this.f162013h = r9;
        this.f162014i = r10;
        this.f162015j = r11;
        this.f162016k = r12;
        this.f162017l = r13;
        this.f162018m = r14;
        this.f162019n = r15;
    }

    public final String a() {
        return this.f162011f;
    }

    public final String b() {
        return this.f162009c;
    }

    public final String c() {
        return this.f162019n;
    }

    public final PortfolioType d() {
        return this.f162016k;
    }

    public final String e() {
        return this.f162007a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (p.g(this.f162007a, r52.f162007a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f162008b, r52.f162008b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f162009c, r52.f162009c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f162010e, r52.f162010e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f162011f, r52.f162011f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f162012g, r52.f162012g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f162013h, r52.f162013h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f162014i, r52.f162014i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f162015j, r52.f162015j) == true) goto L39;
        return false;
    L39:
        if (this.f162016k == r52.f162016k) goto L42;
        return false;
    L42:
        if (p.g(this.f162017l, r52.f162017l) == true) goto L45;
        return false;
    L45:
        if (this.f162018m == r52.f162018m) goto L48;
        return false;
    L48:
        if (p.g(this.f162019n, r52.f162019n) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final String f() {
        return this.f162008b;
    }

    public final String g() {
        return this.f162012g;
    }

    public final String h() {
        return this.f162013h;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f162007a.hashCode() * 31) + this.f162008b.hashCode()) * 31) + this.f162009c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f162010e.hashCode()) * 31) + this.f162011f.hashCode()) * 31) + this.f162012g.hashCode()) * 31) + this.f162013h.hashCode()) * 31) + this.f162014i.hashCode()) * 31) + this.f162015j.hashCode()) * 31) + this.f162016k.hashCode()) * 31) + this.f162017l.hashCode()) * 31) + Boolean.hashCode(this.f162018m)) * 31) + this.f162019n.hashCode();
    }

    public final String i() {
        return this.f162015j;
    }

    public final String j() {
        return this.f162014i;
    }

    public final String k() {
        return this.f162010e;
    }

    public final String l() {
        return this.d;
    }

    public String toString() {
        return "PostSellUIParam(price=" + this.f162007a + ", shares=" + this.f162008b + ", gtc=" + this.f162009c + ", uiref=" + this.d + ", symbol=" + this.f162010e + ", boardtype=" + this.f162011f + ", splitMethod=" + this.f162012g + ", splitQty=" + this.f162013h + ", splitRangeMin=" + this.f162014i + ", splitRangeMax=" + this.f162015j + ", portfolioType=" + this.f162016k + ", companyType=" + this.f162017l + ", otherLotAvailable=" + this.f162018m + ", platformOrderType=" + this.f162019n + ")";
    }
}
