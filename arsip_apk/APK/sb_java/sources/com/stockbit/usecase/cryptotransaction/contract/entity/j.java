package com.stockbit.usecase.cryptotransaction.contract.entity;

import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f157424a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f157425b;

    public j(BigDecimal r2, BigDecimal r3) {
        p.l(r2, "avgPrice");
        p.l(r3, "position");
        this.f157424a = r2;
        this.f157425b = r3;
    }

    public final BigDecimal a() {
        return this.f157424a;
    }

    public final BigDecimal b() {
        return this.f157425b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f157424a, r52.f157424a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157425b, r52.f157425b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f157424a.hashCode() * 31) + this.f157425b.hashCode();
    }

    public String toString() {
        return "CryptoPositionEntity(avgPrice=" + this.f157424a + ", position=" + this.f157425b + ")";
    }
}
