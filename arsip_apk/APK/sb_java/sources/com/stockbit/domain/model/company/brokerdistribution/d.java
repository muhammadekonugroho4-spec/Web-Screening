package com.stockbit.domain.model.company.brokerdistribution;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f81411a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81412b;

    /* renamed from: c, reason: collision with root package name */
    public final double f81413c;

    public d(String r2, String r3, double r4) {
        p.l(r2, "code");
        p.l(r3, "type");
        this.f81411a = r2;
        this.f81412b = r3;
        this.f81413c = r4;
    }

    public final double a() {
        return this.f81413c;
    }

    public final String b() {
        return this.f81411a;
    }

    public final String c() {
        return this.f81412b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (p.g(this.f81411a, r82.f81411a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81412b, r82.f81412b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f81413c, r82.f81413c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81411a.hashCode() * 31) + this.f81412b.hashCode()) * 31) + Double.hashCode(this.f81413c);
    }

    public String toString() {
        return "BrokerTransactionItemEntity(code=" + this.f81411a + ", type=" + this.f81412b + ", amount=" + this.f81413c + ")";
    }
}
