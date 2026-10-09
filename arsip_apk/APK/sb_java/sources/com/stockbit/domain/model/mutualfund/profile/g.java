package com.stockbit.domain.model.mutualfund.profile;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f84439a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84440b;

    public g(String r2, String r3) {
        p.l(r2, "symbol");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f84439a = r2;
        this.f84440b = r3;
    }

    public final String a() {
        return this.f84440b;
    }

    public final String b() {
        return this.f84439a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f84439a, r52.f84439a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84440b, r52.f84440b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84439a.hashCode() * 31) + this.f84440b.hashCode();
    }

    public String toString() {
        return "MutualFundTopHoldingEntity(symbol=" + this.f84439a + ", name=" + this.f84440b + ")";
    }
}
