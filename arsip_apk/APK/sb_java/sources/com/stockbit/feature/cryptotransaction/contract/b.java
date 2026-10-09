package com.stockbit.feature.cryptotransaction.contract;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f95014a;

    public b(String r2) {
        p.l(r2, "coinSymbol");
        this.f95014a = r2;
    }

    public final String a() {
        return this.f95014a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f95014a, ((b) r4).f95014a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f95014a.hashCode();
    }

    public String toString() {
        return "CryptoSellContractArgs(coinSymbol=" + this.f95014a + ')';
    }
}
