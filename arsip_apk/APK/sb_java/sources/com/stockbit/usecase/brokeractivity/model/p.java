package com.stockbit.usecase.brokeractivity.model;

/* loaded from: classes11.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f154859a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154860b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154861c;
    public final String d;

    public p(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "stockCode");
        kotlin.jvm.internal.p.l(r3, "value");
        kotlin.jvm.internal.p.l(r4, "lot");
        kotlin.jvm.internal.p.l(r5, "avgPrice");
        this.f154859a = r2;
        this.f154860b = r3;
        this.f154861c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f154861c;
    }

    public final String c() {
        return this.f154859a;
    }

    public final String d() {
        return this.f154860b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (kotlin.jvm.internal.p.g(this.f154859a, r52.f154859a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f154860b, r52.f154860b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f154861c, r52.f154861c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f154859a.hashCode() * 31) + this.f154860b.hashCode()) * 31) + this.f154861c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BrokerActivityListItemValueUIState(stockCode=" + this.f154859a + ", value=" + this.f154860b + ", lot=" + this.f154861c + ", avgPrice=" + this.d + ")";
    }
}
