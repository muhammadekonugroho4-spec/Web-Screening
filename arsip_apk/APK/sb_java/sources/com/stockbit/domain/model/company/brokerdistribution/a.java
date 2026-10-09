package com.stockbit.domain.model.company.brokerdistribution;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f81403a;

    /* renamed from: b, reason: collision with root package name */
    public final b f81404b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81405c;
    public final String d;

    public a(b r2, b r3, String r4, String r5) {
        p.l(r2, "byValue");
        p.l(r3, "byVolume");
        p.l(r4, "startDate");
        p.l(r5, "endDate");
        this.f81403a = r2;
        this.f81404b = r3;
        this.f81405c = r4;
        this.d = r5;
    }

    public final b a() {
        return this.f81403a;
    }

    public final b b() {
        return this.f81404b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f81405c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81403a, r52.f81403a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81404b, r52.f81404b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81405c, r52.f81405c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f81403a.hashCode() * 31) + this.f81404b.hashCode()) * 31) + this.f81405c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BrokerDistributionEntity(byValue=" + this.f81403a + ", byVolume=" + this.f81404b + ", startDate=" + this.f81405c + ", endDate=" + this.d + ")";
    }
}
