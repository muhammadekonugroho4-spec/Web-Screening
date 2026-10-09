package com.stockbit.feature.cryptotransaction.ui.sell.bottomsheet;

/* loaded from: classes9.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final String f95981a;

    /* renamed from: b, reason: collision with root package name */
    public final String f95982b;

    static {
    }

    public C(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "coinName");
        kotlin.jvm.internal.p.l(r3, "coinLogoUrl");
        this.f95981a = r2;
        this.f95982b = r3;
    }

    public final String a() {
        return this.f95982b;
    }

    public final String b() {
        return this.f95981a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C) == true) goto L8;
        return false;
    L8:
        C r52 = (C) r5;
        if (kotlin.jvm.internal.p.g(this.f95981a, r52.f95981a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f95982b, r52.f95982b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f95981a.hashCode() * 31) + this.f95982b.hashCode();
    }

    public String toString() {
        return "CryptoSellSuccessUIData(coinName=" + this.f95981a + ", coinLogoUrl=" + this.f95982b + ')';
    }
}
