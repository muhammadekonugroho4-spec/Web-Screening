package com.stockbit.domain.model.company.tradebook;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f82045a;

    public i(String r2) {
        p.l(r2, "nextPage");
        this.f82045a = r2;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof i) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f82045a, ((i) r4).f82045a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f82045a.hashCode();
    }

    public String toString() {
        return "TradeBookPaginateEntity(nextPage=" + this.f82045a + ")";
    }
}
