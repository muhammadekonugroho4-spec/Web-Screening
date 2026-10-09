package com.stockbit.canvas.ui.compose.ui.model;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f51817a;

    /* renamed from: b, reason: collision with root package name */
    public final String f51818b;

    static {
    }

    public k(String r2, String r3) {
        p.l(r2, "symbol");
        p.l(r3, "companyId");
        this.f51817a = r2;
        this.f51818b = r3;
    }

    public final String a() {
        return this.f51818b;
    }

    public final String b() {
        return this.f51817a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f51817a, r52.f51817a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f51818b, r52.f51818b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f51817a.hashCode() * 31) + this.f51818b.hashCode();
    }

    public String toString() {
        return "CanvasWatchlistUiParam(symbol=" + this.f51817a + ", companyId=" + this.f51818b + ')';
    }
}
