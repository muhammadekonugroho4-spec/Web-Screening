package com.stockbit.feature.bonds.model;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f92369a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92370b;

    static {
    }

    public i(String r2, String r3) {
        p.l(r2, "productId");
        p.l(r3, "productName");
        this.f92369a = r2;
        this.f92370b = r3;
    }

    public final String a() {
        return this.f92369a;
    }

    public final String b() {
        return this.f92370b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f92369a, r52.f92369a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f92370b, r52.f92370b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f92369a.hashCode() * 31) + this.f92370b.hashCode();
    }

    public String toString() {
        return "BondTransactionSuccessData(productId=" + this.f92369a + ", productName=" + this.f92370b + ')';
    }
}
