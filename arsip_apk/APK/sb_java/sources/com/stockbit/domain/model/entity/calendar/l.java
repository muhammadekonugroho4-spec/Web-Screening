package com.stockbit.domain.model.entity.calendar;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f82604a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82605b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82606c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82607e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82608f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82609g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82610h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82611i;

    public l(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        kotlin.jvm.internal.p.l(r2, "companySymbol");
        kotlin.jvm.internal.p.l(r3, "cumDate");
        kotlin.jvm.internal.p.l(r4, "exDate");
        kotlin.jvm.internal.p.l(r5, "recDate");
        kotlin.jvm.internal.p.l(r6, "tradingStart");
        kotlin.jvm.internal.p.l(r7, "tradingEnd");
        kotlin.jvm.internal.p.l(r8, "ratio");
        kotlin.jvm.internal.p.l(r9, "factor");
        kotlin.jvm.internal.p.l(r10, FirebaseAnalytics.Param.PRICE);
        this.f82604a = r2;
        this.f82605b = r3;
        this.f82606c = r4;
        this.d = r5;
        this.f82607e = r6;
        this.f82608f = r7;
        this.f82609g = r8;
        this.f82610h = r9;
        this.f82611i = r10;
    }

    public final String a() {
        return this.f82604a;
    }

    public final String b() {
        return this.f82605b;
    }

    public final String c() {
        return this.f82606c;
    }

    public final String d() {
        return this.f82610h;
    }

    public final String e() {
        return this.f82611i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f82604a, r52.f82604a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82605b, r52.f82605b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82606c, r52.f82606c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f82607e, r52.f82607e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f82608f, r52.f82608f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f82609g, r52.f82609g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f82610h, r52.f82610h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f82611i, r52.f82611i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f82609g;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.f82608f;
    }

    public int hashCode() {
        return (((((((((((((((this.f82604a.hashCode() * 31) + this.f82605b.hashCode()) * 31) + this.f82606c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82607e.hashCode()) * 31) + this.f82608f.hashCode()) * 31) + this.f82609g.hashCode()) * 31) + this.f82610h.hashCode()) * 31) + this.f82611i.hashCode();
    }

    public final String i() {
        return this.f82607e;
    }

    public String toString() {
        return "CalendarRightIssueData(companySymbol=" + this.f82604a + ", cumDate=" + this.f82605b + ", exDate=" + this.f82606c + ", recDate=" + this.d + ", tradingStart=" + this.f82607e + ", tradingEnd=" + this.f82608f + ", ratio=" + this.f82609g + ", factor=" + this.f82610h + ", price=" + this.f82611i + ')';
    }
}
