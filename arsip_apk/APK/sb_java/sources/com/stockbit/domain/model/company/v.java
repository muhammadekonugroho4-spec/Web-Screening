package com.stockbit.domain.model.company;

import java.util.List;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final List f82068a;

    public v(List r2) {
        kotlin.jvm.internal.p.l(r2, "stockDividend");
        this.f82068a = r2;
    }

    public final List a() {
        return this.f82068a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof v) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f82068a, ((v) r4).f82068a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f82068a.hashCode();
    }

    public String toString() {
        return "CorpActionStockDividendEntity(stockDividend=" + this.f82068a + ")";
    }
}
