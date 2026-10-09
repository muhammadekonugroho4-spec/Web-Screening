package com.stockbit.domain.model.bond.portfolio.detail;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f80802a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80803b;

    public c(List r2, String r3) {
        p.l(r2, FirebaseAnalytics.Param.ITEMS);
        p.l(r3, "year");
        this.f80802a = r2;
        this.f80803b = r3;
    }

    public final List a() {
        return this.f80802a;
    }

    public final String b() {
        return this.f80803b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f80802a, r52.f80802a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80803b, r52.f80803b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80802a.hashCode() * 31) + this.f80803b.hashCode();
    }

    public String toString() {
        return "BondsPortfolioDetailHistoryEntity(items=" + this.f80802a + ", year=" + this.f80803b + ")";
    }
}
