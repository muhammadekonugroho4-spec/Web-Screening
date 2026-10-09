package com.stockbit.usecase.securities.resource;

import com.stockbit.features.model.DomainSecuritiesException;

/* loaded from: classes2.dex */
public final class E implements H {

    /* renamed from: a, reason: collision with root package name */
    public final DomainSecuritiesException f162051a;

    public E(DomainSecuritiesException r2) {
        kotlin.jvm.internal.p.l(r2, "errorDetails");
        this.f162051a = r2;
    }

    public final DomainSecuritiesException a() {
        return this.f162051a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof E) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f162051a, ((E) r4).f162051a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f162051a.hashCode();
    }

    public String toString() {
        return "PortfolioDetails(errorDetails=" + this.f162051a + ")";
    }
}
