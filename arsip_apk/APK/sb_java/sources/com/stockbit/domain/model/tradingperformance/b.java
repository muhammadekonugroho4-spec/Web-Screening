package com.stockbit.domain.model.tradingperformance;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final double f86024a;

    /* renamed from: b, reason: collision with root package name */
    public final List f86025b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86026c;

    public b(double r2, List r4, String r5) {
        p.l(r4, "portfolioReturns");
        p.l(r5, "timeFilter");
        this.f86024a = r2;
        this.f86025b = r4;
        this.f86026c = r5;
    }

    public final List a() {
        return this.f86025b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (Double.compare(this.f86024a, r82.f86024a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f86025b, r82.f86025b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86026c, r82.f86026c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Double.hashCode(this.f86024a) * 31) + this.f86025b.hashCode()) * 31) + this.f86026c.hashCode();
    }

    public String toString() {
        return "CumulativeReturnEntity(percentage=" + this.f86024a + ", portfolioReturns=" + this.f86025b + ", timeFilter=" + this.f86026c + ")";
    }
}
