package com.stockbit.usecase.cryptotransaction.contract.entity;

import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f157398a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f157399b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f157400c;

    public d(String r2, BigDecimal r3, BigDecimal r4) {
        p.l(r2, "asset");
        p.l(r3, "availableQty");
        p.l(r4, "avgPrice");
        this.f157398a = r2;
        this.f157399b = r3;
        this.f157400c = r4;
    }

    public final BigDecimal a() {
        return this.f157399b;
    }

    public final BigDecimal b() {
        return this.f157400c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f157398a, r52.f157398a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157399b, r52.f157399b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157400c, r52.f157400c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f157398a.hashCode() * 31) + this.f157399b.hashCode()) * 31) + this.f157400c.hashCode();
    }

    public String toString() {
        return "CryptoAssetAvailabilityEntity(asset=" + this.f157398a + ", availableQty=" + this.f157399b + ", avgPrice=" + this.f157400c + ")";
    }
}
