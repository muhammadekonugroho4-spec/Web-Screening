package com.stockbit.usecase.tradingperformance.model;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f163530a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163531b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163532c;
    public final ProfitType d;

    public o(String r2, String r3, String r4, ProfitType r5) {
        kotlin.jvm.internal.p.l(r2, "totalEquity");
        kotlin.jvm.internal.p.l(r3, "profit");
        kotlin.jvm.internal.p.l(r4, "profitPercentage");
        kotlin.jvm.internal.p.l(r5, "profitType");
        this.f163530a = r2;
        this.f163531b = r3;
        this.f163532c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f163531b;
    }

    public final String b() {
        return this.f163532c;
    }

    public final ProfitType c() {
        return this.d;
    }

    public final String d() {
        return this.f163530a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (kotlin.jvm.internal.p.g(this.f163530a, r52.f163530a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f163531b, r52.f163531b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f163532c, r52.f163532c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f163530a.hashCode() * 31) + this.f163531b.hashCode()) * 31) + this.f163532c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "TotalEquityUIState(totalEquity=" + this.f163530a + ", profit=" + this.f163531b + ", profitPercentage=" + this.f163532c + ", profitType=" + this.d + ")";
    }

    public /* synthetic */ o(String r2, String r3, String r4, ProfitType r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "0";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "0";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "0%";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = ProfitType.NEUTRAL;
    L14:
        this(r2, r3, r4, r5);
    }
}
