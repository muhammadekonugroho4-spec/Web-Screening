package com.stockbit.domain.model.company.daytrade;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81477a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81478b;

    public a(boolean r2, String r3) {
        p.l(r3, "multiplier");
        this.f81477a = r2;
        this.f81478b = r3;
    }

    public final String a() {
        return this.f81478b;
    }

    public final boolean b() {
        return this.f81477a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f81477a == r52.f81477a) goto L12;
        return false;
    L12:
        if (p.g(this.f81478b, r52.f81478b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f81477a) * 31) + this.f81478b.hashCode();
    }

    public String toString() {
        return "CompanyDayTradeEntity(isShowMultiplier=" + this.f81477a + ", multiplier=" + this.f81478b + ")";
    }
}
