package com.stockbit.domain.model.securities.portfolio;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85608a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85609b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85610c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85611e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85612f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85613g;

    /* renamed from: h, reason: collision with root package name */
    public final String f85614h;

    public c(boolean r2, boolean r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        p.l(r4, "endDateExercise");
        p.l(r5, "timeServer");
        p.l(r6, "notExercisableReason");
        p.l(r7, "notTradableReason");
        p.l(r8, "notTradableType");
        p.l(r9, "notExercisableType");
        this.f85608a = r2;
        this.f85609b = r3;
        this.f85610c = r4;
        this.d = r5;
        this.f85611e = r6;
        this.f85612f = r7;
        this.f85613g = r8;
        this.f85614h = r9;
    }

    public final String a() {
        return this.f85610c;
    }

    public final String b() {
        return this.f85611e;
    }

    public final String c() {
        return this.f85614h;
    }

    public final String d() {
        return this.f85612f;
    }

    public final String e() {
        return this.f85613g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f85608a == r52.f85608a) goto L12;
        return false;
    L12:
        if (this.f85609b == r52.f85609b) goto L15;
        return false;
    L15:
        if (p.g(this.f85610c, r52.f85610c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85611e, r52.f85611e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85612f, r52.f85612f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f85613g, r52.f85613g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f85614h, r52.f85614h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final boolean f() {
        return this.f85608a;
    }

    public final boolean g() {
        return this.f85609b;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.f85608a) * 31) + Boolean.hashCode(this.f85609b)) * 31) + this.f85610c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85611e.hashCode()) * 31) + this.f85612f.hashCode()) * 31) + this.f85613g.hashCode()) * 31) + this.f85614h.hashCode();
    }

    public String toString() {
        return "ExercisableStockEntity(isExercisable=" + this.f85608a + ", isTradable=" + this.f85609b + ", endDateExercise=" + this.f85610c + ", timeServer=" + this.d + ", notExercisableReason=" + this.f85611e + ", notTradableReason=" + this.f85612f + ", notTradableType=" + this.f85613g + ", notExercisableType=" + this.f85614h + ")";
    }
}
