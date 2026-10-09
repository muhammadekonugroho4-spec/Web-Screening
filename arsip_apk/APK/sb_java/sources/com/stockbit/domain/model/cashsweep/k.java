package com.stockbit.domain.model.cashsweep;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f81146a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81147b;

    /* renamed from: c, reason: collision with root package name */
    public final j f81148c;

    public k(String r2, String r3, j r4) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "fileUrl");
        p.l(r4, Constants.KEY_DATE);
        this.f81146a = r2;
        this.f81147b = r3;
        this.f81148c = r4;
    }

    public final j a() {
        return this.f81148c;
    }

    public final String b() {
        return this.f81147b;
    }

    public final String c() {
        return this.f81146a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f81146a, r52.f81146a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81147b, r52.f81147b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81148c, r52.f81148c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81146a.hashCode() * 31) + this.f81147b.hashCode()) * 31) + this.f81148c.hashCode();
    }

    public String toString() {
        return "ProductFundFactsEntity(name=" + this.f81146a + ", fileUrl=" + this.f81147b + ", date=" + this.f81148c + ")";
    }
}
