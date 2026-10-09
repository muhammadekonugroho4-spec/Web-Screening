package com.stockbit.trading.contract.model;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f146241a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f146242b;

    public a(String r2, boolean r3) {
        p.l(r2, "value");
        this.f146241a = r2;
        this.f146242b = r3;
    }

    public final String a() {
        return this.f146241a;
    }

    public final boolean b() {
        return this.f146242b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f146241a, r52.f146241a) == true) goto L12;
        return false;
    L12:
        if (this.f146242b == r52.f146242b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f146241a.hashCode() * 31) + Boolean.hashCode(this.f146242b);
    }

    public String toString() {
        return "PortfolioFilterParam(value=" + this.f146241a + ", isActive=" + this.f146242b + ')';
    }
}
