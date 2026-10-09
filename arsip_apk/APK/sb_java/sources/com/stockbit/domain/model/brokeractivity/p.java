package com.stockbit.domain.model.brokeractivity;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f80913a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80914b;

    public p(String r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "amount");
        this.f80913a = r2;
        this.f80914b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (kotlin.jvm.internal.p.g(this.f80913a, r52.f80913a) == true) goto L12;
        return false;
    L12:
        if (this.f80914b == r52.f80914b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80913a.hashCode() * 31) + Integer.hashCode(this.f80914b);
    }

    public String toString() {
        return "BrokerActivityDailyTotalSellLotEntity(amount=" + this.f80913a + ", pct=" + this.f80914b + ")";
    }
}
