package com.stockbit.domain.model.entity.securities;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f83476a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83477b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83478c;

    public a(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r3, "shares");
        kotlin.jvm.internal.p.l(r4, "orderId");
        this.f83476a = r2;
        this.f83477b = r3;
        this.f83478c = r4;
    }

    public final String a() {
        return this.f83478c;
    }

    public final String b() {
        return this.f83476a;
    }

    public final String c() {
        return this.f83477b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (kotlin.jvm.internal.p.g(this.f83476a, r52.f83476a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83477b, r52.f83477b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83478c, r52.f83478c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f83476a.hashCode() * 31) + this.f83477b.hashCode()) * 31) + this.f83478c.hashCode();
    }

    public String toString() {
        return "AmendOrderBulkItem(price=" + this.f83476a + ", shares=" + this.f83477b + ", orderId=" + this.f83478c + ')';
    }
}
