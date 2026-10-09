package com.stockbit.usecase.company.model.profile.mutualfund;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f156524a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156525b;

    public a(String r2, String r3) {
        p.l(r2, "value");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f156524a = r2;
        this.f156525b = r3;
    }

    public final String a() {
        return this.f156525b;
    }

    public final String b() {
        return this.f156524a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f156524a, r52.f156524a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156525b, r52.f156525b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156524a.hashCode() * 31) + this.f156525b.hashCode();
    }

    public String toString() {
        return "MutualFundAssetAllocationUIState(value=" + this.f156524a + ", name=" + this.f156525b + ")";
    }
}
