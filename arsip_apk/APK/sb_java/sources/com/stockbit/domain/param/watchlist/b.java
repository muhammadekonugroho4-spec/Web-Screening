package com.stockbit.domain.param.watchlist;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f87628a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87629b;

    public b(String r2, boolean r3) {
        p.l(r2, "companyId");
        this.f87628a = r2;
        this.f87629b = r3;
    }

    public final String a() {
        return this.f87628a;
    }

    public final boolean b() {
        return this.f87629b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f87628a, r52.f87628a) == true) goto L12;
        return false;
    L12:
        if (this.f87629b == r52.f87629b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f87628a.hashCode() * 31) + Boolean.hashCode(this.f87629b);
    }

    public String toString() {
        return "WatchlistPinCompanyParam(companyId=" + this.f87628a + ", isPinned=" + this.f87629b + ")";
    }
}
