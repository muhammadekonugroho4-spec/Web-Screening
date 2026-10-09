package com.stockbit.usecase.securities.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f160881a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f160882b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f160883c;
    public final boolean d;

    public i(String r2, boolean r3, boolean r4, boolean r5) {
        p.l(r2, "stockCode");
        this.f160881a = r2;
        this.f160882b = r3;
        this.f160883c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f160881a;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.f160883c;
    }

    public final boolean d() {
        return this.f160882b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f160881a, r52.f160881a) == true) goto L12;
        return false;
    L12:
        if (this.f160882b == r52.f160882b) goto L15;
        return false;
    L15:
        if (this.f160883c == r52.f160883c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f160881a.hashCode() * 31) + Boolean.hashCode(this.f160882b)) * 31) + Boolean.hashCode(this.f160883c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "StockTradableUIState(stockCode=" + this.f160881a + ", isTradable=" + this.f160882b + ", isSharia=" + this.f160883c + ", isMarginTradable=" + this.d + ")";
    }
}
