package com.stockbit.feature.transaction.ui.nego.orderstock.model;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f114881a;

    /* renamed from: b, reason: collision with root package name */
    public final String f114882b;

    /* renamed from: c, reason: collision with root package name */
    public final String f114883c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f114884e;

    /* renamed from: f, reason: collision with root package name */
    public final String f114885f;

    /* renamed from: g, reason: collision with root package name */
    public final String f114886g;

    static {
    }

    public b(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        kotlin.jvm.internal.p.l(r2, "buyFee");
        kotlin.jvm.internal.p.l(r3, "sellFee");
        kotlin.jvm.internal.p.l(r4, "brokerFee");
        kotlin.jvm.internal.p.l(r5, "exchangeTotalBuyFee");
        kotlin.jvm.internal.p.l(r6, "buyAmountExchangeFee");
        kotlin.jvm.internal.p.l(r7, "buyAmountInvestedFee");
        kotlin.jvm.internal.p.l(r8, "buyAmountBrokerFee");
        this.f114881a = r2;
        this.f114882b = r3;
        this.f114883c = r4;
        this.d = r5;
        this.f114884e = r6;
        this.f114885f = r7;
        this.f114886g = r8;
    }

    public final String a() {
        return this.f114883c;
    }

    public final String b() {
        return this.f114886g;
    }

    public final String c() {
        return this.f114884e;
    }

    public final String d() {
        return this.f114885f;
    }

    public final String e() {
        return this.f114881a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (kotlin.jvm.internal.p.g(this.f114881a, r52.f114881a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f114882b, r52.f114882b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f114883c, r52.f114883c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f114884e, r52.f114884e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f114885f, r52.f114885f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f114886g, r52.f114886g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f114882b;
    }

    public int hashCode() {
        return (((((((((((this.f114881a.hashCode() * 31) + this.f114882b.hashCode()) * 31) + this.f114883c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f114884e.hashCode()) * 31) + this.f114885f.hashCode()) * 31) + this.f114886g.hashCode();
    }

    public String toString() {
        return "BuyNegoFormulaUIState(buyFee=" + this.f114881a + ", sellFee=" + this.f114882b + ", brokerFee=" + this.f114883c + ", exchangeTotalBuyFee=" + this.d + ", buyAmountExchangeFee=" + this.f114884e + ", buyAmountInvestedFee=" + this.f114885f + ", buyAmountBrokerFee=" + this.f114886g + ')';
    }

    public /* synthetic */ b(String r2, String r3, String r4, String r5, String r6, String r7, String r8, int r9, kotlin.jvm.internal.i r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r9 & 64) == 0) goto L24;
        String r92 = "";
    L23:
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92);
        return;
    L24:
        r92 = r8;
        goto L23
    }
}
