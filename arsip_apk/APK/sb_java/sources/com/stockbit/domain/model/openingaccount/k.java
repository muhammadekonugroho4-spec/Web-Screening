package com.stockbit.domain.model.openingaccount;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f84559a;

    public k(String r2) {
        p.l(r2, "nextPage");
        this.f84559a = r2;
    }

    public final String a() {
        return this.f84559a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof k) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f84559a, ((k) r4).f84559a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f84559a.hashCode();
    }

    public String toString() {
        return "SecuritiesOANextPageEntity(nextPage=" + this.f84559a + ")";
    }
}
