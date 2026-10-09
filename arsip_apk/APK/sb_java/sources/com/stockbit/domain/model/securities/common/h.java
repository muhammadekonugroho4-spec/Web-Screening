package com.stockbit.domain.model.securities.common;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f85090a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85091b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85092c;

    public h(String r2, String r3, String r4) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "startAt");
        p.l(r4, "endAt");
        this.f85090a = r2;
        this.f85091b = r3;
        this.f85092c = r4;
    }

    public final String a() {
        return this.f85092c;
    }

    public final String b() {
        return this.f85090a;
    }

    public final String c() {
        return this.f85091b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f85090a, r52.f85090a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85091b, r52.f85091b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85092c, r52.f85092c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85090a.hashCode() * 31) + this.f85091b.hashCode()) * 31) + this.f85092c.hashCode();
    }

    public String toString() {
        return "MarketCycleEntity(name=" + this.f85090a + ", startAt=" + this.f85091b + ", endAt=" + this.f85092c + ")";
    }
}
