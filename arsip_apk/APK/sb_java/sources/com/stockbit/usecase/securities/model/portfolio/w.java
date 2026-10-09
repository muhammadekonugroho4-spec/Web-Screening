package com.stockbit.usecase.securities.model.portfolio;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f161880a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161881b;

    public w(boolean r2, String r3) {
        kotlin.jvm.internal.p.l(r3, "delistedDate");
        this.f161880a = r2;
        this.f161881b = r3;
    }

    public final String a() {
        return this.f161881b;
    }

    public final boolean b() {
        return this.f161880a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof w) == true) goto L8;
        return false;
    L8:
        w r52 = (w) r5;
        if (this.f161880a == r52.f161880a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161881b, r52.f161881b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f161880a) * 31) + this.f161881b.hashCode();
    }

    public String toString() {
        return "PortfolioDetailDelistedInfoUIData(isToBeDelisted=" + this.f161880a + ", delistedDate=" + this.f161881b + ")";
    }

    public /* synthetic */ w(boolean r1, String r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
