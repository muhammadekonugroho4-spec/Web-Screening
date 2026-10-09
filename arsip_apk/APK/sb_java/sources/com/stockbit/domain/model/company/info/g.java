package com.stockbit.domain.model.company.info;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f81629a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81630b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81631c;
    public final String d;

    public g(String r1, String r2, String r3, String r4) {
        this.f81629a = r1;
        this.f81630b = r2;
        this.f81631c = r3;
        this.d = r4;
    }

    public final String a() {
        return this.f81629a;
    }

    public final String b() {
        return this.f81631c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f81629a, r52.f81629a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81630b, r52.f81630b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81631c, r52.f81631c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.f81629a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f81630b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f81631c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "CompanyOrderbookBidOfferEntity(bidPrice=" + this.f81629a + ", bidVolume=" + this.f81630b + ", offerPrice=" + this.f81631c + ", offerVolume=" + this.d + ")";
    }
}
