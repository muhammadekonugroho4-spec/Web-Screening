package com.stockbit.domain.param.securities;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f87517a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87518b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87519c;
    public final String d;

    public l(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r3, "shares");
        kotlin.jvm.internal.p.l(r4, "symbol");
        kotlin.jvm.internal.p.l(r5, "platformOrderType");
        this.f87517a = r2;
        this.f87518b = r3;
        this.f87519c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f87517a;
    }

    public final String c() {
        return this.f87518b;
    }

    public final String d() {
        return this.f87519c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f87517a, r52.f87517a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f87518b, r52.f87518b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f87519c, r52.f87519c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f87517a.hashCode() * 31) + this.f87518b.hashCode()) * 31) + this.f87519c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "PostOrderDayTradeSellV2DomainParam(price=" + this.f87517a + ", shares=" + this.f87518b + ", symbol=" + this.f87519c + ", platformOrderType=" + this.d + ")";
    }
}
