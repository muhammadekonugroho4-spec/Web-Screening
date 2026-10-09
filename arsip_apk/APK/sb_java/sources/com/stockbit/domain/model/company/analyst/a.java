package com.stockbit.domain.model.company.analyst;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f81384a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81385b;

    public a(String r2, List r3) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, FirebaseAnalytics.Param.ITEMS);
        this.f81384a = r2;
        this.f81385b = r3;
    }

    public final List a() {
        return this.f81385b;
    }

    public final String b() {
        return this.f81384a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81384a, r52.f81384a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81385b, r52.f81385b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81384a.hashCode() * 31) + this.f81385b.hashCode();
    }

    public String toString() {
        return "AnalystConsensusEntity(name=" + this.f81384a + ", items=" + this.f81385b + ")";
    }
}
