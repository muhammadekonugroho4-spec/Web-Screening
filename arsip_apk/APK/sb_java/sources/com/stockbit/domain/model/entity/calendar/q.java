package com.stockbit.domain.model.entity.calendar;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f82636a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82637b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82638c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82639e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82640f;

    public q(String r2, String r3, String r4, String r5, String r6, String r7) {
        kotlin.jvm.internal.p.l(r2, "companySymbol");
        kotlin.jvm.internal.p.l(r3, "excPrice");
        kotlin.jvm.internal.p.l(r4, "tradingFrom");
        kotlin.jvm.internal.p.l(r5, "tradingEnd");
        kotlin.jvm.internal.p.l(r6, "excFrom");
        kotlin.jvm.internal.p.l(r7, "excEnd");
        this.f82636a = r2;
        this.f82637b = r3;
        this.f82638c = r4;
        this.d = r5;
        this.f82639e = r6;
        this.f82640f = r7;
    }

    public final String a() {
        return this.f82636a;
    }

    public final String b() {
        return this.f82640f;
    }

    public final String c() {
        return this.f82639e;
    }

    public final String d() {
        return this.f82637b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (kotlin.jvm.internal.p.g(this.f82636a, r52.f82636a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82637b, r52.f82637b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82638c, r52.f82638c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f82639e, r52.f82639e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f82640f, r52.f82640f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f82638c;
    }

    public int hashCode() {
        return (((((((((this.f82636a.hashCode() * 31) + this.f82637b.hashCode()) * 31) + this.f82638c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82639e.hashCode()) * 31) + this.f82640f.hashCode();
    }

    public String toString() {
        return "CalendarWarrant(companySymbol=" + this.f82636a + ", excPrice=" + this.f82637b + ", tradingFrom=" + this.f82638c + ", tradingEnd=" + this.d + ", excFrom=" + this.f82639e + ", excEnd=" + this.f82640f + ')';
    }
}
