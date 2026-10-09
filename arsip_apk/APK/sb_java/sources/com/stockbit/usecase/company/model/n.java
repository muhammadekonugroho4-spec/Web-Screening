package com.stockbit.usecase.company.model;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f156323a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f156324b;

    /* renamed from: c, reason: collision with root package name */
    public final int f156325c;

    public n(String r2, boolean r3, int r4) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        this.f156323a = r2;
        this.f156324b = r3;
        this.f156325c = r4;
    }

    public final int a() {
        return this.f156325c;
    }

    public final boolean b() {
        return this.f156324b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f156323a, r52.f156323a) == true) goto L12;
        return false;
    L12:
        if (this.f156324b == r52.f156324b) goto L15;
        return false;
    L15:
        if (this.f156325c == r52.f156325c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f156323a.hashCode() * 31) + Boolean.hashCode(this.f156324b)) * 31) + Integer.hashCode(this.f156325c);
    }

    public String toString() {
        return "CompanyFollowerInfoUIState(symbol=" + this.f156323a + ", isFollowed=" + this.f156324b + ", totalFollowers=" + this.f156325c + ")";
    }
}
