package com.stockbit.domain.model.search;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f84921a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84922b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84923c;
    public final String d;

    public b(String r2, String r3, String r4, String r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "alias1");
        p.l(r5, "parent");
        this.f84921a = r2;
        this.f84922b = r3;
        this.f84923c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f84923c;
    }

    public final String b() {
        return this.f84921a;
    }

    public final String c() {
        return this.f84922b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f84921a, r52.f84921a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84922b, r52.f84922b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84923c, r52.f84923c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f84921a.hashCode() * 31) + this.f84922b.hashCode()) * 31) + this.f84923c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "EmittenSectorSubSectorEntity(id=" + this.f84921a + ", name=" + this.f84922b + ", alias1=" + this.f84923c + ", parent=" + this.d + ")";
    }
}
