package com.stockbit.usecase.securities.model.portfolio;

import com.stockbit.usecase.securities.model.order.DebtStatusType;

/* loaded from: classes2.dex */
public final class D implements J {

    /* renamed from: a, reason: collision with root package name */
    public final double f161572a;

    /* renamed from: b, reason: collision with root package name */
    public final double f161573b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161574c;
    public final DebtStatusType d;

    /* renamed from: e, reason: collision with root package name */
    public final int f161575e;

    public D(double r2, double r4, String r6, DebtStatusType r7, int r8) {
        kotlin.jvm.internal.p.l(r6, "marginRatioTotal");
        kotlin.jvm.internal.p.l(r7, "debtStatusType");
        this.f161572a = r2;
        this.f161573b = r4;
        this.f161574c = r6;
        this.d = r7;
        this.f161575e = r8;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof D) == true) goto L8;
        return false;
    L8:
        D r82 = (D) r8;
        if (Double.compare(this.f161572a, r82.f161572a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f161573b, r82.f161573b) == 0) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161574c, r82.f161574c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f161575e == r82.f161575e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.f161572a) * 31) + Double.hashCode(this.f161573b)) * 31) + this.f161574c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f161575e);
    }

    public String toString() {
        return "PortfolioMarginTradingSeparatorUIState(marginRatioPercentage=" + this.f161572a + ", forceSellThreshold=" + this.f161573b + ", marginRatioTotal=" + this.f161574c + ", debtStatusType=" + this.d + ", marginCallCounter=" + this.f161575e + ")";
    }

    public final DebtStatusType w() {
        return this.d;
    }

    public final double x() {
        return this.f161573b;
    }

    public final int y() {
        return this.f161575e;
    }

    public final double z() {
        return this.f161572a;
    }
}
