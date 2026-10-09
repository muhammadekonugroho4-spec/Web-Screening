package com.stockbit.domain.model.company;

import java.math.BigDecimal;
import java.util.Date;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Date f82065a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f82066b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f82067c;
    public final BigDecimal d;

    public u(Date r2, BigDecimal r3, BigDecimal r4, BigDecimal r5) {
        kotlin.jvm.internal.p.l(r2, "recordingDate");
        kotlin.jvm.internal.p.l(r3, "conversionNumber");
        kotlin.jvm.internal.p.l(r4, "remainingConversion");
        kotlin.jvm.internal.p.l(r5, "stockSumAfterConversion");
        this.f82065a = r2;
        this.f82066b = r3;
        this.f82067c = r4;
        this.d = r5;
    }

    public final BigDecimal a() {
        return this.f82066b;
    }

    public final Date b() {
        return this.f82065a;
    }

    public final BigDecimal c() {
        return this.f82067c;
    }

    public final BigDecimal d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof u) == true) goto L8;
        return false;
    L8:
        u r52 = (u) r5;
        if (kotlin.jvm.internal.p.g(this.f82065a, r52.f82065a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82066b, r52.f82066b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82067c, r52.f82067c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f82065a.hashCode() * 31) + this.f82066b.hashCode()) * 31) + this.f82067c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CorpActionStockConversionEntity(recordingDate=" + this.f82065a + ", conversionNumber=" + this.f82066b + ", remainingConversion=" + this.f82067c + ", stockSumAfterConversion=" + this.d + ")";
    }
}
