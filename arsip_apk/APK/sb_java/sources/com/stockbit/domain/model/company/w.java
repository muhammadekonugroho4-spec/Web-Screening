package com.stockbit.domain.model.company;

import java.util.List;

/* loaded from: classes8.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final List f82069a;

    public w(List r2) {
        kotlin.jvm.internal.p.l(r2, "stockSplits");
        this.f82069a = r2;
    }

    public final List a() {
        return this.f82069a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof w) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f82069a, ((w) r4).f82069a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f82069a.hashCode();
    }

    public String toString() {
        return "CorpActionStockSplitEntity(stockSplits=" + this.f82069a + ")";
    }
}
