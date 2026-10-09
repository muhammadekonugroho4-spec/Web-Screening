package com.stockbit.domain.model.entity.calendar;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f82630a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82631b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82632c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82633e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82634f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82635g;

    public p(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r3, "shares");
        kotlin.jvm.internal.p.l(r4, "percentage");
        kotlin.jvm.internal.p.l(r5, "start");
        kotlin.jvm.internal.p.l(r6, "end");
        kotlin.jvm.internal.p.l(r7, "payDate");
        kotlin.jvm.internal.p.l(r8, "companySymbol");
        this.f82630a = r2;
        this.f82631b = r3;
        this.f82632c = r4;
        this.d = r5;
        this.f82633e = r6;
        this.f82634f = r7;
        this.f82635g = r8;
    }

    public final String a() {
        return this.f82635g;
    }

    public final String b() {
        return this.f82633e;
    }

    public final String c() {
        return this.f82634f;
    }

    public final String d() {
        return this.f82632c;
    }

    public final String e() {
        return this.f82630a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (kotlin.jvm.internal.p.g(this.f82630a, r52.f82630a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82631b, r52.f82631b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82632c, r52.f82632c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f82633e, r52.f82633e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f82634f, r52.f82634f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f82635g, r52.f82635g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f82631b;
    }

    public final String g() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((this.f82630a.hashCode() * 31) + this.f82631b.hashCode()) * 31) + this.f82632c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82633e.hashCode()) * 31) + this.f82634f.hashCode()) * 31) + this.f82635g.hashCode();
    }

    public String toString() {
        return "CalendarTenderOffer(price=" + this.f82630a + ", shares=" + this.f82631b + ", percentage=" + this.f82632c + ", start=" + this.d + ", end=" + this.f82633e + ", payDate=" + this.f82634f + ", companySymbol=" + this.f82635g + ')';
    }
}
