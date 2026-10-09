package com.stockbit.usecase.tradingperformance.model;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f163474a;

    /* renamed from: b, reason: collision with root package name */
    public final float f163475b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163476c;
    public final ProfitType d;

    public d(String r2, float r3, String r4, ProfitType r5) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r4, "cumulativeReturn");
        kotlin.jvm.internal.p.l(r5, "profitTypeDifference");
        this.f163474a = r2;
        this.f163475b = r3;
        this.f163476c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f163476c;
    }

    public final String b() {
        return this.f163474a;
    }

    public final float c() {
        return this.f163475b;
    }

    public final ProfitType d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (kotlin.jvm.internal.p.g(this.f163474a, r52.f163474a) == true) goto L12;
        return false;
    L12:
        if (Float.compare(this.f163475b, r52.f163475b) == 0) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f163476c, r52.f163476c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f163474a.hashCode() * 31) + Float.hashCode(this.f163475b)) * 31) + this.f163476c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CumulativePortfolioChartUIState(date=" + this.f163474a + ", percentage=" + this.f163475b + ", cumulativeReturn=" + this.f163476c + ", profitTypeDifference=" + this.d + ")";
    }
}
