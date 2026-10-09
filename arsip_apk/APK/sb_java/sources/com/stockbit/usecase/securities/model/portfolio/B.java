package com.stockbit.usecase.securities.model.portfolio;

/* loaded from: classes2.dex */
public final class B implements J {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f161549a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f161550b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f161551c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final StockSortType f161552e;

    public B(boolean r2, boolean r3, boolean r4, boolean r5, StockSortType r6) {
        kotlin.jvm.internal.p.l(r6, "stockSortType");
        this.f161549a = r2;
        this.f161550b = r3;
        this.f161551c = r4;
        this.d = r5;
        this.f161552e = r6;
    }

    public static /* synthetic */ B x(B r02, boolean r1, boolean r2, boolean r3, boolean r4, StockSortType r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r02.f161549a;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r02.f161550b;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r02.f161551c;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r02.f161552e;
    L17:
        boolean r62 = r4;
        StockSortType r72 = r5;
        boolean r52 = r3;
        boolean r32 = r1;
        return r02.w(r32, r2, r52, r62, r72);
    }

    public final boolean A() {
        return this.f161549a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof B) == true) goto L8;
        return false;
    L8:
        B r52 = (B) r5;
        if (this.f161549a == r52.f161549a) goto L12;
        return false;
    L12:
        if (this.f161550b == r52.f161550b) goto L15;
        return false;
    L15:
        if (this.f161551c == r52.f161551c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f161552e == r52.f161552e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f161549a) * 31) + Boolean.hashCode(this.f161550b)) * 31) + Boolean.hashCode(this.f161551c)) * 31) + Boolean.hashCode(this.d)) * 31) + this.f161552e.hashCode();
    }

    public String toString() {
        return "PortfolioHeaderCompleteUIState(isFilterStock=" + this.f161549a + ", isFilterBond=" + this.f161550b + ", isFilterPortfolio=" + this.f161551c + ", shouldShowSummaryInvestmentValue=" + this.d + ", stockSortType=" + this.f161552e + ")";
    }

    public final B w(boolean r8, boolean r9, boolean r10, boolean r11, StockSortType r12) {
        kotlin.jvm.internal.p.l(r12, "stockSortType");
        return new B(r8, r9, r10, r11, r12);
    }

    public final StockSortType y() {
        return this.f161552e;
    }

    public final boolean z() {
        return this.f161550b;
    }

    public /* synthetic */ B(boolean r2, boolean r3, boolean r4, boolean r5, StockSortType r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = false;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = true;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = StockSortType.NameAscending;
    L17:
        StockSortType r72 = r6;
        boolean r62 = r5;
        boolean r52 = r4;
        this(r2, r3, r52, r62, r72);
    }
}
