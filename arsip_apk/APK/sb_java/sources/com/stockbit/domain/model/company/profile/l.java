package com.stockbit.domain.model.company.profile;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f81841a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81842b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81843c;
    public final String d;

    public l(String r2, String r3, String r4, String r5) {
        p.l(r2, "company");
        p.l(r3, "percentage");
        p.l(r4, "types");
        p.l(r5, "value");
        this.f81841a = r2;
        this.f81842b = r3;
        this.f81843c = r4;
        this.d = r5;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (p.g(this.f81841a, r52.f81841a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81842b, r52.f81842b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81843c, r52.f81843c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f81841a.hashCode() * 31) + this.f81842b.hashCode()) * 31) + this.f81843c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CompanyProfileSubsidiaryEntity(company=" + this.f81841a + ", percentage=" + this.f81842b + ", types=" + this.f81843c + ", value=" + this.d + ")";
    }
}
