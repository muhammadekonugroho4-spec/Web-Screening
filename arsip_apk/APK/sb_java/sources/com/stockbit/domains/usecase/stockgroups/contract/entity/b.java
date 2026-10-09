package com.stockbit.domains.usecase.stockgroups.contract.entity;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f88413a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88414b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88415c;
    public final int d;

    public b(String r2, String r3, String r4, int r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "code");
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f88413a = r2;
        this.f88414b = r3;
        this.f88415c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f88414b;
    }

    public final String b() {
        return this.f88413a;
    }

    public final String c() {
        return this.f88415c;
    }

    public final int d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f88413a, r52.f88413a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88414b, r52.f88414b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88415c, r52.f88415c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f88413a.hashCode() * 31) + this.f88414b.hashCode()) * 31) + this.f88415c.hashCode()) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "StockGroupCatalogItemEntity(id=" + this.f88413a + ", code=" + this.f88414b + ", name=" + this.f88415c + ", order=" + this.d + ")";
    }
}
