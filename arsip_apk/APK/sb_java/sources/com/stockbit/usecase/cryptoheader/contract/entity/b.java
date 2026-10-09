package com.stockbit.usecase.cryptoheader.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final double f157126a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157127b;

    public b(double r2, String r4) {
        p.l(r4, "formatted");
        this.f157126a = r2;
        this.f157127b = r4;
    }

    public final String a() {
        return this.f157127b;
    }

    public final double b() {
        return this.f157126a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (Double.compare(this.f157126a, r82.f157126a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f157127b, r82.f157127b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f157126a) * 31) + this.f157127b.hashCode();
    }

    public String toString() {
        return "CryptoPriceValue(raw=" + this.f157126a + ", formatted=" + this.f157127b + ")";
    }
}
