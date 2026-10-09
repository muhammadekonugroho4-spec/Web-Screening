package com.stockbit.usecase.transaction.model.confimation;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f163835a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163836b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163837c;
    public final String d;

    public b(int r2, String r3, String r4, String r5) {
        p.l(r3, "portionTB");
        p.l(r4, "portionDT");
        p.l(r5, "forcedSellTime");
        this.f163835a = r2;
        this.f163836b = r3;
        this.f163837c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final int b() {
        return this.f163835a;
    }

    public final String c() {
        return this.f163837c;
    }

    public final String d() {
        return this.f163836b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f163835a == r52.f163835a) goto L12;
        return false;
    L12:
        if (p.g(this.f163836b, r52.f163836b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f163837c, r52.f163837c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f163835a) * 31) + this.f163836b.hashCode()) * 31) + this.f163837c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BuyConfirmationDayTradeInfoUIState(multiplier=" + this.f163835a + ", portionTB=" + this.f163836b + ", portionDT=" + this.f163837c + ", forcedSellTime=" + this.d + ")";
    }
}
