package com.stockbit.domain.model.mutualfund.profile;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84408a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84409b;

    public a(String r2, String r3) {
        p.l(r2, "value");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f84408a = r2;
        this.f84409b = r3;
    }

    public final String a() {
        return this.f84409b;
    }

    public final String b() {
        return this.f84408a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84408a, r52.f84408a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84409b, r52.f84409b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84408a.hashCode() * 31) + this.f84409b.hashCode();
    }

    public String toString() {
        return "MutualFundAssetAllocationEntity(value=" + this.f84408a + ", name=" + this.f84409b + ")";
    }
}
