package com.stockbit.usecase.alert.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f154363a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154364b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154365c;
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final String f154366e;

    /* renamed from: f, reason: collision with root package name */
    public final String f154367f;

    public e(String r2, String r3, String r4, b r5, String r6, String r7) {
        p.l(r2, "alertId");
        p.l(r3, "updated");
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "command");
        p.l(r6, FirebaseAnalytics.Param.PRICE);
        p.l(r7, "iconUrl");
        this.f154363a = r2;
        this.f154364b = r3;
        this.f154365c = r4;
        this.d = r5;
        this.f154366e = r6;
        this.f154367f = r7;
    }

    public final String a() {
        return this.f154363a;
    }

    public final b b() {
        return this.d;
    }

    public final String c() {
        return this.f154367f;
    }

    public final String d() {
        return this.f154365c;
    }

    public final String e() {
        return this.f154366e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f154363a, r52.f154363a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154364b, r52.f154364b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154365c, r52.f154365c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f154366e, r52.f154366e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f154367f, r52.f154367f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f154364b;
    }

    public int hashCode() {
        return (((((((((this.f154363a.hashCode() * 31) + this.f154364b.hashCode()) * 31) + this.f154365c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f154366e.hashCode()) * 31) + this.f154367f.hashCode();
    }

    public String toString() {
        return "AlertTriggeredUIState(alertId=" + this.f154363a + ", updated=" + this.f154364b + ", name=" + this.f154365c + ", command=" + this.d + ", price=" + this.f154366e + ", iconUrl=" + this.f154367f + ")";
    }
}
