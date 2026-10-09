package com.stockbit.domain.model.securities.order.nego;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f85575a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85576b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85577c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85578e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f85579f;

    /* renamed from: g, reason: collision with root package name */
    public final f f85580g;

    public g(String r2, String r3, String r4, String r5, String r6, boolean r7, f r8) {
        p.l(r2, "counterPartyBrokerCode");
        p.l(r3, "settlementMethod");
        p.l(r4, "transactionDate");
        p.l(r5, "settlementDate");
        p.l(r6, "settlementSchedule");
        p.l(r8, "counterParty");
        this.f85575a = r2;
        this.f85576b = r3;
        this.f85577c = r4;
        this.d = r5;
        this.f85578e = r6;
        this.f85579f = r7;
        this.f85580g = r8;
    }

    public final f a() {
        return this.f85580g;
    }

    public final String b() {
        return this.f85575a;
    }

    public final boolean c() {
        return this.f85579f;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f85576b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f85575a, r52.f85575a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85576b, r52.f85576b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85577c, r52.f85577c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85578e, r52.f85578e) == true) goto L24;
        return false;
    L24:
        if (this.f85579f == r52.f85579f) goto L27;
        return false;
    L27:
        if (p.g(this.f85580g, r52.f85580g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f85578e;
    }

    public final String g() {
        return this.f85577c;
    }

    public int hashCode() {
        return (((((((((((this.f85575a.hashCode() * 31) + this.f85576b.hashCode()) * 31) + this.f85577c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85578e.hashCode()) * 31) + Boolean.hashCode(this.f85579f)) * 31) + this.f85580g.hashCode();
    }

    public String toString() {
        return "OrderNegoPreviewEntity(counterPartyBrokerCode=" + this.f85575a + ", settlementMethod=" + this.f85576b + ", transactionDate=" + this.f85577c + ", settlementDate=" + this.d + ", settlementSchedule=" + this.f85578e + ", requireVerification=" + this.f85579f + ", counterParty=" + this.f85580g + ")";
    }
}
