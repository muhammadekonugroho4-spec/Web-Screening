package com.stockbit.usecase.margintrading.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f158406a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158407b;

    /* renamed from: c, reason: collision with root package name */
    public final long f158408c;
    public final String d;

    public c(String r2, String r3, long r4, String r6) {
        p.l(r2, "portfolioId");
        p.l(r3, "portfolioName");
        p.l(r6, "valueFormatted");
        this.f158406a = r2;
        this.f158407b = r3;
        this.f158408c = r4;
        this.d = r6;
    }

    public final String a() {
        return this.f158406a;
    }

    public final long b() {
        return this.f158408c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f158406a, r82.f158406a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158407b, r82.f158407b) == true) goto L15;
        return false;
    L15:
        if (this.f158408c == r82.f158408c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f158406a.hashCode() * 31) + this.f158407b.hashCode()) * 31) + Long.hashCode(this.f158408c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "AddCashCollateralItemUIState(portfolioId=" + this.f158406a + ", portfolioName=" + this.f158407b + ", value=" + this.f158408c + ", valueFormatted=" + this.d + ")";
    }
}
