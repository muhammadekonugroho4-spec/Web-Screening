package com.stockbit.feature.bonds.model;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f92361a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92362b;

    /* renamed from: c, reason: collision with root package name */
    public final String f92363c;
    public final boolean d;

    static {
    }

    public g(String r2, String r3, String r4, boolean r5) {
        p.l(r2, "productId");
        p.l(r3, "productName");
        p.l(r4, "acquisitionOrderId");
        this.f92361a = r2;
        this.f92362b = r3;
        this.f92363c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f92363c;
    }

    public final String b() {
        return this.f92361a;
    }

    public final String c() {
        return this.f92362b;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f92361a, r52.f92361a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f92362b, r52.f92362b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f92363c, r52.f92363c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f92361a.hashCode() * 31) + this.f92362b.hashCode()) * 31) + this.f92363c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "BondSellPickerClickedData(productId=" + this.f92361a + ", productName=" + this.f92362b + ", acquisitionOrderId=" + this.f92363c + ", isStableEarn=" + this.d + ')';
    }
}
