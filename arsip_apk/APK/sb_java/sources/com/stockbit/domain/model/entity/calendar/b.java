package com.stockbit.domain.model.entity.calendar;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f82567a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82568b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82569c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82570e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82571f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82572g;

    public b(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        kotlin.jvm.internal.p.l(r2, "companySymbol");
        kotlin.jvm.internal.p.l(r3, "cumDate");
        kotlin.jvm.internal.p.l(r4, "exDate");
        kotlin.jvm.internal.p.l(r5, "recDate");
        kotlin.jvm.internal.p.l(r6, "paymentDate");
        kotlin.jvm.internal.p.l(r7, "ratio");
        kotlin.jvm.internal.p.l(r8, "factor");
        this.f82567a = r2;
        this.f82568b = r3;
        this.f82569c = r4;
        this.d = r5;
        this.f82570e = r6;
        this.f82571f = r7;
        this.f82572g = r8;
    }

    public final String a() {
        return this.f82567a;
    }

    public final String b() {
        return this.f82568b;
    }

    public final String c() {
        return this.f82569c;
    }

    public final String d() {
        return this.f82572g;
    }

    public final String e() {
        return this.f82570e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (kotlin.jvm.internal.p.g(this.f82567a, r52.f82567a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82568b, r52.f82568b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82569c, r52.f82569c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f82570e, r52.f82570e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f82571f, r52.f82571f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f82572g, r52.f82572g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f82571f;
    }

    public final String g() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((this.f82567a.hashCode() * 31) + this.f82568b.hashCode()) * 31) + this.f82569c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82570e.hashCode()) * 31) + this.f82571f.hashCode()) * 31) + this.f82572g.hashCode();
    }

    public String toString() {
        return "CalendarBonusShareData(companySymbol=" + this.f82567a + ", cumDate=" + this.f82568b + ", exDate=" + this.f82569c + ", recDate=" + this.d + ", paymentDate=" + this.f82570e + ", ratio=" + this.f82571f + ", factor=" + this.f82572g + ')';
    }
}
