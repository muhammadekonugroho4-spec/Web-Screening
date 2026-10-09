package com.stockbit.usecase.securities.model.order;

/* loaded from: classes2.dex */
public final class J implements p {

    /* renamed from: a, reason: collision with root package name */
    public final String f161158a;

    public J(String r2) {
        kotlin.jvm.internal.p.l(r2, "tradingBalance");
        this.f161158a = r2;
    }

    public final String a() {
        return this.f161158a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof J) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f161158a, ((J) r4).f161158a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f161158a.hashCode();
    }

    public String toString() {
        return "TradingBalanceUIState(tradingBalance=" + this.f161158a + ")";
    }
}
