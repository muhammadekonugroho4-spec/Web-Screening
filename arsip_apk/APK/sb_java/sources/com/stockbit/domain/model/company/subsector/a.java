package com.stockbit.domain.model.company.subsector;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81945a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81946b;

    public a(boolean r2, String r3) {
        p.l(r3, "multiplier");
        this.f81945a = r2;
        this.f81946b = r3;
    }

    public final String a() {
        return this.f81946b;
    }

    public final boolean b() {
        return this.f81945a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f81945a == r52.f81945a) goto L12;
        return false;
    L12:
        if (p.g(this.f81946b, r52.f81946b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f81945a) * 31) + this.f81946b.hashCode();
    }

    public String toString() {
        return "SubSectorCompanyDayTradeEntity(isShowMultiplier=" + this.f81945a + ", multiplier=" + this.f81946b + ")";
    }
}
