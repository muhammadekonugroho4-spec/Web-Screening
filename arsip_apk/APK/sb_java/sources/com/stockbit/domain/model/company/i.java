package com.stockbit.domain.model.company;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f81549a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81550b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81551c;

    public i(String r2, boolean r3, int r4) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        this.f81549a = r2;
        this.f81550b = r3;
        this.f81551c = r4;
    }

    public final String a() {
        return this.f81549a;
    }

    public final int b() {
        return this.f81551c;
    }

    public final boolean c() {
        return this.f81550b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (kotlin.jvm.internal.p.g(this.f81549a, r52.f81549a) == true) goto L12;
        return false;
    L12:
        if (this.f81550b == r52.f81550b) goto L15;
        return false;
    L15:
        if (this.f81551c == r52.f81551c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81549a.hashCode() * 31) + Boolean.hashCode(this.f81550b)) * 31) + Integer.hashCode(this.f81551c);
    }

    public String toString() {
        return "CompanyFollowerInfoEntity(symbol=" + this.f81549a + ", isFollowed=" + this.f81550b + ", totalFollowers=" + this.f81551c + ")";
    }
}
