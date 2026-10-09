package com.stockbit.usecase.markettime.model;

import com.stockbit.domain.model.markettime.MarketStatus;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final MarketStatus f158498a;

    /* renamed from: b, reason: collision with root package name */
    public final int f158499b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f158500c;
    public final String d;

    public a(MarketStatus r2, int r3, boolean r4, String r5) {
        p.l(r2, "marketStatus");
        p.l(r5, "suspendInfo");
        this.f158498a = r2;
        this.f158499b = r3;
        this.f158500c = r4;
        this.d = r5;
    }

    public final MarketStatus a() {
        return this.f158498a;
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.f158499b;
    }

    public final boolean d() {
        return this.f158500c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f158498a == r52.f158498a) goto L12;
        return false;
    L12:
        if (this.f158499b == r52.f158499b) goto L15;
        return false;
    L15:
        if (this.f158500c == r52.f158500c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f158498a.hashCode() * 31) + Integer.hashCode(this.f158499b)) * 31) + Boolean.hashCode(this.f158500c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MarketSessionDetailUIState(marketStatus=" + this.f158498a + ", timeLeftRaw=" + this.f158499b + ", isOpenMarket=" + this.f158500c + ", suspendInfo=" + this.d + ')';
    }
}
