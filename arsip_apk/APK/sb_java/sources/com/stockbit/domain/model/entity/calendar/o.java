package com.stockbit.domain.model.entity.calendar;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f82620a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82621b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82622c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82623e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82624f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82625g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82626h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82627i;

    /* renamed from: j, reason: collision with root package name */
    public final String f82628j;

    /* renamed from: k, reason: collision with root package name */
    public final String f82629k;

    public o(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12) {
        kotlin.jvm.internal.p.l(r2, "companySymbol");
        kotlin.jvm.internal.p.l(r3, "cumDate");
        kotlin.jvm.internal.p.l(r4, "exDate");
        kotlin.jvm.internal.p.l(r5, "recDate");
        kotlin.jvm.internal.p.l(r6, "ratio");
        kotlin.jvm.internal.p.l(r7, "factor");
        kotlin.jvm.internal.p.l(r8, "lock");
        kotlin.jvm.internal.p.l(r9, "created");
        kotlin.jvm.internal.p.l(r10, "newShare");
        kotlin.jvm.internal.p.l(r11, "newPrice");
        kotlin.jvm.internal.p.l(r12, "lastUpdate");
        this.f82620a = r2;
        this.f82621b = r3;
        this.f82622c = r4;
        this.d = r5;
        this.f82623e = r6;
        this.f82624f = r7;
        this.f82625g = r8;
        this.f82626h = r9;
        this.f82627i = r10;
        this.f82628j = r11;
        this.f82629k = r12;
    }

    public final String a() {
        return this.f82620a;
    }

    public final String b() {
        return this.f82621b;
    }

    public final String c() {
        return this.f82622c;
    }

    public final String d() {
        return this.f82624f;
    }

    public final String e() {
        return this.f82623e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (kotlin.jvm.internal.p.g(this.f82620a, r52.f82620a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82621b, r52.f82621b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82622c, r52.f82622c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f82623e, r52.f82623e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f82624f, r52.f82624f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f82625g, r52.f82625g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f82626h, r52.f82626h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f82627i, r52.f82627i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f82628j, r52.f82628j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f82629k, r52.f82629k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f82620a.hashCode() * 31) + this.f82621b.hashCode()) * 31) + this.f82622c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82623e.hashCode()) * 31) + this.f82624f.hashCode()) * 31) + this.f82625g.hashCode()) * 31) + this.f82626h.hashCode()) * 31) + this.f82627i.hashCode()) * 31) + this.f82628j.hashCode()) * 31) + this.f82629k.hashCode();
    }

    public String toString() {
        return "CalendarStockSplit(companySymbol=" + this.f82620a + ", cumDate=" + this.f82621b + ", exDate=" + this.f82622c + ", recDate=" + this.d + ", ratio=" + this.f82623e + ", factor=" + this.f82624f + ", lock=" + this.f82625g + ", created=" + this.f82626h + ", newShare=" + this.f82627i + ", newPrice=" + this.f82628j + ", lastUpdate=" + this.f82629k + ')';
    }
}
