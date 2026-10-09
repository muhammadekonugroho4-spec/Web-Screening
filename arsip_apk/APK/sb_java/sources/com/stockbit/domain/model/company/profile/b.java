package com.stockbit.domain.model.company.profile;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f81788a;

    public b(String r2) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f81788a = r2;
    }

    public final String a() {
        return this.f81788a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f81788a, ((b) r4).f81788a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81788a.hashCode();
    }

    public String toString() {
        return "CompanyProfileBeneficiaryEntity(name=" + this.f81788a + ")";
    }
}
