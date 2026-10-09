package com.stockbit.domain.model.securities.account;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f85019a;

    /* renamed from: b, reason: collision with root package name */
    public final PortfolioPurposeType f85020b;

    public e(String r2, PortfolioPurposeType r3) {
        p.l(r2, "portfolioName");
        p.l(r3, "purpose");
        this.f85019a = r2;
        this.f85020b = r3;
    }

    public final String a() {
        return this.f85019a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f85019a, r52.f85019a) == true) goto L12;
        return false;
    L12:
        if (this.f85020b == r52.f85020b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85019a.hashCode() * 31) + this.f85020b.hashCode();
    }

    public String toString() {
        return "PortfolioInfoEntity(portfolioName=" + this.f85019a + ", purpose=" + this.f85020b + ")";
    }
}
