package com.stockbit.usecase.topstock.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f163133a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163134b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163135c;
    public final long d;

    public d(String r2, String r3, String r4, long r5) {
        p.l(r2, "fBuy");
        p.l(r3, "fSell");
        p.l(r4, "netF");
        this.f163133a = r2;
        this.f163134b = r3;
        this.f163135c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f163133a;
    }

    public final String b() {
        return this.f163134b;
    }

    public final String c() {
        return this.f163135c;
    }

    public final long d() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (p.g(this.f163133a, r82.f163133a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163134b, r82.f163134b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f163135c, r82.f163135c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f163133a.hashCode() * 31) + this.f163134b.hashCode()) * 31) + this.f163135c.hashCode()) * 31) + Long.hashCode(this.d);
    }

    public String toString() {
        return "TopStockSummaryUIState(fBuy=" + this.f163133a + ", fSell=" + this.f163134b + ", netF=" + this.f163135c + ", netFRaw=" + this.d + ")";
    }

    public /* synthetic */ d(String r2, String r3, String r4, long r5, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "-";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "-";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "-";
    L12:
        if ((r7 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        long r6 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r6);
    }
}
