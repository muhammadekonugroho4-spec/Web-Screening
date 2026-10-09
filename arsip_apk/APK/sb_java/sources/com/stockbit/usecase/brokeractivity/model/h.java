package com.stockbit.usecase.brokeractivity.model;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f154813a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154814b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154815c;
    public final String d;

    public h(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "avgPrice");
        kotlin.jvm.internal.p.l(r3, "freq");
        kotlin.jvm.internal.p.l(r4, "lot");
        kotlin.jvm.internal.p.l(r5, "value");
        this.f154813a = r2;
        this.f154814b = r3;
        this.f154815c = r4;
        this.d = r5;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f154813a, r52.f154813a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f154814b, r52.f154814b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f154815c, r52.f154815c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f154813a.hashCode() * 31) + this.f154814b.hashCode()) * 31) + this.f154815c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailyGroupNetSummaryUIState(avgPrice=" + this.f154813a + ", freq=" + this.f154814b + ", lot=" + this.f154815c + ", value=" + this.d + ")";
    }
}
