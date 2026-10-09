package com.stockbit.domain.model.company;

import java.util.List;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final List f81844a;

    public q(List r2) {
        kotlin.jvm.internal.p.l(r2, "dividend");
        this.f81844a = r2;
    }

    public final List a() {
        return this.f81844a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof q) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f81844a, ((q) r4).f81844a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81844a.hashCode();
    }

    public String toString() {
        return "CorpActionDividendEntity(dividend=" + this.f81844a + ")";
    }
}
