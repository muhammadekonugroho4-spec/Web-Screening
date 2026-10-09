package com.stockbit.usecase.paywall.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f158960a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f158961b;

    public a(String r2, boolean r3) {
        p.l(r2, "company");
        this.f158960a = r2;
        this.f158961b = r3;
    }

    public final boolean a() {
        return this.f158961b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f158960a, r52.f158960a) == true) goto L12;
        return false;
    L12:
        if (this.f158961b == r52.f158961b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f158960a.hashCode() * 31) + Boolean.hashCode(this.f158961b);
    }

    public String toString() {
        return "PaywallCompanyUIState(company=" + this.f158960a + ", isEligible=" + this.f158961b + ")";
    }
}
