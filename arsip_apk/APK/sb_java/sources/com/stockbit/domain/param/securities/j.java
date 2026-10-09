package com.stockbit.domain.param.securities;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f87508a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87509b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87510c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87511e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87512f;

    public j(String r2, String r3, String r4, String r5, String r6, String r7) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r4, "shares");
        kotlin.jvm.internal.p.l(r5, "multiplier");
        kotlin.jvm.internal.p.l(r6, "platformOrderType");
        kotlin.jvm.internal.p.l(r7, "uiRef");
        this.f87508a = r2;
        this.f87509b = r3;
        this.f87510c = r4;
        this.d = r5;
        this.f87511e = r6;
        this.f87512f = r7;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f87511e;
    }

    public final String c() {
        return this.f87509b;
    }

    public final String d() {
        return this.f87510c;
    }

    public final String e() {
        return this.f87508a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f87508a, r52.f87508a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f87509b, r52.f87509b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f87510c, r52.f87510c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f87511e, r52.f87511e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f87512f, r52.f87512f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f87512f;
    }

    public int hashCode() {
        return (((((((((this.f87508a.hashCode() * 31) + this.f87509b.hashCode()) * 31) + this.f87510c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f87511e.hashCode()) * 31) + this.f87512f.hashCode();
    }

    public String toString() {
        return "PostOrderDayTradeBuyDomainParam(symbol=" + this.f87508a + ", price=" + this.f87509b + ", shares=" + this.f87510c + ", multiplier=" + this.d + ", platformOrderType=" + this.f87511e + ", uiRef=" + this.f87512f + ")";
    }
}
