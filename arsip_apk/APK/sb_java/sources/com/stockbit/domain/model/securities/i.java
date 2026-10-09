package com.stockbit.domain.model.securities;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f85324a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85325b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85326c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85327e;

    public i(String r2, String r3, String r4, String r5, String r6) {
        kotlin.jvm.internal.p.l(r2, "disbursedAmount");
        kotlin.jvm.internal.p.l(r3, "referenceId");
        kotlin.jvm.internal.p.l(r4, "productName");
        kotlin.jvm.internal.p.l(r5, "stampDuty");
        kotlin.jvm.internal.p.l(r6, "accruedInterest");
        this.f85324a = r2;
        this.f85325b = r3;
        this.f85326c = r4;
        this.d = r5;
        this.f85327e = r6;
    }

    public final String a() {
        return this.f85327e;
    }

    public final String b() {
        return this.f85324a;
    }

    public final String c() {
        return this.f85326c;
    }

    public final String d() {
        return this.f85325b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (kotlin.jvm.internal.p.g(this.f85324a, r52.f85324a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f85325b, r52.f85325b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f85326c, r52.f85326c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f85327e, r52.f85327e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f85324a.hashCode() * 31) + this.f85325b.hashCode()) * 31) + this.f85326c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85327e.hashCode();
    }

    public String toString() {
        return "HistorySBNEntity(disbursedAmount=" + this.f85324a + ", referenceId=" + this.f85325b + ", productName=" + this.f85326c + ", stampDuty=" + this.d + ", accruedInterest=" + this.f85327e + ")";
    }
}
