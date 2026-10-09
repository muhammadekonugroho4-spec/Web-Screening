package com.stockbit.domain.param.securities;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f87520a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87521b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87522c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87523e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87524f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87525g;

    /* renamed from: h, reason: collision with root package name */
    public final String f87526h;

    /* renamed from: i, reason: collision with root package name */
    public final String f87527i;

    /* renamed from: j, reason: collision with root package name */
    public final String f87528j;

    /* renamed from: k, reason: collision with root package name */
    public final String f87529k;

    public m(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12) {
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r3, "shares");
        kotlin.jvm.internal.p.l(r4, "gtc");
        kotlin.jvm.internal.p.l(r5, "uiref");
        kotlin.jvm.internal.p.l(r6, "symbol");
        kotlin.jvm.internal.p.l(r7, "boardtype");
        kotlin.jvm.internal.p.l(r8, "splitMethod");
        kotlin.jvm.internal.p.l(r9, "splitQty");
        kotlin.jvm.internal.p.l(r10, "splitRangeMin");
        kotlin.jvm.internal.p.l(r11, "splitRangeMax");
        kotlin.jvm.internal.p.l(r12, "platformOrderType");
        this.f87520a = r2;
        this.f87521b = r3;
        this.f87522c = r4;
        this.d = r5;
        this.f87523e = r6;
        this.f87524f = r7;
        this.f87525g = r8;
        this.f87526h = r9;
        this.f87527i = r10;
        this.f87528j = r11;
        this.f87529k = r12;
    }

    public final String a() {
        return this.f87524f;
    }

    public final String b() {
        return this.f87522c;
    }

    public final String c() {
        return this.f87529k;
    }

    public final String d() {
        return this.f87520a;
    }

    public final String e() {
        return this.f87521b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (kotlin.jvm.internal.p.g(this.f87520a, r52.f87520a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f87521b, r52.f87521b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f87522c, r52.f87522c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f87523e, r52.f87523e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f87524f, r52.f87524f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f87525g, r52.f87525g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f87526h, r52.f87526h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f87527i, r52.f87527i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f87528j, r52.f87528j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f87529k, r52.f87529k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f87525g;
    }

    public final String g() {
        return this.f87526h;
    }

    public final String h() {
        return this.f87528j;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f87520a.hashCode() * 31) + this.f87521b.hashCode()) * 31) + this.f87522c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f87523e.hashCode()) * 31) + this.f87524f.hashCode()) * 31) + this.f87525g.hashCode()) * 31) + this.f87526h.hashCode()) * 31) + this.f87527i.hashCode()) * 31) + this.f87528j.hashCode()) * 31) + this.f87529k.hashCode();
    }

    public final String i() {
        return this.f87527i;
    }

    public final String j() {
        return this.f87523e;
    }

    public final String k() {
        return this.d;
    }

    public String toString() {
        return "PostSellDomainParam(price=" + this.f87520a + ", shares=" + this.f87521b + ", gtc=" + this.f87522c + ", uiref=" + this.d + ", symbol=" + this.f87523e + ", boardtype=" + this.f87524f + ", splitMethod=" + this.f87525g + ", splitQty=" + this.f87526h + ", splitRangeMin=" + this.f87527i + ", splitRangeMax=" + this.f87528j + ", platformOrderType=" + this.f87529k + ")";
    }
}
