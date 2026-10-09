package com.stockbit.feature.transaction.ui.buystockcompose.bottomsheet;

/* loaded from: classes9.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final String f110607a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110608b;

    /* renamed from: c, reason: collision with root package name */
    public final String f110609c;

    static {
    }

    public P(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "headerExpiryTextId");
        kotlin.jvm.internal.p.l(r3, "fakTitleTextId");
        kotlin.jvm.internal.p.l(r4, "fakContentTextId");
        this.f110607a = r2;
        this.f110608b = r3;
        this.f110609c = r4;
    }

    public final String a() {
        return this.f110609c;
    }

    public final String b() {
        return this.f110608b;
    }

    public final String c() {
        return this.f110607a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof P) == true) goto L8;
        return false;
    L8:
        P r52 = (P) r5;
        if (kotlin.jvm.internal.p.g(this.f110607a, r52.f110607a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f110608b, r52.f110608b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f110609c, r52.f110609c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f110607a.hashCode() * 31) + this.f110608b.hashCode()) * 31) + this.f110609c.hashCode();
    }

    public String toString() {
        return "MarketExpiryBSIdentifier(headerExpiryTextId=" + this.f110607a + ", fakTitleTextId=" + this.f110608b + ", fakContentTextId=" + this.f110609c + ')';
    }
}
