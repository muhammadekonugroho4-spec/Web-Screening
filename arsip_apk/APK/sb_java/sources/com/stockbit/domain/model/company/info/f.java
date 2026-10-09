package com.stockbit.domain.model.company.info;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f81627a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81628b;

    public f(String r2, String r3) {
        p.l(r2, "lightMode");
        p.l(r3, "darkMode");
        this.f81627a = r2;
        this.f81628b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f81627a, r52.f81627a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81628b, r52.f81628b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81627a.hashCode() * 31) + this.f81628b.hashCode();
    }

    public String toString() {
        return "CompanyNotationIconUrlEntity(lightMode=" + this.f81627a + ", darkMode=" + this.f81628b + ")";
    }
}
