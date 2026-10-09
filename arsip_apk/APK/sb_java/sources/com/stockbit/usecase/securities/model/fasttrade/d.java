package com.stockbit.usecase.securities.model.fasttrade;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f160571a;

    public d(String r2) {
        p.l(r2, "tradingBalance");
        this.f160571a = r2;
    }

    public final String a() {
        return this.f160571a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f160571a, ((d) r4).f160571a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f160571a.hashCode();
    }

    public String toString() {
        return "FastTradeTradingBalanceUIState(tradingBalance=" + this.f160571a + ")";
    }
}
