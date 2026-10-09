package com.stockbit.domain.model.company.comparison;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f81433a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81434b;

    public b(String r2, String r3) {
        p.l(r2, "symbol");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f81433a = r2;
        this.f81434b = r3;
    }

    public final String a() {
        return this.f81434b;
    }

    public final String b() {
        return this.f81433a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f81433a, r52.f81433a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81434b, r52.f81434b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81433a.hashCode() * 31) + this.f81434b.hashCode();
    }

    public String toString() {
        return "CompanyCompetitorItemEntity(symbol=" + this.f81433a + ", name=" + this.f81434b + ")";
    }
}
