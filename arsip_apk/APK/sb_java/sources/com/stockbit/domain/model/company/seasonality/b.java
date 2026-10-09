package com.stockbit.domain.model.company.seasonality;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f81920a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81921b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81922c;

    public b(String r2, String r3, String r4) {
        p.l(r2, Constants.KEY_COLOR);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "value");
        this.f81920a = r2;
        this.f81921b = r3;
        this.f81922c = r4;
    }

    public final String a() {
        return this.f81920a;
    }

    public final String b() {
        return this.f81921b;
    }

    public final String c() {
        return this.f81922c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f81920a, r52.f81920a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81921b, r52.f81921b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81922c, r52.f81922c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81920a.hashCode() * 31) + this.f81921b.hashCode()) * 31) + this.f81922c.hashCode();
    }

    public String toString() {
        return "ColumnsEntity(color=" + this.f81920a + ", name=" + this.f81921b + ", value=" + this.f81922c + ")";
    }
}
