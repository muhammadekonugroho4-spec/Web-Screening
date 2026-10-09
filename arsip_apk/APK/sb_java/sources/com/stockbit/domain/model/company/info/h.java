package com.stockbit.domain.model.company.info;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final double f81632a;

    /* renamed from: b, reason: collision with root package name */
    public final double f81633b;

    /* renamed from: c, reason: collision with root package name */
    public final double f81634c;
    public final String d;

    public h(double r2, double r4, double r6, String r8) {
        p.l(r8, "period");
        this.f81632a = r2;
        this.f81633b = r4;
        this.f81634c = r6;
        this.d = r8;
    }

    public final double a() {
        return this.f81633b;
    }

    public final String b() {
        return this.d;
    }

    public final double c() {
        return this.f81632a;
    }

    public final double d() {
        return this.f81634c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof h) == true) goto L8;
        return false;
    L8:
        h r82 = (h) r8;
        if (Double.compare(this.f81632a, r82.f81632a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f81633b, r82.f81633b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f81634c, r82.f81634c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f81632a) * 31) + Double.hashCode(this.f81633b)) * 31) + Double.hashCode(this.f81634c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CompanySentimentEntity(startValue=" + this.f81632a + ", endValue=" + this.f81633b + ", value=" + this.f81634c + ", period=" + this.d + ")";
    }
}
