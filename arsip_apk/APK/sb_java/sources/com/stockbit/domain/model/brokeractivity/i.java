package com.stockbit.domain.model.brokeractivity;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f80896a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80897b;

    public i(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "value");
        kotlin.jvm.internal.p.l(r3, "volume");
        this.f80896a = r2;
        this.f80897b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (kotlin.jvm.internal.p.g(this.f80896a, r52.f80896a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80897b, r52.f80897b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80896a.hashCode() * 31) + this.f80897b.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailyNetSummaryEntity(value=" + this.f80896a + ", volume=" + this.f80897b + ")";
    }
}
