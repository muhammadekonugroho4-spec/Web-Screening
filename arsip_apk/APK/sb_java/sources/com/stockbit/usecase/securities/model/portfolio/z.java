package com.stockbit.usecase.securities.model.portfolio;

/* loaded from: classes2.dex */
public final class z implements J {

    /* renamed from: a, reason: collision with root package name */
    public final PortfolioFilterType f161890a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f161891b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f161892c;

    public z(PortfolioFilterType r2, boolean r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "filterType");
        this.f161890a = r2;
        this.f161891b = r3;
        this.f161892c = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof z) == true) goto L8;
        return false;
    L8:
        z r52 = (z) r5;
        if (this.f161890a == r52.f161890a) goto L12;
        return false;
    L12:
        if (this.f161891b == r52.f161891b) goto L15;
        return false;
    L15:
        if (this.f161892c == r52.f161892c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f161890a.hashCode() * 31) + Boolean.hashCode(this.f161891b)) * 31) + Boolean.hashCode(this.f161892c);
    }

    public String toString() {
        return "PortfolioEmptyUIState(filterType=" + this.f161890a + ", isMainAccount=" + this.f161891b + ", showSubAccEmptyState=" + this.f161892c + ")";
    }

    public final PortfolioFilterType w() {
        return this.f161890a;
    }

    public final boolean x() {
        return this.f161892c;
    }

    public final boolean y() {
        return this.f161891b;
    }
}
