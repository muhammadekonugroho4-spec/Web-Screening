package com.stockbit.domain.model.linkeddevice;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84217a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84218b;

    public a(String r2, String r3) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "type");
        this.f84217a = r2;
        this.f84218b = r3;
    }

    public final String a() {
        return this.f84217a;
    }

    public final String b() {
        return this.f84218b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84217a, r52.f84217a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84218b, r52.f84218b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84217a.hashCode() * 31) + this.f84218b.hashCode();
    }

    public String toString() {
        return "DeviceEntity(name=" + this.f84217a + ", type=" + this.f84218b + ")";
    }
}
