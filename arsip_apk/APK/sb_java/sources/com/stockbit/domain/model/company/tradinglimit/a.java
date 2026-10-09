package com.stockbit.domain.model.company.tradinglimit;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f82063a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82064b;

    public a(boolean r2, String r3) {
        p.l(r3, "haircutPercentage");
        this.f82063a = r2;
        this.f82064b = r3;
    }

    public final String a() {
        return this.f82064b;
    }

    public final boolean b() {
        return this.f82063a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f82063a == r52.f82063a) goto L12;
        return false;
    L12:
        if (p.g(this.f82064b, r52.f82064b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f82063a) * 31) + this.f82064b.hashCode();
    }

    public String toString() {
        return "CompanyTradingLimitInfoEntity(isTradingLimit=" + this.f82063a + ", haircutPercentage=" + this.f82064b + ")";
    }
}
