package com.stockbit.domain.model.company;

import java.util.List;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final List f82070a;

    public x(List r2) {
        kotlin.jvm.internal.p.l(r2, "tenderOffers");
        this.f82070a = r2;
    }

    public final List a() {
        return this.f82070a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof x) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f82070a, ((x) r4).f82070a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f82070a.hashCode();
    }

    public String toString() {
        return "CorpActionTenderOfferEntity(tenderOffers=" + this.f82070a + ")";
    }
}
