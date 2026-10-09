package com.stockbit.usecase.margintrading.model;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f158398a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158399b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158400c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final String f158401e;

    /* renamed from: f, reason: collision with root package name */
    public final double f158402f;

    public a(String r2, String r3, String r4, long r5, String r7, double r8) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "haircut");
        p.l(r7, "valueFormatted");
        this.f158398a = r2;
        this.f158399b = r3;
        this.f158400c = r4;
        this.d = r5;
        this.f158401e = r7;
        this.f158402f = r8;
    }

    public final String a() {
        return this.f158400c;
    }

    public final String b() {
        return this.f158398a;
    }

    public final double c() {
        return this.f158402f;
    }

    public final String d() {
        return this.f158399b;
    }

    public final String e() {
        return this.f158401e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f158398a, r82.f158398a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158399b, r82.f158399b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f158400c, r82.f158400c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (p.g(this.f158401e, r82.f158401e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f158402f, r82.f158402f) == 0) goto L26;
        return false;
    L26:
        return true;
    }

    public final long f() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((this.f158398a.hashCode() * 31) + this.f158399b.hashCode()) * 31) + this.f158400c.hashCode()) * 31) + Long.hashCode(this.d)) * 31) + this.f158401e.hashCode()) * 31) + Double.hashCode(this.f158402f);
    }

    public String toString() {
        return "AddAssetCollateralItemUIState(id=" + this.f158398a + ", name=" + this.f158399b + ", haircut=" + this.f158400c + ", valueRaw=" + this.d + ", valueFormatted=" + this.f158401e + ", input=" + this.f158402f + ")";
    }
}
