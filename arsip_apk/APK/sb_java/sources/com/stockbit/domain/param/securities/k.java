package com.stockbit.domain.param.securities;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f87513a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87514b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87515c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87516e;

    public k(String r2, String r3, String r4, String r5, String r6) {
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r3, "shares");
        kotlin.jvm.internal.p.l(r4, "uiref");
        kotlin.jvm.internal.p.l(r5, "symbol");
        kotlin.jvm.internal.p.l(r6, "platformOrderType");
        this.f87513a = r2;
        this.f87514b = r3;
        this.f87515c = r4;
        this.d = r5;
        this.f87516e = r6;
    }

    public final String a() {
        return this.f87516e;
    }

    public final String b() {
        return this.f87513a;
    }

    public final String c() {
        return this.f87514b;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f87515c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f87513a, r52.f87513a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f87514b, r52.f87514b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f87515c, r52.f87515c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f87516e, r52.f87516e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f87513a.hashCode() * 31) + this.f87514b.hashCode()) * 31) + this.f87515c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f87516e.hashCode();
    }

    public String toString() {
        return "PostOrderDayTradeSellDomainParam(price=" + this.f87513a + ", shares=" + this.f87514b + ", uiref=" + this.f87515c + ", symbol=" + this.d + ", platformOrderType=" + this.f87516e + ")";
    }
}
