package com.stockbit.usecase.company.model.daytrade;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f156211a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156212b;

    public a(boolean r2, String r3) {
        p.l(r3, "multiplier");
        this.f156211a = r2;
        this.f156212b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f156211a == r52.f156211a) goto L12;
        return false;
    L12:
        if (p.g(this.f156212b, r52.f156212b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f156211a) * 31) + this.f156212b.hashCode();
    }

    public String toString() {
        return "CompanyDayTradeInfoUIState(isShowMultiplier=" + this.f156211a + ", multiplier=" + this.f156212b + ")";
    }
}
