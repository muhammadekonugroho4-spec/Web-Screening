package com.stockbit.domain.param.securities;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f87488a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87489b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f87490c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87491e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87492f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87493g;

    /* renamed from: h, reason: collision with root package name */
    public final String f87494h;

    /* renamed from: i, reason: collision with root package name */
    public final String f87495i;

    /* renamed from: j, reason: collision with root package name */
    public final String f87496j;

    /* renamed from: k, reason: collision with root package name */
    public final String f87497k;

    public h(String r2, String r3, boolean r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12) {
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r3, "shares");
        kotlin.jvm.internal.p.l(r5, "uiref");
        kotlin.jvm.internal.p.l(r6, "symbol");
        kotlin.jvm.internal.p.l(r7, "boardType");
        kotlin.jvm.internal.p.l(r8, "splitMethod");
        kotlin.jvm.internal.p.l(r9, "splitQty");
        kotlin.jvm.internal.p.l(r10, "splitRangeMin");
        kotlin.jvm.internal.p.l(r11, "splitRangeMax");
        kotlin.jvm.internal.p.l(r12, "platformOrderType");
        this.f87488a = r2;
        this.f87489b = r3;
        this.f87490c = r4;
        this.d = r5;
        this.f87491e = r6;
        this.f87492f = r7;
        this.f87493g = r8;
        this.f87494h = r9;
        this.f87495i = r10;
        this.f87496j = r11;
        this.f87497k = r12;
    }

    public final String a() {
        return this.f87492f;
    }

    public final String b() {
        return this.f87497k;
    }

    public final String c() {
        return this.f87488a;
    }

    public final String d() {
        return this.f87489b;
    }

    public final String e() {
        return this.f87493g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f87488a, r52.f87488a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f87489b, r52.f87489b) == true) goto L15;
        return false;
    L15:
        if (this.f87490c == r52.f87490c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f87491e, r52.f87491e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f87492f, r52.f87492f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f87493g, r52.f87493g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f87494h, r52.f87494h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f87495i, r52.f87495i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f87496j, r52.f87496j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f87497k, r52.f87497k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f87494h;
    }

    public final String g() {
        return this.f87496j;
    }

    public final String h() {
        return this.f87495i;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f87488a.hashCode() * 31) + this.f87489b.hashCode()) * 31) + Boolean.hashCode(this.f87490c)) * 31) + this.d.hashCode()) * 31) + this.f87491e.hashCode()) * 31) + this.f87492f.hashCode()) * 31) + this.f87493g.hashCode()) * 31) + this.f87494h.hashCode()) * 31) + this.f87495i.hashCode()) * 31) + this.f87496j.hashCode()) * 31) + this.f87497k.hashCode();
    }

    public final String i() {
        return this.f87491e;
    }

    public final String j() {
        return this.d;
    }

    public final boolean k() {
        return this.f87490c;
    }

    public String toString() {
        return "PostOrderBuyDomainParam(price=" + this.f87488a + ", shares=" + this.f87489b + ", isGtc=" + this.f87490c + ", uiref=" + this.d + ", symbol=" + this.f87491e + ", boardType=" + this.f87492f + ", splitMethod=" + this.f87493g + ", splitQty=" + this.f87494h + ", splitRangeMin=" + this.f87495i + ", splitRangeMax=" + this.f87496j + ", platformOrderType=" + this.f87497k + ")";
    }
}
