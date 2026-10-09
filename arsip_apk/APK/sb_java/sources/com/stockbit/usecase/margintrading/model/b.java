package com.stockbit.usecase.margintrading.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f158403a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158404b;

    /* renamed from: c, reason: collision with root package name */
    public final List f158405c;

    public b(String r2, String r3, List r4) {
        p.l(r2, "portfolioId");
        p.l(r3, "portfolioName");
        p.l(r4, "collateralItems");
        this.f158403a = r2;
        this.f158404b = r3;
        this.f158405c = r4;
    }

    public static /* synthetic */ b b(b r02, String r1, String r2, List r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f158403a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f158404b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f158405c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final b a(String r2, String r3, List r4) {
        p.l(r2, "portfolioId");
        p.l(r3, "portfolioName");
        p.l(r4, "collateralItems");
        return new b(r2, r3, r4);
    }

    public final List c() {
        return this.f158405c;
    }

    public final String d() {
        return this.f158403a;
    }

    public final String e() {
        return this.f158404b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f158403a, r52.f158403a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158404b, r52.f158404b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f158405c, r52.f158405c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f158403a.hashCode() * 31) + this.f158404b.hashCode()) * 31) + this.f158405c.hashCode();
    }

    public String toString() {
        return "AddAssetCollateralPortfolioUIState(portfolioId=" + this.f158403a + ", portfolioName=" + this.f158404b + ", collateralItems=" + this.f158405c + ")";
    }
}
