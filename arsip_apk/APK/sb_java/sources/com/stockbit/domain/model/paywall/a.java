package com.stockbit.domain.model.paywall;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84621a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84622b;

    public a(String r2, boolean r3) {
        p.l(r2, "company");
        this.f84621a = r2;
        this.f84622b = r3;
    }

    public final String a() {
        return this.f84621a;
    }

    public final boolean b() {
        return this.f84622b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84621a, r52.f84621a) == true) goto L12;
        return false;
    L12:
        if (this.f84622b == r52.f84622b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84621a.hashCode() * 31) + Boolean.hashCode(this.f84622b);
    }

    public String toString() {
        return "PaywallCompanyEntity(company=" + this.f84621a + ", isEligible=" + this.f84622b + ")";
    }
}
