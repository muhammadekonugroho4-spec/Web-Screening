package com.stockbit.usecase.cashsweep.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f155083a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155084b;

    public s(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r3, "fileUrl");
        this.f155083a = r2;
        this.f155084b = r3;
    }

    public final String a() {
        return this.f155084b;
    }

    public final String b() {
        return this.f155083a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s) == true) goto L8;
        return false;
    L8:
        s r52 = (s) r5;
        if (kotlin.jvm.internal.p.g(this.f155083a, r52.f155083a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f155084b, r52.f155084b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f155083a.hashCode() * 31) + this.f155084b.hashCode();
    }

    public String toString() {
        return "ProspectusUIState(name=" + this.f155083a + ", fileUrl=" + this.f155084b + ")";
    }
}
