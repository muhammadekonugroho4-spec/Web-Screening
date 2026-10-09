package com.stockbit.domain.model.alert;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f80586a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80587b;

    /* renamed from: c, reason: collision with root package name */
    public final b f80588c;

    public e(String r2, String r3, b r4) {
        kotlin.jvm.internal.p.l(r2, "alertId");
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "command");
        this.f80586a = r2;
        this.f80587b = r3;
        this.f80588c = r4;
    }

    public final String a() {
        return this.f80586a;
    }

    public final b b() {
        return this.f80588c;
    }

    public final String c() {
        return this.f80587b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (kotlin.jvm.internal.p.g(this.f80586a, r52.f80586a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80587b, r52.f80587b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80588c, r52.f80588c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f80586a.hashCode() * 31) + this.f80587b.hashCode()) * 31) + this.f80588c.hashCode();
    }

    public String toString() {
        return "AlertDetailEntity(alertId=" + this.f80586a + ", name=" + this.f80587b + ", command=" + this.f80588c + ")";
    }
}
