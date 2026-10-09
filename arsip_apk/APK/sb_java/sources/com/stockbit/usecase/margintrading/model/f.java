package com.stockbit.usecase.margintrading.model;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f158437a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158438b;

    public f(String r2, String r3) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f158437a = r2;
        this.f158438b = r3;
    }

    public final String a() {
        return this.f158437a;
    }

    public final String b() {
        return this.f158438b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f158437a, r52.f158437a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158438b, r52.f158438b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f158437a.hashCode() * 31) + this.f158438b.hashCode();
    }

    public String toString() {
        return "PortfolioUIState(id=" + this.f158437a + ", name=" + this.f158438b + ")";
    }
}
