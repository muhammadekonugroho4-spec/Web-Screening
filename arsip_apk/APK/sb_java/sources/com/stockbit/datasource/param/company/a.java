package com.stockbit.datasource.param.company;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f80066a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80067b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80068c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f80069e;

    public a(String r2, int r3, int r4, int r5, boolean r6) {
        p.l(r2, "symbol");
        this.f80066a = r2;
        this.f80067b = r3;
        this.f80068c = r4;
        this.d = r5;
        this.f80069e = r6;
    }

    public final int a() {
        return this.f80068c;
    }

    public final int b() {
        return this.f80067b;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.f80066a;
    }

    public final boolean e() {
        return this.f80069e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f80066a, r52.f80066a) == true) goto L12;
        return false;
    L12:
        if (this.f80067b == r52.f80067b) goto L15;
        return false;
    L15:
        if (this.f80068c == r52.f80068c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f80069e == r52.f80069e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f80066a.hashCode() * 31) + Integer.hashCode(this.f80067b)) * 31) + Integer.hashCode(this.f80068c)) * 31) + Integer.hashCode(this.d)) * 31) + Boolean.hashCode(this.f80069e);
    }

    public String toString() {
        return "CompanyFinancialTableDataParam(symbol=" + this.f80066a + ", reportType=" + this.f80067b + ", dataType=" + this.f80068c + ", statementType=" + this.d + ", isPercentage=" + this.f80069e + ")";
    }
}
