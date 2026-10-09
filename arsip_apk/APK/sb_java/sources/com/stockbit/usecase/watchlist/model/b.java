package com.stockbit.usecase.watchlist.model;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f164568a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f164569b;

    public b(int r1, boolean r2) {
        this.f164568a = r1;
        this.f164569b = r2;
    }

    public final int a() {
        return this.f164568a;
    }

    public final boolean b() {
        return this.f164569b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f164568a == r52.f164568a) goto L12;
        return false;
    L12:
        if (this.f164569b == r52.f164569b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f164568a) * 31) + Boolean.hashCode(this.f164569b);
    }

    public String toString() {
        return "RearrangeFavoriteWatchlistParam(id=" + this.f164568a + ", isFavorite=" + this.f164569b + ")";
    }
}
