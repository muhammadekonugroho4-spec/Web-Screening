package com.stockbit.usecase.company.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: com.stockbit.usecase.company.model.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10888h {

    /* renamed from: a, reason: collision with root package name */
    public String f156226a;

    /* renamed from: b, reason: collision with root package name */
    public String f156227b;

    public C10888h(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f156226a = r2;
        this.f156227b = r3;
    }

    public final String a() {
        return this.f156227b;
    }

    public final String b() {
        return this.f156226a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10888h) == true) goto L8;
        return false;
    L8:
        C10888h r52 = (C10888h) r5;
        if (kotlin.jvm.internal.p.g(this.f156226a, r52.f156226a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156227b, r52.f156227b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156226a.hashCode() * 31) + this.f156227b.hashCode();
    }

    public String toString() {
        return "CompanyCompetitorItemUIState(symbol=" + this.f156226a + ", name=" + this.f156227b + ")";
    }
}
