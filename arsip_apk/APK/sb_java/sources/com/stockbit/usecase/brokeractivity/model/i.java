package com.stockbit.usecase.brokeractivity.model;

/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f154816a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154817b;

    /* renamed from: c, reason: collision with root package name */
    public final h f154818c;

    public i(String r2, String r3, h r4) {
        kotlin.jvm.internal.p.l(r2, "dateFrom");
        kotlin.jvm.internal.p.l(r3, "dateTo");
        kotlin.jvm.internal.p.l(r4, "netSummary");
        this.f154816a = r2;
        this.f154817b = r3;
        this.f154818c = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (kotlin.jvm.internal.p.g(this.f154816a, r52.f154816a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f154817b, r52.f154817b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f154818c, r52.f154818c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f154816a.hashCode() * 31) + this.f154817b.hashCode()) * 31) + this.f154818c.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailyGroupSummaryItemUIState(dateFrom=" + this.f154816a + ", dateTo=" + this.f154817b + ", netSummary=" + this.f154818c + ")";
    }
}
