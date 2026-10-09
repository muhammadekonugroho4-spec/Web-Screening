package com.stockbit.domain.model.company.brokerdistribution;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f81406a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81407b;

    public b(List r2, List r3) {
        p.l(r2, "topBrokerBuy");
        p.l(r3, "topBrokerSell");
        this.f81406a = r2;
        this.f81407b = r3;
    }

    public final List a() {
        return this.f81406a;
    }

    public final List b() {
        return this.f81407b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f81406a, r52.f81406a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81407b, r52.f81407b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81406a.hashCode() * 31) + this.f81407b.hashCode();
    }

    public String toString() {
        return "BrokerDistributionGroupEntity(topBrokerBuy=" + this.f81406a + ", topBrokerSell=" + this.f81407b + ")";
    }
}
