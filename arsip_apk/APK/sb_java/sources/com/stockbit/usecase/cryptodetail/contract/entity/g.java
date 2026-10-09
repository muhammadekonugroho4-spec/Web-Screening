package com.stockbit.usecase.cryptodetail.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f157085a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f157086b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157087c;

    public g(String r1, Double r2, String r3) {
        this.f157085a = r1;
        this.f157086b = r2;
        this.f157087c = r3;
    }

    public final String a() {
        return this.f157087c;
    }

    public final String b() {
        return this.f157085a;
    }

    public final Double c() {
        return this.f157086b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f157085a, r52.f157085a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157086b, r52.f157086b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157087c, r52.f157087c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f157085a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.f157086b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f157087c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "CryptoSeasonalityCellEntity(monthName=" + this.f157085a + ", percentChange=" + this.f157086b + ", colorHex=" + this.f157087c + ")";
    }
}
