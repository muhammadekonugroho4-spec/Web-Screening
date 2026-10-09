package com.stockbit.usecase.securities.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f160388a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f160389b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160390c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f160391e;

    public b(String r2, boolean r3, String r4, String r5, String r6) {
        p.l(r2, "stockCode");
        p.l(r4, "notTradableType");
        p.l(r5, "notTradableReason");
        p.l(r6, "endDateExercise");
        this.f160388a = r2;
        this.f160389b = r3;
        this.f160390c = r4;
        this.d = r5;
        this.f160391e = r6;
    }

    public final String a() {
        return this.f160391e;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f160390c;
    }

    public final boolean d() {
        return this.f160389b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f160388a, r52.f160388a) == true) goto L12;
        return false;
    L12:
        if (this.f160389b == r52.f160389b) goto L15;
        return false;
    L15:
        if (p.g(this.f160390c, r52.f160390c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f160391e, r52.f160391e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f160388a.hashCode() * 31) + Boolean.hashCode(this.f160389b)) * 31) + this.f160390c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f160391e.hashCode();
    }

    public String toString() {
        return "ExercisableStockTradableUIState(stockCode=" + this.f160388a + ", isTradable=" + this.f160389b + ", notTradableType=" + this.f160390c + ", notTradableReason=" + this.d + ", endDateExercise=" + this.f160391e + ")";
    }
}
