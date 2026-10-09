package com.stockbit.domain.model.brokeractivity;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f80911a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80912b;

    public o(String r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "amount");
        this.f80911a = r2;
        this.f80912b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (kotlin.jvm.internal.p.g(this.f80911a, r52.f80911a) == true) goto L12;
        return false;
    L12:
        if (this.f80912b == r52.f80912b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80911a.hashCode() * 31) + Integer.hashCode(this.f80912b);
    }

    public String toString() {
        return "BrokerActivityDailyTotalBuyLotEntity(amount=" + this.f80911a + ", pct=" + this.f80912b + ")";
    }
}
