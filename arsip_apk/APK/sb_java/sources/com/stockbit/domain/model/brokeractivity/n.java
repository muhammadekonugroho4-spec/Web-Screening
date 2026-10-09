package com.stockbit.domain.model.brokeractivity;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f80908a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80909b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80910c;
    public final String d;

    public n(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "avgPrice");
        kotlin.jvm.internal.p.l(r3, "freq");
        kotlin.jvm.internal.p.l(r4, "lot");
        kotlin.jvm.internal.p.l(r5, "value");
        this.f80908a = r2;
        this.f80909b = r3;
        this.f80910c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f80908a;
    }

    public final String b() {
        return this.f80910c;
    }

    public final String c() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f80908a, r52.f80908a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80909b, r52.f80909b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80910c, r52.f80910c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f80908a.hashCode() * 31) + this.f80909b.hashCode()) * 31) + this.f80910c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailySellSummaryEntity(avgPrice=" + this.f80908a + ", freq=" + this.f80909b + ", lot=" + this.f80910c + ", value=" + this.d + ")";
    }
}
