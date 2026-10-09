package com.stockbit.usecase.company.model.param;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f156465a;

    /* renamed from: b, reason: collision with root package name */
    public final int f156466b;

    /* renamed from: c, reason: collision with root package name */
    public final int f156467c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f156468e;

    public a(String r2, int r3, int r4, int r5, boolean r6) {
        p.l(r2, "symbol");
        this.f156465a = r2;
        this.f156466b = r3;
        this.f156467c = r4;
        this.d = r5;
        this.f156468e = r6;
    }

    public final int a() {
        return this.f156467c;
    }

    public final int b() {
        return this.f156466b;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.f156465a;
    }

    public final boolean e() {
        return this.f156468e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f156465a, r52.f156465a) == true) goto L12;
        return false;
    L12:
        if (this.f156466b == r52.f156466b) goto L15;
        return false;
    L15:
        if (this.f156467c == r52.f156467c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f156468e == r52.f156468e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f156465a.hashCode() * 31) + Integer.hashCode(this.f156466b)) * 31) + Integer.hashCode(this.f156467c)) * 31) + Integer.hashCode(this.d)) * 31) + Boolean.hashCode(this.f156468e);
    }

    public String toString() {
        return "CompanyFinancialTableUIParam(symbol=" + this.f156465a + ", reportType=" + this.f156466b + ", dataType=" + this.f156467c + ", statementType=" + this.d + ", isPercentage=" + this.f156468e + ")";
    }
}
