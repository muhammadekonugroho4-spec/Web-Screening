package com.stockbit.domain.param.company;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f87395a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87396b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87397c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f87398e;

    public a(String r2, int r3, int r4, int r5, boolean r6) {
        p.l(r2, "symbol");
        this.f87395a = r2;
        this.f87396b = r3;
        this.f87397c = r4;
        this.d = r5;
        this.f87398e = r6;
    }

    public final int a() {
        return this.f87397c;
    }

    public final int b() {
        return this.f87396b;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.f87395a;
    }

    public final boolean e() {
        return this.f87398e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f87395a, r52.f87395a) == true) goto L12;
        return false;
    L12:
        if (this.f87396b == r52.f87396b) goto L15;
        return false;
    L15:
        if (this.f87397c == r52.f87397c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f87398e == r52.f87398e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f87395a.hashCode() * 31) + Integer.hashCode(this.f87396b)) * 31) + Integer.hashCode(this.f87397c)) * 31) + Integer.hashCode(this.d)) * 31) + Boolean.hashCode(this.f87398e);
    }

    public String toString() {
        return "CompanyFinancialTableDomainParam(symbol=" + this.f87395a + ", reportType=" + this.f87396b + ", dataType=" + this.f87397c + ", statementType=" + this.d + ", isPercentage=" + this.f87398e + ")";
    }
}
