package com.stockbit.domain.param.watchlist;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f87626a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87627b;

    public a(int r1, boolean r2) {
        this.f87626a = r1;
        this.f87627b = r2;
    }

    public final int a() {
        return this.f87626a;
    }

    public final boolean b() {
        return this.f87627b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f87626a == r52.f87626a) goto L12;
        return false;
    L12:
        if (this.f87627b == r52.f87627b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f87626a) * 31) + Boolean.hashCode(this.f87627b);
    }

    public String toString() {
        return "RearrangeFavoriteWatchlistDomainParam(id=" + this.f87626a + ", isFavorite=" + this.f87627b + ")";
    }
}
