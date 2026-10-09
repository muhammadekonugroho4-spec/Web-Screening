package com.stockbit.domains.usecase.eipo.resource;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.domains.usecase.eipo.model.b f88290a;

    public d(com.stockbit.domains.usecase.eipo.model.b r2) {
        p.l(r2, "uiState");
        this.f88290a = r2;
    }

    public final com.stockbit.domains.usecase.eipo.model.b a() {
        return this.f88290a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f88290a, ((d) r4).f88290a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f88290a.hashCode();
    }

    public String toString() {
        return "CompanyDetail(uiState=" + this.f88290a + ")";
    }
}
