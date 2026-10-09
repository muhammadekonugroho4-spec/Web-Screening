package com.stockbit.domain.model.company.runningtrade;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f81878a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81879b;

    public d(String r2, String r3) {
        p.l(r2, "brokerCode");
        p.l(r3, "brokerType");
        this.f81878a = r2;
        this.f81879b = r3;
    }

    public final String a() {
        return this.f81878a;
    }

    public final String b() {
        return this.f81879b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f81878a, r52.f81878a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81879b, r52.f81879b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81878a.hashCode() * 31) + this.f81879b.hashCode();
    }

    public String toString() {
        return "RunningTradeGroupedBrokerEntity(brokerCode=" + this.f81878a + ", brokerType=" + this.f81879b + ")";
    }
}
