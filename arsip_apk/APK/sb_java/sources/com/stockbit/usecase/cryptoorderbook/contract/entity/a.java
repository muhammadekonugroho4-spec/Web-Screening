package com.stockbit.usecase.cryptoorderbook.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f157290a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157291b;

    public a(double r2, String r4) {
        p.l(r4, "formatted");
        this.f157290a = r2;
        this.f157291b = r4;
    }

    public final String a() {
        return this.f157291b;
    }

    public final double b() {
        return this.f157290a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (Double.compare(this.f157290a, r82.f157290a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f157291b, r82.f157291b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f157290a) * 31) + this.f157291b.hashCode();
    }

    public String toString() {
        return "CryptoOrderBookDecimal(raw=" + this.f157290a + ", formatted=" + this.f157291b + ")";
    }
}
