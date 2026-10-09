package com.stockbit.domain.model.cashsweep;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f81112a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81113b;

    public d(List r2, List r3) {
        p.l(r2, "prospectus");
        p.l(r3, "productFundFacts");
        this.f81112a = r2;
        this.f81113b = r3;
    }

    public final List a() {
        return this.f81113b;
    }

    public final List b() {
        return this.f81112a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f81112a, r52.f81112a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81113b, r52.f81113b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81112a.hashCode() * 31) + this.f81113b.hashCode();
    }

    public String toString() {
        return "CashSweepDocsEntity(prospectus=" + this.f81112a + ", productFundFacts=" + this.f81113b + ")";
    }
}
