package com.stockbit.usecase.company.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* renamed from: com.stockbit.usecase.company.model.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10882b {

    /* renamed from: a, reason: collision with root package name */
    public final String f156168a;

    /* renamed from: b, reason: collision with root package name */
    public final List f156169b;

    public C10882b(String r2, List r3) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r3, FirebaseAnalytics.Param.ITEMS);
        this.f156168a = r2;
        this.f156169b = r3;
    }

    public final List a() {
        return this.f156169b;
    }

    public final String b() {
        return this.f156168a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10882b) == true) goto L8;
        return false;
    L8:
        C10882b r52 = (C10882b) r5;
        if (kotlin.jvm.internal.p.g(this.f156168a, r52.f156168a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156169b, r52.f156169b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156168a.hashCode() * 31) + this.f156169b.hashCode();
    }

    public String toString() {
        return "AnalystConsensusUIState(name=" + this.f156168a + ", items=" + this.f156169b + ")";
    }
}
