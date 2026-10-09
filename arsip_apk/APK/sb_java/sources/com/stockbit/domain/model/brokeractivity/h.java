package com.stockbit.domain.model.brokeractivity;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f80893a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80894b;

    /* renamed from: c, reason: collision with root package name */
    public final f f80895c;

    public h(String r2, String r3, f r4) {
        kotlin.jvm.internal.p.l(r2, "dateFrom");
        kotlin.jvm.internal.p.l(r3, "dateTo");
        kotlin.jvm.internal.p.l(r4, "netSummary");
        this.f80893a = r2;
        this.f80894b = r3;
        this.f80895c = r4;
    }

    public final String a() {
        return this.f80893a;
    }

    public final String b() {
        return this.f80894b;
    }

    public final f c() {
        return this.f80895c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f80893a, r52.f80893a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80894b, r52.f80894b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80895c, r52.f80895c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f80893a.hashCode() * 31) + this.f80894b.hashCode()) * 31) + this.f80895c.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailyGroupSummaryItemEntity(dateFrom=" + this.f80893a + ", dateTo=" + this.f80894b + ", netSummary=" + this.f80895c + ")";
    }
}
