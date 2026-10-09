package com.stockbit.components.cryptoheader;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f78275a;

    static {
    }

    public i(String r2) {
        kotlin.jvm.internal.p.l(r2, "coinSymbol");
        this.f78275a = r2;
    }

    public final String a() {
        return this.f78275a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof i) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f78275a, ((i) r4).f78275a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f78275a.hashCode();
    }

    public String toString() {
        return "CryptoHeaderErrorUIData(coinSymbol=" + this.f78275a + ')';
    }
}
