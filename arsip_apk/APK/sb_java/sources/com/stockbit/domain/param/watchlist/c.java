package com.stockbit.domain.param.watchlist;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f87630a;

    public c(List r2) {
        p.l(r2, "companies");
        this.f87630a = r2;
    }

    public final List a() {
        return this.f87630a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f87630a, ((c) r4).f87630a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f87630a.hashCode();
    }

    public String toString() {
        return "WatchlistPinParam(companies=" + this.f87630a + ")";
    }
}
