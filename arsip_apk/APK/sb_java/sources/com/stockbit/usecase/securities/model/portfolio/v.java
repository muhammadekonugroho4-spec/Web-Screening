package com.stockbit.usecase.securities.model.portfolio;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f161878a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161879b;

    public v(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "formattedUnsettledLot");
        kotlin.jvm.internal.p.l(r3, "settleDate");
        this.f161878a = r2;
        this.f161879b = r3;
    }

    public final String a() {
        return this.f161878a;
    }

    public final String b() {
        return this.f161879b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof v) == true) goto L8;
        return false;
    L8:
        v r52 = (v) r5;
        if (kotlin.jvm.internal.p.g(this.f161878a, r52.f161878a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161879b, r52.f161879b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f161878a.hashCode() * 31) + this.f161879b.hashCode();
    }

    public String toString() {
        return "PortfolioDetailDataUnsettledUIState(formattedUnsettledLot=" + this.f161878a + ", settleDate=" + this.f161879b + ")";
    }

    public /* synthetic */ v(String r2, String r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
