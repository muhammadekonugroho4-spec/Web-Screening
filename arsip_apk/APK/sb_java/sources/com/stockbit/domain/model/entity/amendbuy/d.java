package com.stockbit.domain.model.entity.amendbuy;

import java.math.BigDecimal;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f82548a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f82549b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f82550c;
    public final BigDecimal d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f82551e;

    public d(BigDecimal r2, BigDecimal r3, BigDecimal r4, BigDecimal r5, BigDecimal r6) {
        p.l(r2, "buyFeeValue");
        p.l(r3, "amountWithoutFeeValue");
        p.l(r4, "brokerFeeValue");
        p.l(r5, "exChangeFeeValue");
        p.l(r6, "totalValue");
        this.f82548a = r2;
        this.f82549b = r3;
        this.f82550c = r4;
        this.d = r5;
        this.f82551e = r6;
    }

    public final BigDecimal a() {
        return this.f82549b;
    }

    public final BigDecimal b() {
        return this.f82550c;
    }

    public final BigDecimal c() {
        return this.f82548a;
    }

    public final BigDecimal d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f82548a, r52.f82548a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82549b, r52.f82549b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82550c, r52.f82550c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82551e, r52.f82551e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f82548a.hashCode() * 31) + this.f82549b.hashCode()) * 31) + this.f82550c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82551e.hashCode();
    }

    public String toString() {
        return "AmendBuyCostCalculationEntity(buyFeeValue=" + this.f82548a + ", amountWithoutFeeValue=" + this.f82549b + ", brokerFeeValue=" + this.f82550c + ", exChangeFeeValue=" + this.d + ", totalValue=" + this.f82551e + ')';
    }

    public /* synthetic */ d(BigDecimal r2, BigDecimal r3, BigDecimal r4, BigDecimal r5, BigDecimal r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = BigDecimal.ZERO;
        p.k(r2, "ZERO");
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = BigDecimal.ZERO;
        p.k(r3, "ZERO");
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = BigDecimal.ZERO;
        p.k(r4, "ZERO");
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = BigDecimal.ZERO;
        p.k(r5, "ZERO");
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = BigDecimal.ZERO;
        p.k(r6, "ZERO");
    L17:
        BigDecimal r72 = r5;
        BigDecimal r82 = r6;
        BigDecimal r62 = r4;
        BigDecimal r42 = r2;
        this(r42, r3, r62, r72, r82);
    }
}
