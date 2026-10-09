package com.stockbit.domain.model.company.subsector;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f81977a;

    public c(d r2) {
        p.l(r2, "frAttributes");
        this.f81977a = r2;
    }

    public final d a() {
        return this.f81977a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f81977a, ((c) r4).f81977a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81977a.hashCode();
    }

    public String toString() {
        return "SubSectorCompanyExtraAttributesEntity(frAttributes=" + this.f81977a + ")";
    }
}
