package com.stockbit.usecase.company.model.ownershipallocation;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f156394a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156395b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156396c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f156397e;

    public a(String r2, String r3, String r4, String r5, boolean r6) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "companyName");
        p.l(r5, "iconUrl");
        this.f156394a = r2;
        this.f156395b = r3;
        this.f156396c = r4;
        this.d = r5;
        this.f156397e = r6;
    }

    public final String a() {
        return this.f156396c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f156394a;
    }

    public final String d() {
        return this.f156395b;
    }

    public final boolean e() {
        return this.f156397e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f156394a, r52.f156394a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156395b, r52.f156395b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156396c, r52.f156396c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f156397e == r52.f156397e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f156394a.hashCode() * 31) + this.f156395b.hashCode()) * 31) + this.f156396c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f156397e);
    }

    public String toString() {
        return "DisplaySearchItemUIState(id=" + this.f156394a + ", name=" + this.f156395b + ", companyName=" + this.f156396c + ", iconUrl=" + this.d + ", isInvestor=" + this.f156397e + ")";
    }
}
