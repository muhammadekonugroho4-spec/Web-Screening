package com.stockbit.usecase.bonds.model.portfolio;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f154673a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154674b;

    public b(List r2, String r3) {
        p.l(r2, FirebaseAnalytics.Param.ITEMS);
        p.l(r3, "year");
        this.f154673a = r2;
        this.f154674b = r3;
    }

    public final List a() {
        return this.f154673a;
    }

    public final String b() {
        return this.f154674b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f154673a, r52.f154673a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154674b, r52.f154674b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f154673a.hashCode() * 31) + this.f154674b.hashCode();
    }

    public String toString() {
        return "BondPortfolioDetailCouponHistoryUIState(items=" + this.f154673a + ", year=" + this.f154674b + ")";
    }
}
