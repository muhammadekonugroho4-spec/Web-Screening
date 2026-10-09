package com.stockbit.domain.model.screener;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f84895a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84896b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84897c;
    public final String d;

    public h(String r2, String r3, int r4, String r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "type");
        this.f84895a = r2;
        this.f84896b = r3;
        this.f84897c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f84897c;
    }

    public final String b() {
        return this.f84895a;
    }

    public final String c() {
        return this.f84896b;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f84895a, r52.f84895a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84896b, r52.f84896b) == true) goto L15;
        return false;
    L15:
        if (this.f84897c == r52.f84897c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f84895a.hashCode() * 31) + this.f84896b.hashCode()) * 31) + Integer.hashCode(this.f84897c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ScreenerSavedEntity(id=" + this.f84895a + ", name=" + this.f84896b + ", favorite=" + this.f84897c + ", type=" + this.d + ")";
    }
}
