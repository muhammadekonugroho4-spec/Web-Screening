package com.stockbit.usecase.securities.param;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f161954a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.usecase.securities.model.account.c f161955b;

    /* renamed from: c, reason: collision with root package name */
    public final com.stockbit.usecase.securities.model.account.b f161956c;

    public d(String r2, com.stockbit.usecase.securities.model.account.c r3, com.stockbit.usecase.securities.model.account.b r4) {
        p.l(r2, "portfolioName");
        p.l(r3, "purpose");
        p.l(r4, "tnc");
        this.f161954a = r2;
        this.f161955b = r3;
        this.f161956c = r4;
    }

    public static /* synthetic */ d b(d r02, String r1, com.stockbit.usecase.securities.model.account.c r2, com.stockbit.usecase.securities.model.account.b r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f161954a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f161955b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f161956c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final d a(String r2, com.stockbit.usecase.securities.model.account.c r3, com.stockbit.usecase.securities.model.account.b r4) {
        p.l(r2, "portfolioName");
        p.l(r3, "purpose");
        p.l(r4, "tnc");
        return new d(r2, r3, r4);
    }

    public final String c() {
        return this.f161954a;
    }

    public final com.stockbit.usecase.securities.model.account.c d() {
        return this.f161955b;
    }

    public final com.stockbit.usecase.securities.model.account.b e() {
        return this.f161956c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f161954a, r52.f161954a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f161955b, r52.f161955b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f161956c, r52.f161956c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f161954a.hashCode() * 31) + this.f161955b.hashCode()) * 31) + this.f161956c.hashCode();
    }

    public String toString() {
        return "CreateNewPortfolioUIParam(portfolioName=" + this.f161954a + ", purpose=" + this.f161955b + ", tnc=" + this.f161956c + ")";
    }

    public /* synthetic */ d(String r7, com.stockbit.usecase.securities.model.account.c r8, com.stockbit.usecase.securities.model.account.b r9, int r10, kotlin.jvm.internal.i r11) {
        if ((r10 & 1) == 0) goto L6;
        r7 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r8 = new com.stockbit.usecase.securities.model.account.c(null, null, 3, null);
    L9:
        if ((r10 & 4) == 0) goto L11;
        r9 = new com.stockbit.usecase.securities.model.account.b(null, null, null, 7, null);
    L11:
        this(r7, r8, r9);
    }
}
