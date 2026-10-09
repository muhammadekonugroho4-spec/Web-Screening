package com.stockbit.feature.portfolio.presentation.detail.orderlist;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final List f105153a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f105154b;

    static {
    }

    public n(List r2, boolean r3) {
        p.l(r2, FirebaseAnalytics.Param.ITEMS);
        this.f105153a = r2;
        this.f105154b = r3;
    }

    public final List a() {
        return this.f105153a;
    }

    public final boolean b() {
        return this.f105154b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (p.g(this.f105153a, r52.f105153a) == true) goto L12;
        return false;
    L12:
        if (this.f105154b == r52.f105154b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f105153a.hashCode() * 31) + Boolean.hashCode(this.f105154b);
    }

    public String toString() {
        return "PortfolioDetailOrderlistScreenState(items=" + this.f105153a + ", isLoading=" + this.f105154b + ')';
    }
}
