package com.stockbit.domain.model.securities.portfolio;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f85606a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85607b;

    public b(a r2, String r3) {
        p.l(r2, FirebaseAnalytics.Param.COUPON);
        p.l(r3, "maturity");
        this.f85606a = r2;
        this.f85607b = r3;
    }

    public final a a() {
        return this.f85606a;
    }

    public final String b() {
        return this.f85607b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f85606a, r52.f85606a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85607b, r52.f85607b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85606a.hashCode() * 31) + this.f85607b.hashCode();
    }

    public String toString() {
        return "BondEntity(coupon=" + this.f85606a + ", maturity=" + this.f85607b + ")";
    }

    public /* synthetic */ b(a r7, String r8, int r9, kotlin.jvm.internal.i r10) {
        if ((r9 & 1) == 0) goto L6;
        r7 = new a(null, null, null, 7, null);
    L6:
        if ((r9 & 2) == 0) goto L8;
        r8 = "";
    L8:
        this(r7, r8);
    }
}
