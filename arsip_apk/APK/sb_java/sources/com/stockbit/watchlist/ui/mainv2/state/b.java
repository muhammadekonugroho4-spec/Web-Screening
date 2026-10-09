package com.stockbit.watchlist.ui.mainv2.state;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f170887a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f170888b;

    static {
    }

    public b(String r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        this.f170887a = r2;
        this.f170888b = r3;
    }

    public final String a() {
        return this.f170887a;
    }

    public final boolean b() {
        return this.f170888b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (kotlin.jvm.internal.p.g(this.f170887a, r52.f170887a) == true) goto L12;
        return false;
    L12:
        if (this.f170888b == r52.f170888b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f170887a.hashCode() * 31) + Boolean.hashCode(this.f170888b);
    }

    public String toString() {
        return "WatchlistMainArrangedGroupUIData(id=" + this.f170887a + ", isFavorite=" + this.f170888b + ')';
    }
}
