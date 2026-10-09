package com.stockbit.usecase.company.model.profile.mutualfund;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f156528a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156529b;

    public c(String r2, String r3) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "url");
        this.f156528a = r2;
        this.f156529b = r3;
    }

    public final String a() {
        return this.f156528a;
    }

    public final String b() {
        return this.f156529b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f156528a, r52.f156528a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156529b, r52.f156529b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156528a.hashCode() * 31) + this.f156529b.hashCode();
    }

    public String toString() {
        return "MutualFundFileUIState(name=" + this.f156528a + ", url=" + this.f156529b + ")";
    }
}
