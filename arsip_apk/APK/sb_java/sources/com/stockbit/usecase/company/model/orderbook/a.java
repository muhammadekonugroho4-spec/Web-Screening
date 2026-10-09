package com.stockbit.usecase.company.model.orderbook;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f156346a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f156347b;

    public a(String r2, boolean r3) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        this.f156346a = r2;
        this.f156347b = r3;
    }

    public final String a() {
        return this.f156346a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f156346a, r52.f156346a) == true) goto L12;
        return false;
    L12:
        if (this.f156347b == r52.f156347b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156346a.hashCode() * 31) + Boolean.hashCode(this.f156347b);
    }

    public String toString() {
        return "OrderBookAraArbUIState(price=" + this.f156346a + ", isVisible=" + this.f156347b + ")";
    }
}
