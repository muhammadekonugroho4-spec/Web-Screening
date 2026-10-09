package com.stockbit.domain.model.screener;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f84883a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84884b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84885c;
    public final String d;

    public e(String r2, String r3, String r4, String r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "type");
        p.l(r5, "order");
        this.f84883a = r2;
        this.f84884b = r3;
        this.f84885c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f84883a;
    }

    public final String b() {
        return this.f84884b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f84885c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f84883a, r52.f84883a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84884b, r52.f84884b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84885c, r52.f84885c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f84883a.hashCode() * 31) + this.f84884b.hashCode()) * 31) + this.f84885c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ScreenerFavoriteEntity(id=" + this.f84883a + ", name=" + this.f84884b + ", type=" + this.f84885c + ", order=" + this.d + ")";
    }
}
