package com.stockbit.usecase.securities.model.portfolio;

import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.stockbit.usecase.securities.model.portfolio.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10923e {

    /* renamed from: a, reason: collision with root package name */
    public final C10920b f161732a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161733b;

    public C10923e(C10920b r2, String r3) {
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.COUPON);
        kotlin.jvm.internal.p.l(r3, "maturity");
        this.f161732a = r2;
        this.f161733b = r3;
    }

    public final C10920b a() {
        return this.f161732a;
    }

    public final String b() {
        return this.f161733b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10923e) == true) goto L8;
        return false;
    L8:
        C10923e r52 = (C10923e) r5;
        if (kotlin.jvm.internal.p.g(this.f161732a, r52.f161732a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161733b, r52.f161733b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f161732a.hashCode() * 31) + this.f161733b.hashCode();
    }

    public String toString() {
        return "BondUIState(coupon=" + this.f161732a + ", maturity=" + this.f161733b + ")";
    }
}
