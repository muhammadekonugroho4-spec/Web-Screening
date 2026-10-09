package com.stockbit.usecase.tradingperformance.model;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f163477a;

    /* renamed from: b, reason: collision with root package name */
    public final ProfitType f163478b;

    public e(String r2, ProfitType r3) {
        kotlin.jvm.internal.p.l(r2, "percentage");
        kotlin.jvm.internal.p.l(r3, "profitType");
        this.f163477a = r2;
        this.f163478b = r3;
    }

    public final String a() {
        return this.f163477a;
    }

    public final ProfitType b() {
        return this.f163478b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (kotlin.jvm.internal.p.g(this.f163477a, r52.f163477a) == true) goto L12;
        return false;
    L12:
        if (this.f163478b == r52.f163478b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f163477a.hashCode() * 31) + this.f163478b.hashCode();
    }

    public String toString() {
        return "CumulativePortfolioSummaryUIState(percentage=" + this.f163477a + ", profitType=" + this.f163478b + ")";
    }

    public /* synthetic */ e(String r1, ProfitType r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = ProfitType.NEUTRAL;
    L8:
        this(r1, r2);
    }
}
