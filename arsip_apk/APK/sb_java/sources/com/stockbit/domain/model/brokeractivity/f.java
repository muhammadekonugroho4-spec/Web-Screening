package com.stockbit.domain.model.brokeractivity;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f80888a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80889b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80890c;
    public final String d;

    public f(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "avgPrice");
        kotlin.jvm.internal.p.l(r3, "freq");
        kotlin.jvm.internal.p.l(r4, "lot");
        kotlin.jvm.internal.p.l(r5, "value");
        this.f80888a = r2;
        this.f80889b = r3;
        this.f80890c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f80888a;
    }

    public final String b() {
        return this.f80889b;
    }

    public final String c() {
        return this.f80890c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (kotlin.jvm.internal.p.g(this.f80888a, r52.f80888a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80889b, r52.f80889b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80890c, r52.f80890c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f80888a.hashCode() * 31) + this.f80889b.hashCode()) * 31) + this.f80890c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailyGroupNetSummaryEntity(avgPrice=" + this.f80888a + ", freq=" + this.f80889b + ", lot=" + this.f80890c + ", value=" + this.d + ")";
    }
}
