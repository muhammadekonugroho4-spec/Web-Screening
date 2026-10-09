package com.stockbit.usecase.company.model.seasonality;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f156568a;

    /* renamed from: b, reason: collision with root package name */
    public String f156569b;

    /* renamed from: c, reason: collision with root package name */
    public String f156570c;

    public a(String r2, String r3, String r4) {
        p.l(r2, Constants.KEY_COLOR);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "value");
        this.f156568a = r2;
        this.f156569b = r3;
        this.f156570c = r4;
    }

    public final String a() {
        return this.f156568a;
    }

    public final String b() {
        return this.f156569b;
    }

    public final String c() {
        return this.f156570c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f156568a, r52.f156568a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156569b, r52.f156569b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156570c, r52.f156570c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f156568a.hashCode() * 31) + this.f156569b.hashCode()) * 31) + this.f156570c.hashCode();
    }

    public String toString() {
        return "ColumnsUIState(color=" + this.f156568a + ", name=" + this.f156569b + ", value=" + this.f156570c + ")";
    }
}
