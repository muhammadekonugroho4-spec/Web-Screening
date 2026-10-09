package com.stockbit.usecase.cryptodetail.contract.entity;

import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f157095a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157096b;

    public k(BigDecimal r1, String r2) {
        this.f157095a = r1;
        this.f157096b = r2;
    }

    public final String a() {
        return this.f157096b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f157095a, r52.f157095a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157096b, r52.f157096b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        BigDecimal r02 = this.f157095a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f157096b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "CryptoStatValue(raw=" + this.f157095a + ", formatted=" + this.f157096b + ")";
    }
}
