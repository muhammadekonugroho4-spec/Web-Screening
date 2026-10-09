package com.stockbit.domain.param.securities;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f87555a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87556b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87557c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87558e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87559f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87560g;

    /* renamed from: h, reason: collision with root package name */
    public final String f87561h;

    /* renamed from: i, reason: collision with root package name */
    public final String f87562i;

    /* renamed from: j, reason: collision with root package name */
    public final String f87563j;

    public o(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11) {
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r3, "shares");
        kotlin.jvm.internal.p.l(r4, "gtc");
        kotlin.jvm.internal.p.l(r5, "symbol");
        kotlin.jvm.internal.p.l(r6, "boardType");
        kotlin.jvm.internal.p.l(r7, "splitMethod");
        kotlin.jvm.internal.p.l(r8, "splitQty");
        kotlin.jvm.internal.p.l(r9, "splitRangeMin");
        kotlin.jvm.internal.p.l(r10, "splitRangeMax");
        kotlin.jvm.internal.p.l(r11, "platformOrderType");
        this.f87555a = r2;
        this.f87556b = r3;
        this.f87557c = r4;
        this.d = r5;
        this.f87558e = r6;
        this.f87559f = r7;
        this.f87560g = r8;
        this.f87561h = r9;
        this.f87562i = r10;
        this.f87563j = r11;
    }

    public final String a() {
        return this.f87558e;
    }

    public final String b() {
        return this.f87557c;
    }

    public final String c() {
        return this.f87563j;
    }

    public final String d() {
        return this.f87555a;
    }

    public final String e() {
        return this.f87556b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (kotlin.jvm.internal.p.g(this.f87555a, r52.f87555a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f87556b, r52.f87556b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f87557c, r52.f87557c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f87558e, r52.f87558e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f87559f, r52.f87559f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f87560g, r52.f87560g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f87561h, r52.f87561h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f87562i, r52.f87562i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f87563j, r52.f87563j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f87559f;
    }

    public final String g() {
        return this.f87560g;
    }

    public final String h() {
        return this.f87562i;
    }

    public int hashCode() {
        return (((((((((((((((((this.f87555a.hashCode() * 31) + this.f87556b.hashCode()) * 31) + this.f87557c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f87558e.hashCode()) * 31) + this.f87559f.hashCode()) * 31) + this.f87560g.hashCode()) * 31) + this.f87561h.hashCode()) * 31) + this.f87562i.hashCode()) * 31) + this.f87563j.hashCode();
    }

    public final String i() {
        return this.f87561h;
    }

    public final String j() {
        return this.d;
    }

    public String toString() {
        return "PostSellV2DomainParam(price=" + this.f87555a + ", shares=" + this.f87556b + ", gtc=" + this.f87557c + ", symbol=" + this.d + ", boardType=" + this.f87558e + ", splitMethod=" + this.f87559f + ", splitQty=" + this.f87560g + ", splitRangeMin=" + this.f87561h + ", splitRangeMax=" + this.f87562i + ", platformOrderType=" + this.f87563j + ")";
    }
}
