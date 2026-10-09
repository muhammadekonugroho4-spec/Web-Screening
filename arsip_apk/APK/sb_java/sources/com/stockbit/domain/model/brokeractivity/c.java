package com.stockbit.domain.model.brokeractivity;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f80875a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80876b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80877c;
    public final String d;

    public c(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "avgPrice");
        kotlin.jvm.internal.p.l(r3, "freq");
        kotlin.jvm.internal.p.l(r4, "lot");
        kotlin.jvm.internal.p.l(r5, "value");
        this.f80875a = r2;
        this.f80876b = r3;
        this.f80877c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f80875a;
    }

    public final String b() {
        return this.f80877c;
    }

    public final String c() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (kotlin.jvm.internal.p.g(this.f80875a, r52.f80875a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80876b, r52.f80876b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80877c, r52.f80877c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f80875a.hashCode() * 31) + this.f80876b.hashCode()) * 31) + this.f80877c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailyBuySummaryEntity(avgPrice=" + this.f80875a + ", freq=" + this.f80876b + ", lot=" + this.f80877c + ", value=" + this.d + ")";
    }
}
