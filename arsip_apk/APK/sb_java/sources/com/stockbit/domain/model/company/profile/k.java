package com.stockbit.domain.model.company.profile;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f81838a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81839b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81840c;
    public final String d;

    public k(String r2, String r3, String r4, String r5) {
        p.l(r2, "shareholderDate");
        p.l(r3, "totalShare");
        p.l(r4, "change");
        p.l(r5, "changeFormatted");
        this.f81838a = r2;
        this.f81839b = r3;
        this.f81840c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f81840c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f81838a;
    }

    public final String d() {
        return this.f81839b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f81838a, r52.f81838a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81839b, r52.f81839b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81840c, r52.f81840c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f81838a.hashCode() * 31) + this.f81839b.hashCode()) * 31) + this.f81840c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CompanyProfileShareHolderNumberEntity(shareholderDate=" + this.f81838a + ", totalShare=" + this.f81839b + ", change=" + this.f81840c + ", changeFormatted=" + this.d + ")";
    }
}
