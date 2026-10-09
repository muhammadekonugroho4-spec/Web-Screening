package com.stockbit.usecase.company.model.profile.mutualfund;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f156551a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156552b;

    public g(String r2, String r3) {
        p.l(r2, "symbol");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f156551a = r2;
        this.f156552b = r3;
    }

    public final String a() {
        return this.f156552b;
    }

    public final String b() {
        return this.f156551a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f156551a, r52.f156551a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156552b, r52.f156552b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156551a.hashCode() * 31) + this.f156552b.hashCode();
    }

    public String toString() {
        return "MutualFundTopHoldingUIState(symbol=" + this.f156551a + ", name=" + this.f156552b + ")";
    }
}
