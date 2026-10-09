package com.stockbit.domain.model.company;

/* loaded from: classes8.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final String f82072a;

    public z(String r2) {
        kotlin.jvm.internal.p.l(r2, "token");
        this.f82072a = r2;
    }

    public final String a() {
        return this.f82072a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof z) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f82072a, ((z) r4).f82072a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f82072a.hashCode();
    }

    public String toString() {
        return "FundachartTokenEntity(token=" + this.f82072a + ")";
    }
}
