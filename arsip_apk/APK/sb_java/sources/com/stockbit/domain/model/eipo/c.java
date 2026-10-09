package com.stockbit.domain.model.eipo;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f82126a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82127b;

    public c(String r2, String r3) {
        p.l(r2, "url");
        p.l(r3, "token");
        this.f82126a = r2;
        this.f82127b = r3;
    }

    public final String a() {
        return this.f82126a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f82126a, r52.f82126a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82127b, r52.f82127b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f82126a.hashCode() * 31) + this.f82127b.hashCode();
    }

    public String toString() {
        return "EIpoCompanyLinkEntity(url=" + this.f82126a + ", token=" + this.f82127b + ")";
    }
}
