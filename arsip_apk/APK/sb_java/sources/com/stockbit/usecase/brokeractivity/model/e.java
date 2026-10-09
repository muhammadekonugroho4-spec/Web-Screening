package com.stockbit.usecase.brokeractivity.model;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f154798a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154799b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154800c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f154801e;

    public e(String r2, String r3, String r4, String r5, String r6) {
        kotlin.jvm.internal.p.l(r2, "dateFrom");
        kotlin.jvm.internal.p.l(r3, "dateTo");
        kotlin.jvm.internal.p.l(r4, "netValue");
        kotlin.jvm.internal.p.l(r5, "netLot");
        kotlin.jvm.internal.p.l(r6, "avgPrice");
        this.f154798a = r2;
        this.f154799b = r3;
        this.f154800c = r4;
        this.d = r5;
        this.f154801e = r6;
    }

    public final String a() {
        return this.f154801e;
    }

    public final String b() {
        return this.f154798a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f154800c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (kotlin.jvm.internal.p.g(this.f154798a, r52.f154798a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f154799b, r52.f154799b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f154800c, r52.f154800c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f154801e, r52.f154801e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f154798a.hashCode() * 31) + this.f154799b.hashCode()) * 31) + this.f154800c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f154801e.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailyCalendarSummaryUIState(dateFrom=" + this.f154798a + ", dateTo=" + this.f154799b + ", netValue=" + this.f154800c + ", netLot=" + this.d + ", avgPrice=" + this.f154801e + ")";
    }

    public /* synthetic */ e(String r2, String r3, String r4, String r5, String r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "-";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "-";
    L15:
        if ((r7 & 16) == 0) goto L18;
        String r72 = "-";
    L17:
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
