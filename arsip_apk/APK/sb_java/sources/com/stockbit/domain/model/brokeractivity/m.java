package com.stockbit.domain.model.brokeractivity;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f80906a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80907b;

    public m(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "amount");
        kotlin.jvm.internal.p.l(r3, "pct");
        this.f80906a = r2;
        this.f80907b = r3;
    }

    public final String a() {
        return this.f80907b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (kotlin.jvm.internal.p.g(this.f80906a, r52.f80906a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80907b, r52.f80907b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80906a.hashCode() * 31) + this.f80907b.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailyReturnSummaryEntity(amount=" + this.f80906a + ", pct=" + this.f80907b + ")";
    }
}
