package com.stockbit.domain.model.entity.calendar;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f82597a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82598b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82599c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82600e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82601f;

    public j(String r2, String r3, String r4, String r5, String r6, String r7) {
        kotlin.jvm.internal.p.l(r2, "companySymbol");
        kotlin.jvm.internal.p.l(r3, "cumDate");
        kotlin.jvm.internal.p.l(r4, "exDate");
        kotlin.jvm.internal.p.l(r5, "recDate");
        kotlin.jvm.internal.p.l(r6, "ratio");
        kotlin.jvm.internal.p.l(r7, "factor");
        this.f82597a = r2;
        this.f82598b = r3;
        this.f82599c = r4;
        this.d = r5;
        this.f82600e = r6;
        this.f82601f = r7;
    }

    public final String a() {
        return this.f82597a;
    }

    public final String b() {
        return this.f82598b;
    }

    public final String c() {
        return this.f82599c;
    }

    public final String d() {
        return this.f82601f;
    }

    public final String e() {
        return this.f82600e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f82597a, r52.f82597a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82598b, r52.f82598b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82599c, r52.f82599c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f82600e, r52.f82600e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f82601f, r52.f82601f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((this.f82597a.hashCode() * 31) + this.f82598b.hashCode()) * 31) + this.f82599c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82600e.hashCode()) * 31) + this.f82601f.hashCode();
    }

    public String toString() {
        return "CalendarReverseSplit(companySymbol=" + this.f82597a + ", cumDate=" + this.f82598b + ", exDate=" + this.f82599c + ", recDate=" + this.d + ", ratio=" + this.f82600e + ", factor=" + this.f82601f + ')';
    }
}
