package com.stockbit.domain.model.brokeractivity;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f80885a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80886b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80887c;

    public e(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "foreignBuy");
        kotlin.jvm.internal.p.l(r3, "foreignSell");
        kotlin.jvm.internal.p.l(r4, "netForeign");
        this.f80885a = r2;
        this.f80886b = r3;
        this.f80887c = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (kotlin.jvm.internal.p.g(this.f80885a, r52.f80885a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80886b, r52.f80886b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80887c, r52.f80887c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f80885a.hashCode() * 31) + this.f80886b.hashCode()) * 31) + this.f80887c.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailyForeignSummaryEntity(foreignBuy=" + this.f80885a + ", foreignSell=" + this.f80886b + ", netForeign=" + this.f80887c + ")";
    }
}
