package com.stockbit.feature.transaction.ui.buystockcompose.form.layout;

/* renamed from: com.stockbit.feature.transaction.ui.buystockcompose.form.layout.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8356d {

    /* renamed from: a, reason: collision with root package name */
    public final String f110976a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110977b;

    static {
    }

    public C8356d(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "tradingBalanceTextId");
        kotlin.jvm.internal.p.l(r3, "totalTradingBalanceTextId");
        this.f110976a = r2;
        this.f110977b = r3;
    }

    public final String a() {
        return this.f110977b;
    }

    public final String b() {
        return this.f110976a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C8356d) == true) goto L8;
        return false;
    L8:
        C8356d r52 = (C8356d) r5;
        if (kotlin.jvm.internal.p.g(this.f110976a, r52.f110976a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f110977b, r52.f110977b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f110976a.hashCode() * 31) + this.f110977b.hashCode();
    }

    public String toString() {
        return "BalanceIdentifier(tradingBalanceTextId=" + this.f110976a + ", totalTradingBalanceTextId=" + this.f110977b + ')';
    }
}
