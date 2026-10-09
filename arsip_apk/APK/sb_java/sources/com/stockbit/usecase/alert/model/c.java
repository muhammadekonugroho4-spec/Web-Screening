package com.stockbit.usecase.alert.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f154357a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154358b;

    /* renamed from: c, reason: collision with root package name */
    public final b f154359c;
    public final String d;

    public c(String r2, String r3, b r4, String r5) {
        p.l(r2, "alertId");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "command");
        p.l(r5, FirebaseAnalytics.Param.PRICE);
        this.f154357a = r2;
        this.f154358b = r3;
        this.f154359c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f154357a;
    }

    public final b b() {
        return this.f154359c;
    }

    public final String c() {
        return this.f154358b;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f154357a, r52.f154357a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154358b, r52.f154358b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154359c, r52.f154359c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f154357a.hashCode() * 31) + this.f154358b.hashCode()) * 31) + this.f154359c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "AlertDetailUIState(alertId=" + this.f154357a + ", name=" + this.f154358b + ", command=" + this.f154359c + ", price=" + this.d + ")";
    }
}
