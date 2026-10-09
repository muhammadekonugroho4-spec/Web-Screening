package com.stockbit.usecase.securities.resource;

import com.stockbit.usecase.securities.model.portfolio.StockListType;
import java.util.List;

/* loaded from: classes2.dex */
public final class K implements J {

    /* renamed from: a, reason: collision with root package name */
    public final List f162062a;

    /* renamed from: b, reason: collision with root package name */
    public final List f162063b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f162064c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f162065e;

    /* renamed from: f, reason: collision with root package name */
    public final String f162066f;

    /* renamed from: g, reason: collision with root package name */
    public final StockListType f162067g;

    public K(List r2, List r3, boolean r4, boolean r5, boolean r6, String r7, StockListType r8) {
        kotlin.jvm.internal.p.l(r2, "originalList");
        kotlin.jvm.internal.p.l(r3, "filteredList");
        kotlin.jvm.internal.p.l(r7, "ineligibilityReason");
        kotlin.jvm.internal.p.l(r8, "stockListType");
        this.f162062a = r2;
        this.f162063b = r3;
        this.f162064c = r4;
        this.d = r5;
        this.f162065e = r6;
        this.f162066f = r7;
        this.f162067g = r8;
    }

    public final List a() {
        return this.f162063b;
    }

    public final String b() {
        return this.f162066f;
    }

    public final List c() {
        return this.f162062a;
    }

    public final boolean d() {
        return this.d;
    }

    public final StockListType e() {
        return this.f162067g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof K) == true) goto L8;
        return false;
    L8:
        K r52 = (K) r5;
        if (kotlin.jvm.internal.p.g(this.f162062a, r52.f162062a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f162063b, r52.f162063b) == true) goto L15;
        return false;
    L15:
        if (this.f162064c == r52.f162064c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f162065e == r52.f162065e) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f162066f, r52.f162066f) == true) goto L27;
        return false;
    L27:
        if (this.f162067g == r52.f162067g) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f162065e;
    }

    public int hashCode() {
        return (((((((((((this.f162062a.hashCode() * 31) + this.f162063b.hashCode()) * 31) + Boolean.hashCode(this.f162064c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f162065e)) * 31) + this.f162066f.hashCode()) * 31) + this.f162067g.hashCode();
    }

    public String toString() {
        return "WithPortfolio(originalList=" + this.f162062a + ", filteredList=" + this.f162063b + ", shouldShowAutoOrder=" + this.f162064c + ", shouldShowCashSweepMenu=" + this.d + ", isCashSweepEligible=" + this.f162065e + ", ineligibilityReason=" + this.f162066f + ", stockListType=" + this.f162067g + ")";
    }
}
