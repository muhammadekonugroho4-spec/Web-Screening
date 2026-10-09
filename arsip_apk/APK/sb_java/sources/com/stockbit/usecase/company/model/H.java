package com.stockbit.usecase.company.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes2.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final String f156162a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156163b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156164c;
    public final String d;

    public H(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r3, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r4, "lastPriceDate");
        kotlin.jvm.internal.p.l(r5, "iconUrl");
        this.f156162a = r2;
        this.f156163b = r3;
        this.f156164c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f156164c;
    }

    public final String c() {
        return this.f156162a;
    }

    public final String d() {
        return this.f156163b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof H) == true) goto L8;
        return false;
    L8:
        H r52 = (H) r5;
        if (kotlin.jvm.internal.p.g(this.f156162a, r52.f156162a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156163b, r52.f156163b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156164c, r52.f156164c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f156162a.hashCode() * 31) + this.f156163b.hashCode()) * 31) + this.f156164c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MutualFundInfoUIState(name=" + this.f156162a + ", price=" + this.f156163b + ", lastPriceDate=" + this.f156164c + ", iconUrl=" + this.d + ")";
    }
}
