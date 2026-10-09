package com.stockbit.usecase.company.model.profile;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f156476a;

    public b(String r2) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f156476a = r2;
    }

    public final String a() {
        return this.f156476a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f156476a, ((b) r4).f156476a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f156476a.hashCode();
    }

    public String toString() {
        return "CompanyProfileBeneficiaryUIState(name=" + this.f156476a + ")";
    }
}
