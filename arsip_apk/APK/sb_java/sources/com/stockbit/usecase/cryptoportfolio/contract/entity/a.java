package com.stockbit.usecase.cryptoportfolio.contract.entity;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f157328a;

    /* renamed from: b, reason: collision with root package name */
    public final List f157329b;

    public a(BigDecimal r2, List r3) {
        p.l(r2, "idrAvailableBalance");
        p.l(r3, "holdings");
        this.f157328a = r2;
        this.f157329b = r3;
    }

    public final List a() {
        return this.f157329b;
    }

    public final BigDecimal b() {
        return this.f157328a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f157328a, r52.f157328a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157329b, r52.f157329b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f157328a.hashCode() * 31) + this.f157329b.hashCode();
    }

    public String toString() {
        return "CryptoPortfolioAssetsEntity(idrAvailableBalance=" + this.f157328a + ", holdings=" + this.f157329b + ")";
    }
}
