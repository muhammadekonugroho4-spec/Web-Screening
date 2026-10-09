package com.stockbit.domain.model.company.info;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f81577a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81578b;

    public c(String r2, String r3) {
        p.l(r2, "companySymbol");
        p.l(r3, "companyType");
        this.f81577a = r2;
        this.f81578b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f81577a, r52.f81577a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81578b, r52.f81578b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81577a.hashCode() * 31) + this.f81578b.hashCode();
    }

    public String toString() {
        return "CompanyIndexEntity(companySymbol=" + this.f81577a + ", companyType=" + this.f81578b + ")";
    }
}
