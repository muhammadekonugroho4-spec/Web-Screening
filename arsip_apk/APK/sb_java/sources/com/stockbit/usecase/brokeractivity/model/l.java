package com.stockbit.usecase.brokeractivity.model;

import java.util.List;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final List f154834a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154835b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154836c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f154837e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f154838f;

    public l(List r2, String r3, String r4, String r5, boolean r6, boolean r7) {
        kotlin.jvm.internal.p.l(r2, "brokerItems");
        kotlin.jvm.internal.p.l(r3, "dateFrom");
        kotlin.jvm.internal.p.l(r4, "dateTo");
        kotlin.jvm.internal.p.l(r5, "dateRange");
        this.f154834a = r2;
        this.f154835b = r3;
        this.f154836c = r4;
        this.d = r5;
        this.f154837e = r6;
        this.f154838f = r7;
    }

    public final List a() {
        return this.f154834a;
    }

    public final String b() {
        return this.f154835b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f154836c;
    }

    public final boolean e() {
        return this.f154837e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f154834a, r52.f154834a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f154835b, r52.f154835b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f154836c, r52.f154836c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f154837e == r52.f154837e) goto L24;
        return false;
    L24:
        if (this.f154838f == r52.f154838f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f154834a.hashCode() * 31) + this.f154835b.hashCode()) * 31) + this.f154836c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f154837e)) * 31) + Boolean.hashCode(this.f154838f);
    }

    public String toString() {
        return "BrokerActivityDetailUIState(brokerItems=" + this.f154834a + ", dateFrom=" + this.f154835b + ", dateTo=" + this.f154836c + ", dateRange=" + this.d + ", isCanPaginate=" + this.f154837e + ", isEmpty=" + this.f154838f + ")";
    }
}
