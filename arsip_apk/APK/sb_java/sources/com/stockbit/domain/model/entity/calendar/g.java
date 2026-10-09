package com.stockbit.domain.model.entity.calendar;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f82588a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82589b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82590c;
    public final h d;

    public g(String r2, String r3, String r4, h r5) {
        kotlin.jvm.internal.p.l(r2, "companyName");
        kotlin.jvm.internal.p.l(r3, "companySymbol");
        kotlin.jvm.internal.p.l(r4, "listingDate");
        kotlin.jvm.internal.p.l(r5, "detail");
        this.f82588a = r2;
        this.f82589b = r3;
        this.f82590c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f82588a;
    }

    public final String b() {
        return this.f82589b;
    }

    public final h c() {
        return this.d;
    }

    public final String d() {
        return this.f82590c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (kotlin.jvm.internal.p.g(this.f82588a, r52.f82588a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82589b, r52.f82589b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82590c, r52.f82590c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f82588a.hashCode() * 31) + this.f82589b.hashCode()) * 31) + this.f82590c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CalendarIpo(companyName=" + this.f82588a + ", companySymbol=" + this.f82589b + ", listingDate=" + this.f82590c + ", detail=" + this.d + ')';
    }
}
