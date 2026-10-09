package com.stockbit.feature.cryptotransaction.contract;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f95013a;

    public a(String r2) {
        p.l(r2, "coinSymbol");
        this.f95013a = r2;
    }

    public final String a() {
        return this.f95013a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f95013a, ((a) r4).f95013a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f95013a.hashCode();
    }

    public String toString() {
        return "CryptoBuyContractArgs(coinSymbol=" + this.f95013a + ')';
    }
}
