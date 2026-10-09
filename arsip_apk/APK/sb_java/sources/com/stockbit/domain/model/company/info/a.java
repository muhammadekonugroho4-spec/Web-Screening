package com.stockbit.domain.model.company.info;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f81569a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81570b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81571c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81572e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f81573f;

    public a(String r2, String r3, String r4, String r5, String r6, boolean r7) {
        p.l(r2, "companySymbol");
        p.l(r3, "catalogName");
        p.l(r4, "companyType");
        p.l(r5, "sectorId");
        p.l(r6, "parentId");
        this.f81569a = r2;
        this.f81570b = r3;
        this.f81571c = r4;
        this.d = r5;
        this.f81572e = r6;
        this.f81573f = r7;
    }

    public final String a() {
        return this.f81570b;
    }

    public final String b() {
        return this.f81569a;
    }

    public final String c() {
        return this.f81571c;
    }

    public final boolean d() {
        return this.f81573f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81569a, r52.f81569a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81570b, r52.f81570b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81571c, r52.f81571c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81572e, r52.f81572e) == true) goto L24;
        return false;
    L24:
        if (this.f81573f == r52.f81573f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f81569a.hashCode() * 31) + this.f81570b.hashCode()) * 31) + this.f81571c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81572e.hashCode()) * 31) + Boolean.hashCode(this.f81573f);
    }

    public String toString() {
        return "CompanyCatalogEntity(companySymbol=" + this.f81569a + ", catalogName=" + this.f81570b + ", companyType=" + this.f81571c + ", sectorId=" + this.d + ", parentId=" + this.f81572e + ", isShow=" + this.f81573f + ")";
    }
}
