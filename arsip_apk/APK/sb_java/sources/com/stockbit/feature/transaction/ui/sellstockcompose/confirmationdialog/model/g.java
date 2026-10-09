package com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f116183a;

    /* renamed from: b, reason: collision with root package name */
    public final String f116184b;

    /* renamed from: c, reason: collision with root package name */
    public final String f116185c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f116186e;

    static {
    }

    public g(String r2, String r3, String r4, boolean r5, boolean r6) {
        p.l(r2, "iconUrl");
        p.l(r3, "companySymbol");
        p.l(r4, "stockName");
        this.f116183a = r2;
        this.f116184b = r3;
        this.f116185c = r4;
        this.d = r5;
        this.f116186e = r6;
    }

    public final String a() {
        return this.f116184b;
    }

    public final String b() {
        return this.f116183a;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.f116186e;
    }

    public final String e() {
        return this.f116185c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f116183a, r52.f116183a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f116184b, r52.f116184b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f116185c, r52.f116185c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f116186e == r52.f116186e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f116183a.hashCode() * 31) + this.f116184b.hashCode()) * 31) + this.f116185c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f116186e);
    }

    public String toString() {
        return "SellConfirmationSuccessUiState(iconUrl=" + this.f116183a + ", companySymbol=" + this.f116184b + ", stockName=" + this.f116185c + ", showBackToOrderPage=" + this.d + ", showShareTrade=" + this.f116186e + ')';
    }
}
