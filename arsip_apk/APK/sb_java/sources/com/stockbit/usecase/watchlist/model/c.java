package com.stockbit.usecase.watchlist.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f164570a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f164571b;

    public c(String r2, boolean r3) {
        p.l(r2, "message");
        this.f164570a = r2;
        this.f164571b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f164570a, r52.f164570a) == true) goto L12;
        return false;
    L12:
        if (this.f164571b == r52.f164571b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f164570a.hashCode() * 31) + Boolean.hashCode(this.f164571b);
    }

    public String toString() {
        return "WatchlistFavoriteUIState(message=" + this.f164570a + ", isSuccess=" + this.f164571b + ")";
    }
}
