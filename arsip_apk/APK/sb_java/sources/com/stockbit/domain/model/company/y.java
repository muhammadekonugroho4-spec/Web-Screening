package com.stockbit.domain.model.company;

import java.util.List;

/* loaded from: classes8.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final List f82071a;

    public y(List r2) {
        kotlin.jvm.internal.p.l(r2, "warrants");
        this.f82071a = r2;
    }

    public final List a() {
        return this.f82071a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof y) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f82071a, ((y) r4).f82071a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f82071a.hashCode();
    }

    public String toString() {
        return "CorpActionWarrantEntity(warrants=" + this.f82071a + ")";
    }
}
